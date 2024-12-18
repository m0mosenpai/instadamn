package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes6.dex */
public final class GPK implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C23031Ai A02;

    public GPK(Activity activity, View view, C23031Ai c23031Ai) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = c23031Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            Activity activity = this.A00;
            C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131957380));
            A0f.A03(view);
            A0f.A01();
            A0f.A07(C5SV.A07);
            A0f.A0A = true;
            A0f.A04 = new EfP(this.A02, 6);
            AbstractC166997dE.A1P(A0f);
        }
    }
}
