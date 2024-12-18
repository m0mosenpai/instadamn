package com.instagram.push;

import X.AbstractC167017dG;
import X.C08310bt;
import X.C0f9;
import X.C0fM;
import X.C96P;
import X.FWU;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public final class RefreshPushTokenBootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C0f9.A01(675598072);
        C0fM.A01(this, context, intent);
        AbstractC167017dG.A1N(context, intent);
        if (C08310bt.A02().A00(context, intent, this) && FWU.A01(intent.getAction())) {
            C96P.A01.A00(context);
            i = -1588643420;
        } else {
            i = 1073984376;
        }
        C0f9.A0E(i, A01, intent);
    }
}
