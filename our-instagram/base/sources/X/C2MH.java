package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.2MH, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2MH extends C2MJ {
    public final BroadcastReceiver A00;

    public abstract IntentFilter A04();

    public abstract void A05(Intent intent);

    public C2MH(Context context, C2LC c2lc) {
        super(context, c2lc);
        this.A00 = new BroadcastReceiver() { // from class: X.2MM
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                int A01 = C0f9.A01(-1028952253);
                C0fM.A01(this, context2, intent);
                C14360o3.A0B(context2, 0);
                C14360o3.A0B(intent, 1);
                C2MH.this.A05(intent);
                C0f9.A0E(-670843309, A01, intent);
            }
        };
    }

    @Override // X.C2MJ
    public final void A01() {
        C48442Kl.A00();
        this.A01.registerReceiver(this.A00, A04());
    }

    @Override // X.C2MJ
    public final void A02() {
        C48442Kl.A00();
        this.A01.unregisterReceiver(this.A00);
    }
}
