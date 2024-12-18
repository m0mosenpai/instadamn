package com.facebook.secureconsentframework.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes3.dex */
public class MailboxSecureConsentFrameworkJNI {
    public static final native Object dispatchCqlOIIIOOOOOOO(int i, int i2, int i3, int i4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static final native Object dispatchCqlOIIOO(int i, int i2, int i3, Object obj, Object obj2);

    public static final native Object dispatchCqlOIIOZ(int i, int i2, int i3, Object obj, boolean z);

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchCqlOIOZ(int i, int i2, Object obj, boolean z);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchDasmOIIOOO(int i, int i2, int i3, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIIOOZ(int i, int i2, int i3, Object obj, Object obj2, boolean z);

    public static final native Object dispatchDasmOIOO(int i, int i2, Object obj, Object obj2);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxsecureconsentframeworkjni");
    }
}
