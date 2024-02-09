package org.example.util;

import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;
import java.util.Map;

public class Result {
    @Getter @Setter private String message;
    @Getter @Setter private Map<String, Object> data = new HashMap<>();

    private Result() {}

    public static Result ok() {
        Result r = new Result();
        r.setMessage("Success");
        return r;
    }

    public static Result ok(String message, Map<String, Object> data) {
        Result r = ok();
        r.setMessage(message);
        r.setData(data);
        return r;
    }

    public static Result ok(Map<String, Object> data) {
        Result r = ok();
        r.setData(data);
        return r;
    }

    public static Result error(int code, String message) {
        Result r = new Result();
        r.setMessage(message);
        return r;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.data.putAll(map);
        return this;
    }
}
