package com.facebook.analyticslogging.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes4.dex */
public class MailboxAnalyticsLoggingJNI {
    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxanalyticsloggingjni");
    }
}
