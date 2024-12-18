package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H4F extends C0T6 implements JM7 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // X.JM7
    public final H4F Ewh() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4F) {
                H4F h4f = (H4F) obj;
                if (!C14360o3.A0K(this.A00, h4f.A00) || !C14360o3.A0K(this.A01, h4f.A01) || !C14360o3.A0K(this.A02, h4f.A02) || !C14360o3.A0K(this.A03, h4f.A03) || !C14360o3.A0K(this.A04, h4f.A04) || !C14360o3.A0K(this.A05, h4f.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM7
    public final String B4o() {
        return this.A00;
    }

    @Override // X.JM7
    public final String Bhi() {
        return this.A02;
    }

    @Override // X.JM7
    public final String Bhz() {
        return this.A03;
    }

    @Override // X.JM7
    public final String BiG() {
        return this.A04;
    }

    @Override // X.JM7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMicroFbUserDict", AbstractC40079Hq5.A00(this));
    }

    @Override // X.JM7
    public final String getFullName() {
        return this.A01;
    }

    @Override // X.JM7
    public final String getUsername() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public H4F(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }
}
