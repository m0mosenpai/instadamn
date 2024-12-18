package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GQJ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C5QE A02;
    public final /* synthetic */ EL5 A03;

    public GQJ(View view, C5QE c5qe, EL5 el5, int i) {
        this.A03 = el5;
        this.A02 = c5qe;
        this.A00 = i;
        this.A01 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EL5 el5 = this.A03;
        if (el5.getActivity() != null) {
            C5SU c5su = new C5SU(el5.requireActivity(), new C149686oL(BHX.A02(el5, this.A02)));
            c5su.A04(this.A01, 0, this.A00, true);
            c5su.A01();
            c5su.A00().A07(AbstractC166987dD.A0r(el5.A0O));
        }
    }
}
