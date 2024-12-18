package com.facebook.tamreporting.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes4.dex */
public class MailboxTamReportingJNI {
    public static final native Object dispatchCqlOIJJOOOOOOOO(int i, int i2, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native void dispatchVJJOOOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native void dispatchVJJOOOOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxtamreportingjni");
    }
}
