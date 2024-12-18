package X;

import android.view.View;

/* renamed from: X.M3b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49934M3b implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C50724MaP A01;

    public RunnableC49934M3b(View view, C50724MaP c50724MaP) {
        this.A01 = c50724MaP;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50724MaP c50724MaP = this.A01;
        C5SU A0f = AbstractC167017dG.A0f(c50724MaP.requireActivity(), c50724MaP.requireContext().getString(2131962416));
        A0f.A01();
        View view = this.A00;
        C14360o3.A0A(view);
        A0f.A03(view);
        KYR.A00(A0f, c50724MaP, 7).A07(c50724MaP.A0C());
    }
}
