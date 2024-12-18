package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VXH {
    public static final void A00(AnonymousClass182 anonymousClass182, C66619UPg c66619UPg) {
        C14360o3.A0B(c66619UPg, 1);
        anonymousClass182.A0d();
        String str = c66619UPg.A0M;
        if (str != null) {
            anonymousClass182.A0S("alacorn_session_id", str);
        }
        Boolean bool = c66619UPg.A04;
        if (bool != null) {
            anonymousClass182.A0T("allow_media_creation_with_music", bool.booleanValue());
        }
        anonymousClass182.A0T("allows_saving", c66619UPg.A0p);
        String str2 = c66619UPg.A0N;
        if (str2 != null) {
            anonymousClass182.A0S("artist_id", str2);
        }
        String str3 = c66619UPg.A0O;
        if (str3 != null) {
            anonymousClass182.A0S("audio_asset_id", str3);
        }
        Integer num = c66619UPg.A0G;
        if (num != null) {
            anonymousClass182.A0Q("audio_asset_start_time_in_ms", num.intValue());
        }
        Integer num2 = c66619UPg.A0H;
        if (num2 != null) {
            anonymousClass182.A0Q("audio_asset_suggested_start_time_in_ms", num2.intValue());
        }
        String str4 = c66619UPg.A0P;
        if (str4 != null) {
            anonymousClass182.A0S("audio_cluster_id", str4);
        }
        List list = c66619UPg.A0m;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "audio_filter_infos", list);
            while (A0q.hasNext()) {
                VE2 ve2 = (VE2) A0q.next();
                C14360o3.A0B(ve2, 0);
                anonymousClass182.A0u(ve2.A00);
            }
            anonymousClass182.A0Z();
        }
        C51699MsU c51699MsU = c66619UPg.A00;
        if (c51699MsU != null) {
            anonymousClass182.A0r("audio_muting_info");
            anonymousClass182.A0d();
            anonymousClass182.A0T("allow_audio_editing", c51699MsU.A02);
            anonymousClass182.A0T("mute_audio", c51699MsU.A03);
            EnumC39578Hdo enumC39578Hdo = (EnumC39578Hdo) c51699MsU.A00;
            if (enumC39578Hdo != null) {
                anonymousClass182.A0S("mute_reason", enumC39578Hdo.A00);
            }
            anonymousClass182.A0S("mute_reason_str", c51699MsU.A01);
            anonymousClass182.A0T("show_muted_audio_toast", c51699MsU.A04);
            anonymousClass182.A0a();
        }
        String str5 = c66619UPg.A0Q;
        if (str5 != null) {
            anonymousClass182.A0S("browse_session_id", str5);
        }
        String str6 = c66619UPg.A0R;
        if (str6 != null) {
            anonymousClass182.A0S("cover_artwork_thumbnail_uri", str6);
        }
        anonymousClass182.A0S("cover_artwork_uri", c66619UPg.A0S);
        String str7 = c66619UPg.A0T;
        if (str7 != null) {
            anonymousClass182.A0S("dark_message", str7);
        }
        String str8 = c66619UPg.A0U;
        if (str8 != null) {
            anonymousClass182.A0S("dash_manifest", str8);
        }
        String str9 = c66619UPg.A0V;
        if (str9 != null) {
            anonymousClass182.A0S("derived_content_id", str9);
        }
        Integer num3 = c66619UPg.A0I;
        if (num3 != null) {
            anonymousClass182.A0Q(AbstractC111324zv.A00(107), num3.intValue());
        }
        String str10 = c66619UPg.A0W;
        if (str10 != null) {
            anonymousClass182.A0S("display_artist", str10);
        }
        List list2 = c66619UPg.A0n;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "display_labels", list2);
            while (A0q2.hasNext()) {
                EnumC68147VDp enumC68147VDp = (EnumC68147VDp) A0q2.next();
                C14360o3.A0B(enumC68147VDp, 0);
                anonymousClass182.A0u(enumC68147VDp.A00);
            }
            anonymousClass182.A0Z();
        }
        Integer num4 = c66619UPg.A0J;
        if (num4 != null) {
            anonymousClass182.A0Q("duration_in_ms", num4.intValue());
        }
        String str11 = c66619UPg.A0X;
        if (str11 != null) {
            anonymousClass182.A0S("fast_start_progressive_download_url", str11);
        }
        String str12 = c66619UPg.A0Y;
        if (str12 != null) {
            anonymousClass182.A0S("formatted_clips_media_count", str12);
        }
        Boolean bool2 = c66619UPg.A05;
        if (bool2 != null) {
            anonymousClass182.A0T("has_lyrics", bool2.booleanValue());
        }
        Boolean bool3 = c66619UPg.A06;
        if (bool3 != null) {
            anonymousClass182.A0T("hide_remixing", bool3.booleanValue());
        }
        List list3 = c66619UPg.A0o;
        if (list3 != null) {
            Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "highlight_start_times_in_ms", list3);
            while (A0q3.hasNext()) {
                anonymousClass182.A0h(AbstractC167007dF.A0B(A0q3));
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c66619UPg.A0Z);
        UPU upu = c66619UPg.A01;
        if (upu != null) {
            anonymousClass182.A0r("ig_artist");
            VXD.A00(anonymousClass182, upu);
        }
        String str13 = c66619UPg.A0a;
        if (str13 != null) {
            anonymousClass182.A0S("ig_username", str13);
        }
        Boolean bool4 = c66619UPg.A07;
        if (bool4 != null) {
            anonymousClass182.A0T("is_bookmarked", bool4.booleanValue());
        }
        Boolean bool5 = c66619UPg.A08;
        if (bool5 != null) {
            anonymousClass182.A0T("is_eligible_for_audio_effects", bool5.booleanValue());
        }
        Boolean bool6 = c66619UPg.A09;
        if (bool6 != null) {
            anonymousClass182.A0T("is_eligible_for_vinyl_sticker", bool6.booleanValue());
        }
        anonymousClass182.A0T("is_explicit", c66619UPg.A0q);
        Boolean bool7 = c66619UPg.A0A;
        if (bool7 != null) {
            anonymousClass182.A0T("is_local_audio", bool7.booleanValue());
        }
        Boolean bool8 = c66619UPg.A0B;
        if (bool8 != null) {
            anonymousClass182.A0T("is_original_sound", bool8.booleanValue());
        }
        Boolean bool9 = c66619UPg.A0C;
        if (bool9 != null) {
            anonymousClass182.A0T("is_trending_in_clips", bool9.booleanValue());
        }
        String str14 = c66619UPg.A0b;
        if (str14 != null) {
            anonymousClass182.A0S("local_audio_file_path", str14);
        }
        VED ved = c66619UPg.A03;
        if (ved != null) {
            anonymousClass182.A0S("music_product", ved.A00);
        }
        String str15 = c66619UPg.A0c;
        if (str15 != null) {
            anonymousClass182.A0S("original_media_id", str15);
        }
        Integer num5 = c66619UPg.A0K;
        if (num5 != null) {
            anonymousClass182.A0Q("overlap_duration_in_ms", num5.intValue());
        }
        Boolean bool10 = c66619UPg.A0D;
        if (bool10 != null) {
            anonymousClass182.A0T("picked_in_post_capture", bool10.booleanValue());
        }
        anonymousClass182.A0S("placeholder_profile_pic_url", c66619UPg.A0d);
        String str16 = c66619UPg.A0e;
        if (str16 != null) {
            anonymousClass182.A0S("progressive_download_url", str16);
        }
        String str17 = c66619UPg.A0f;
        if (str17 != null) {
            anonymousClass182.A0S("reactive_audio_download_url", str17);
        }
        String str18 = c66619UPg.A0g;
        if (str18 != null) {
            anonymousClass182.A0S("sanitized_title", str18);
        }
        Boolean bool11 = c66619UPg.A0E;
        if (bool11 != null) {
            anonymousClass182.A0T("should_allow_music_editing", bool11.booleanValue());
        }
        anonymousClass182.A0T("should_mute_audio", c66619UPg.A0r);
        anonymousClass182.A0S("should_mute_audio_reason", c66619UPg.A0h);
        EnumC39578Hdo enumC39578Hdo2 = c66619UPg.A02;
        if (enumC39578Hdo2 != null) {
            anonymousClass182.A0S("should_mute_audio_reason_type", enumC39578Hdo2.A00);
        }
        Boolean bool12 = c66619UPg.A0F;
        if (bool12 != null) {
            anonymousClass182.A0T("should_skip_attribution", bool12.booleanValue());
        }
        String str19 = c66619UPg.A0i;
        if (str19 != null) {
            anonymousClass182.A0S("subtitle", str19);
        }
        String str20 = c66619UPg.A0j;
        if (str20 != null) {
            anonymousClass182.A0S("tag", str20);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, c66619UPg.A0k);
        Integer num6 = c66619UPg.A0L;
        if (num6 != null) {
            anonymousClass182.A0Q("trend_rank", num6.intValue());
        }
        String str21 = c66619UPg.A0l;
        if (str21 != null) {
            anonymousClass182.A0S("web_30s_preview_download_url", str21);
        }
        anonymousClass182.A0a();
    }
}
