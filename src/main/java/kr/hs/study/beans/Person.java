package kr.hs.study.beans;
import lombok.Data;

//같은 타입 객체를 만들어야하기 때문에 Component 붙이면 안됨.(java나 xml 파일로 객체 2개 만들기)
@Data
public class Person {
    String name;
    int age;
    String nickname;

    public Person(String name, int age, String nickname) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public void go(){
        System.out.println("가다");
    }
}
