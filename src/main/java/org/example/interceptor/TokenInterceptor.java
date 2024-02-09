package org.example.interceptor;

import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.example.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
@Slf4j
public class TokenInterceptor implements HandlerInterceptor {

    private JwtUtils jwtUtils;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        log.info("经过了拦截器");
//        //获得放置token的请求头
//        String token = request.getHeader("Authorization");
//        //校验头格式
//        if(StringUtils.isEmpty(token) || !token.startsWith("Bearer ")){
//            throw new RuntimeException("请先登录");
//        }
//        //截取token字符串
//        token = token.substring(7);
//        //解析token
//        try {
//            Claims claims = jwtUtils.getClaimsByToken(token);
//            request.setAttribute("claims",claims);
//        } catch (Exception e) {
//            throw new RuntimeException("请先登录");
//        }
        return true;
    }

}

