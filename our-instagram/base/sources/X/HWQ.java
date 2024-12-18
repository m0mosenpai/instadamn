package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class HWQ extends C17T implements InterfaceC115905Mg {
    public InterfaceC37961pd A00;
    public JMK A01;
    public InterfaceC37791pH A02;

    @Override // X.InterfaceC115905Mg
    public final InterfaceC37961pd AiD() {
        InterfaceC37961pd interfaceC37961pd = this.A00;
        if (interfaceC37961pd == null) {
            return (InterfaceC37961pd) A05(-1618876223, HNG.class);
        }
        return interfaceC37961pd;
    }

    @Override // X.InterfaceC115905Mg
    public final JMK Bf2() {
        JMK jmk = this.A01;
        if (jmk == null) {
            return (JMK) A05(195461543, HRp.class);
        }
        return jmk;
    }

    @Override // X.InterfaceC115905Mg
    public final InterfaceC37791pH BlP() {
        InterfaceC37791pH interfaceC37791pH = this.A02;
        if (interfaceC37791pH == null) {
            return (InterfaceC37791pH) A05(3496474, HWN.class);
        }
        return interfaceC37791pH;
    }

    @Override // X.InterfaceC115905Mg
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40709I2p.A00(this));
    }

    @Override // X.InterfaceC115905Mg
    public final InterfaceC115905Mg EBg(C1DY c1dy) {
        InterfaceC37961pd AiD = AiD();
        InterfaceC37791pH interfaceC37791pH = null;
        if (AiD != null) {
            AiD.E8l(c1dy);
        } else {
            AiD = null;
        }
        this.A00 = AiD;
        JMK Bf2 = Bf2();
        if (Bf2 != null) {
            Bf2.E9c(c1dy);
        } else {
            Bf2 = null;
        }
        this.A01 = Bf2;
        InterfaceC37791pH BlP = BlP();
        if (BlP != null) {
            BlP.EBd(c1dy);
            interfaceC37791pH = BlP;
        }
        this.A02 = interfaceC37791pH;
        return this;
    }

    @Override // X.InterfaceC115905Mg
    public final C115895Mf F5W(C1DY c1dy) {
        C37941pb c37941pb;
        C38736H4a c38736H4a;
        InterfaceC37961pd AiD = AiD();
        C37771pE c37771pE = null;
        if (AiD != null) {
            c37941pb = AiD.ErP(c1dy);
        } else {
            c37941pb = null;
        }
        JMK Bf2 = Bf2();
        if (Bf2 != null) {
            c38736H4a = Bf2.Ey6(c1dy);
        } else {
            c38736H4a = null;
        }
        InterfaceC37791pH BlP = BlP();
        if (BlP != null) {
            c37771pE = BlP.F5R(c1dy);
        }
        return new C115895Mf(c37941pb, c38736H4a, c37771pE);
    }
}
