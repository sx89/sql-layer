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

package com.akiban.ais.model.validation;

import org.junit.Test;

import com.akiban.ais.model.AISBuilder;
import com.akiban.ais.model.Index;
import com.akiban.server.error.InvalidOperationException;

public class AISInvariantsTest {

    private AISBuilder builder;
    
    @Test (expected=InvalidOperationException.class)
    public void testDupicateTables1() {
        builder = new AISBuilder();
        builder.userTable("test", "t1");
        builder.column("test", "t1", "c1", 0, "INT", (long)0, (long)0, false, true, null, null);
        
        builder.userTable("test", "t1");
    }
    
    @Test (expected=InvalidOperationException.class)
    public void testDuplicateTables2() {
        builder = new AISBuilder();
        builder.userTable("test", "t1");
        builder.createGroup("test", "test", "t1");
    }
    
    @Test (expected=InvalidOperationException.class)
    public void testDuplicateTables3() {
        builder = new AISBuilder();
        builder.createGroup("test", "test", "t1");
        builder.userTable("test", "t1");
    }
    
    @Test (expected=InvalidOperationException.class)
    public void testDuplicateTables4() {
        builder = new AISBuilder();
        builder.createGroup ("test", "test", "t1");
        builder.createGroup ("fred", "test", "t1");
    }
    @Test (expected=InvalidOperationException.class)
    public void testDuplicateColumns() {
        builder = new AISBuilder();
        
        builder.userTable("test", "t1");
        builder.column("test", "t1", "c1", 0, "int", (long)0, (long)0, false, true, null, null);
        builder.column("test", "t1", "c1", 1, "INT", (long)0, (long)0, false, false, null, null);

    }
    
    //@Test (expected=InvalidOperationException.class)
    public void testDuplicateColumnPos() {
        builder = new AISBuilder();
        
        builder.userTable("test", "t1");
        builder.column("test", "t1", "c1", 0, "int", (long)0, (long)0, false, true, null, null);
        builder.column("test", "t1", "c2", 0, "int", (long)0, (long)0, false, false, null, null);
    }
    
    @Test (expected=InvalidOperationException.class)
    public void testDuplicateIndexes() {
        builder = new AISBuilder();
        builder.userTable("test", "t1");
        builder.column("test", "t1", "c1", 0, "int", (long)0, (long)0, false, true, null, null);
        builder.column("test", "t1", "c2", 1, "int", (long)0, (long)0, false, false, null, null);
        
        builder.index("test", "t1", "PRIMARY", true, Index.PRIMARY_KEY_CONSTRAINT);
        builder.indexColumn("test", "t1", "PRIMARY", "c1", 0, true, null);
        builder.index("test", "t1", "PRIMARY", true, Index.PRIMARY_KEY_CONSTRAINT);
    }
    
    @Test (expected=InvalidOperationException.class)
    public void testDuplicateGroup() {
        builder = new AISBuilder();
        builder.createGroup("test", "test", "t1");
        builder.createGroup("test", "test", "t2");
    }
}
