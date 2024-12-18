package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class Q1h extends BroadcastReceiver {
    public final /* synthetic */ T4D A00;

    public Q1h(T4D t4d) {
        this.A00 = t4d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, -2118526327);
        final T4D t4d = this.A00;
        t4d.A04.post(new Runnable() { // from class: X.TLG
            @Override // java.lang.Runnable
            public final void run() {
                T4D.A00(T4D.this);
            }
        });
        C0f9.A0E(-925848450, A04, intent);
    }
}
