package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.Bhk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26159Bhk extends C0T6 implements InterfaceC31131DmE {
    public final InterfaceC31133DmG A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC31131DmE
    public final C26159Bhk F48(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC31131DmE
    public final C26159Bhk F49(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26159Bhk) {
                C26159Bhk c26159Bhk = (C26159Bhk) obj;
                if (!C14360o3.A0K(this.A01, c26159Bhk.A01) || !C14360o3.A0K(this.A02, c26159Bhk.A02) || !C14360o3.A0K(this.A00, c26159Bhk.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31131DmE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsAppAttribution", CFQ.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)));
    }

    public C26159Bhk(InterfaceC31133DmG interfaceC31133DmG, String str, String str2) {
        AbstractC167027dH.A13(str, str2, interfaceC31133DmG);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = interfaceC31133DmG;
    }

    @Override // X.InterfaceC31131DmE
    public final InterfaceC31133DmG BdT() {
        return this.A00;
    }

    @Override // X.InterfaceC31131DmE
    public final String getAttributionAppId() {
        return this.A01;
    }

    @Override // X.InterfaceC31131DmE
    public final String getAttributionAppName() {
        return this.A02;
    }

    @Override // X.InterfaceC31131DmE
    public final InterfaceC31131DmE EBG(C1DY c1dy) {
        return this;
    }
}
