package com.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp(){
        // db에서 데이터를 지우거나 넣는 코드를 넣을 수 있음
        System.out.println("비포중");
    }

    @Test
    @DisplayName("test 시작")
    void push(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();

        assertEquals(20,st.peek());
        assertEquals(20,st.pop());
        assertEquals(10,st.pop());;
        assertEquals(true,st.isEmpty());
    }

}