package com.space.ap.util;

public class ApiResponse {

    private int status;     // Response code
    private String message; // Response message
    private Object data;    // Response data

    /** constructor */
    public ApiResponse(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
    public ApiResponse(int status, String message) {
        this(status, message, null);
    }

    /** success */
    public static ApiResponse success(Object data) {
        return new ApiResponse(200, "OK", data);
    }
    public static ApiResponse success(Object data, String message) {
        return new ApiResponse(200, message, data);
    }

    /** error */
    public static ApiResponse error(int status, String message) {
        return new ApiResponse(status, message, null);
    }
}
