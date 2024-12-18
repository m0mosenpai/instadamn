package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* loaded from: classes7.dex */
public final class HT5 extends C17T implements InterfaceC43578JMm {
    @Override // X.InterfaceC43578JMm
    public final BeneficiaryType Afu() {
        return (BeneficiaryType) A0N(506959956, C43275JAu.A00);
    }

    @Override // X.InterfaceC43578JMm
    public final FundraiserCampaignTypeEnum B9C() {
        return (FundraiserCampaignTypeEnum) A0N(-2077350418, C43276JAv.A00);
    }

    @Override // X.InterfaceC43578JMm
    public final UserRoleOnFundraiser CE2() {
        return (UserRoleOnFundraiser) A0M(339473514, C43277JAw.A00);
    }

    @Override // X.InterfaceC43578JMm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40257HtN.A00(this));
    }

    @Override // X.InterfaceC43578JMm
    public final boolean AlL() {
        return getBooleanValueByHashCode(1246209572);
    }

    @Override // X.InterfaceC43578JMm
    public final Long B24() {
        return A0L(1725551537);
    }

    @Override // X.InterfaceC43578JMm
    public final boolean BB3() {
        return getBooleanValueByHashCode(-957271681);
    }

    @Override // X.InterfaceC43578JMm
    public final Integer BcO() {
        return getOptionalIntValueByHashCode(2117142322);
    }

    @Override // X.InterfaceC43578JMm
    public final H5G Ezp() {
        String A0i = A0i(506758053);
        BeneficiaryType Afu = Afu();
        String A0i2 = A0i(-1511230224);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1246209572);
        Long A0L = A0L(1725551537);
        String A0i3 = A0i(-1122682371);
        String A0i4 = A0i(2123044865);
        String A0j = A0j(-761937713);
        String A0i5 = A0i(26173988);
        FundraiserCampaignTypeEnum B9C = B9C();
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(-957271681);
        String A0i6 = A0i(-1729814302);
        return new H5G(Afu, CE2(), B9C, getOptionalIntValueByHashCode(2117142322), A0L, A0i, A0i2, A0i3, A0i4, A0j, A0i5, A0i6, A0i(-566195809), booleanValueByHashCode, booleanValueByHashCode2);
    }

    @Override // X.InterfaceC43578JMm
    public final String getBeneficiaryName() {
        return A0i(506758053);
    }

    @Override // X.InterfaceC43578JMm
    public final String getBeneficiaryUsername() {
        return A0i(-1511230224);
    }

    @Override // X.InterfaceC43578JMm
    public final String getFormattedFundraiserProgressInfoText() {
        return A0i(-1122682371);
    }

    @Override // X.InterfaceC43578JMm
    public final String getFormattedGoalAmount() {
        return A0i(2123044865);
    }

    @Override // X.InterfaceC43578JMm
    public final String getFundraiserId() {
        return A0j(-761937713);
    }

    @Override // X.InterfaceC43578JMm
    public final String getFundraiserTitle() {
        return A0i(26173988);
    }

    @Override // X.InterfaceC43578JMm
    public final String getOwnerUsername() {
        return A0i(-1729814302);
    }

    @Override // X.InterfaceC43578JMm
    public final String getThumbnailDisplayUrl() {
        return A0i(-566195809);
    }
}
