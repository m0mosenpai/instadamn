package com.facebook.fts.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes8.dex */
public class MailboxFTSJNI {
    public static final native Object dispatchCqlOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOIJOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOIJOOOOZ(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchCqlOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOIOZ(int i, int i2, Object obj, boolean z);

    public static final native Object dispatchCqlOJJOOOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxftsjni");
    }
}
