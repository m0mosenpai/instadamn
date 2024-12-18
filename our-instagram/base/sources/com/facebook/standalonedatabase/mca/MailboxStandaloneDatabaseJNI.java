package com.facebook.standalonedatabase.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes3.dex */
public class MailboxStandaloneDatabaseJNI {
    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxstandalonedatabasejni");
    }
}
