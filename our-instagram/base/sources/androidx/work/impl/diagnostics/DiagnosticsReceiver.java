package androidx.work.impl.diagnostics;

import X.AbstractC48382Kf;
import X.AbstractC58318PtA;
import X.C0f9;
import X.C2L1;
import X.C48442Kl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;

/* loaded from: classes10.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String A00 = C48442Kl.A01("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -568300422);
        if (intent == null) {
            i = 1341755024;
        } else {
            C48442Kl.A00();
            String str = A00;
            try {
                C2L1.A00(context).A03(Collections.singletonList(new AbstractC48382Kf(DiagnosticsWorker.class).A00()));
            } catch (IllegalStateException e) {
                C48442Kl.A00();
                Log.e(str, "WorkManager is not initialized", e);
            }
            i = -2108859493;
        }
        C0f9.A0E(i, A04, intent);
    }
}
