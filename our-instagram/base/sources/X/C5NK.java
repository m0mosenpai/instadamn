package X;

import android.os.Parcelable;
import android.text.Layout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.model.venue.LocationDict;
import com.instagram.music.common.model.LyricsPhrase;
import com.instagram.music.common.model.WordOffset;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.5NK, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5NK {
    /* JADX WARN: Type inference failed for: r1v4, types: [X.5NM, java.lang.Object] */
    public static C5NM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C24025AlH c24025AlH = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C24024AlG c24024AlG = null;
            C5QI c5qi = null;
            Wm3 wm3 = null;
            C1815983m c1815983m = null;
            C68024V6s c68024V6s = null;
            C66646URk c66646URk = null;
            C217849kH c217849kH = null;
            C5QK c5qk = null;
            C217809kD c217809kD = null;
            C217839kG c217839kG = null;
            C217899kM c217899kM = null;
            C24016Aku c24016Aku = null;
            C24020Aky c24020Aky = null;
            C83o c83o = null;
            Al8 al8 = null;
            Al2 al2 = null;
            URE ure = null;
            StoryPromptTappableData storyPromptTappableData = null;
            C6RN c6rn = null;
            C189138Ze c189138Ze = null;
            URL url = null;
            C66645URj c66645URj = null;
            URN urn = null;
            C217879kK c217879kK = null;
            C217889kL c217889kL = null;
            URM urm = null;
            C217869kJ c217869kJ = null;
            Al7 al7 = null;
            Wm4 wm4 = null;
            Al4 al4 = null;
            Al5 al5 = null;
            Al1 al1 = null;
            C74W c74w = null;
            ReelsVisualRepliesModel reelsVisualRepliesModel = null;
            AlA alA = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            C106074qN c106074qN = null;
            UpcomingEventImpl upcomingEventImpl = null;
            SharePlatformStickerClientModel sharePlatformStickerClientModel = null;
            StoryThenAndNowStickerDict storyThenAndNowStickerDict = null;
            StoryGroupMentionTappableData storyGroupMentionTappableData = null;
            StoryMusicPickTappableData storyMusicPickTappableData = null;
            C24017Akv c24017Akv = null;
            Al3 al3 = null;
            C24017Akv c24017Akv2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("lyrics_sticker_spec".equals(A0q)) {
                    c24025AlH = AbstractC22755A1z.parseFromJson(c16l);
                } else if ("music_overlay_view_model".equals(A0q)) {
                    c24024AlG = A20.parseFromJson(c16l);
                } else if ("timed_sticker_client_model".equals(A0q)) {
                    c5qi = C5QH.parseFromJson(c16l);
                } else if ("bitmap_sticker_client_model".equals(A0q)) {
                    wm3 = VX9.parseFromJson(c16l);
                } else if ("igtv_sticker_client_model".equals(A0q)) {
                    c1815983m = AbstractC226579zF.parseFromJson(c16l);
                } else if ("media_sticker_client_model".equals(A0q)) {
                    c68024V6s = VSS.parseFromJson(c16l);
                } else if ("karaoke_caption_client_model".equals(A0q)) {
                    c66646URk = VSW.parseFromJson(c16l);
                } else if ("static_sticker_client_model".equals(A0q)) {
                    c217849kH = AbstractC226179ya.parseFromJson(c16l);
                } else if ("text_sticker_client_model".equals(A0q)) {
                    c5qk = C5QJ.parseFromJson(c16l);
                } else if ("date_time_sticker_client_model".equals(A0q)) {
                    c217809kD = VST.parseFromJson(c16l);
                } else if ("internal_sticker_client_model".equals(A0q)) {
                    c217839kG = VSU.parseFromJson(c16l);
                } else if ("gallery_sticker_client_model".equals(A0q)) {
                    c217899kM = AbstractC226089yR.parseFromJson(c16l);
                } else if ("polaroid_sticker_client_model".equals(A0q)) {
                    c24016Aku = AbstractC226159yY.parseFromJson(c16l);
                } else if ("swappable_gallery_sticker_client_model".equals(A0q)) {
                    c24020Aky = AbstractC226209yd.parseFromJson(c16l);
                } else if ("secret_sticker_client_model".equals(A0q)) {
                    c24017Akv2 = ADV.parseFromJson(c16l);
                } else if ("clips_attribution_sticker_client_model".equals(A0q)) {
                    c83o = AbstractC226919zn.parseFromJson(c16l);
                } else if ("video_sticker_client_model".equals(A0q)) {
                    al8 = AbstractC226229yf.parseFromJson(c16l);
                } else if ("dual_photo_client_model".equals(A0q)) {
                    al2 = AbstractC226479z4.parseFromJson(c16l);
                } else if ("question_sticker_client_model".equals(A0q)) {
                    ure = ADF.parseFromJson(c16l);
                } else if ("prompt_sticker_client_model".equals(A0q)) {
                    storyPromptTappableData = AbstractC109294vv.parseFromJson(c16l);
                } else if ("link_sticker_client_model".equals(A0q)) {
                    c6rn = AbstractC226119yU.parseFromJson(c16l);
                } else if ("fundraiser_sticker_client_model".equals(A0q)) {
                    c189138Ze = AEH.parseFromJson(c16l);
                } else if ("countdown_sticker_client_model".equals(A0q)) {
                    url = AbstractC69879Vx4.parseFromJson(c16l);
                } else if ("chat_sticker_client_model".equals(A0q)) {
                    c66645URj = AbstractC69978Vyv.parseFromJson(c16l);
                } else if ("slider_sticker_client_model".equals(A0q)) {
                    urn = AbstractC69881Vx6.parseFromJson(c16l);
                } else if ("hashtag_sticker_client_model".equals(A0q)) {
                    c217879kK = AbstractC226099yS.parseFromJson(c16l);
                } else if ("mention_sticker_client_model".equals(A0q)) {
                    c217889kL = AbstractC226139yW.parseFromJson(c16l);
                } else if ("quiz_sticker_client_model".equals(A0q)) {
                    urm = AbstractC69880Vx5.parseFromJson(c16l);
                } else if ("location_sticker_client_model".equals(A0q)) {
                    c217869kJ = VSV.parseFromJson(c16l);
                } else if ("poll_sticker_client_model".equals(A0q)) {
                    al7 = VWA.parseFromJson(c16l);
                } else if ("poll_sticker_v2_client_model".equals(A0q)) {
                    wm4 = VWB.parseFromJson(c16l);
                } else if ("clips_end_card_client_model".equals(A0q)) {
                    al4 = AbstractC225809xz.parseFromJson(c16l);
                } else if ("clips_end_card_static_client_model".equals(A0q)) {
                    al5 = AbstractC225799xy.parseFromJson(c16l);
                } else if ("clips_watermark_client_model".equals(A0q)) {
                    al1 = AbstractC225869y5.parseFromJson(c16l);
                } else if ("loadable_gif_sticker_client_model".equals(A0q)) {
                    c74w = AbstractC226129yV.parseFromJson(c16l);
                } else if ("reels_visual_replies_model".equals(A0q)) {
                    reelsVisualRepliesModel = AbstractC226459z2.parseFromJson(c16l);
                } else if ("i_take_care_sticker_model".equals(A0q)) {
                    alA = AbstractC22749A1t.parseFromJson(c16l);
                } else if ("subscriptions_sticker_model".equals(A0q)) {
                    subscriptionStickerDict = ADI.parseFromJson(c16l);
                } else if ("reaction_sticker_model".equals(A0q)) {
                    c106074qN = AbstractC106064qM.parseFromJson(c16l);
                } else if ("upcoming_event".equals(A0q)) {
                    upcomingEventImpl = IT3.parseFromJson(c16l);
                } else if ("share_platform_sticker_model".equals(A0q)) {
                    sharePlatformStickerClientModel = AbstractC226239yg.parseFromJson(c16l);
                } else if ("before_and_after_sticker_model".equals(A0q)) {
                    storyThenAndNowStickerDict = IPG.parseFromJson(c16l);
                } else if ("group_mention_sticker_model".equals(A0q)) {
                    storyGroupMentionTappableData = ADG.parseFromJson(c16l);
                } else if ("music_pick_sticker_model".equals(A0q)) {
                    storyMusicPickTappableData = IP8.parseFromJson(c16l);
                } else if ("secret_sticker_model".equals(A0q)) {
                    c24017Akv = ADV.parseFromJson(c16l);
                } else if ("bio_product_sticker_model".equals(A0q)) {
                    al3 = AbstractC22738A1i.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (c24025AlH != null) {
                obj.A0d = c24025AlH;
            }
            if (c24024AlG != null) {
                obj.A0e = c24024AlG;
            }
            if (c5qi != null) {
                obj.A0Y = c5qi;
            }
            if (wm3 != null) {
                obj.A0i = wm3;
            }
            if (c1815983m != null) {
                obj.A0U = c1815983m;
            }
            if (c68024V6s != null) {
                obj.A0C = c68024V6s;
            }
            if (c66646URk != null) {
                obj.A0V = c66646URk;
            }
            if (c217849kH != null) {
                obj.A0O = c217849kH;
            }
            if (c5qk != null) {
                obj.A0X = c5qk;
            }
            if (c217809kD != null) {
                obj.A0D = c217809kD;
            }
            if (c217839kG != null) {
                obj.A0G = c217839kG;
            }
            if (c217899kM != null) {
                obj.A0E = c217899kM;
            }
            if (c24016Aku != null) {
                obj.A0L = c24016Aku;
            }
            if (c24020Aky != null) {
                obj.A0P = c24020Aky;
            }
            if (c24017Akv2 != null) {
                obj.A0M = c24017Akv2;
            }
            if (c83o != null) {
                obj.A0W = c83o;
            }
            if (al8 != null) {
                obj.A0Q = al8;
            }
            if (al2 != null) {
                obj.A0T = al2;
            }
            if (ure != null) {
                obj.A00 = ure;
            }
            if (storyPromptTappableData != null) {
                obj.A04 = storyPromptTappableData;
            }
            if (c6rn != null) {
                obj.A0H = c6rn;
            }
            if (c189138Ze != null) {
                obj.A0b = c189138Ze;
            }
            if (url != null) {
                obj.A01 = url;
            }
            if (c66645URj != null) {
                obj.A0a = c66645URj;
            }
            if (urn != null) {
                obj.A06 = urn;
            }
            if (c217879kK != null) {
                obj.A0F = c217879kK;
            }
            if (c217889kL != null) {
                obj.A0K = c217889kL;
            }
            if (urm != null) {
                obj.A05 = urm;
            }
            if (c217869kJ != null) {
                obj.A0J = c217869kJ;
            }
            if (al7 != null) {
                obj.A0f = al7;
            }
            if (wm4 != null) {
                obj.A0g = wm4;
            }
            if (al4 != null) {
                obj.A0A = al4;
            }
            if (al5 != null) {
                obj.A09 = al5;
            }
            if (al1 != null) {
                obj.A0B = al1;
            }
            if (c74w != null) {
                obj.A0I = c74w;
            }
            if (reelsVisualRepliesModel != null) {
                obj.A0S = reelsVisualRepliesModel;
            }
            if (alA != null) {
                obj.A0c = alA;
            }
            if (subscriptionStickerDict != null) {
                obj.A08 = subscriptionStickerDict;
            }
            if (c106074qN != null) {
                obj.A0h = c106074qN;
            }
            if (upcomingEventImpl != null) {
                obj.A0j = upcomingEventImpl;
            }
            if (sharePlatformStickerClientModel != null) {
                obj.A0R = sharePlatformStickerClientModel;
            }
            if (storyThenAndNowStickerDict != null) {
                obj.A07 = storyThenAndNowStickerDict;
            }
            if (storyGroupMentionTappableData != null) {
                obj.A02 = storyGroupMentionTappableData;
            }
            if (storyMusicPickTappableData != null) {
                obj.A03 = storyMusicPickTappableData;
            }
            if (c24017Akv != null) {
                obj.A0N = c24017Akv;
            }
            if (al3 != null) {
                obj.A0Z = al3;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5NM c5nm) {
        String A00;
        String str;
        String str2;
        anonymousClass182.A0d();
        if (c5nm.A0d != null) {
            anonymousClass182.A0r("lyrics_sticker_spec");
            C24025AlH c24025AlH = c5nm.A0d;
            anonymousClass182.A0d();
            c24025AlH.BVp();
            anonymousClass182.A0S("music_sticker_display_type", c24025AlH.BVp().A02);
            c24025AlH.BVf();
            anonymousClass182.A0r("music_sticker_model");
            C4A1.A00(anonymousClass182, c24025AlH.BVf(), true);
            if (c24025AlH.A01 != null) {
                anonymousClass182.A0r("music_asset_lyrics");
                C38059Gom c38059Gom = c24025AlH.A01;
                if (c38059Gom != null) {
                    anonymousClass182.A0d();
                    if (c38059Gom.A00 != null) {
                        C16V.A03(anonymousClass182, "phrases");
                        for (LyricsPhrase lyricsPhrase : c38059Gom.A00) {
                            if (lyricsPhrase != null) {
                                anonymousClass182.A0d();
                                anonymousClass182.A0Q("start_time_in_ms", lyricsPhrase.A00);
                                String str3 = lyricsPhrase.A01;
                                if (str3 != null) {
                                    anonymousClass182.A0S("phrase", str3);
                                }
                                if (lyricsPhrase.A02 != null) {
                                    C16V.A03(anonymousClass182, "word_offsets");
                                    for (WordOffset wordOffset : lyricsPhrase.A02) {
                                        if (wordOffset != null) {
                                            anonymousClass182.A0d();
                                            anonymousClass182.A0Q("start_index", wordOffset.A02);
                                            anonymousClass182.A0Q("end_index", wordOffset.A00);
                                            anonymousClass182.A0Q("start_offset_ms", wordOffset.A03);
                                            anonymousClass182.A0Q("end_offset_ms", wordOffset.A01);
                                            anonymousClass182.A0T("trailing_space", wordOffset.A04);
                                            anonymousClass182.A0a();
                                        }
                                    }
                                    anonymousClass182.A0Z();
                                }
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                    anonymousClass182.A0Q("text_color", c24025AlH.A00);
                    anonymousClass182.A0a();
                }
            }
            str2 = "musicAssetLyrics";
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        if (c5nm.A0e != null) {
            anonymousClass182.A0r("music_overlay_view_model");
            C24024AlG c24024AlG = c5nm.A0e;
            anonymousClass182.A0d();
            anonymousClass182.A0S("music_sticker_display_type", c24024AlG.A03.A02);
            c24024AlG.BVf();
            anonymousClass182.A0r("music_sticker_model");
            C4A1.A00(anonymousClass182, c24024AlG.BVf(), true);
            anonymousClass182.A0Q("color", c24024AlG.A00);
            anonymousClass182.A0a();
        }
        if (c5nm.A0Y != null) {
            anonymousClass182.A0r("timed_sticker_client_model");
            C5QI c5qi = c5nm.A0Y;
            anonymousClass182.A0d();
            String str4 = c5qi.A04;
            if (str4 != null) {
                anonymousClass182.A0S("sticker_id", str4);
            }
            anonymousClass182.A0Q("start_time_ms", c5qi.A01);
            anonymousClass182.A0Q("end_time_ms", c5qi.A00);
            String str5 = c5qi.A06;
            if (str5 != null) {
                anonymousClass182.A0S("tts_voice_id", str5);
            }
            String str6 = c5qi.A07;
            if (str6 != null) {
                anonymousClass182.A0S("tts_voice_name", str6);
            }
            String str7 = c5qi.A03;
            if (str7 != null) {
                anonymousClass182.A0S("tts_sfx", str7);
            }
            String str8 = c5qi.A05;
            if (str8 != null) {
                anonymousClass182.A0S("tts_shortwave_id", str8);
            }
            if (c5qi.A02 != null) {
                anonymousClass182.A0r("base_sticker_client_model");
                A00(anonymousClass182, c5qi.A02);
            }
            anonymousClass182.A0a();
        }
        if (c5nm.A0i != null) {
            anonymousClass182.A0r("bitmap_sticker_client_model");
            Wm3 wm3 = c5nm.A0i;
            anonymousClass182.A0d();
            anonymousClass182.A0S("sticker_id", wm3.A04);
            anonymousClass182.A0S("image_file_path", wm3.A05);
            anonymousClass182.A0Q("rect_left", wm3.A01);
            anonymousClass182.A0Q("rect_top", wm3.A03);
            anonymousClass182.A0Q("rect_right", wm3.A02);
            anonymousClass182.A0Q("rect_bottom", wm3.A00);
            anonymousClass182.A0a();
        }
        if (c5nm.A0U != null) {
            anonymousClass182.A0r("igtv_sticker_client_model");
            C1815983m c1815983m = c5nm.A0U;
            anonymousClass182.A0d();
            if (c1815983m.A04 != null) {
                anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                User user = c1815983m.A04;
                Parcelable.Creator creator = User.CREATOR;
                AbstractC38851rI.A08(anonymousClass182, user);
            }
            String str9 = c1815983m.A06;
            if (str9 != null) {
                anonymousClass182.A0S("original_media_id", str9);
            }
            anonymousClass182.A0T("is_landscape", c1815983m.A08);
            String str10 = c1815983m.A05;
            if (str10 != null) {
                anonymousClass182.A0S("media_title", str10);
            }
            anonymousClass182.A0Q("media_duration", c1815983m.A03);
            anonymousClass182.A0Q("container_width", c1815983m.A02);
            anonymousClass182.A0Q("container_height", c1815983m.A01);
            anonymousClass182.A0P("media_aspect_ratio", c1815983m.A00);
            anonymousClass182.A0T("is_shoppable", c1815983m.A09);
            anonymousClass182.A0T("has_collaborators", c1815983m.A07);
            anonymousClass182.A0a();
        }
        if (c5nm.A0C != null) {
            anonymousClass182.A0r("media_sticker_client_model");
            C68024V6s c68024V6s = c5nm.A0C;
            anonymousClass182.A0d();
            String str11 = c68024V6s.A0E;
            if (str11 != null) {
                anonymousClass182.A0S("media_id", str11);
            }
            String str12 = c68024V6s.A07;
            if (str12 != null) {
                anonymousClass182.A0S("carousel_child_media_id", str12);
            }
            String str13 = c68024V6s.A0F;
            if (str13 != null) {
                anonymousClass182.A0S("media_owner_id", str13);
            }
            String str14 = c68024V6s.A0I;
            if (str14 != null) {
                anonymousClass182.A0S(AbstractC31198Dnh.A02(19, 8, 115), str14);
            }
            String str15 = c68024V6s.A0H;
            if (str15 != null) {
                anonymousClass182.A0S("user_attribution", str15);
            }
            if (c68024V6s.A05 != null) {
                anonymousClass182.A0r("profile_pic_url");
                AbstractC222616c.A01(anonymousClass182, c68024V6s.A05);
            }
            anonymousClass182.A0T("has_product_tags", c68024V6s.A0L);
            anonymousClass182.A0T("carousel_child_has_product_tags", c68024V6s.A0J);
            anonymousClass182.A0T("has_collaborators", c68024V6s.A0K);
            anonymousClass182.A0T("is_media_author_seller", c68024V6s.A0O);
            String str16 = c68024V6s.A0G;
            if (str16 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str16);
            }
            String str17 = c68024V6s.A08;
            if (str17 != null) {
                anonymousClass182.A0S("duration", str17);
            }
            Long l = c68024V6s.A06;
            if (l != null) {
                anonymousClass182.A0R("duration_ms", l.longValue());
            }
            String str18 = c68024V6s.A0A;
            if (str18 != null) {
                anonymousClass182.A0S(AbstractC43591JPw.A00(358), str18);
            }
            String str19 = c68024V6s.A0C;
            if (str19 != null) {
                anonymousClass182.A0S("event_title", str19);
            }
            String str20 = c68024V6s.A0B;
            if (str20 != null) {
                anonymousClass182.A0S("event_time", str20);
            }
            String str21 = c68024V6s.A09;
            if (str21 != null) {
                anonymousClass182.A0S("event_action_button_text", str21);
            }
            anonymousClass182.A0T("is_autoplay", c68024V6s.A0M);
            anonymousClass182.A0T("is_carousel", c68024V6s.A0N);
            String str22 = c68024V6s.A0D;
            if (str22 != null) {
                anonymousClass182.A0S("fundraiser_id", str22);
            }
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c68024V6s.A04);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c68024V6s.A00);
            anonymousClass182.A0Q("padding_x", c68024V6s.A01);
            anonymousClass182.A0Q("padding_y", c68024V6s.A02);
            anonymousClass182.A0Q("repost_pill_width", c68024V6s.A03);
            ADU.A00(anonymousClass182, c68024V6s);
            anonymousClass182.A0a();
        }
        if (c5nm.A0V != null) {
            anonymousClass182.A0r("karaoke_caption_client_model");
            C66646URk c66646URk = c5nm.A0V;
            anonymousClass182.A0d();
            if (c66646URk.A07 != null) {
                C16V.A03(anonymousClass182, "tokens");
                for (US9 us9 : c66646URk.A07) {
                    if (us9 != null) {
                        AbstractC69932Vxx.A00(anonymousClass182, us9);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0Q("duration", c66646URk.A01);
            VES ves = c66646URk.A02;
            if (ves != null) {
                anonymousClass182.A0S("karaoke_sticker_display_type", ves.A02);
            }
            anonymousClass182.A0Q("color", c66646URk.A00);
            C6S5 c6s5 = c66646URk.A03;
            if (c6s5 != null) {
                anonymousClass182.A0S("karaoke_sticker_emphasis_state", c6s5.A00);
            }
            String str23 = c66646URk.A06;
            if (str23 != null) {
                anonymousClass182.A0S("sticker_id", str23);
            }
            anonymousClass182.A0T("is_clips_v2_media", c66646URk.A08);
            Integer num = c66646URk.A05;
            if (num != null) {
                anonymousClass182.A0Q("text_color", num.intValue());
            }
            Integer num2 = c66646URk.A04;
            if (num2 != null) {
                anonymousClass182.A0Q("background_color", num2.intValue());
            }
            anonymousClass182.A0a();
        }
        if (c5nm.A0O != null) {
            anonymousClass182.A0r("static_sticker_client_model");
            C217849kH c217849kH = c5nm.A0O;
            anonymousClass182.A0d();
            c217849kH.A00();
            anonymousClass182.A0r("static_sticker");
            AbstractC201078up.A00(anonymousClass182, c217849kH.A00());
            ADU.A00(anonymousClass182, c217849kH);
            anonymousClass182.A0a();
        }
        if (c5nm.A0X != null) {
            anonymousClass182.A0r("text_sticker_client_model");
            C5QK c5qk = c5nm.A0X;
            anonymousClass182.A0d();
            if (c5qk.A0D != null) {
                anonymousClass182.A0r("text_metadata");
                C5QM.A00(anonymousClass182, c5qk.A0D);
            }
            Layout.Alignment alignment = c5qk.A0A;
            if (alignment != null) {
                anonymousClass182.A0S("text_emphasis", alignment.name());
            }
            anonymousClass182.A0P("padding_x", c5qk.A03);
            anonymousClass182.A0P("padding_y", c5qk.A04);
            anonymousClass182.A0Q("text_color", c5qk.A07);
            anonymousClass182.A0P("text_size", c5qk.A05);
            if (c5qk.A0E != null) {
                anonymousClass182.A0r("shadow_layer");
                C1572374d c1572374d = c5qk.A0E;
                anonymousClass182.A0d();
                anonymousClass182.A0P("shadow_layer_radius", c1572374d.A02);
                anonymousClass182.A0P("shadow_layer_dx", c1572374d.A00);
                anonymousClass182.A0P("shadow_layer_dy", c1572374d.A01);
                anonymousClass182.A0Q("shadow_layer_color", c1572374d.A03);
                anonymousClass182.A0a();
            }
            anonymousClass182.A0P("line_spacing_add", c5qk.A01);
            anonymousClass182.A0P("line_spacing_mult", c5qk.A02);
            anonymousClass182.A0P("letter_spacing", c5qk.A00);
            anonymousClass182.A0Q("truncation_max_lines", c5qk.A09);
            String str24 = c5qk.A0G;
            if (str24 != null) {
                anonymousClass182.A0S("truncation_suffix", str24);
            }
            anonymousClass182.A0T("is_animated", c5qk.A0H);
            anonymousClass182.A0Q("safe_width", c5qk.A06);
            Integer num3 = c5qk.A0F;
            if (num3 != null) {
                anonymousClass182.A0S("drawable_source", C5QR.A00(num3));
            }
            anonymousClass182.A0T("is_story_text_drawable", c5qk.A0I);
            EnumC194908jr enumC194908jr = c5qk.A0B;
            if (enumC194908jr != null) {
                anonymousClass182.A0S("animation_id", enumC194908jr.A00);
            }
            C6RC c6rc = c5qk.A0C;
            if (c6rc != null) {
                anonymousClass182.A0S("effect_id", c6rc.A00);
            }
            anonymousClass182.A0Q("text_effect_color", c5qk.A08);
            anonymousClass182.A0a();
        }
        if (c5nm.A0D != null) {
            anonymousClass182.A0r("date_time_sticker_client_model");
            C217809kD c217809kD = c5nm.A0D;
            anonymousClass182.A0d();
            anonymousClass182.A0R("timestamp_ms", c217809kD.A00);
            ADU.A00(anonymousClass182, c217809kD);
            anonymousClass182.A0a();
        }
        if (c5nm.A0G != null) {
            anonymousClass182.A0r("internal_sticker_client_model");
            C217839kG c217839kG = c5nm.A0G;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("max_width", c217839kG.A00);
            anonymousClass182.A0T("is_ig_internal_sticker_available", c217839kG.A01);
            anonymousClass182.A0T("is_meta_internal_sticker_available", c217839kG.A02);
            ADU.A00(anonymousClass182, c217839kG);
            anonymousClass182.A0a();
        }
        if (c5nm.A0E != null) {
            anonymousClass182.A0r("gallery_sticker_client_model");
            C217899kM c217899kM = c5nm.A0E;
            anonymousClass182.A0d();
            c217899kM.A00();
            anonymousClass182.A0r("medium");
            C8IR.A00(anonymousClass182, c217899kM.A00());
            anonymousClass182.A0Q("max_width", c217899kM.A01);
            anonymousClass182.A0Q("max_height", c217899kM.A00);
            ADU.A00(anonymousClass182, c217899kM);
            anonymousClass182.A0a();
        }
        if (c5nm.A0L != null) {
            anonymousClass182.A0r("polaroid_sticker_client_model");
            C24016Aku c24016Aku = c5nm.A0L;
            anonymousClass182.A0d();
            if (c24016Aku.A00 != null) {
                anonymousClass182.A0r("medium");
                C8IR.A00(anonymousClass182, c24016Aku.A00);
            }
            String str25 = c24016Aku.A01;
            if (str25 != null) {
                anonymousClass182.A0S("caption", str25);
            }
            anonymousClass182.A0a();
        }
        if (c5nm.A0P != null) {
            anonymousClass182.A0r("swappable_gallery_sticker_client_model");
            C24020Aky c24020Aky = c5nm.A0P;
            anonymousClass182.A0d();
            str2 = "medium";
            if (c24020Aky.A02 != null) {
                anonymousClass182.A0r("medium");
                Medium medium = c24020Aky.A02;
                if (medium != null) {
                    C8IR.A00(anonymousClass182, medium);
                    anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c24020Aky.A01);
                    anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c24020Aky.A00);
                    anonymousClass182.A0a();
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        if (c5nm.A0M != null) {
            anonymousClass182.A0r("secret_sticker_client_model");
            ADV.A00(anonymousClass182, c5nm.A0M);
        }
        if (c5nm.A0W != null) {
            anonymousClass182.A0r("clips_attribution_sticker_client_model");
            C83o c83o = c5nm.A0W;
            anonymousClass182.A0d();
            User user2 = c83o.A0B;
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            Parcelable.Creator creator2 = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user2);
            User user3 = c83o.A0A;
            if (user3 != null) {
                anonymousClass182.A0r("group_profile");
                AbstractC38851rI.A08(anonymousClass182, user3);
            }
            anonymousClass182.A0S("original_media_id", c83o.A0C);
            anonymousClass182.A0Q("container_height", c83o.A01);
            anonymousClass182.A0Q("container_width", c83o.A02);
            anonymousClass182.A0P("aspect_ratio", c83o.A05);
            anonymousClass182.A0Q("media_duration", c83o.A06);
            C88513x8 c88513x8 = c83o.A09;
            if (c88513x8 != null) {
                anonymousClass182.A0r("clips_metadata");
                AbstractC83943oe.A00(anonymousClass182, c88513x8);
            }
            anonymousClass182.A0T("is_full_screen", c83o.A04);
            anonymousClass182.A0T("is_video_transcoding_enabled", c83o.A0D);
            anonymousClass182.A0P("full_screen_scale", c83o.A00);
            anonymousClass182.A0a();
        }
        if (c5nm.A0Q != null) {
            anonymousClass182.A0r("video_sticker_client_model");
            Al8 al8 = c5nm.A0Q;
            anonymousClass182.A0d();
            if (al8.A06 != null) {
                anonymousClass182.A0r("medium");
                C8IR.A00(anonymousClass182, al8.A06);
            }
            EnumC222999se enumC222999se = al8.A07;
            if (enumC222999se != null) {
                anonymousClass182.A0S("product_type", enumC222999se.toString());
            }
            anonymousClass182.A0Q("max_width", al8.A02);
            anonymousClass182.A0Q("max_height", al8.A01);
            anonymousClass182.A0P("volume", al8.A00);
            EnumC222939sY enumC222939sY = al8.A08;
            if (enumC222939sY != null) {
                anonymousClass182.A0S("clips_remix_layout_type", enumC222939sY.toString());
            }
            anonymousClass182.A0T("is_mirrored", al8.A09);
            anonymousClass182.A0T("should_use_new_transcoding_flow", al8.A0A);
            if (al8.A05 != null) {
                anonymousClass182.A0r("corner_radii");
                C206169Az c206169Az = al8.A05;
                anonymousClass182.A0d();
                anonymousClass182.A0P("top_left", c206169Az.A02);
                anonymousClass182.A0P("top_right", c206169Az.A03);
                anonymousClass182.A0P("bottom_right", c206169Az.A01);
                anonymousClass182.A0P("bottom_left", c206169Az.A00);
                anonymousClass182.A0a();
            }
            anonymousClass182.A0Q("time_interval_start_time_ms", al8.A04);
            anonymousClass182.A0Q("time_interval_end_time_ms", al8.A03);
            anonymousClass182.A0a();
        }
        if (c5nm.A0T != null) {
            anonymousClass182.A0r("dual_photo_client_model");
            Al2 al2 = c5nm.A0T;
            anonymousClass182.A0d();
            String str26 = al2.A04;
            if (str26 != null) {
                anonymousClass182.A0S("file_path", str26);
            }
            anonymousClass182.A0Q("creation_layout_config_width", al2.A02);
            anonymousClass182.A0Q("creation_layout_config_height", al2.A01);
            anonymousClass182.A0Q("orientation", al2.A03);
            anonymousClass182.A0Q("corner_radius", al2.A00);
            anonymousClass182.A0a();
        }
        if (c5nm.A00 != null) {
            anonymousClass182.A0r("question_sticker_client_model");
            ADF.A00(anonymousClass182, c5nm.A00, true);
        }
        if (c5nm.A04 != null) {
            anonymousClass182.A0r("prompt_sticker_client_model");
            AbstractC109294vv.A00(anonymousClass182, c5nm.A04, true);
        }
        if (c5nm.A0H != null) {
            anonymousClass182.A0r("link_sticker_client_model");
            C6RN c6rn = c5nm.A0H;
            anonymousClass182.A0d();
            ADU.A00(anonymousClass182, c6rn);
            anonymousClass182.A0a();
        }
        if (c5nm.A0b != null) {
            anonymousClass182.A0r("fundraiser_sticker_client_model");
            AEH.A00(anonymousClass182, c5nm.A0b, true);
        }
        if (c5nm.A01 != null) {
            anonymousClass182.A0r("countdown_sticker_client_model");
            AbstractC69879Vx4.A00(anonymousClass182, c5nm.A01, true);
        }
        if (c5nm.A0a != null) {
            anonymousClass182.A0r("chat_sticker_client_model");
            AbstractC69978Vyv.A00(anonymousClass182, c5nm.A0a, true);
        }
        if (c5nm.A06 != null) {
            anonymousClass182.A0r("slider_sticker_client_model");
            AbstractC69881Vx6.A00(anonymousClass182, c5nm.A06, true);
        }
        if (c5nm.A0F != null) {
            anonymousClass182.A0r("hashtag_sticker_client_model");
            C217879kK c217879kK = c5nm.A0F;
            anonymousClass182.A0d();
            String str27 = c217879kK.A02;
            if (str27 != null) {
                anonymousClass182.A0S("text", str27);
            }
            anonymousClass182.A0P("text_size", c217879kK.A00);
            anonymousClass182.A0Q("max_width", c217879kK.A01);
            ADU.A00(anonymousClass182, c217879kK);
            anonymousClass182.A0a();
        }
        if (c5nm.A0K != null) {
            anonymousClass182.A0r("mention_sticker_client_model");
            C217889kL c217889kL = c5nm.A0K;
            anonymousClass182.A0d();
            String str28 = c217889kL.A04;
            if (str28 != null) {
                anonymousClass182.A0S("text", str28);
            }
            anonymousClass182.A0P("text_size", c217889kL.A00);
            anonymousClass182.A0Q("max_width", c217889kL.A01);
            if (c217889kL.A03 != null) {
                anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                User user4 = c217889kL.A03;
                Parcelable.Creator creator3 = User.CREATOR;
                AbstractC38851rI.A08(anonymousClass182, user4);
            }
            if (c217889kL.A02 != null) {
                anonymousClass182.A0r("pics_please_response");
                QJ0 qj0 = c217889kL.A02;
                anonymousClass182.A0d();
                String str29 = qj0.A02;
                if (str29 != null) {
                    anonymousClass182.A0S("prompt", str29);
                }
                Number number = (Number) qj0.A00;
                if (number != null) {
                    anonymousClass182.A0Q("background_color", number.intValue());
                }
                String str30 = qj0.A01;
                if (str30 != null) {
                    anonymousClass182.A0S("original_question_id", str30);
                }
                String str31 = qj0.A04;
                if (str31 != null) {
                    anonymousClass182.A0S("question_response_id", str31);
                }
                String str32 = qj0.A03;
                if (str32 != null) {
                    anonymousClass182.A0S("question_responder_id", str32);
                }
                anonymousClass182.A0a();
            }
            ADU.A00(anonymousClass182, c217889kL);
            anonymousClass182.A0a();
        }
        if (c5nm.A05 != null) {
            anonymousClass182.A0r("quiz_sticker_client_model");
            AbstractC69880Vx5.A00(anonymousClass182, c5nm.A05, true);
        }
        if (c5nm.A0J != null) {
            anonymousClass182.A0r("location_sticker_client_model");
            C217869kJ c217869kJ = c5nm.A0J;
            anonymousClass182.A0d();
            if (c217869kJ.A00 != null) {
                anonymousClass182.A0r("venue");
                LocationDict locationDict = c217869kJ.A00;
                if (locationDict != null) {
                    AbstractC84373pU.A00(anonymousClass182, locationDict);
                    Integer num4 = c217869kJ.A01;
                    if (num4 != null) {
                        anonymousClass182.A0Q("themed_color", num4.intValue());
                    }
                    ADU.A00(anonymousClass182, c217869kJ);
                    anonymousClass182.A0a();
                }
            }
            str2 = "locationDict";
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        if (c5nm.A0f != null) {
            anonymousClass182.A0r("poll_sticker_client_model");
            Al7 al7 = c5nm.A0f;
            anonymousClass182.A0d();
            anonymousClass182.A0S("first_option_string", al7.A05);
            anonymousClass182.A0S("second_option_string", al7.A07);
            anonymousClass182.A0P("first_option_text_size", al7.A00);
            anonymousClass182.A0P("second_option_text_size", al7.A02);
            String str33 = al7.A06;
            if (str33 != null) {
                anonymousClass182.A0S("question", str33);
            }
            anonymousClass182.A0P("question_text_size", al7.A01);
            anonymousClass182.A0Q("question_max_width", al7.A03);
            anonymousClass182.A0Q("question_padding_bottom", al7.A04);
            anonymousClass182.A0a();
        }
        if (c5nm.A0g != null) {
            anonymousClass182.A0r("poll_sticker_v2_client_model");
            Wm4 wm4 = c5nm.A0g;
            anonymousClass182.A0d();
            anonymousClass182.A0S(AbstractC43591JPw.A00(448), wm4.A03);
            String str34 = wm4.A04;
            if (str34 != null) {
                anonymousClass182.A0S("question", str34);
            }
            Integer num5 = wm4.A01;
            if (num5 != null) {
                anonymousClass182.A0Q("viewer_vote", num5.intValue());
            }
            anonymousClass182.A0T("viewer_can_vote", wm4.A07);
            anonymousClass182.A0T("is_shared_result", wm4.A08);
            C16V.A03(anonymousClass182, "tallies");
            for (C101374gu c101374gu : wm4.A06) {
                if (c101374gu != null) {
                    AbstractC101364gt.A00(anonymousClass182, c101374gu);
                }
            }
            anonymousClass182.A0Z();
            if (wm4.A05 != null) {
                C16V.A03(anonymousClass182, "option_tally_ratios");
                for (Number number2 : wm4.A05) {
                    if (number2 != null) {
                        anonymousClass182.A0h(number2.intValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0S("color", wm4.A02);
            anonymousClass182.A0a();
        }
        if (c5nm.A0A != null) {
            anonymousClass182.A0r("clips_end_card_client_model");
            Al4 al4 = c5nm.A0A;
            anonymousClass182.A0d();
            anonymousClass182.A0S(AbstractC31198Dnh.A02(19, 8, 115), al4.A05);
            String str35 = al4.A04;
            if (str35 != null) {
                anonymousClass182.A0S("attribution_info", str35);
            }
            anonymousClass182.A0Q("container_width", al4.A01);
            anonymousClass182.A0Q("container_height", al4.A00);
            anonymousClass182.A0R("video_duration", al4.A03);
            anonymousClass182.A0Q("endcard_video_duration_ms", al4.A02);
            anonymousClass182.A0a();
        }
        if (c5nm.A09 != null) {
            anonymousClass182.A0r("clips_end_card_static_client_model");
            Al5 al5 = c5nm.A09;
            anonymousClass182.A0d();
            anonymousClass182.A0S(AbstractC31198Dnh.A01(), al5.A06);
            String str36 = al5.A05;
            if (str36 != null) {
                anonymousClass182.A0S("attribution_info", str36);
            }
            anonymousClass182.A0Q("container_width", al5.A01);
            anonymousClass182.A0Q("container_height", al5.A00);
            anonymousClass182.A0R("video_duration", al5.A03);
            anonymousClass182.A0Q("endcard_video_duration_ms", al5.A02);
            if (1 - al5.A04.intValue() != 0) {
                str = "last_frame";
            } else {
                str = "black_background";
            }
            anonymousClass182.A0S("background_type", str);
            anonymousClass182.A0a();
        }
        if (c5nm.A0B != null) {
            anonymousClass182.A0r("clips_watermark_client_model");
            Al1 al1 = c5nm.A0B;
            anonymousClass182.A0d();
            anonymousClass182.A0S(AbstractC31198Dnh.A02(19, 8, 115), al1.A04);
            String str37 = al1.A03;
            if (str37 != null) {
                anonymousClass182.A0S("attribution_info", str37);
            }
            anonymousClass182.A0Q("container_width", al1.A01);
            anonymousClass182.A0Q("container_height", al1.A00);
            anonymousClass182.A0Q("video_duration", al1.A02);
            anonymousClass182.A0a();
        }
        if (c5nm.A0I != null) {
            anonymousClass182.A0r("loadable_gif_sticker_client_model");
            C74W c74w = c5nm.A0I;
            anonymousClass182.A0d();
            String str38 = c74w.A08;
            if (str38 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str38);
            }
            String str39 = c74w.A09;
            if (str39 != null) {
                anonymousClass182.A0S("image_url", str39);
            }
            String str40 = c74w.A07;
            if (str40 != null) {
                anonymousClass182.A0S("high_resolution_image_url", str40);
            }
            anonymousClass182.A0P("progress_bar_width", c74w.A00);
            anonymousClass182.A0Q("intrinsic_size", c74w.A02);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c74w.A05);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c74w.A01);
            anonymousClass182.A0Q("progress_background_colour", c74w.A03);
            anonymousClass182.A0Q("progress_foreground_colour", c74w.A04);
            anonymousClass182.A0T("is_background_gif_drawable", c74w.A0A);
            Integer num6 = c74w.A06;
            if (num6 != null) {
                if (1 - num6.intValue() != 0) {
                    A00 = MSV.A00(369);
                } else {
                    A00 = AbstractC58317Pt9.A00(182);
                }
                anonymousClass182.A0S("scale_mode", A00);
            }
            anonymousClass182.A0a();
        }
        if (c5nm.A0S != null) {
            anonymousClass182.A0r("reels_visual_replies_model");
            ReelsVisualRepliesModel reelsVisualRepliesModel = c5nm.A0S;
            anonymousClass182.A0d();
            if (reelsVisualRepliesModel.A00 != null) {
                anonymousClass182.A0r("media_vcr_tappable_data");
                AbstractC2042191r.A00(anonymousClass182, reelsVisualRepliesModel.A00, true);
            }
            ADU.A00(anonymousClass182, reelsVisualRepliesModel);
            anonymousClass182.A0a();
        }
        if (c5nm.A0c != null) {
            anonymousClass182.A0r("i_take_care_sticker_model");
            AlA alA = c5nm.A0c;
            anonymousClass182.A0d();
            String str41 = alA.A02;
            if (str41 != null) {
                anonymousClass182.A0S("prompt", str41);
            }
            String str42 = alA.A01;
            if (str42 != null) {
                anonymousClass182.A0S("hint", str42);
            }
            String str43 = alA.A00;
            if (str43 != null) {
                anonymousClass182.A0S("help_text", str43);
            }
            String str44 = alA.A03;
            if (str44 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str44);
            }
            anonymousClass182.A0a();
        }
        if (c5nm.A08 != null) {
            anonymousClass182.A0r("subscriptions_sticker_model");
            ADI.A00(anonymousClass182, c5nm.A08);
        }
        if (c5nm.A0h != null) {
            anonymousClass182.A0r("reaction_sticker_model");
            AbstractC106064qM.A00(anonymousClass182, c5nm.A0h);
        }
        if (c5nm.A0j != null) {
            anonymousClass182.A0r("upcoming_event");
            IT3.A00(anonymousClass182, c5nm.A0j);
        }
        if (c5nm.A0R != null) {
            anonymousClass182.A0r("share_platform_sticker_model");
            SharePlatformStickerClientModel sharePlatformStickerClientModel = c5nm.A0R;
            anonymousClass182.A0d();
            if (sharePlatformStickerClientModel.A07 != null) {
                anonymousClass182.A0r("media_upload_metadata");
                AbstractC93554Hv.A00(anonymousClass182, sharePlatformStickerClientModel.A07);
            }
            String str45 = sharePlatformStickerClientModel.A09;
            if (str45 != null) {
                anonymousClass182.A0S("attribution_url", str45);
            }
            String str46 = sharePlatformStickerClientModel.A0A;
            if (str46 != null) {
                anonymousClass182.A0S("image_path", str46);
            }
            anonymousClass182.A0Q("image_width", sharePlatformStickerClientModel.A03);
            anonymousClass182.A0Q("image_height", sharePlatformStickerClientModel.A02);
            anonymousClass182.A0Q("rotation", sharePlatformStickerClientModel.A04);
            anonymousClass182.A0Q("sticker_width", sharePlatformStickerClientModel.A06);
            anonymousClass182.A0Q("sticker_height", sharePlatformStickerClientModel.A05);
            anonymousClass182.A0T("should_keep_on_screen", sharePlatformStickerClientModel.A0B);
            EnumC222859sQ enumC222859sQ = sharePlatformStickerClientModel.A08;
            if (enumC222859sQ != null) {
                anonymousClass182.A0S("share_platform_type", enumC222859sQ.A00);
            }
            anonymousClass182.A0P("start_time_ms", sharePlatformStickerClientModel.A01);
            anonymousClass182.A0P("end_time_ms", sharePlatformStickerClientModel.A00);
            anonymousClass182.A0a();
        }
        if (c5nm.A07 != null) {
            anonymousClass182.A0r("before_and_after_sticker_model");
            IPG.A00(anonymousClass182, c5nm.A07, true);
        }
        if (c5nm.A02 != null) {
            anonymousClass182.A0r("group_mention_sticker_model");
            ADG.A00(anonymousClass182, c5nm.A02);
        }
        if (c5nm.A03 != null) {
            anonymousClass182.A0r("music_pick_sticker_model");
            IP8.A00(anonymousClass182, c5nm.A03);
        }
        if (c5nm.A0N != null) {
            anonymousClass182.A0r("secret_sticker_model");
            ADV.A00(anonymousClass182, c5nm.A0N);
        }
        if (c5nm.A0Z != null) {
            anonymousClass182.A0r("bio_product_sticker_model");
            Al3 al3 = c5nm.A0Z;
            anonymousClass182.A0d();
            String str47 = al3.A03;
            if (str47 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str47);
            }
            String str48 = al3.A02;
            if (str48 != null) {
                anonymousClass182.A0S("price", str48);
            }
            String str49 = al3.A00;
            if (str49 != null) {
                anonymousClass182.A0S("coverImagePath", str49);
            }
            String str50 = al3.A04;
            if (str50 != null) {
                anonymousClass182.A0S("variants", str50);
            }
            String str51 = al3.A01;
            if (str51 != null) {
                anonymousClass182.A0S("currency", str51);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
