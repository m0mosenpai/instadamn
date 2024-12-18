package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class HT4 extends C17T implements InterfaceC104924o5 {
    public InterfaceC43583JMr A00;

    @Override // X.InterfaceC104924o5
    public final InterfaceC43583JMr BVT() {
        InterfaceC43583JMr interfaceC43583JMr = this.A00;
        if (interfaceC43583JMr == null) {
            return (InterfaceC43583JMr) A04(541071095, HRG.class);
        }
        return interfaceC43583JMr;
    }

    @Override // X.InterfaceC104924o5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40256HtM.A00(this));
    }

    @Override // X.InterfaceC104924o5
    public final InterfaceC104924o5 E9v(C1DY c1dy) {
        InterfaceC43583JMr BVT = BVT();
        BVT.E9N(c1dy);
        this.A00 = BVT;
        return this;
    }

    @Override // X.InterfaceC104924o5
    public final C114615Fj Ezn(C1DY c1dy) {
        return new C114615Fj(BVT().Ewx(c1dy));
    }

    @Override // X.InterfaceC104924o5
    public final C114615Fj Ezo(C1DV c1dv) {
        return Ezn(AbstractC25235BEs.A0b(c1dv));
    }
}
