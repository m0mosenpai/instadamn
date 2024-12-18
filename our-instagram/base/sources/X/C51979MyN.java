package X;

import android.view.View;

/* renamed from: X.MyN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51979MyN extends C668630d {
    public final /* synthetic */ OyC A00;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        OyC oyC = this.A00;
        View view = oyC.A01;
        if (view != null) {
            if (c55982hj.A09.A00 == 0.0d) {
                view.setVisibility(8);
            } else {
                oyC.A0B.A01();
            }
        }
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        OyC oyC = this.A00;
        if (oyC.A01 != null) {
            C55992hk c55992hk = c55982hj.A09;
            float f = (float) c55992hk.A00;
            int i = oyC.A08;
            float f2 = i;
            oyC.EgG((1.0f - f) * f2);
            if (oyC.A05) {
                int i2 = i - oyC.A09;
                C8TN c8tn = oyC.A02;
                if (c8tn != null) {
                    c8tn.A0K.A00().FCq(f * (-i2));
                }
            }
            OyE oyE = oyC.A04;
            if (oyE != null) {
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(oyE.A08);
                AbstractC166987dD.A1Z(new PYa(A0Z, null, ((float) c55992hk.A00) * f2, 12), AbstractC141776au.A00(A0Z));
            }
        }
    }

    public C51979MyN(OyC oyC) {
        this.A00 = oyC;
    }
}
