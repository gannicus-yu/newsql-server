package com.noslowq.newsql.base;

import com.noslowq.newsql.constants.StatusCode;
import com.noslowq.newsql.utils.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class CustomExceptionResolver implements HandlerExceptionResolver {

    private static final Logger logger = Logger.getLogger(CustomExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse response, Object o, Exception e) {
        ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());
        Map<String, Object> map = new HashMap<>();
        map.put("code", StatusCode.INTERNAL_ERROR.getCode());
        map.put("success", false);
        map.put("message", e.getClass());
        mv.addAllObjects(map);
        logger.error(e, "uncaught exception");
        return mv;
    }
}
