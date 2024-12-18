package X;

import android.app.Activity;

/* renamed from: X.AyK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24798AyK implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC116795Qi A01;
    public final /* synthetic */ C23031Ai A02;

    public RunnableC24798AyK(Activity activity, InterfaceC116795Qi interfaceC116795Qi, C23031Ai c23031Ai) {
        this.A00 = activity;
        this.A01 = interfaceC116795Qi;
        this.A02 = c23031Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A00;
        if (activity != null) {
            C5SU A0U = AbstractC167007dF.A0U(activity, 2131954839);
            A0U.A03 = this.A01;
            A0U.A01();
            A0U.A00 = 5000;
            A0U.A0A = true;
            AbstractC166997dE.A1P(A0U);
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(this.A02);
            A0w.E77("carousel_scrubbing_tooltip_shown", true);
            A0w.apply();
        }
    }
}
