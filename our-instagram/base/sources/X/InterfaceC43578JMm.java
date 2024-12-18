package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* renamed from: X.JMm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC43578JMm {
    public static final IXT A00 = IXT.A00;

    BeneficiaryType Afu();

    boolean AlL();

    Long B24();

    FundraiserCampaignTypeEnum B9C();

    boolean BB3();

    Integer BcO();

    UserRoleOnFundraiser CE2();

    H5G Ezp();

    TreeUpdaterJNI F7o();

    String getBeneficiaryName();

    String getBeneficiaryUsername();

    String getFormattedFundraiserProgressInfoText();

    String getFormattedGoalAmount();

    String getFundraiserId();

    String getFundraiserTitle();

    String getOwnerUsername();

    String getThumbnailDisplayUrl();
}
