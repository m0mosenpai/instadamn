package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LgS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48698LgS implements InterfaceC71949XCb {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48698LgS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71949XCb
    public final void DiF(C45105JxZ c45105JxZ) {
        JWd jWd;
        C45026JwH c45026JwH;
        if (this.A00 != 0) {
            if (C45105JxZ.A00(c45105JxZ, 2) && (jWd = (JWd) c45105JxZ.A01) != null && (c45026JwH = (C45026JwH) jWd.A00) != null) {
                LIE lie = (LIE) this.A02;
                AbstractC47995LLh.A0G(new C45543KEi(5, c45026JwH, lie), lie.A06, (C1GL) this.A01, c45026JwH);
                return;
            }
            return;
        }
        C45493KCi c45493KCi = (C45493KCi) this.A02;
        UserSession A0r = AbstractC166987dD.A0r(c45493KCi.A04);
        LJL.A00((Context) this.A01, c45493KCi.A02, A0r, null, null, C05F.A0C, C05F.A0j, c45105JxZ.A01(), null, c45493KCi.A03, new C37018GSz(2, c45493KCi, c45105JxZ), C50199MFg.A00);
    }

    @Override // X.InterfaceC71949XCb
    public final void Dwl(C45105JxZ c45105JxZ) {
        JWd jWd;
        C45026JwH c45026JwH;
        if (this.A00 != 0) {
            if (C45105JxZ.A00(c45105JxZ, 2) && (jWd = (JWd) c45105JxZ.A01) != null && (c45026JwH = (C45026JwH) jWd.A00) != null) {
                LIE lie = (LIE) this.A02;
                AbstractC47995LLh.A0H(new C45543KEi(6, c45026JwH, lie), lie.A06, (C1GL) this.A01, c45026JwH);
                return;
            }
            return;
        }
        C45493KCi c45493KCi = (C45493KCi) this.A02;
        LJL.A02(c45493KCi.A02, AbstractC166987dD.A0r(c45493KCi.A04), null, null, C05F.A0j, c45105JxZ.A01(), null, c45493KCi.A03, new C37018GSz(3, c45493KCi, c45105JxZ));
    }
}
