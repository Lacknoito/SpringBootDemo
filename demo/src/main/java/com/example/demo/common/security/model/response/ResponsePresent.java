package com.example.demo.common.security.model.response;
 
public class ResponsePresent {
	public static final String STATUS_OK = "OK";
    public static final String STATUS_ERROR = "FAIL";
    public static final String STATUS_UNAUTHORIZED = "UNAUTHORIZED";

    private String status;
    private String statusCode;
    private Object data;
    private String message;
    
	public ResponsePresent sendOk(Object data)
    {
        this.status = STATUS_OK;
        this.statusCode = "200";
        this.data = data;
        this.message = "Success";
        return this;
    }

    public ResponsePresent sendOk(Object data, String message)
    {
        this.status = STATUS_OK;
        this.statusCode = "200";
        this.data = data;
        this.message = message;
        return this;
    }

    public ResponsePresent sendError(String message)
    {
        this.status = STATUS_ERROR;
        this.statusCode = "400";
        this.message = message;
        return this;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
}
