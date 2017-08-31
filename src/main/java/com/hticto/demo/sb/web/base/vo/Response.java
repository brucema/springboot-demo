package com.hticto.demo.sb.web.base.vo;

import org.springframework.http.HttpStatus;

public class Response {

    public int status = HttpStatus.OK.value();

    public String message = "";

    public Object data;

    public Response(Object data) {
        this.data = data;
    }

    public Response() {
    }

    public Response(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public static Response error(String message) {
        Response response = new Response();
        response.status = HttpStatus.INTERNAL_SERVER_ERROR.value();
        response.message = message;
        return response;
    }

    public static Response badRequest() {
        Response response = new Response();
        response.status = HttpStatus.BAD_REQUEST.value();
        return response;
    }
}
