/** リクエストメソッドの定義ファイル */
import axios from './axios';

export default {
  /**
   * GETリクエストを送信するメソッド
   * @returns 
   */
  login: (data) => {
    return axios.get('/api/login', { params: data });
  },

  /**
   * POSTリクエストを送信するメソッド
   * @param {*} data 
   * @returns 
   */
//   postRequest: (data) => {
//     return axios.post('/api/login', data);
//   },

  // 他のHTTPメソッドを定義...
};
