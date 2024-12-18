package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H7d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38813H7d extends C0T6 implements JLG {
    public final C38815H7f A00;
    public final String A01;
    public final String A02;

    public C38813H7d(C38815H7f c38815H7f, String str, String str2) {
        C14360o3.A0B(str2, 3);
        this.A01 = str;
        this.A00 = c38815H7f;
        this.A02 = str2;
    }

    @Override // X.JLG
    public final C38813H7d F5b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38813H7d) {
                C38813H7d c38813H7d = (C38813H7d) obj;
                if (!C14360o3.A0K(this.A01, c38813H7d.A01) || !C14360o3.A0K(this.A00, c38813H7d.A00) || !C14360o3.A0K(this.A02, c38813H7d.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLG
    public final /* bridge */ /* synthetic */ JK5 BpJ() {
        return this.A00;
    }

    @Override // X.JLG
    public final String BpL() {
        return this.A02;
    }

    @Override // X.JLG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShoppingNetegoInStoryLabel", I30.A00(this));
    }

    @Override // X.JLG
    public final String getDestination() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00)) * 31);
    }
}
