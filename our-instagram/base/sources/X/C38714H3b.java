package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes;
import com.instagram.api.schemas.PartnerTypes;

/* renamed from: X.H3b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38714H3b extends C0T6 implements C5FV {
    public final BuyWithIntegrationPostClickExperienceTypes A00;
    public final PartnerTypes A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // X.C5FV
    public final C38714H3b EuW() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38714H3b) {
                C38714H3b c38714H3b = (C38714H3b) obj;
                if (!C14360o3.A0K(this.A04, c38714H3b.A04) || !C14360o3.A0K(this.A02, c38714H3b.A02) || !C14360o3.A0K(this.A05, c38714H3b.A05) || !C14360o3.A0K(this.A06, c38714H3b.A06) || this.A00 != c38714H3b.A00 || !C14360o3.A0K(this.A03, c38714H3b.A03) || !C14360o3.A0K(this.A07, c38714H3b.A07) || this.A01 != c38714H3b.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5FV
    public final Integer AXv() {
        return this.A02;
    }

    @Override // X.C5FV
    public final String AcA() {
        return this.A05;
    }

    @Override // X.C5FV
    public final String Afl() {
        return this.A06;
    }

    @Override // X.C5FV
    public final BuyWithIntegrationPostClickExperienceTypes AjJ() {
        return this.A00;
    }

    @Override // X.C5FV
    public final Long BYS() {
        return this.A03;
    }

    @Override // X.C5FV
    public final String Bb3() {
        return this.A07;
    }

    @Override // X.C5FV
    public final PartnerTypes Bbc() {
        return this.A01;
    }

    @Override // X.C5FV
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGBuyWithIntegrationIABPostClickDataExtensionDict", AbstractC39974HoA.A00(this));
    }

    @Override // X.C5FV
    public final String getAccessToken() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38714H3b(BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes, PartnerTypes partnerTypes, Integer num, Long l, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A02 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = buyWithIntegrationPostClickExperienceTypes;
        this.A03 = l;
        this.A07 = str4;
        this.A01 = partnerTypes;
    }
}
