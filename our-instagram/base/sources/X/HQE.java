package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class HQE extends C17T implements InterfaceC43537JKx {
    @Override // X.InterfaceC43537JKx
    public final JKI AeL() {
        return (JKI) A05(1997542747, HQA.class);
    }

    @Override // X.InterfaceC43537JKx
    public final JKJ Bbm() {
        return (JKJ) A05(968393960, HQC.class);
    }

    @Override // X.InterfaceC43537JKx
    public final InterfaceC43536JKw Bkw() {
        return (InterfaceC43536JKw) A05(-755354819, HQD.class);
    }

    @Override // X.InterfaceC43537JKx
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40000Hoh.A00(this));
    }

    @Override // X.InterfaceC43537JKx
    public final C38725H3n EvE() {
        C38721H3j c38721H3j;
        C38723H3l c38723H3l;
        JKI AeL = AeL();
        C38724H3m c38724H3m = null;
        if (AeL != null) {
            c38721H3j = AeL.EvA();
        } else {
            c38721H3j = null;
        }
        JKJ Bbm = Bbm();
        if (Bbm != null) {
            c38723H3l = Bbm.EvC();
        } else {
            c38723H3l = null;
        }
        InterfaceC43536JKw Bkw = Bkw();
        if (Bkw != null) {
            c38724H3m = Bkw.EvD();
        }
        return new C38725H3n(c38721H3j, c38723H3l, c38724H3m);
    }
}
