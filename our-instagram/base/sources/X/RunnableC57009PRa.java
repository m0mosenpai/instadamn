package X;

import android.view.View;

/* renamed from: X.PRa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57009PRa implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C54565O8r A01;

    public RunnableC57009PRa(View view, C54565O8r c54565O8r) {
        this.A01 = c54565O8r;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C54565O8r c54565O8r = this.A01;
        C5SU A0U = AbstractC167007dF.A0U(c54565O8r.A00, 2131960973);
        A0U.A03(this.A00);
        A0U.A02();
        NMC.A00(A0U, c54565O8r, 9).A07(c54565O8r.A01);
    }
}
