package com.instagram.util.startup.appwarmer;

import X.C0f9;
import X.C0fM;
import X.C14360o3;
import X.C9FL;
import X.C9GL;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class KeepWarmReceiver extends BroadcastReceiver {
    public BroadcastReceiver.PendingResult A00;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(-1088981695);
        C0fM.A01(this, context, intent);
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intent, 1);
        try {
            BroadcastReceiver.PendingResult pendingResult = this.A00;
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (IllegalStateException unused) {
        }
        this.A00 = goAsync();
        new C9GL(new C9FL(17, context, intent, this)).start();
        C0f9.A0E(1993646225, A01, intent);
    }
}
