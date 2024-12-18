package com.facebook.proactivewarnings.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes8.dex */
public class MailboxProactiveWarningsJNI {
    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxproactivewarningsjni");
    }
}
