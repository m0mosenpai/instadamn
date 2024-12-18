package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.tagging.model.TagSerializer;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55151OdE {
    public static final C1ON A01(C38686GzR c38686GzR, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, C51685MsG c51685MsG, C38321qM c38321qM, MusicOverlayStickerModel musicOverlayStickerModel, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2) {
        String A00;
        String str3;
        String str4 = "";
        boolean A1V = AbstractC167007dF.A1V(str);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC31173DnH.A1Q(A0c, "media/%s/edit_media/", MSY.A1b(c38321qM));
        A0c.A9s("caption_text", str);
        A0c.A0H("funded_content_deal_id", str2);
        if (c38686GzR == null) {
            A00 = "";
        } else {
            try {
                A00 = AbstractC41651Ibj.A00(c38686GzR);
            } catch (IOException e) {
                AbstractC167007dF.A15(C18950wb.A01.AEp("ReelApiUtil.createEditMetadataTask", 817902720), DialogModule.KEY_MESSAGE, "IOException: ClipsShoppingMetadata serializeToJson", e);
            }
        }
        A0c.A9s("shopping_data", A00);
        A0c.A0F("is_fan_club_promo_video", bool);
        A0c.A0F("revshare_ads_toggled_on", bool2);
        if (bool3 != null) {
            if (bool3.booleanValue()) {
                str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str3 = "0";
            }
            A0c.A0H("video_subtitles_enabled", str3);
        }
        if (bool4 != null) {
            A0c.A0F("video_subtitles_translations_enabled", bool4);
        }
        if (bool5 != null) {
            A0c.A0F("sticker_translations_enabled", bool5);
        }
        if (musicOverlayStickerModel != null) {
            A0c.AA6("music_params", AbstractC23129AMi.A04(musicOverlayStickerModel));
        }
        A0c.A9s("include_e2ee_mentioned_user_list", "true");
        if (mediaGenAIDetectionMethod != null) {
            A0c.A9s("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        if (c38321qM.A0C.Ar6() != null && C18U.A06(C06090Tz.A05, userSession, 36327301541018097L)) {
            A0c.A9s("include_unpublished", "true");
        }
        if (c51685MsG != null) {
            try {
                str4 = OXq.A00(c51685MsG);
            } catch (IOException unused) {
                C0w9.A03("ReelApiUtil.createEditMetadataTask", "IOException: IGBIOProductInfo serializeToJson");
            }
        }
        A0c.A9s("bio_product", str4);
        return AbstractC31175DnJ.A0D(A0c, N3N.class, C41349IRu.class, A1V);
    }

    public static final C1ON A02(UserSession userSession, String str) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/archive_clip/");
        A0c.A0H(AbstractC43591JPw.A00(139), str);
        return AbstractC25227BEk.A0e(A0c, C32125E9y.class, FS6.class);
    }

    public static final C1ON A03(UserSession userSession, String str) {
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        AbstractC37301Gc2.A1M(A0C, AbstractC13670mt.A06("media/%s/delete/", str), str);
        return AbstractC31175DnJ.A0D(A0C, H9U.class, C41256INx.class, true);
    }

    public static final C1ON A04(UserSession userSession, String str, List list) {
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        AbstractC37301Gc2.A1M(A0C, AbstractC13670mt.A06("media/%s/delete/", str), str);
        try {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0S = AbstractC167007dF.A0S(A0O);
            Iterator A0q = AbstractC37301Gc2.A0q(A0S, "deep_deletion_destination_apps", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1F(A0S, A0q);
            }
            A0S.A0Z();
            A0S.A0S("source_app", "IG");
            A0C.A9s("deep_deletion_request", AbstractC167017dG.A0l(A0S, A0O));
        } catch (IOException e) {
            AbstractC167007dF.A15(C18950wb.A01.AEp("ClipsEditApiUtil.createDeepDeleteMediaTask", 817902720), DialogModule.KEY_MESSAGE, "IOException: DeepDeletionRequestMetadata serializeToJson", e);
        }
        return AbstractC31175DnJ.A0D(A0C, H9U.class, C41256INx.class, true);
    }

    public static final C1ON A00(C38686GzR c38686GzR, BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, C51685MsG c51685MsG, C38321qM c38321qM, EnumC76383bi enumC76383bi, Venue venue, MusicOverlayStickerModel musicOverlayStickerModel, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, boolean z) {
        HashSet hashSet;
        String str4 = str3;
        C14360o3.A0B(userSession, 0);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC31173DnH.A1Q(A0c, "media/%s/edit_media/", MSY.A1b(c38321qM));
        A0c.A0H("caption_text", str);
        A0c.A0H("funded_content_deal_id", str2);
        String str5 = "";
        A0c.A9s("shopping_data", c38686GzR == null ? "" : AbstractC41651Ibj.A00(c38686GzR));
        A0c.A0F("is_fan_club_promo_video", bool);
        A0c.A0F("revshare_ads_toggled_on", bool2);
        C06090Tz c06090Tz = C06090Tz.A05;
        A0c.A0I("include_e2ee_mentioned_user_list", C18U.A06(c06090Tz, userSession, 2342156760134322412L));
        if (bool3 != null) {
            A0c.A0H("video_subtitles_enabled", bool3.booleanValue() ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : "0");
        }
        if (bool4 != null) {
            A0c.A0F("video_subtitles_translations_enabled", bool4);
        }
        if (bool5 != null) {
            A0c.A0F("sticker_translations_enabled", bool5);
        }
        A0c.A9s("usertags", TagSerializer.A01(list3, list4, null));
        A0c.A9s("fb_user_tags", TagSerializer.A01(null, list5, null));
        if (((list6 != null && !list6.isEmpty()) || (list7 != null && !list7.isEmpty())) && ((c38321qM.A0C.Ar6() != null && AbstractC100604fP.A04(userSession, true)) || C18U.A06(c06090Tz, userSession, 36312999300367961L))) {
            if (list6 == null) {
                hashSet = null;
            } else {
                hashSet = AbstractC001800i.A0V(list6);
            }
            A0c.A9s("coauthor_invites", TagSerializer.A02(null, hashSet, list7 != null ? AbstractC001800i.A0V(list7) : null));
        }
        if (!C14360o3.A0K(c38321qM.A0C.BW0(), str4)) {
            if (str3 == null) {
                str4 = "";
            }
            A0c.A9s("mv_link", str4);
        }
        if (mediaGenAIDetectionMethod != null) {
            A0c.A9s("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        try {
            String A00 = AbstractC68553VVg.A00(venue);
            A0c.A9s("location", A00);
            if (venue != null && "facebook_events".equals(venue.A03())) {
                A0c.A9s("event", A00);
            }
        } catch (IOException e) {
            AbstractC167007dF.A15(C18950wb.A01.AEp("ReelApiUtil.createEditMetadataTask", 817902720), DialogModule.KEY_MESSAGE, "IOException: UploadLocationSerializer getVenueAsJsonString", e);
        }
        AbstractC55150OdD.A04(A0c, userSession, list, list2, z);
        AbstractC55150OdD.A03(A0c, brandedContentProjectMetadataIntf);
        AbstractC55150OdD.A02(A0c, brandedContentGatingInfoIntf);
        if (musicOverlayStickerModel != null) {
            A0c.AA6("music_params", AbstractC23129AMi.A04(musicOverlayStickerModel));
        }
        if (enumC76383bi != null) {
            A0c.A0H("audience", enumC76383bi.A00);
        }
        if (c38321qM.A0C.Ar6() != null && C18U.A06(c06090Tz, userSession, 36327301541018097L)) {
            A0c.A9s("include_unpublished", "true");
        }
        if (c51685MsG != null) {
            try {
                str5 = OXq.A00(c51685MsG);
            } catch (IOException unused) {
                C0w9.A03("ReelApiUtil.createEditMetadataTask", "IOException: IGBIOProductInfo serializeToJson");
            }
        }
        A0c.A9s("bio_product", str5);
        A0c.A0P(null, N3N.class, C41349IRu.class, false);
        return AbstractC31172DnG.A0U(A0c, true);
    }
}
