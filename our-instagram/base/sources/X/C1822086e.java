package X;

import android.view.View;

/* renamed from: X.86e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1822086e extends C668630d {
    public View A00;
    public final C55982hj A01;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        View view = this.A00;
        if (view != null) {
            C55992hk c55992hk = c55982hj.A09;
            float A04 = (float) AbstractC70163Da.A04(c55992hk.A00, 0.0d, 1.0d, 1.0d, 0.9800000190734863d);
            view.setScaleX(A04);
            view.setScaleY(A04);
            view.setAlpha((float) AbstractC70163Da.A04(c55992hk.A00, 0.0d, 1.0d, 1.0d, 0.699999988079071d));
        }
    }

    public C1822086e() {
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(C55942hf.A03(5.0d, 10.0d));
        A02.A0A(this);
        this.A01 = A02;
    }
}
