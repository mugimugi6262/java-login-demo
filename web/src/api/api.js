/** リクエストメソッドの定義ファイル */
import axios from './axios';

export default {
  /**
   * GETリクエストを送信するメソッド
   * @returns 
   */
  getRequest: () => {
    return axios.get('/api/log');
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
