package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteCreateAudienceResponse;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.WFd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70178WFd {
    public static C1ON A01(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, UserSession userSession, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, double d, double d2, int i, int i2, int i3) {
        String obj;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("ads/promote/create_audience_v2/");
        A0M.A9s("fb_auth_token", "");
        A0M.A9s("flow_id", str3);
        if (targetingRelaxationConstants == null) {
            obj = TargetingRelaxationConstants.A05.toString();
        } else {
            obj = targetingRelaxationConstants.toString();
        }
        A0M.A9s("target_relax_option", obj);
        A0M.A0H("address", str2);
        A0M.A0H(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        A0M.A0S(PromoteCreateAudienceResponse.class, C69918Vxj.class);
        if (list3 != null) {
            A0M.A9s("countries", AbstractC31175DnJ.A0b(list3));
        }
        if (list4 != null) {
            A0M.A9s("region_keys", AbstractC31175DnJ.A0b(list4));
        }
        if (list5 != null) {
            A0M.A9s("city_keys", AbstractC31175DnJ.A0b(list5));
        }
        if (list6 != null) {
            A0M.A9s("zip_keys", AbstractC31175DnJ.A0b(list6));
        }
        if (!AbstractC83893oY.A00(list2)) {
            A0M.A9s("interest_ids", AbstractC31175DnJ.A0b(list2));
        }
        if (i2 != 0 && i != 0) {
            A0M.A9s("min_age", String.valueOf(i));
            A0M.A9s("max_age", String.valueOf(i2));
        }
        if (d2 != 0.0d && d != 0.0d) {
            A0M.A9s("longitude", String.valueOf(d2));
            A0M.A9s(Location.LATITUDE, String.valueOf(d));
        }
        if (i3 != 0) {
            A0M.A9s("radius", String.valueOf(i3));
        }
        if (!AbstractC83893oY.A00(list)) {
            A0M.A9s("genders", AbstractC31175DnJ.A0b(list));
        }
        if (advantageAudienceData != null && WG1.A06(userSession)) {
            A0M.A9s("advantage_audience", AbstractC31175DnJ.A0d(AbstractC68363VNx.A00(advantageAudienceData)));
        }
        return A0M.A0N();
    }

    public static C1ON A02(UserSession userSession, String str, String str2, String str3) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("ads/promote/audience_edit_screen_v2/");
        A0M.A0H("audience_id", str2);
        A0M.A9s("fb_auth_token", str);
        A0M.A9s("flow_id", str3);
        return AbstractC31172DnG.A0S(A0M, PromoteAudienceInfo.class, C69916Vxh.class);
    }

    public static C1ON A03(UserSession userSession, String str, String str2, String str3, String str4) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("ads/promote/review_screen_details_v2/");
        A0M.A9s("fb_auth_token", str);
        A0M.A9s("flow_id", str2);
        A0M.A9s("media_id", str3);
        A0M.A9s("ad_amount", str4);
        return AbstractC31172DnG.A0S(A0M, C38852H9a.class, C41275IOq.class);
    }

    public static C1ON A04(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B(AbstractC43591JPw.A00(743));
        A0M.A9s("fb_auth_token", str);
        A0M.A9s("media_id", str2);
        A0M.A9s("platform_for_debug", "native_ig_android");
        A0M.A0H("selected_audio_spec", str3);
        A0M.A0H("flow_id", str4);
        A0M.A0H("coupon_offer_id", str5);
        A0M.A0H("promote_entry_point", str6);
        return AbstractC31172DnG.A0S(A0M, C67837UzA.class, C69903VxU.class);
    }

    public static C1ON A05(UserSession userSession, String str, String str2, List list, boolean z) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        AbstractC37301Gc2.A1M(A0M, "ads/promote/suggested_interests_v2/", str);
        A0M.A9s("detailed_targeting_items", list.toString());
        A0M.A0I("should_fetch_default_interests", z);
        A0M.A9s("flow_id", str2);
        return AbstractC31172DnG.A0S(A0M, C67826Uyz.class, C69911Vxc.class);
    }

    public static C1ON A00(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, XIGIGBoostDestination xIGIGBoostDestination, C1OL c1ol, UserSession userSession, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, double d, double d2, int i, int i2, int i3) {
        String obj;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        AbstractC37301Gc2.A1M(A0M, "ads/promote/audience_potential_reach_v2/", str);
        A0M.A9s("destination", xIGIGBoostDestination.toString());
        A0M.A9s("additional_publisher_platforms", AbstractC31175DnJ.A0b(list));
        A0M.A9s("fb_auth_token", "");
        A0M.A9s("min_age", String.valueOf(i));
        A0M.A9s("max_age", String.valueOf(i2));
        A0M.A0H("address", str2);
        A0M.A0H("flow_id", str3);
        if (targetingRelaxationConstants == null) {
            obj = TargetingRelaxationConstants.A05.toString();
        } else {
            obj = targetingRelaxationConstants.toString();
        }
        A0M.A9s("target_relax_option", obj);
        A0M.A0S(PromoteAudiencePotentialReach.class, C69917Vxi.class);
        if (list2 != null) {
            A0M.A9s("genders", AbstractC31175DnJ.A0b(list2));
        }
        if (list4 != null) {
            A0M.A9s("countries", AbstractC31175DnJ.A0b(list4));
        }
        if (list5 != null) {
            A0M.A9s("region_keys", AbstractC31175DnJ.A0b(list5));
        }
        if (list6 != null) {
            A0M.A9s("city_keys", AbstractC31175DnJ.A0b(list6));
        }
        if (list7 != null) {
            A0M.A9s("zip_keys", AbstractC31175DnJ.A0b(list7));
        }
        if (list3 != null) {
            A0M.A9s("interest_ids", AbstractC31175DnJ.A0b(list3));
        }
        if (d2 != 0.0d && d != 0.0d) {
            A0M.A9s("longitude", String.valueOf(d2));
            A0M.A9s(Location.LATITUDE, String.valueOf(d));
        }
        if (i3 != 0) {
            A0M.A9s("radius", String.valueOf(i3));
        }
        if (advantageAudienceData != null) {
            A0M.A9s("advantage_audience", AbstractC31175DnJ.A0d(AbstractC68363VNx.A00(advantageAudienceData)));
        }
        A0M.A00 = c1ol;
        return A0M.A0N();
    }
}
