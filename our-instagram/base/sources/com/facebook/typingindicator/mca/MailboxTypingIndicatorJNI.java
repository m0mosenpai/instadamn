package com.facebook.typingindicator.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes4.dex */
public class MailboxTypingIndicatorJNI {
    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native void dispatchVOOOZZ(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxtypingindicatorjni");
    }
}
