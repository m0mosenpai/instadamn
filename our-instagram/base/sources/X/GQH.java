package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes6.dex */
public final class GQH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C33I A03;

    public GQH(Activity activity, View view, C33I c33i, int i) {
        this.A01 = activity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = c33i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A01;
        C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(this.A00));
        A0f.A03(this.A02);
        A0f.A02();
        A0f.A0B = false;
        A0f.A0A = true;
        A0f.A04 = this.A03;
        AbstractC166997dE.A1P(A0f);
    }
}
