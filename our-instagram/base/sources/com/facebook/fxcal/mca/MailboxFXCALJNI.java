package com.facebook.fxcal.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes3.dex */
public class MailboxFXCALJNI {
    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxfxcaljni");
    }
}
