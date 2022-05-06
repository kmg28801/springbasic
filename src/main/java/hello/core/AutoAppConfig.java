package hello.core;


import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// Configuration도 Component다.. AppConfig가 있으니까 빼는거다.
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
// basePackages를 지정안하면 @ComponentScan이 붙은 곳이 디폴트임
public class AutoAppConfig {


}
