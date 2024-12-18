package X;

import android.app.Activity;
import android.util.TypedValue;

/* renamed from: X.Axg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC24758Axg implements Runnable {
    public final /* synthetic */ C194808jg A00;
    public final /* synthetic */ C183688Ct A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ RunnableC24758Axg(C194808jg c194808jg, C183688Ct c183688Ct, boolean z) {
        this.A01 = c183688Ct;
        this.A02 = z;
        this.A00 = c194808jg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C183688Ct c183688Ct = this.A01;
        boolean z = this.A02;
        C194808jg c194808jg = this.A00;
        Activity activity = c183688Ct.A0o;
        int i = 2131953551;
        if (z) {
            i = 2131953521;
        }
        C5SU c5su = new C5SU(activity, new C149686oL(activity.getString(i)));
        c5su.A05(new C207559Gj(c183688Ct.A1t, 0, (c194808jg.getIntrinsicHeight() / 2) - ((int) TypedValue.applyDimension(1, 20.0f, c183688Ct.A0p.getResources().getDisplayMetrics())), true));
        c5su.A01();
        c5su.A00().A07(c183688Ct.A0w);
    }
}
