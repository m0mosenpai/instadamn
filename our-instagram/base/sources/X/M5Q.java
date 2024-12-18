package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes8.dex */
public final class M5Q implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C23031Ai A02;

    public M5Q(Activity activity, View view, C23031Ai c23031Ai) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = c23031Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            Activity activity = this.A00;
            C5SU A0Q = AbstractC31178DnM.A0Q(activity, view, AbstractC166997dE.A0p(activity, 2131960585));
            AbstractC43594JPz.A1L(A0Q);
            KYR.A00(A0Q, this.A02, 9).A06();
        }
    }
}
