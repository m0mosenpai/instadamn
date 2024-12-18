package com.facebook.nobreak;

import X.C0f9;
import X.C0fM;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class CrashLoop$LastState extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(1170860296);
        C0fM.A01(this, context, intent);
        C0f9.A0E(332985848, A01, intent);
    }
}
