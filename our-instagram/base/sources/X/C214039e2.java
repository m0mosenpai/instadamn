package X;

import android.view.View;

/* renamed from: X.9e2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214039e2 extends C668630d {
    public final int A00;
    public final Object A01;

    public C214039e2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        if (2 - this.A00 != 0) {
            super.Dnj(c55982hj);
            return;
        }
        AM2 am2 = (AM2) this.A01;
        am2.A07.setVisibility(0);
        if (am2.A03().A05 == null) {
            return;
        }
        am2.A0A.setVisibility(0);
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        int itemCount;
        int i;
        switch (this.A00) {
            case 2:
                if (c55982hj.A01 != 0.0d) {
                    return;
                }
                AM2 am2 = (AM2) this.A01;
                am2.A07.setVisibility(8);
                am2.A0A.setVisibility(8);
                return;
            case 3:
            default:
                super.Dnk(c55982hj);
                return;
            case 4:
                A8U a8u = (A8U) this.A01;
                C55982hj c55982hj2 = a8u.A01;
                if (c55982hj2.A09.A00 != 0.8999999761581421d) {
                    return;
                }
                c55982hj2.A06 = false;
                c55982hj2.A03();
                C218209ks c218209ks = a8u.A02.A00.A0M.A02;
                if (c218209ks.getItemCount() <= 0 || (itemCount = (((C8JF) c218209ks).A00 + 1) % c218209ks.getItemCount()) == (i = ((C8JF) c218209ks).A00)) {
                    return;
                }
                ((C8JE) c218209ks).A03 = true;
                c218209ks.A04.post(new RunnableC24762Axk(c218209ks, itemCount, i));
                return;
        }
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C44358Jix c44358Jix;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c55982hj, 0);
                c44358Jix = ((C24151Ana) this.A01).A09;
                break;
            case 1:
                C14360o3.A0B(c55982hj, 0);
                c44358Jix = ((C24151Ana) this.A01).A0A;
                break;
            case 2:
                double A01 = AbstractC70163Da.A01(c55982hj.A09.A00, 1.0d);
                AM2 am2 = (AM2) this.A01;
                float f = (float) A01;
                am2.A07.setAlpha(f);
                InterfaceC56392iX interfaceC56392iX = am2.A0A;
                if (!interfaceC56392iX.CWW()) {
                    return;
                }
                interfaceC56392iX.getView().setAlpha(f);
                return;
            case 3:
                C14360o3.A0B(c55982hj, 0);
                View view = (View) this.A01;
                C55992hk c55992hk = c55982hj.A09;
                view.setScaleX((float) c55992hk.A00);
                view.setScaleY((float) c55992hk.A00);
                return;
            default:
                A8U a8u = (A8U) this.A01;
                float f2 = (float) a8u.A01.A09.A00;
                View view2 = a8u.A00;
                view2.setScaleX(f2);
                view2.setScaleY(f2);
                return;
        }
        c44358Jix.A02(c55982hj.A09.A00);
    }
}
