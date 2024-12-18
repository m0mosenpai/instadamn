package com.facebook.messengerencryptedbackupsdirect.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes8.dex */
public class MailboxMessengerEncryptedBackupsDirectJNI {
    public static final native void dispatchVIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native void dispatchVIOOOOZ(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public static final native void dispatchVJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native void dispatchVJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxmessengerencryptedbackupsdirectjni");
    }
}
