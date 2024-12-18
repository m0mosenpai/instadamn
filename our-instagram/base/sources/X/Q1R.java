package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes10.dex */
public abstract class Q1R extends BroadcastReceiver {
    static {
        C48442Kl.A01("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, -760694811);
        C48442Kl.A00();
        Intent A08 = MSW.A08(context, SystemAlarmService.class);
        A08.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(A08);
        C0f9.A0E(46434577, A04, intent);
    }
}
