package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes;

/* renamed from: X.H3c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38715H3c extends C0T6 implements C5FW {
    public final IGBuyWithPrimeExperienceTypes A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // X.C5FW
    public final C38715H3c EuX() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38715H3c) {
                C38715H3c c38715H3c = (C38715H3c) obj;
                if (!C14360o3.A0K(this.A03, c38715H3c.A03) || !C14360o3.A0K(this.A01, c38715H3c.A01) || !C14360o3.A0K(this.A02, c38715H3c.A02) || !C14360o3.A0K(this.A04, c38715H3c.A04) || !C14360o3.A0K(this.A05, c38715H3c.A05) || this.A00 != c38715H3c.A00 || !C14360o3.A0K(this.A06, c38715H3c.A06) || !C14360o3.A0K(this.A07, c38715H3c.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5FW
    public final Integer AXu() {
        return this.A01;
    }

    @Override // X.C5FW
    public final Integer AXv() {
        return this.A02;
    }

    @Override // X.C5FW
    public final String AcA() {
        return this.A04;
    }

    @Override // X.C5FW
    public final String Afl() {
        return this.A05;
    }

    @Override // X.C5FW
    public final IGBuyWithPrimeExperienceTypes AjL() {
        return this.A00;
    }

    @Override // X.C5FW
    public final String Anw() {
        return this.A06;
    }

    @Override // X.C5FW
    public final String Bb3() {
        return this.A07;
    }

    @Override // X.C5FW
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGBuyWithPrimeIABPostClickDataExtensionDict", HoB.A00(this));
    }

    @Override // X.C5FW
    public final String getAccessToken() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A07);
    }

    public C38715H3c(IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        this.A03 = str;
        this.A01 = num;
        this.A02 = num2;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = iGBuyWithPrimeExperienceTypes;
        this.A06 = str4;
        this.A07 = str5;
    }
}
