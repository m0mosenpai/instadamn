package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.location.platform.api.Location;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteSaveAudienceEditResponse;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WDz {
    public static C1ON A01(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, String str, String str2, List list) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("ads/promote/audience_create_screen/");
        A0M.A0H("media_id", str2);
        A0M.A9s("regulated_category", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A0M.A9s("destination", xIGIGBoostDestination.toString());
        A0M.A9s("fb_auth_token", str);
        A0M.A0S(PromoteAudienceInfo.class, C69916Vxh.class);
        if (list != null) {
            A0M.A9s("regulated_categories", AbstractC31175DnJ.A0b(list));
        }
        return A0M.A0N();
    }

    public static C1ON A02(UserSession userSession, String str, double d, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A0H("caption", str);
        c25621Ms.A0I("has_branded_content_tag", z);
        c25621Ms.A0I("has_product_tags", z2);
        c25621Ms.A0I("has_tagged_collection", z3);
        c25621Ms.A0I("has_upcoming_event", z4);
        c25621Ms.A0I("is_feed", z5);
        c25621Ms.A0I(MSV.A00(106), z6);
        c25621Ms.A0D(AbstractC111324zv.A00(1096), i);
        c25621Ms.A0D(AbstractC111324zv.A00(1105), i2);
        c25621Ms.A0W.A05("video_duration_s", String.valueOf(d));
        c25621Ms.A0I("is_carousel_media", z7);
        c25621Ms.A0D("num_carousel_cards", i3);
        c25621Ms.A05();
        c25621Ms.A0B("ads/promote/promote_eligibility/");
        return AbstractC31172DnG.A0S(c25621Ms, C52092N2s.class, OOB.class);
    }

    public static C1ON A00(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, UserSession userSession, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, double d, double d2, int i, int i2, int i3) {
        String obj;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("ads/promote/edit_audience/");
        A0M.A0H("audience_id", str);
        A0M.A9s("fb_auth_token", "");
        A0M.A0D("fb_actor_id", 0);
        if (targetingRelaxationConstants == null) {
            obj = TargetingRelaxationConstants.A05.toString();
        } else {
            obj = targetingRelaxationConstants.toString();
        }
        A0M.A9s("target_relax_option", obj);
        A0M.A0H("address", str3);
        A0M.A0H("audience_name", str2);
        A0M.A0S(PromoteSaveAudienceEditResponse.class, C69920Vxl.class);
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

    public static C1ON A03(UserSession userSession, String str, boolean z) {
        String str2;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        if (z) {
            str2 = "ads/promote/ads_mode_story_afterparty_promote_eligibility/";
        } else {
            str2 = "ads/promote/story_afterparty_promote_eligibility/";
        }
        A0M.A0E = str2;
        A0M.A9s("media_id", str);
        return AbstractC31178DnM.A0I(A0M, C52081N2h.class, OOA.class);
    }
}
