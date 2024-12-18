package X;

import android.app.Activity;

/* loaded from: classes9.dex */
public final class PRJ implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C43081yb A01;

    public PRJ(Activity activity, C43081yb c43081yb) {
        this.A01 = c43081yb;
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OCD ocd = (OCD) this.A01.A01.get(this.A00);
        if (ocd != null) {
            ocd.A01.A01();
        }
    }
}
