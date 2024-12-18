package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H6z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38809H6z extends C0T6 implements InterfaceC43544JLe {
    public final Double A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC43544JLe
    public final C38809H6z F3c() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38809H6z) {
                C38809H6z c38809H6z = (C38809H6z) obj;
                if (!C14360o3.A0K(this.A01, c38809H6z.A01) || !C14360o3.A0K(this.A02, c38809H6z.A02) || !C14360o3.A0K(this.A00, c38809H6z.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43544JLe
    public final /* bridge */ /* synthetic */ C41092IHj AKd() {
        return new C41092IHj(this);
    }

    @Override // X.InterfaceC43544JLe
    public final String BxG() {
        return this.A01;
    }

    @Override // X.InterfaceC43544JLe
    public final String BxJ() {
        return this.A02;
    }

    @Override // X.InterfaceC43544JLe
    public final Double C8M() {
        return this.A00;
    }

    @Override // X.InterfaceC43544JLe
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTUserEngagementSignal", AbstractC40436HwR.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38809H6z(Double d, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = d;
    }
}
