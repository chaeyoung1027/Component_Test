package kr.hs.study.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Member {   //setter, constructor 사용 금지
    @Autowired
    @Qualifier("p1")
    Person p1;
    @Autowired
    @Qualifier("p2")
    Person p2;

    public Person getP1() {
        return p1;
    }

    public Person getP2() {
        return p2;
    }
}
