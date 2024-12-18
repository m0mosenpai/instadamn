package com.facebook.instagramportabledb.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes8.dex */
public class MailboxInstagramPortableDBJNI {
    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxinstagramportabledbjni");
    }
}
