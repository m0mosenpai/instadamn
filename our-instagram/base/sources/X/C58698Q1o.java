package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.Q1o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58698Q1o extends BroadcastReceiver {
    public Context A00;
    public final AbstractC61585Rq9 A01;

    public final synchronized void A00() {
        Context context = this.A00;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.A00 = null;
    }

    public C58698Q1o(AbstractC61585Rq9 abstractC61585Rq9) {
        this.A01 = abstractC61585Rq9;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1153110321);
        android.net.Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.A01.A00();
            A00();
            i = -241227437;
        } else {
            i = -874733382;
        }
        C0f9.A0E(i, A04, intent);
    }
}
