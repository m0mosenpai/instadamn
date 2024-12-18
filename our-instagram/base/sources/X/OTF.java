package X;

import android.content.Context;
import android.telephony.PhoneStateListener;

/* loaded from: classes9.dex */
public final class OTF {
    public final PhoneStateListener A00;
    public final C23411Cd A01;

    public static boolean A00(Context context) {
        try {
        } catch (SecurityException e) {
            C0K8.A0J("SafeTelephonyManager", "getCallState: Caught Security Exception ", e);
        }
        if (C1CZ.A00(context, null).A00.getCallState() == 2) {
            return true;
        }
        return false;
    }

    public OTF(Context context, InterfaceC57909PmE interfaceC57909PmE) {
        this.A01 = C1CZ.A00(context, null);
        this.A00 = new C50760MbR(interfaceC57909PmE);
    }
}
