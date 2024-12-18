package com.facebook.urlblackhole.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes8.dex */
public class MailboxUrlBlackholeJNI {
    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxurlblackholejni");
    }
}
