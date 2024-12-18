package com.facebook.rtccallevents.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes4.dex */
public class MailboxRtcCallEventsJNI {
    public static final native Object dispatchCqlOIJOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchCqlOIJOOOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxrtccalleventsjni");
    }
}
