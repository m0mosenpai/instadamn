package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* loaded from: classes7.dex */
public final class H5G extends C0T6 implements InterfaceC43578JMm {
    public final BeneficiaryType A00;
    public final UserRoleOnFundraiser A01;
    public final FundraiserCampaignTypeEnum A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;

    @Override // X.InterfaceC43578JMm
    public final H5G Ezp() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5G) {
                H5G h5g = (H5G) obj;
                if (!C14360o3.A0K(this.A05, h5g.A05) || this.A00 != h5g.A00 || !C14360o3.A0K(this.A06, h5g.A06) || this.A0D != h5g.A0D || !C14360o3.A0K(this.A04, h5g.A04) || !C14360o3.A0K(this.A07, h5g.A07) || !C14360o3.A0K(this.A08, h5g.A08) || !C14360o3.A0K(this.A09, h5g.A09) || !C14360o3.A0K(this.A0A, h5g.A0A) || this.A02 != h5g.A02 || this.A0E != h5g.A0E || !C14360o3.A0K(this.A0B, h5g.A0B) || !C14360o3.A0K(this.A03, h5g.A03) || !C14360o3.A0K(this.A0C, h5g.A0C) || this.A01 != h5g.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public H5G(BeneficiaryType beneficiaryType, UserRoleOnFundraiser userRoleOnFundraiser, FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        C14360o3.A0B(userRoleOnFundraiser, 15);
        this.A05 = str;
        this.A00 = beneficiaryType;
        this.A06 = str2;
        this.A0D = z;
        this.A04 = l;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A02 = fundraiserCampaignTypeEnum;
        this.A0E = z2;
        this.A0B = str7;
        this.A03 = num;
        this.A0C = str8;
        this.A01 = userRoleOnFundraiser;
    }

    @Override // X.InterfaceC43578JMm
    public final BeneficiaryType Afu() {
        return this.A00;
    }

    @Override // X.InterfaceC43578JMm
    public final boolean AlL() {
        return this.A0D;
    }

    @Override // X.InterfaceC43578JMm
    public final Long B24() {
        return this.A04;
    }

    @Override // X.InterfaceC43578JMm
    public final FundraiserCampaignTypeEnum B9C() {
        return this.A02;
    }

    @Override // X.InterfaceC43578JMm
    public final boolean BB3() {
        return this.A0E;
    }

    @Override // X.InterfaceC43578JMm
    public final Integer BcO() {
        return this.A03;
    }

    @Override // X.InterfaceC43578JMm
    public final UserRoleOnFundraiser CE2() {
        return this.A01;
    }

    @Override // X.InterfaceC43578JMm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStandaloneFundraiserDict", AbstractC40257HtN.A00(this));
    }

    @Override // X.InterfaceC43578JMm
    public final String getBeneficiaryName() {
        return this.A05;
    }

    @Override // X.InterfaceC43578JMm
    public final String getBeneficiaryUsername() {
        return this.A06;
    }

    @Override // X.InterfaceC43578JMm
    public final String getFormattedFundraiserProgressInfoText() {
        return this.A07;
    }

    @Override // X.InterfaceC43578JMm
    public final String getFormattedGoalAmount() {
        return this.A08;
    }

    @Override // X.InterfaceC43578JMm
    public final String getFundraiserId() {
        return this.A09;
    }

    @Override // X.InterfaceC43578JMm
    public final String getFundraiserTitle() {
        return this.A0A;
    }

    @Override // X.InterfaceC43578JMm
    public final String getOwnerUsername() {
        return this.A0B;
    }

    @Override // X.InterfaceC43578JMm
    public final String getThumbnailDisplayUrl() {
        return this.A0C;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (((((AbstractC167007dF.A0D(this.A0E, (((((((((((AbstractC167007dF.A0D(this.A0D, ((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A0C)) * 31);
    }
}
