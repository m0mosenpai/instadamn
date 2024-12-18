package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.M5q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50001M5q implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C47428KxJ A02;

    public RunnableC50001M5q(Activity activity, View view, C47428KxJ c47428KxJ) {
        this.A02 = c47428KxJ;
        this.A00 = activity;
        this.A01 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47428KxJ c47428KxJ = this.A02;
        Activity activity = this.A00;
        View view = this.A01;
        C5SU A0U = AbstractC167007dF.A0U(activity, 2131958812);
        A0U.A03(view);
        A0U.A02();
        KYR.A00(A0U, c47428KxJ, 11).A07(c47428KxJ.A00);
    }
}
