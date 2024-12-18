package X;

import android.view.View;

/* renamed from: X.GOh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36912GOh implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ EJK A01;

    public RunnableC36912GOh(View view, EJK ejk) {
        this.A01 = ejk;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU A0U = AbstractC167007dF.A0U(this.A01.requireActivity(), 2131970140);
        A0U.A03(this.A00);
        A0U.A0F = true;
        A0U.A06(EnumC58132lV.A04);
        A0U.A0B = false;
        A0U.A0A = true;
        AbstractC166997dE.A1P(A0U);
    }
}
