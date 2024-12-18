package X;

import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.BnU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26509BnU extends AbstractC51572Yf {
    public final C28362CfM A00;
    public final C25812BbT A01;
    public final C7N A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        View view;
        CWZ cwz;
        Fragment A00;
        C14360o3.A0B(c76223bS, 0);
        BX7 bx7 = (BX7) AbstractC77183d4.A00(c76223bS, DEJ.A00, new Object[0]);
        C25812BbT c25812BbT = this.A01;
        AbstractC27456C9y abstractC27456C9y = (AbstractC27456C9y) AbstractC25525BQn.A00(c76223bS, c25812BbT.A0Q);
        C28272CdH c28272CdH = (C28272CdH) AbstractC25525BQn.A00(c76223bS, c25812BbT.A0S);
        C51762Yz A002 = AbstractC77073ct.A00(c76223bS, C29890DGe.A00(c76223bS, 39));
        C2XE c2xe = c76223bS.A05;
        Object A06 = c2xe.A06(CWZ.class);
        if ((A06 instanceof CWZ) && (cwz = (CWZ) A06) != null && (A00 = cwz.A00()) != null) {
            view = A00.mView;
        } else {
            view = null;
        }
        AbstractC27727CKu.A00(new SpannableString(""), view, c76223bS, A002, new BIE(A002.A03, 50));
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 1.0f, 1);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        boolean z = this.A04;
        boolean z2 = this.A06;
        C7N c7n = this.A02;
        boolean z3 = this.A09;
        boolean z4 = this.A07;
        D5P d5p = new D5P(c25812BbT, 5);
        boolean z5 = this.A03;
        boolean z6 = this.A05;
        C28362CfM c28362CfM = this.A00;
        C51722Yv A0N = AbstractC25234BEr.A0N(null, C05F.A00, num, 100.0f, 0);
        long A0J = AbstractC25229BEm.A0J();
        Integer num2 = C05F.A0A;
        A0P.A00(new C26517Bnc(C9CU.A00(A0N, num2, 0, A0J), c28362CfM, abstractC27456C9y, c7n, d5p, z, z2, z3, z4, z5, z6));
        D5P d5p2 = new D5P(c25812BbT, 6);
        boolean z7 = this.A08;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(C9CU.A00(null, C05F.A0Y, 0, Double.doubleToRawLongBits(44.0d)), C05F.A0C, 0.0f, 1);
        long A0F = AbstractC25229BEm.A0F();
        A0P.A00(new C26559BoI(C9CU.A00(C9CU.A00(A0d2, C05F.A04, 0, A0F), num2, 0, A0F), bx7, c28272CdH, abstractC27456C9y, d5p2, z7));
        return AbstractC76963ci.A05(A0P, c76223bS, A0d);
    }

    public C26509BnU(C28362CfM c28362CfM, C25812BbT c25812BbT, C7N c7n, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C14360o3.A0B(c28362CfM, 11);
        this.A04 = z;
        this.A06 = z2;
        this.A02 = c7n;
        this.A09 = z3;
        this.A07 = z4;
        this.A08 = z5;
        this.A03 = z6;
        this.A01 = c25812BbT;
        this.A05 = z7;
        this.A00 = c28362CfM;
    }
}
