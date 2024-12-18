package X;

import com.instagram.api.schemas.PivotPageInsightsTip;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BfI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26029BfI extends C0T6 {
    public final PivotPageInsightsTip A00;
    public final C69749Vuj A01;
    public final C69749Vuj A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public C26029BfI(PivotPageInsightsTip pivotPageInsightsTip, C69749Vuj c69749Vuj, C69749Vuj c69749Vuj2, ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, String str, String str2, String str3, boolean z) {
        AbstractC167007dF.A1G(str, 1, imageUrl2);
        this.A07 = str;
        this.A08 = str2;
        this.A04 = imageUrl;
        this.A06 = str3;
        this.A03 = imageUrl2;
        this.A01 = c69749Vuj;
        this.A02 = c69749Vuj2;
        this.A05 = bool;
        this.A09 = z;
        this.A00 = pivotPageInsightsTip;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26029BfI) {
                C26029BfI c26029BfI = (C26029BfI) obj;
                if (!C14360o3.A0K(this.A07, c26029BfI.A07) || !C14360o3.A0K(this.A08, c26029BfI.A08) || !C14360o3.A0K(this.A04, c26029BfI.A04) || !C14360o3.A0K(this.A06, c26029BfI.A06) || !C14360o3.A0K(this.A03, c26029BfI.A03) || !C14360o3.A0K(this.A01, c26029BfI.A01) || !C14360o3.A0K(this.A02, c26029BfI.A02) || !C14360o3.A0K(this.A05, c26029BfI.A05) || this.A09 != c26029BfI.A09 || !C14360o3.A0K(this.A00, c26029BfI.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A09, (((((AbstractC166997dE.A0J(this.A03, (((((AbstractC166987dD.A0J(this.A07) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PivotPageDefaultHeaderModel(title=");
        A1C.append(this.A07);
        A1C.append(", username=");
        A1C.append(this.A08);
        A1C.append(", userProfilePictureUrl=");
        A1C.append(this.A04);
        A1C.append(", formattedCount=");
        A1C.append(this.A06);
        A1C.append(", thumbnailUrl=");
        A1C.append(this.A03);
        A1C.append(", usernameAttributionContentRes=");
        A1C.append(this.A01);
        A1C.append(", usernamePlaceholderContentRes=");
        A1C.append(this.A02);
        A1C.append(", isUsernameVerified=");
        A1C.append(this.A05);
        A1C.append(", isInsightsCtaEnabled=");
        A1C.append(this.A09);
        A1C.append(", insightsTip=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
