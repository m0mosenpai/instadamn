package X;

import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.io.IOException;

/* renamed from: X.HtO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40258HtO {
    public static H5G parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str = null;
            BeneficiaryType beneficiaryType = null;
            String str2 = null;
            Long l = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum = null;
            String str7 = null;
            Integer num = null;
            String str8 = null;
            UserRoleOnFundraiser userRoleOnFundraiser = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("beneficiary_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (MSV.A00(182).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    beneficiaryType = (BeneficiaryType) BeneficiaryType.A01.get(A1P3);
                    if (beneficiaryType == null) {
                        beneficiaryType = BeneficiaryType.A05;
                    }
                } else if ("beneficiary_username".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("can_viewer_share_to_feed".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("end_time".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("formatted_fundraiser_progress_info_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("formatted_goal_amount".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("fundraiser_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("fundraiser_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("fundraiser_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    fundraiserCampaignTypeEnum = (FundraiserCampaignTypeEnum) FundraiserCampaignTypeEnum.A01.get(A1P2);
                    if (fundraiserCampaignTypeEnum == null) {
                        fundraiserCampaignTypeEnum = FundraiserCampaignTypeEnum.A0N;
                    }
                } else if ("has_active_fundraiser".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("owner_username".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("percent_raised".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("thumbnail_display_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("user_role".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    userRoleOnFundraiser = (UserRoleOnFundraiser) UserRoleOnFundraiser.A01.get(A1P);
                    if (userRoleOnFundraiser == null) {
                        userRoleOnFundraiser = UserRoleOnFundraiser.A07;
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("can_viewer_share_to_feed", c16l, "StandaloneFundraiserDictImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (userRoleOnFundraiser == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("user_role", c16l, "StandaloneFundraiserDictImpl");
                } else {
                    return new H5G(beneficiaryType, userRoleOnFundraiser, fundraiserCampaignTypeEnum, num, l, str, str2, str3, str4, str5, str6, str7, str8, bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("has_active_fundraiser", c16l, "StandaloneFundraiserDictImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
