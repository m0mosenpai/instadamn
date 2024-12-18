package X;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.BRn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25551BRn implements InterfaceC31066Dl8 {
    public final InterfaceC31159Dn3 A00;

    @Override // X.InterfaceC31054Dku
    public final void CJc(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        this.A00.D68(null, c120985dq, c37644Ghd, null, false);
    }

    @Override // X.InterfaceC31046Dkk
    public final void CJx(C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, boolean z) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        this.A00.DOx(null, c120985dq, c37644Ghd, false);
    }

    @Override // X.InterfaceC31020DkJ
    public final void Cxt(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        AbstractC167007dF.A1D(c120985dq, 1, c37644Ghd);
        if (!z) {
            boolean CdW = c120985dq.CdW();
            InterfaceC31159Dn3 interfaceC31159Dn3 = this.A00;
            if (CdW) {
                interfaceC31159Dn3.DnV(c120985dq, c37644Ghd, 1);
            } else {
                interfaceC31159Dn3.Cxs(c120985dq, c37644Ghd);
            }
        }
    }

    @Override // X.C39H
    public final void DWK(EnumC85043qs enumC85043qs, C38321qM c38321qM, Integer num, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.InterfaceC31061Dl3
    public final void DlJ(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z, boolean z2) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        InterfaceC31159Dn3 interfaceC31159Dn3 = this.A00;
        if (z) {
            interfaceC31159Dn3.DlL(view, c120985dq);
        } else {
            interfaceC31159Dn3.DlM(view, c120985dq, c37644Ghd, null, z2);
        }
    }

    @Override // X.InterfaceC31061Dl3
    public final void DlN(MotionEvent motionEvent, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C14360o3.A0B(c120985dq, 1);
        this.A00.DlO(motionEvent, c120985dq);
    }

    @Override // X.InterfaceC31066Dl8
    public final void EX7(InterfaceC16570sA interfaceC16570sA) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31020DkJ
    public final void EX8(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31061Dl3
    public final void EXN(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.C39H
    public final void EXO(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.InterfaceC31046Dkk
    public final void EXZ(InterfaceC16590sC interfaceC16590sC) {
    }

    @Override // X.InterfaceC31054Dku
    public final void EXh(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.InterfaceC31054Dku
    public final void EXi(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.InterfaceC31066Dl8
    public final void EXk(InterfaceC16610sE interfaceC16610sE) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31061Dl3
    public final void EXo(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.InterfaceC31067Dl9
    public final void EYZ(InterfaceC16620sF interfaceC16620sF) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31067Dl9
    public final void Ed0(InterfaceC16620sF interfaceC16620sF) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31061Dl3
    public final void Eds(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.InterfaceC31019DkI
    public final void EfN(InterfaceC16610sE interfaceC16610sE) {
    }

    @Override // X.InterfaceC31067Dl9
    public final void EfO(InterfaceC16620sF interfaceC16620sF) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31021DkK
    public final void EfP(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.InterfaceC31021DkK
    public final void E1N(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A00.E1N(c38321qM, c75113Zb);
    }

    public C25551BRn(InterfaceC31159Dn3 interfaceC31159Dn3) {
        this.A00 = interfaceC31159Dn3;
    }

    @Override // X.InterfaceC31054Dku
    public final void CJd(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A00.D6E(null, c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31046Dkk
    public final void CJy(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, int i) {
        this.A00.DP0(view, c120985dq, c37644Ghd, AbstractC167017dG.A1a(c120985dq, c37644Ghd));
    }

    @Override // X.InterfaceC31066Dl8
    public final void CK1(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A00.DTo(view, c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31067Dl9
    public final void CKG(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A00.Di4(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31067Dl9
    public final void CKH(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A00.Di6(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31067Dl9
    public final void CKI(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A00.Di7(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31019DkI
    public final void DL9(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A00.DL9(view, c120985dq, c37644Ghd);
    }
}
