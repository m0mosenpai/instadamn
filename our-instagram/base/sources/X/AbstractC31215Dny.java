package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubInfoDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dny, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31215Dny {
    public static Map A00(FanClubInfoDict fanClubInfoDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (fanClubInfoDict.AeJ() != null) {
            linkedHashMap.put("autosave_to_exclusive_highlight", fanClubInfoDict.AeJ());
        }
        if (fanClubInfoDict.AqM() != null) {
            linkedHashMap.put("connected_member_count", fanClubInfoDict.AqM());
        }
        if (fanClubInfoDict.getFanClubId() != null) {
            linkedHashMap.put("fan_club_id", fanClubInfoDict.getFanClubId());
        }
        if (fanClubInfoDict.getFanClubName() != null) {
            linkedHashMap.put("fan_club_name", fanClubInfoDict.getFanClubName());
        }
        if (fanClubInfoDict.B4S() != null) {
            FanClubFanConsiderationPageFeatureEligibilityResponse B4S = fanClubInfoDict.B4S();
            if (B4S != null) {
                treeUpdaterJNI = B4S.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("fan_consideration_page_revamp_eligiblity", treeUpdaterJNI);
        }
        if (fanClubInfoDict.BBZ() != null) {
            linkedHashMap.put("has_enough_subscribers_for_ssc", fanClubInfoDict.BBZ());
        }
        if (fanClubInfoDict.CUI() != null) {
            linkedHashMap.put("is_fan_club_gifting_eligible", fanClubInfoDict.CUI());
        }
        if (fanClubInfoDict.CUK() != null) {
            linkedHashMap.put("is_fan_club_referral_eligible", fanClubInfoDict.CUK());
        }
        if (fanClubInfoDict.BLB() != null) {
            linkedHashMap.put("largest_public_bc_id", fanClubInfoDict.BLB());
        }
        if (fanClubInfoDict.C3U() != null) {
            linkedHashMap.put("subscriber_count", fanClubInfoDict.C3U());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
