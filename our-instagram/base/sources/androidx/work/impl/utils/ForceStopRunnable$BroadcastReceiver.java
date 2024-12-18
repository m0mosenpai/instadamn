package androidx.work.impl.utils;

import X.C0f9;
import X.C0fM;
import X.C2NR;
import X.C48442Kl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        C48442Kl.A01("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(10042950);
        C0fM.A01(this, context, intent);
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            C48442Kl.A00();
            C2NR.A00(context);
        }
        C0f9.A0E(2044285295, A01, intent);
    }
}
