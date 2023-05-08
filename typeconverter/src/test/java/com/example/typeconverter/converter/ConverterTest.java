package com.example.typeconverter.converter;

import com.example.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    void stringToInteger(){
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10"); // 문자 10
        Assertions.assertThat(result).isEqualTo(10); // 숫자 10
    }

    @Test
    void IntegerToString(){
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10); // 숫자 10
        Assertions.assertThat(result).isEqualTo("10"); // 문자 10
    }

    @Test
    void stringToIpPort(){
        StringToIpPortConverter converter = new StringToIpPortConverter();
        IpPort result = converter.convert("127.0.0.1:8080");
        Assertions.assertThat(result).isEqualTo(new IpPort("127.0.0.1",8080));
    }

    @Test
    void ipPortToString(){
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort ipPort = new IpPort("127.0.0.1" , 8080);
        String result = converter.convert(ipPort);
        Assertions.assertThat(result).isEqualTo("127.0.0.1:8080");
    }
}
