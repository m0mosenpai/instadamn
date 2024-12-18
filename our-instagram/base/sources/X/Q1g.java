package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class Q1g extends BroadcastReceiver {
    public final /* synthetic */ QFS A00;

    public Q1g(QFS qfs) {
        this.A00 = qfs;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, 405269596);
        if (isInitialStickyBroadcast()) {
            i = -1153565486;
        } else {
            this.A00.A0A.execute(new TLB(this));
            i = 1281352793;
        }
        C0f9.A0E(i, A04, intent);
    }
}
