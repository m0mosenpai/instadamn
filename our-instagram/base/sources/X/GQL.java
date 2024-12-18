package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes6.dex */
public final class GQL implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C33I A02;
    public final /* synthetic */ String A03;

    public GQL(Activity activity, View view, C33I c33i, String str) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = str;
        this.A02 = c33i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            C5SU A0Q = AbstractC31178DnM.A0Q(this.A00, view, this.A03);
            A0Q.A02();
            A0Q.A07(C5SV.A06);
            A0Q.A0B = false;
            A0Q.A04 = this.A02;
            AbstractC166997dE.A1P(A0Q);
        }
    }
}
