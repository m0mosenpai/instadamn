package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class URK extends C0T6 implements XGG {
    public final Boolean A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final String A07;
    public final String A08;

    @Override // X.XGG
    public final URK F0B() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URK) {
                URK urk = (URK) obj;
                if (!C14360o3.A0K(this.A07, urk.A07) || !C14360o3.A0K(this.A01, urk.A01) || !C14360o3.A0K(this.A02, urk.A02) || !C14360o3.A0K(this.A03, urk.A03) || !C14360o3.A0K(this.A00, urk.A00) || !C14360o3.A0K(this.A04, urk.A04) || !C14360o3.A0K(this.A05, urk.A05) || !C14360o3.A0K(this.A06, urk.A06) || !C14360o3.A0K(this.A08, urk.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGG
    public final String Aev() {
        return this.A07;
    }

    @Override // X.XGG
    public final Float Aj2() {
        return this.A01;
    }

    @Override // X.XGG
    public final Float AjF() {
        return this.A02;
    }

    @Override // X.XGG
    public final Float AjG() {
        return this.A03;
    }

    @Override // X.XGG
    public final Float BKy() {
        return this.A04;
    }

    @Override // X.XGG
    public final Float BL2() {
        return this.A05;
    }

    @Override // X.XGG
    public final Float Bav() {
        return this.A06;
    }

    @Override // X.XGG
    public final String C6B() {
        return this.A08;
    }

    @Override // X.XGG
    public final Boolean CSK() {
        return this.A00;
    }

    @Override // X.XGG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryChatPartialRenderInfo", VP1.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((((((((AbstractC167017dG.A0O(this.A07) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31;
        String str = this.A08;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public URK(Boolean bool, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, String str, String str2) {
        this.A07 = str;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = bool;
        this.A04 = f4;
        this.A05 = f5;
        this.A06 = f6;
        this.A08 = str2;
    }
}
