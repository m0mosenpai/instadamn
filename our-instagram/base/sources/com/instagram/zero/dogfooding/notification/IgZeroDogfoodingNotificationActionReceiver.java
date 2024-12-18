package com.instagram.zero.dogfooding.notification;

import X.AbstractC167007dF;
import X.AbstractC54300NzK;
import X.C05A;
import X.C08310bt;
import X.C0f9;
import X.C0fM;
import X.C1R3;
import X.C1R4;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes9.dex */
public final class IgZeroDogfoodingNotificationActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        Object value;
        C1R4 c1r4;
        int A01 = C0f9.A01(1292909763);
        C0fM.A01(this, context, intent);
        AbstractC167007dF.A1K(context, intent);
        if (!C08310bt.A02().A00(context, intent, this)) {
            i = 648494246;
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                i = -1928017738;
            } else {
                Integer A00 = AbstractC54300NzK.A00(extras.getString("dogfooding_mode"));
                if (A00 != null) {
                    C05A c05a = C1R3.A03.A01;
                    do {
                        value = c05a.getValue();
                        c1r4 = (C1R4) value;
                    } while (!c05a.AIi(value, C1R4.A02(c1r4, A00, null, c1r4.A01 + 1, 0, 499, 0L, 0L, false, false, false, false, false)));
                }
                i = 1998897917;
            }
        }
        C0f9.A0E(i, A01, intent);
    }
}
