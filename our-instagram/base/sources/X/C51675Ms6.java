package X;

import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.user.model.User;

/* renamed from: X.Ms6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51675Ms6 extends C0T6 {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Long A07;
    public final String A08;

    public C51675Ms6(Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A07 = l;
        this.A00 = bool;
        this.A04 = str5;
        this.A03 = str6;
        this.A08 = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51675Ms6) {
                C51675Ms6 c51675Ms6 = (C51675Ms6) obj;
                if (!C14360o3.A0K(this.A05, c51675Ms6.A05) || !C14360o3.A0K(this.A06, c51675Ms6.A06) || !C14360o3.A0K(this.A01, c51675Ms6.A01) || !C14360o3.A0K(this.A02, c51675Ms6.A02) || !C14360o3.A0K(this.A07, c51675Ms6.A07) || !C14360o3.A0K(this.A00, c51675Ms6.A00) || !C14360o3.A0K(this.A04, c51675Ms6.A04) || !C14360o3.A0K(this.A03, c51675Ms6.A03) || !C14360o3.A0K(this.A08, c51675Ms6.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final User A00() {
        User user = new User(this.A01, this.A06);
        user.A0r(this.A08);
        user.A0q(this.A02);
        user.A03.EPn(BrandedContentBrandTaggingRequestApprovalStatus.A07);
        return user;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A05)))) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A08);
    }
}
