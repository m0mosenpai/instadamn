package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.AxT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24745AxT implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C33I A02;

    public RunnableC24745AxT(Activity activity, View view, C33I c33i) {
        this.A00 = activity;
        this.A01 = view;
        this.A02 = c33i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU A0U = AbstractC167007dF.A0U(this.A00, 2131953468);
        A0U.A03(this.A01);
        A0U.A02();
        A0U.A04 = this.A02;
        AbstractC166997dE.A1P(A0U);
    }
}
