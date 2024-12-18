package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* loaded from: classes10.dex */
public final class TQP implements Runnable {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ ConstraintProxyUpdateReceiver A03;

    public TQP(final BroadcastReceiver.PendingResult this$0, final Context val$intent, final Intent val$context, final ConstraintProxyUpdateReceiver val$pendingResult) {
        this.A03 = val$pendingResult;
        this.A02 = val$context;
        this.A01 = val$intent;
        this.A00 = this$0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Intent intent = this.A02;
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            C48442Kl.A00();
            Context context = this.A01;
            AbstractC48952Mo.A00(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            AbstractC48952Mo.A00(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            AbstractC48952Mo.A00(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            AbstractC48952Mo.A00(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            this.A00.finish();
        }
    }
}
