package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gco, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37346Gco {
    public static Map A00(InterfaceC39031rc interfaceC39031rc) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC39031rc.getBeneficiaryName() != null) {
            linkedHashMap.put("beneficiary_name", interfaceC39031rc.getBeneficiaryName());
        }
        if (interfaceC39031rc.getBeneficiaryUsername() != null) {
            linkedHashMap.put("beneficiary_username", interfaceC39031rc.getBeneficiaryUsername());
        }
        if (interfaceC39031rc.AlC() != null) {
            linkedHashMap.put("can_viewer_donate", interfaceC39031rc.AlC());
        }
        if (interfaceC39031rc.AlG() != null) {
            linkedHashMap.put("can_viewer_remove_fundraiser_tag", interfaceC39031rc.AlG());
        }
        if (interfaceC39031rc.getContextualTitleStr() != null) {
            linkedHashMap.put("contextual_title_str", interfaceC39031rc.getContextualTitleStr());
        }
        if (interfaceC39031rc.getFormattedAmountRaised() != null) {
            linkedHashMap.put("formatted_amount_raised", interfaceC39031rc.getFormattedAmountRaised());
        }
        if (interfaceC39031rc.getFormattedFundraiserProgressInfoText() != null) {
            linkedHashMap.put("formatted_fundraiser_progress_info_text", interfaceC39031rc.getFormattedFundraiserProgressInfoText());
        }
        if (interfaceC39031rc.getFormattedGoalAmount() != null) {
            linkedHashMap.put("formatted_goal_amount", interfaceC39031rc.getFormattedGoalAmount());
        }
        if (interfaceC39031rc.getFundraiserId() != null) {
            linkedHashMap.put("fundraiser_id", interfaceC39031rc.getFundraiserId());
        }
        if (interfaceC39031rc.getFundraiserOwnerUsername() != null) {
            linkedHashMap.put("fundraiser_owner_username", interfaceC39031rc.getFundraiserOwnerUsername());
        }
        if (interfaceC39031rc.getFundraiserTitle() != null) {
            linkedHashMap.put("fundraiser_title", interfaceC39031rc.getFundraiserTitle());
        }
        String str2 = null;
        if (interfaceC39031rc.B9C() != null) {
            FundraiserCampaignTypeEnum B9C = interfaceC39031rc.B9C();
            if (B9C != null) {
                str = B9C.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("fundraiser_type", str);
        }
        if (interfaceC39031rc.BCh() != null) {
            linkedHashMap.put("has_standalone_fundraiser", interfaceC39031rc.BCh());
        }
        if (interfaceC39031rc.CYG() != null) {
            linkedHashMap.put("is_media_owner_fundraiser_owner", interfaceC39031rc.CYG());
        }
        if (interfaceC39031rc.getProgressStr() != null) {
            linkedHashMap.put("progress_str", interfaceC39031rc.getProgressStr());
        }
        if (interfaceC39031rc.BwP() != null) {
            linkedHashMap.put("show_fundraiser_owner_attribution", interfaceC39031rc.BwP());
        }
        if (interfaceC39031rc.C7y() != null) {
            ImageUrl C7y = interfaceC39031rc.C7y();
            if (C7y != null) {
                str2 = C7y.getUrl();
            }
            linkedHashMap.put("thumbnail_display_url", str2);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
