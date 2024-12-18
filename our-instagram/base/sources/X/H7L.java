package X;

import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* loaded from: classes7.dex */
public final class H7L extends C0T6 implements JFT {
    public final FundraiserCampaignTypeEnum A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7L) {
                H7L h7l = (H7L) obj;
                if (!C14360o3.A0K(this.A02, h7l.A02) || !C14360o3.A0K(this.A03, h7l.A03) || !C14360o3.A0K(this.A04, h7l.A04) || !C14360o3.A0K(this.A05, h7l.A05) || this.A00 != h7l.A00 || !C14360o3.A0K(this.A07, h7l.A07) || !C14360o3.A0K(this.A08, h7l.A08) || !C14360o3.A0K(this.A06, h7l.A06) || !C14360o3.A0K(this.A01, h7l.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, (((((AbstractC166997dE.A0K(this.A03, AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31)) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H7L(FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = fundraiserCampaignTypeEnum;
        this.A07 = str5;
        this.A08 = str6;
        this.A06 = str7;
        this.A01 = bool;
    }
}
