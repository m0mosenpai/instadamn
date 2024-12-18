package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes6.dex */
public final class GPE implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public GPE(Activity activity, View view, View view2) {
        this.A02 = view;
        this.A00 = activity;
        this.A01 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A00;
        C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131975769));
        A0f.A01();
        A0f.A03(this.A01);
        AbstractC166997dE.A1P(A0f);
    }
}
