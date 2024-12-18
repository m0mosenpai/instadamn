package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.io.IOException;

/* renamed from: X.1ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39011ra {
    public static C39021rb parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str10 = null;
            Boolean bool5 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("beneficiary_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("beneficiary_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("can_viewer_donate".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("can_viewer_remove_fundraiser_tag".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("contextual_title_str".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("formatted_amount_raised".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("formatted_fundraiser_progress_info_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("formatted_goal_amount".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("fundraiser_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("fundraiser_owner_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("fundraiser_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("fundraiser_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    fundraiserCampaignTypeEnum = (FundraiserCampaignTypeEnum) FundraiserCampaignTypeEnum.A01.get(A1P);
                    if (fundraiserCampaignTypeEnum == null) {
                        fundraiserCampaignTypeEnum = FundraiserCampaignTypeEnum.A0N;
                    }
                } else if ("has_standalone_fundraiser".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_media_owner_fundraiser_owner".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("progress_str".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("show_fundraiser_owner_attribution".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("thumbnail_display_url".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            return new C39021rb(simpleImageUrl, fundraiserCampaignTypeEnum, bool, bool2, bool3, bool4, bool5, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
