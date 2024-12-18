package X;

import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HtN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40257HtN {
    public static Map A00(InterfaceC43578JMm interfaceC43578JMm) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43578JMm.getBeneficiaryName() != null) {
            A1I.put("beneficiary_name", interfaceC43578JMm.getBeneficiaryName());
        }
        String str2 = null;
        if (interfaceC43578JMm.Afu() != null) {
            BeneficiaryType Afu = interfaceC43578JMm.Afu();
            if (Afu != null) {
                str = Afu.A00;
            } else {
                str = null;
            }
            A1I.put(MSV.A00(182), str);
        }
        if (interfaceC43578JMm.getBeneficiaryUsername() != null) {
            A1I.put("beneficiary_username", interfaceC43578JMm.getBeneficiaryUsername());
        }
        interfaceC43578JMm.AlL();
        A1I.put("can_viewer_share_to_feed", Boolean.valueOf(interfaceC43578JMm.AlL()));
        if (interfaceC43578JMm.B24() != null) {
            A1I.put("end_time", interfaceC43578JMm.B24());
        }
        if (interfaceC43578JMm.getFormattedFundraiserProgressInfoText() != null) {
            A1I.put("formatted_fundraiser_progress_info_text", interfaceC43578JMm.getFormattedFundraiserProgressInfoText());
        }
        if (interfaceC43578JMm.getFormattedGoalAmount() != null) {
            A1I.put("formatted_goal_amount", interfaceC43578JMm.getFormattedGoalAmount());
        }
        if (interfaceC43578JMm.getFundraiserId() != null) {
            A1I.put("fundraiser_id", interfaceC43578JMm.getFundraiserId());
        }
        if (interfaceC43578JMm.getFundraiserTitle() != null) {
            A1I.put("fundraiser_title", interfaceC43578JMm.getFundraiserTitle());
        }
        if (interfaceC43578JMm.B9C() != null) {
            FundraiserCampaignTypeEnum B9C = interfaceC43578JMm.B9C();
            if (B9C != null) {
                str2 = B9C.A00;
            }
            A1I.put("fundraiser_type", str2);
        }
        interfaceC43578JMm.BB3();
        A1I.put("has_active_fundraiser", Boolean.valueOf(interfaceC43578JMm.BB3()));
        if (interfaceC43578JMm.getOwnerUsername() != null) {
            A1I.put("owner_username", interfaceC43578JMm.getOwnerUsername());
        }
        if (interfaceC43578JMm.BcO() != null) {
            A1I.put("percent_raised", interfaceC43578JMm.BcO());
        }
        if (interfaceC43578JMm.getThumbnailDisplayUrl() != null) {
            A1I.put("thumbnail_display_url", interfaceC43578JMm.getThumbnailDisplayUrl());
        }
        if (interfaceC43578JMm.CE2() != null) {
            UserRoleOnFundraiser CE2 = interfaceC43578JMm.CE2();
            C14360o3.A0B(CE2, 0);
            A1I.put("user_role", CE2.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
