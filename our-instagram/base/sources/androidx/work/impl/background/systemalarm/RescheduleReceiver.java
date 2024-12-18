package androidx.work.impl.background.systemalarm;

import X.C0f9;
import X.C0fM;
import X.C2L1;
import X.C48442Kl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes3.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = C48442Kl.A01("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(1184958104);
        C0fM.A01(this, context, intent);
        C48442Kl.A00();
        String str = A00;
        try {
            C2L1 A002 = C2L1.A00(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (C2L1.A0C) {
                BroadcastReceiver.PendingResult pendingResult = A002.A00;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                A002.A00 = goAsync;
                if (A002.A08) {
                    goAsync.finish();
                    A002.A00 = null;
                }
            }
        } catch (IllegalStateException e) {
            C48442Kl.A00();
            Log.e(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
        C0f9.A0E(534565690, A01, intent);
    }
}
