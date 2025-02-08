<template>
    <v-sheet class="pa-12" color="primary" rounded>
        <!-- 装飾 -->
        <Mugi />

        <!-- ログイン -->
        <v-card class="mx-auto px-6 py-8" max-width="350">
            <v-card-title>Java-Login-Demo</v-card-title>
            <v-card-text>{{ message }}</v-card-text>
            <v-form
                v-model="form"
                @submit.prevent="onLogin">
            <!-- フォーム -->
            <v-text-field
                v-model="userName"
                :readonly="loading"
                label="User Name"
                clearable />
            <v-text-field
                v-model="password"
                :readonly="loading"
                label="Password"
                clearable />
            <!-- ボタン -->
            <!-- 
                To Do: バリデーション
                v-formで囲むなら、type=Submitいるのでは? -->
            <Button label="Login"
                    @click="onLogin" />
            </v-form>
            
        </v-card>
    </v-sheet>

    
</template>

<script setup>
import { ref } from 'vue'
import api from '@/api/api'
import Mugi from '@/component/thing/Mugi.vue';
import Button from '@/component/thing/Button.vue';

/** リアクティブデータの定義 */
const message = ref("View the response.");
const form = ref(false);
const loading = ref(false);
const userName = ref(null);
const password = ref(null);

/** メソッドの定義 */
const onLogin = async () => {

    // ローディングを開始する。
    loading.value = true;

    const data = {
        'userName': userName.value,
        'password': password.value
    };

    console.log('login data: ', data);

    // API通信（GET）
    api.login(data).then(
        response => {
            console.log('response:', response.data);
            message.value = response.data;

    }).catch(error => {
        console.error("Error:", error);

    });

    // ローディングを終了する。
    loading.value = false;
};


</script>

<style scoped>

</style>