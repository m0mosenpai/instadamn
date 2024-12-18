package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38719H3h extends C0T6 implements C5L5 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.C5L5
    public final C38719H3h Eun() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38719H3h) {
                C38719H3h c38719H3h = (C38719H3h) obj;
                if (!C14360o3.A0K(this.A00, c38719H3h.A00) || !C14360o3.A0K(this.A01, c38719H3h.A01) || !C14360o3.A0K(this.A02, c38719H3h.A02) || !C14360o3.A0K(this.A03, c38719H3h.A03) || !C14360o3.A0K(this.A04, c38719H3h.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5L5
    public final String BIM() {
        return this.A00;
    }

    @Override // X.C5L5
    public final String BIN() {
        return this.A01;
    }

    @Override // X.C5L5
    public final String BeG() {
        return this.A02;
    }

    @Override // X.C5L5
    public final String Bge() {
        return this.A03;
    }

    @Override // X.C5L5
    public final String Brn() {
        return this.A04;
    }

    @Override // X.C5L5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGLeadGenPrivacyPolicyInfoDict", AbstractC39982HoN.A00(this));
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C38719H3h(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
