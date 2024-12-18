package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes6.dex */
public final class GQ8 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C23031Ai A03;

    public GQ8(Activity activity, View view, View view2, C23031Ai c23031Ai) {
        this.A02 = view;
        this.A00 = activity;
        this.A01 = view2;
        this.A03 = c23031Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A00;
        C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131958852));
        A0f.A01();
        A0f.A03(this.A01);
        A0f.A0A = true;
        A0f.A04 = new EfP(this.A03, 4);
        AbstractC166997dE.A1P(A0f);
    }
}
