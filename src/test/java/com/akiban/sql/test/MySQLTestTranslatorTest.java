/**
 * END USER LICENSE AGREEMENT (“EULA”)
 *
 * READ THIS AGREEMENT CAREFULLY (date: 9/13/2011):
 * http://www.akiban.com/licensing/20110913
 *
 * BY INSTALLING OR USING ALL OR ANY PORTION OF THE SOFTWARE, YOU ARE ACCEPTING
 * ALL OF THE TERMS AND CONDITIONS OF THIS AGREEMENT. YOU AGREE THAT THIS
 * AGREEMENT IS ENFORCEABLE LIKE ANY WRITTEN AGREEMENT SIGNED BY YOU.
 *
 * IF YOU HAVE PAID A LICENSE FEE FOR USE OF THE SOFTWARE AND DO NOT AGREE TO
 * THESE TERMS, YOU MAY RETURN THE SOFTWARE FOR A FULL REFUND PROVIDED YOU (A) DO
 * NOT USE THE SOFTWARE AND (B) RETURN THE SOFTWARE WITHIN THIRTY (30) DAYS OF
 * YOUR INITIAL PURCHASE.
 *
 * IF YOU WISH TO USE THE SOFTWARE AS AN EMPLOYEE, CONTRACTOR, OR AGENT OF A
 * CORPORATION, PARTNERSHIP OR SIMILAR ENTITY, THEN YOU MUST BE AUTHORIZED TO SIGN
 * FOR AND BIND THE ENTITY IN ORDER TO ACCEPT THE TERMS OF THIS AGREEMENT. THE
 * LICENSES GRANTED UNDER THIS AGREEMENT ARE EXPRESSLY CONDITIONED UPON ACCEPTANCE
 * BY SUCH AUTHORIZED PERSONNEL.
 *
 * IF YOU HAVE ENTERED INTO A SEPARATE WRITTEN LICENSE AGREEMENT WITH AKIBAN FOR
 * USE OF THE SOFTWARE, THE TERMS AND CONDITIONS OF SUCH OTHER AGREEMENT SHALL
 * PREVAIL OVER ANY CONFLICTING TERMS OR CONDITIONS IN THIS AGREEMENT.
 */

package com.akiban.sql.test;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

/*
 * Test class for converting MySQL test cases to Yaml format
 * */
public class MySQLTestTranslatorTest extends MySQLTestTranslator {

    @Test
    public void testLargeData() {
        MySQLTestTranslator t = new MySQLTestTranslator();
        String strLine = "";
        strLine = "a\ta\t1";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\ta\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t1";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\tb\t1";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "b\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\tb\t1";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\tb\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t1";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\ta\t3";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\ta\t3";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\ta\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t3";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "b\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\tb\t1";
        t.translateData(strLine);
        strLine = "b\ta\t3";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\tb\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t3";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\ta\t2";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\ta\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t2";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "b\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\tb\t1";
        t.translateData(strLine);
        strLine = "b\ta\t2";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\tb\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t2";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\ta\t7";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\ta\t7";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\ta\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\tb\t7";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "b\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\tb\t1";
        t.translateData(strLine);
        strLine = "b\ta\t7";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\tb\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\ta\t6";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\ta\t6";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\ta\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t6";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\tb\t6";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "b\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\tb\t1";
        t.translateData(strLine);
        strLine = "b\ta\t6";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\tb\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t6";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\ta\t4";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\ta\t4";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\ta\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t4";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\tb\t4";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "b\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\tb\t1";
        t.translateData(strLine);
        strLine = "b\ta\t4";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\tb\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t4";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\ta\t5";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\ta\t5";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\ta\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t5";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\tb\t5";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "b\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\tb\t1";
        t.translateData(strLine);
        strLine = "b\ta\t5";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\tb\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t5";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\ta\t9";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\ta\t9";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\ta\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t9";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\tb\t9";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "b\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\tb\t1";
        t.translateData(strLine);
        strLine = "b\ta\t9";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\tb\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t9";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\ta\t8";
        t.translateData(strLine);
        strLine = "a\ta\t2";
        t.translateData(strLine);
        strLine = "a\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\ta\t1";
        t.translateData(strLine);
        strLine = "b\ta\t8";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\ta\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t8";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        strLine = "a\tb\t8";
        t.translateData(strLine);
        strLine = "a\tb\t2";
        t.translateData(strLine);
        strLine = "b\tb\t3";
        t.translateData(strLine);
        strLine = "a\tc\t4";
        t.translateData(strLine);
        strLine = "a\td\t5";
        t.translateData(strLine);
        strLine = "b\tb\t1";
        t.translateData(strLine);
        strLine = "b\ta\t8";
        t.translateData(strLine);
        strLine = "b\tc\t6";
        t.translateData(strLine);
        strLine = "b\te\t4";
        t.translateData(strLine);
        strLine = "b\tz\t5";
        t.translateData(strLine);
        strLine = "c\tb\t5";
        t.translateData(strLine);
        strLine = "c\tc\t7";
        t.translateData(strLine);
        strLine = "c\tc\t8";
        t.translateData(strLine);
        strLine = "c\td\t9";
        t.translateData(strLine);
        strLine = "c\tf\t5";
        t.translateData(strLine);
        Assert.assertEquals(270, t.smallCounter);
        char[] test = { 'c', 'f', '5' };
        Assert.assertEquals(Arrays.toString(test),
                Arrays.toString(t.alldata[t.smallCounter - 1]));
        char[] test2 = { 'c', 'd', '9' };
        Assert.assertEquals(Arrays.toString(test2),
                Arrays.toString(t.alldata[t.smallCounter - 2]));
    }

}
