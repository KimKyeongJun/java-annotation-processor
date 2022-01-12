package com.kkj;

import org.junit.Assert;
import org.junit.Test;

public class MemberTest {

    @Test
    public void getterSetter() {
        Member member = new Member();
        member.setName("kj");

        Assert.assertEquals(member.getName(), "kj");
    }
}
