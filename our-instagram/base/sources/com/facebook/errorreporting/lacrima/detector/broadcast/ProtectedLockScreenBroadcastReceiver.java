package com.facebook.errorreporting.lacrima.detector.broadcast;

import X.AbstractC07560aV;
import X.AbstractC08230bl;
import X.C02O;
import X.C07970bH;
import X.C0NO;
import X.C0OK;
import X.InterfaceC08190bh;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ProtectedLockScreenBroadcastReceiver extends AbstractC07560aV implements InterfaceC08190bh {
    public static final C0NO A01 = new Object();
    public static final C07970bH A00 = new C07970bH();

    @Override // X.AbstractC07560aV
    public final boolean A06(String str) {
        if (str != null) {
            return AbstractC08230bl.A00(str) || AbstractC08230bl.A07.contains(str);
        }
        return false;
    }

    public ProtectedLockScreenBroadcastReceiver() {
        this.A00 = new C0OK(A00, A01);
    }

    @Override // X.AbstractC07560aV
    public final void A05(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        if (C02O.A00(intent.getAction(), "android.intent.action.SCREEN_OFF")) {
            throw new NullPointerException("getDetectorByClass");
        }
        if (C02O.A00(intent.getAction(), "android.intent.action.SCREEN_ON")) {
            throw new NullPointerException("getDetectorByClass");
        }
    }
}
