package com.facebook.errorreporting.lacrima.detector.broadcast;

import X.C0QK;
import X.InterfaceC08190bh;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class PublicLockScreenBroadcastReceiver extends C0QK {
    @Override // X.AbstractC07560aV
    public final void A05(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        if (intent.getAction().equals("com.instagram.android.intent.action.ACTION_SCREEN_OFF")) {
            throw new NullPointerException("getDetectorByClass");
        }
        if (intent.getAction().equals("com.instagram.android.intent.action.ACTION_SCREEN_ON")) {
            throw new NullPointerException("getDetectorByClass");
        }
    }
}
