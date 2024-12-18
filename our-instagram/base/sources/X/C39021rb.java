package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* renamed from: X.1rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39021rb extends C0T6 implements InterfaceC39031rc {
    public final ImageUrl A00;
    public final FundraiserCampaignTypeEnum A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;

    @Override // X.InterfaceC39031rc
    public final C39021rb Ezr() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39021rb) {
                C39021rb c39021rb = (C39021rb) obj;
                if (!C14360o3.A0K(this.A07, c39021rb.A07) || !C14360o3.A0K(this.A08, c39021rb.A08) || !C14360o3.A0K(this.A02, c39021rb.A02) || !C14360o3.A0K(this.A03, c39021rb.A03) || !C14360o3.A0K(this.A09, c39021rb.A09) || !C14360o3.A0K(this.A0A, c39021rb.A0A) || !C14360o3.A0K(this.A0B, c39021rb.A0B) || !C14360o3.A0K(this.A0C, c39021rb.A0C) || !C14360o3.A0K(this.A0D, c39021rb.A0D) || !C14360o3.A0K(this.A0E, c39021rb.A0E) || !C14360o3.A0K(this.A0F, c39021rb.A0F) || this.A01 != c39021rb.A01 || !C14360o3.A0K(this.A04, c39021rb.A04) || !C14360o3.A0K(this.A05, c39021rb.A05) || !C14360o3.A0K(this.A0G, c39021rb.A0G) || !C14360o3.A0K(this.A06, c39021rb.A06) || !C14360o3.A0K(this.A00, c39021rb.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A07;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A08;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A03;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0B;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0C;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0D;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0E;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A0F;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum = this.A01;
        int hashCode12 = (hashCode11 + (fundraiserCampaignTypeEnum == null ? 0 : fundraiserCampaignTypeEnum.hashCode())) * 31;
        Boolean bool3 = this.A04;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A05;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str10 = this.A0G;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool5 = this.A06;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        ImageUrl imageUrl = this.A00;
        return hashCode16 + (imageUrl != null ? imageUrl.hashCode() : 0);
    }

    @Override // X.InterfaceC39031rc
    public final Boolean AlC() {
        return this.A02;
    }

    @Override // X.InterfaceC39031rc
    public final Boolean AlG() {
        return this.A03;
    }

    @Override // X.InterfaceC39031rc
    public final FundraiserCampaignTypeEnum B9C() {
        return this.A01;
    }

    @Override // X.InterfaceC39031rc
    public final Boolean BCh() {
        return this.A04;
    }

    @Override // X.InterfaceC39031rc
    public final Boolean BwP() {
        return this.A06;
    }

    @Override // X.InterfaceC39031rc
    public final ImageUrl C7y() {
        return this.A00;
    }

    @Override // X.InterfaceC39031rc
    public final Boolean CYG() {
        return this.A05;
    }

    @Override // X.InterfaceC39031rc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStandaloneFundraiserTag", AbstractC37346Gco.A00(this));
    }

    @Override // X.InterfaceC39031rc
    public final String getBeneficiaryName() {
        return this.A07;
    }

    @Override // X.InterfaceC39031rc
    public final String getBeneficiaryUsername() {
        return this.A08;
    }

    @Override // X.InterfaceC39031rc
    public final String getContextualTitleStr() {
        return this.A09;
    }

    @Override // X.InterfaceC39031rc
    public final String getFormattedAmountRaised() {
        return this.A0A;
    }

    @Override // X.InterfaceC39031rc
    public final String getFormattedFundraiserProgressInfoText() {
        return this.A0B;
    }

    @Override // X.InterfaceC39031rc
    public final String getFormattedGoalAmount() {
        return this.A0C;
    }

    @Override // X.InterfaceC39031rc
    public final String getFundraiserId() {
        return this.A0D;
    }

    @Override // X.InterfaceC39031rc
    public final String getFundraiserOwnerUsername() {
        return this.A0E;
    }

    @Override // X.InterfaceC39031rc
    public final String getFundraiserTitle() {
        return this.A0F;
    }

    @Override // X.InterfaceC39031rc
    public final String getProgressStr() {
        return this.A0G;
    }

    public C39021rb(ImageUrl imageUrl, FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.A07 = str;
        this.A08 = str2;
        this.A02 = bool;
        this.A03 = bool2;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A0C = str6;
        this.A0D = str7;
        this.A0E = str8;
        this.A0F = str9;
        this.A01 = fundraiserCampaignTypeEnum;
        this.A04 = bool3;
        this.A05 = bool4;
        this.A0G = str10;
        this.A06 = bool5;
        this.A00 = imageUrl;
    }
}
