package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes5.dex */
public final class C1M extends C17T implements InterfaceC31131DmE {
    public InterfaceC31133DmG A00;

    @Override // X.InterfaceC31131DmE
    public final InterfaceC31133DmG BdT() {
        InterfaceC31133DmG interfaceC31133DmG = this.A00;
        if (interfaceC31133DmG == null) {
            return (InterfaceC31133DmG) A04(-945543744, C0Z.class);
        }
        return interfaceC31133DmG;
    }

    @Override // X.InterfaceC31131DmE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CFQ.A00(this));
    }

    @Override // X.InterfaceC31131DmE
    public final InterfaceC31131DmE EBG(C1DY c1dy) {
        InterfaceC31133DmG BdT = BdT();
        BdT.E8s(c1dy);
        this.A00 = BdT;
        return this;
    }

    @Override // X.InterfaceC31131DmE
    public final C26159Bhk F48(C1DY c1dy) {
        return new C26159Bhk(BdT().Es2(c1dy), A0k(-1679792199), A0h(627549609));
    }

    @Override // X.InterfaceC31131DmE
    public final C26159Bhk F49(C1DV c1dv) {
        return F48(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC31131DmE
    public final String getAttributionAppId() {
        return A0k(-1679792199);
    }

    @Override // X.InterfaceC31131DmE
    public final String getAttributionAppName() {
        return A0h(627549609);
    }
}
