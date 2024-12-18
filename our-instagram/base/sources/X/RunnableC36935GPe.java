package X;

import android.app.Activity;
import android.text.Spanned;
import android.view.View;

/* renamed from: X.GPe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36935GPe implements Runnable {
    public final /* synthetic */ Spanned A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ENI A02;

    public RunnableC36935GPe(Spanned spanned, View view, ENI eni) {
        this.A02 = eni;
        this.A00 = spanned;
        this.A01 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU c5su = new C5SU((Activity) this.A02.A00, new C149686oL(this.A00));
        c5su.A03(this.A01);
        c5su.A02();
        c5su.A0B = true;
        c5su.A00 = 3000;
        c5su.A0A = false;
        c5su.A04 = new EfP(this, 9);
        AbstractC166997dE.A1P(c5su);
    }
}
