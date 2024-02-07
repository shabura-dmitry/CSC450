package com.msu.ctap.Config;


import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;


@Configuration
@EnableWebMvc
@EnableSpringDataWebSupport
@ComponentScan("com.msu.ctap")
public class WebMVCConfiguration implements WebMvcConfigurer {

    @Bean
    public FormattingConversionServiceFactoryBean conversionService(){
        return new FormattingConversionServiceFactoryBean();
    }

    @Bean
    public TilesConfigurer tilesViewResolver(){

        TilesConfigurer props = new TilesConfigurer();
        props.setDefinitions("/WEB-INF/views.xml","/WEB-INF/views/page-views.xml","/WEB-INF/views/**/views.xml");

        return props;
    }

    @Bean
    public TilesViewResolver tilesViewResolver(){
        TilesViewResolver props = new TilesViewResolver();
        props.setViewClass(TilesView.class);
        return props;
    }

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

}
