<template>
    <v-container>
`        <!-- <v-row>
            <v-col>ログイン画面</v-col>
        </v-row>` -->
        <v-row>
            <v-col>
                <v-btn @click="sendLog">リクエスト</v-btn>
            </v-col>
        </v-row>
        <v-row>
            <v-col>{{ message }}</v-col>
        </v-row>
    </v-container>
</template>

<script setup>
import { ref } from 'vue';
import api from '@/api/api';

/** リアクティブデータの定義 */
const message = ref("メッセージ");

/** メソッドの定義 */
const sendLog = async () => {

// API通信（GET）
api.getRequest().then(response => {
    console.log('response:', response.data);
    message.value = response.data;
    })
    .catch(error => {
    console.error("Error:", error);
    });
};

</script>

<style scoped>

</style>