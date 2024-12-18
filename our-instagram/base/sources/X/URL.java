package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class URL extends C0T6 implements XGK {
    public final User A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    @Override // X.XGK
    public final URL F0E(C1DY c1dy) {
        return this;
    }

    @Override // X.XGK
    public final URL F0F(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URL) {
                URL url = (URL) obj;
                if (!C14360o3.A0K(this.A00, url.A00) || !C14360o3.A0K(this.A05, url.A05) || !C14360o3.A0K(this.A06, url.A06) || !C14360o3.A0K(this.A07, url.A07) || !C14360o3.A0K(this.A08, url.A08) || !C14360o3.A0K(this.A09, url.A09) || !C14360o3.A0K(this.A04, url.A04) || !C14360o3.A0K(this.A01, url.A01) || !C14360o3.A0K(this.A02, url.A02) || !C14360o3.A0K(this.A0A, url.A0A) || !C14360o3.A0K(this.A0B, url.A0B) || !C14360o3.A0K(this.A0C, url.A0C) || !C14360o3.A0K(this.A03, url.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGK
    public final User AdB() {
        return this.A00;
    }

    @Override // X.XGK
    public final String Af0() {
        return this.A05;
    }

    @Override // X.XGK
    public final String As3() {
        return this.A06;
    }

    @Override // X.XGK
    public final String AxN() {
        return this.A07;
    }

    @Override // X.XGK
    public final String AxO() {
        return this.A08;
    }

    @Override // X.XGK
    public final Long B2C() {
        return this.A04;
    }

    @Override // X.XGK
    public final Boolean B7Y() {
        return this.A01;
    }

    @Override // X.XGK
    public final Boolean CGB() {
        return this.A03;
    }

    @Override // X.XGK
    public final Boolean CZx() {
        return this.A02;
    }

    @Override // X.XGK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryCountdownTappableData", VP2.A00(this));
    }

    @Override // X.XGK
    public final String getEndBackgroundColor() {
        return this.A09;
    }

    @Override // X.XGK
    public final String getStartBackgroundColor() {
        return this.A0A;
    }

    @Override // X.XGK
    public final String getText() {
        return this.A0B;
    }

    @Override // X.XGK
    public final String getTextColor() {
        return this.A0C;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31;
        Boolean bool = this.A03;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0M + i;
    }

    public URL(User user, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = user;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A04 = l;
        this.A01 = bool;
        this.A02 = bool2;
        this.A0A = str6;
        this.A0B = str7;
        this.A0C = str8;
        this.A03 = bool3;
    }

    @Override // X.XGK
    public final XGK EA4(C1DY c1dy) {
        return this;
    }
}
