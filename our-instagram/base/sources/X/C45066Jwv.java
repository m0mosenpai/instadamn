package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.Jwv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45066Jwv extends C0T6 {
    public final int A00;
    public final ImageUrl A01;
    public final DirectThreadAnalyticsParams A02;
    public final PrivacyMediaOverlayViewModel A03;
    public final C38321qM A04;
    public final EnumC40111tc A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45066Jwv) {
                C45066Jwv c45066Jwv = (C45066Jwv) obj;
                if (!C14360o3.A0K(this.A06, c45066Jwv.A06) || !C14360o3.A0K(this.A04, c45066Jwv.A04) || this.A05 != c45066Jwv.A05 || this.A07 != c45066Jwv.A07 || !C14360o3.A0K(this.A01, c45066Jwv.A01) || this.A00 != c45066Jwv.A00 || !C14360o3.A0K(this.A03, c45066Jwv.A03) || this.A08 != c45066Jwv.A08 || !C14360o3.A0K(this.A02, c45066Jwv.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A08, (((((AbstractC167007dF.A0D(this.A07, ((((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C45066Jwv(ImageUrl imageUrl, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, C38321qM c38321qM, EnumC40111tc enumC40111tc, String str, int i, boolean z, boolean z2) {
        this.A06 = str;
        this.A04 = c38321qM;
        this.A05 = enumC40111tc;
        this.A07 = z;
        this.A01 = imageUrl;
        this.A00 = i;
        this.A03 = privacyMediaOverlayViewModel;
        this.A08 = z2;
        this.A02 = directThreadAnalyticsParams;
    }
}
