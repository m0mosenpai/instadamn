package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.GoW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38043GoW extends C17T implements C4CW {
    @Override // X.C4CW
    public final /* synthetic */ C41119IIk AKF() {
        return new C41119IIk(this);
    }

    @Override // X.C4CW
    public final C4CS ApW() {
        return (C4CS) A05(950398559, C38044GoX.class);
    }

    @Override // X.C4CW
    public final InterfaceC116715Qa BaO() {
        return (InterfaceC116715Qa) A05(529642498, C39191HMv.class);
    }

    @Override // X.C4CW
    public final C4CP BdB() {
        return (C4CP) A05(3440953, BU9.class);
    }

    @Override // X.C4CW
    public final InterfaceC116735Qc CC9() {
        return (InterfaceC116735Qc) A05(115704, C39192HMw.class);
    }

    @Override // X.C4CW
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37379GdL.A00(this));
    }

    @Override // X.C4CW
    public final C4CV Eqs() {
        C4CR c4cr;
        H2H h2h;
        C4CO c4co;
        C4CS ApW = ApW();
        C116725Qb c116725Qb = null;
        if (ApW != null) {
            c4cr = ApW.Eqr();
        } else {
            c4cr = null;
        }
        InterfaceC116715Qa BaO = BaO();
        if (BaO != null) {
            h2h = BaO.Eqt();
        } else {
            h2h = null;
        }
        C4CP BdB = BdB();
        if (BdB != null) {
            c4co = BdB.Equ();
        } else {
            c4co = null;
        }
        InterfaceC116735Qc CC9 = CC9();
        if (CC9 != null) {
            c116725Qb = CC9.Eqv();
        }
        return new C4CV(c4cr, h2h, c4co, c116725Qb);
    }
}
