package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115895Mf extends C0T6 implements InterfaceC115905Mg {
    public final C37941pb A00;
    public final C38736H4a A01;
    public final C37771pE A02;

    @Override // X.InterfaceC115905Mg
    public final InterfaceC115905Mg EBg(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC115905Mg
    public final C115895Mf F5W(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115895Mf) {
                C115895Mf c115895Mf = (C115895Mf) obj;
                if (!C14360o3.A0K(this.A00, c115895Mf.A00) || !C14360o3.A0K(this.A01, c115895Mf.A01) || !C14360o3.A0K(this.A02, c115895Mf.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C37941pb c37941pb = this.A00;
        int hashCode = (c37941pb == null ? 0 : c37941pb.hashCode()) * 31;
        C38736H4a c38736H4a = this.A01;
        int hashCode2 = (hashCode + (c38736H4a == null ? 0 : c38736H4a.hashCode())) * 31;
        C37771pE c37771pE = this.A02;
        return hashCode2 + (c37771pE != null ? c37771pE.hashCode() : 0);
    }

    @Override // X.InterfaceC115905Mg
    public final /* bridge */ /* synthetic */ InterfaceC37961pd AiD() {
        return this.A00;
    }

    @Override // X.InterfaceC115905Mg
    public final /* bridge */ /* synthetic */ JMK Bf2() {
        return this.A01;
    }

    @Override // X.InterfaceC115905Mg
    public final /* bridge */ /* synthetic */ InterfaceC37791pH BlP() {
        return this.A02;
    }

    @Override // X.InterfaceC115905Mg
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserStory", AbstractC40709I2p.A00(this));
    }

    public C115895Mf(C37941pb c37941pb, C38736H4a c38736H4a, C37771pE c37771pE) {
        this.A00 = c37941pb;
        this.A01 = c38736H4a;
        this.A02 = c37771pE;
    }
}
