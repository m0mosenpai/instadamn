package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H5X extends C0T6 implements JMV {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // X.JMV
    public final H5X F0L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5X) {
                H5X h5x = (H5X) obj;
                if (!C14360o3.A0K(this.A00, h5x.A00) || !C14360o3.A0K(this.A01, h5x.A01) || !C14360o3.A0K(this.A02, h5x.A02) || !C14360o3.A0K(this.A03, h5x.A03) || !C14360o3.A0K(this.A04, h5x.A04) || !C14360o3.A0K(this.A05, h5x.A05) || !C14360o3.A0K(this.A06, h5x.A06) || !C14360o3.A0K(this.A07, h5x.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMV
    public final String B4e() {
        return this.A00;
    }

    @Override // X.JMV
    public final String B4f() {
        return this.A01;
    }

    @Override // X.JMV
    public final String B4g() {
        return this.A02;
    }

    @Override // X.JMV
    public final String B4h() {
        return this.A03;
    }

    @Override // X.JMV
    public final String B4i() {
        return this.A04;
    }

    @Override // X.JMV
    public final String B4y() {
        return this.A05;
    }

    @Override // X.JMV
    public final String BTd() {
        return this.A06;
    }

    @Override // X.JMV
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryFBCommunityStickerDict", AbstractC40279Htj.A00(this));
    }

    @Override // X.JMV
    public final String getPk() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A07);
    }

    public H5X(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
    }
}
