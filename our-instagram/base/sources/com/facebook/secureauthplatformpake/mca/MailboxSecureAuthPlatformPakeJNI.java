package com.facebook.secureauthplatformpake.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes8.dex */
public class MailboxSecureAuthPlatformPakeJNI {
    public static final native void dispatchVIOO(int i, int i2, Object obj, Object obj2);

    public static final native void dispatchVIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native void dispatchVOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static final native void dispatchVOOOOZ(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxsecureauthplatformpakejni");
    }
}