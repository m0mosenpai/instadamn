package com.facebook.rtc.notification;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC54360O0s;
import X.C08310bt;
import X.C0f9;
import X.C0fM;
import X.C51999Myp;
import X.EnumC53332NiC;
import X.OXh;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes9.dex */
public final class RtcMultiCallActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C0f9.A01(-915029749);
        C0fM.A01(this, context, intent);
        boolean A1R = AbstractC167007dF.A1R(0, context, intent);
        if (!C08310bt.A02().A00(context, intent, this)) {
            i = 1281642503;
        } else {
            String action = intent.getAction();
            if (action != null && action.hashCode() == -1016139507 && action.equals("com.facebook.rtc.notification.DECLINE_MULTI_CALL_ACTION")) {
                String stringExtra = intent.getStringExtra("local_call_id");
                if (stringExtra != null) {
                    OXh.A01(EnumC53332NiC.A10, null, stringExtra, null, null);
                    C51999Myp c51999Myp = (C51999Myp) AbstractC54360O0s.A01.invoke(stringExtra);
                    if (c51999Myp != null) {
                        c51999Myp.A01().removeWhenEnded();
                        c51999Myp.A01().end(0, "decline_multi_call_via_notification", A1R);
                    }
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0E(1085486319, A01, intent);
                    throw A0g;
                }
            } else {
                EnumC53332NiC enumC53332NiC = EnumC53332NiC.A17;
                String action2 = intent.getAction();
                if (action2 == null) {
                    action2 = "";
                }
                OXh.A01(enumC53332NiC, null, null, null, AbstractC167007dF.A0n("action", action2));
            }
            i = -1645311122;
        }
        C0f9.A0E(i, A01, intent);
    }
}
