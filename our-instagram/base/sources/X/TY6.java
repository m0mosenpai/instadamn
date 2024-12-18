package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes10.dex */
public final class TY6 extends Thread {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C63380Siu A01;

    public TY6(Context context, C63380Siu c63380Siu) {
        this.A01 = c63380Siu;
        this.A00 = context;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        PackageManager packageManager;
        if (C2J8.A06 == null) {
            C63380Siu c63380Siu = this.A01;
            Context context = ((AbstractC63223SfY) c63380Siu.A03).A00;
            C48092Iw.A06.A00(c63380Siu.A0A);
            if (context != null && (packageManager = context.getPackageManager()) != null) {
                packageManager.setComponentEnabledSetting(new ComponentName(context, "com.instagram.fbpay.w3c.views.PaymentActivity"), 1, 1);
            }
        }
        C63380Siu c63380Siu2 = this.A01;
        Context context2 = this.A00;
        C5G6 c5g6 = c63380Siu2.A0Q;
        C63021Sam c63021Sam = c5g6.A02;
        Integer A00 = c63021Sam.A00(null, 772805399, 0);
        if (c63380Siu2.A09 == null) {
            c63380Siu2.A09 = new C2GP(context2, c5g6);
        }
        if (c63380Siu2.A01 == null) {
            c63021Sam.A02(A00, null, "setViewModelCardObserverStart", 772805399);
            c63380Siu2.A01 = new C63625SqX(1, A00, c63380Siu2);
        }
        STG.A00(new RunnableC64673TPe(context2, c63380Siu2, A00));
        c63380Siu2.A0C();
    }
}
