package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38730H3t extends C0T6 implements InterfaceC104884nz {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC104884nz
    public final C38730H3t EvK() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38730H3t) {
                C38730H3t c38730H3t = (C38730H3t) obj;
                if (!C14360o3.A0K(this.A00, c38730H3t.A00) || !C14360o3.A0K(this.A01, c38730H3t.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC104884nz
    public final String BIk() {
        return this.A01;
    }

    @Override // X.InterfaceC104884nz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGOopsSurveyInfoDict", AbstractC40011Hos.A00(this));
    }

    @Override // X.InterfaceC104884nz
    public final String getCategory() {
        return this.A00;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C38730H3t(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
