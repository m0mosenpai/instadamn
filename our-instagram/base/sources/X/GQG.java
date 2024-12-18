package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes6.dex */
public final /* synthetic */ class GQG implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C33I A03;

    public /* synthetic */ GQG(Activity activity, View view, C33I c33i, int i) {
        this.A01 = activity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = c33i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A01;
        int i = this.A00;
        View view = this.A02;
        C33I c33i = this.A03;
        C5SU A0Q = AbstractC31178DnM.A0Q(activity, view, activity.getString(i));
        A0Q.A02();
        A0Q.A0B = false;
        A0Q.A0A = true;
        A0Q.A04 = c33i;
        AbstractC166997dE.A1P(A0Q);
    }
}
