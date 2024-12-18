package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.55i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1123155i {
    public static C84823qW parseFromJson(C16L c16l) {
        EnumC75383a5 enumC75383a5;
        String str;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C84823qW c84823qW = new C84823qW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    EnumC75383a5 enumC75383a52 = (EnumC75383a5) EnumC75383a5.A01.get(c16l.A1Q());
                    if (enumC75383a52 == null) {
                        enumC75383a52 = EnumC75383a5.A1J;
                    }
                    c84823qW.A12 = enumC75383a52;
                } else {
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    String str13 = null;
                    String str14 = null;
                    String str15 = null;
                    String str16 = null;
                    String str17 = null;
                    String str18 = null;
                    String str19 = null;
                    String str20 = null;
                    String str21 = null;
                    ArrayList arrayList = null;
                    String str22 = null;
                    String str23 = null;
                    String str24 = null;
                    String str25 = null;
                    String str26 = null;
                    String str27 = null;
                    String str28 = null;
                    if ("template_sticker_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        c84823qW.A1m = str3;
                    } else if ("fillable_element_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        c84823qW.A1U = str4;
                    } else if ("gallery_fillable_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        c84823qW.A1V = str5;
                    } else if ("color_string".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str6 = c16l.A1P();
                        }
                        c84823qW.A1Q = str6;
                    } else if ("x".equals(A0q)) {
                        c84823qW.A03 = (float) c16l.A0U();
                    } else if ("y".equals(A0q)) {
                        c84823qW.A04 = (float) c16l.A0U();
                    } else if ("z".equals(A0q)) {
                        c84823qW.A09 = c16l.A1D();
                    } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                        c84823qW.A02 = (float) c16l.A0U();
                    } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                        c84823qW.A00 = (float) c16l.A0U();
                    } else if ("rotation".equals(A0q)) {
                        c84823qW.A01 = (float) c16l.A0U();
                    } else if ("start_time_ms".equals(A0q)) {
                        c84823qW.A1L = new Float(c16l.A0U());
                    } else if ("end_time_ms".equals(A0q)) {
                        c84823qW.A1K = new Float(c16l.A0U());
                    } else if ("is_consumption_disabled".equals(A0q)) {
                        c84823qW.A1r = c16l.A0d();
                    } else if ("consumption_disabled_reason".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str7 = c16l.A1P();
                        }
                        c84823qW.A1R = str7;
                    } else if ("accessibility_label".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str8 = c16l.A1P();
                        }
                        c84823qW.A1N = str8;
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                        Parcelable.Creator creator = User.CREATOR;
                        c84823qW.A1C = AbstractC38851rI.A00(c16l, false);
                    } else if ("location".equals(A0q)) {
                        c84823qW.A0u = AbstractC84373pU.parseFromJson(c16l);
                    } else if ("hashtag".equals(A0q)) {
                        c84823qW.A0l = AbstractC109614wn.parseFromJson(c16l);
                    } else if ("product_sticker".equals(A0q)) {
                        c84823qW.A0r = IRH.parseFromJson(c16l);
                    } else if ("multi_product_sticker".equals(A0q)) {
                        c84823qW.A0o = IRE.parseFromJson(c16l);
                    } else if ("seller_collection_sticker".equals(A0q)) {
                        c84823qW.A0p = IRG.parseFromJson(c16l);
                    } else if ("storefront_sticker".equals(A0q)) {
                        c84823qW.A0s = IRK.parseFromJson(c16l);
                    } else if ("product_share_sticker".equals(A0q)) {
                        c84823qW.A0q = I47.parseFromJson(c16l);
                    } else if ("countdown_sticker".equals(A0q)) {
                        c84823qW.A0R = AbstractC69879Vx4.parseFromJson(c16l);
                    } else if ("fundraiser_sticker".equals(A0q)) {
                        c84823qW.A0z = AEH.parseFromJson(c16l);
                    } else if ("fb_fundraiser_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str9 = c16l.A1P();
                        }
                        c84823qW.A1T = str9;
                    } else if ("fb_community_sticker".equals(A0q)) {
                        c84823qW.A0S = IP4.parseFromJson(c16l);
                    } else if ("fb_tag_sticker".equals(A0q)) {
                        c84823qW.A0T = IP5.parseFromJson(c16l);
                    } else if ("smb_support_sticker".equals(A0q)) {
                        c84823qW.A0P = AbstractC41278IOt.parseFromJson(c16l);
                    } else if ("support_personalized_ads_sticker".equals(A0q)) {
                        c84823qW.A0A = AbstractC46594KjX.parseFromJson(c16l);
                    } else if ("poll_sticker".equals(A0q)) {
                        c84823qW.A15 = AbstractC101354gs.parseFromJson(c16l);
                    } else if ("question_sticker".equals(A0q)) {
                        c84823qW.A0O = ADF.parseFromJson(c16l);
                    } else if ("question_response_metadata".equals(A0q)) {
                        c84823qW.A16 = AEN.parseFromJson(c16l);
                    } else if ("prompt_sticker".equals(A0q)) {
                        c84823qW.A0Z = AbstractC109294vv.parseFromJson(c16l);
                    } else if ("karaoke_sticker".equals(A0q)) {
                        c84823qW.A0J = IOP.parseFromJson(c16l);
                    } else if ("clips_text_sticker".equals(A0q)) {
                        c84823qW.A0g = IPQ.parseFromJson(c16l);
                    } else if ("music_pick_sticker".equals(A0q)) {
                        c84823qW.A0X = IP8.parseFromJson(c16l);
                    } else if ("before_and_after_sticker".equals(A0q)) {
                        c84823qW.A0d = IPG.parseFromJson(c16l);
                    } else if ("photo_credit_sticker".equals(A0q)) {
                        c84823qW.A0L = AbstractC40140Hr9.parseFromJson(c16l);
                    } else if ("caption".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str10 = c16l.A1P();
                        }
                        c84823qW.A1f = str10;
                    } else if ("notify_me_sticker".equals(A0q)) {
                        c84823qW.A0Y = ADH.parseFromJson(c16l);
                    } else if ("achievement_sticker".equals(A0q)) {
                        c84823qW.A0Q = AbstractC41283IOy.parseFromJson(c16l);
                    } else if ("group_mention_sticker".equals(A0q)) {
                        c84823qW.A0V = ADG.parseFromJson(c16l);
                    } else if ("join_chat_sticker".equals(A0q)) {
                        c84823qW.A0y = AbstractC69978Vyv.parseFromJson(c16l);
                    } else if ("quiz_sticker".equals(A0q)) {
                        c84823qW.A0a = AbstractC69880Vx5.parseFromJson(c16l);
                    } else if ("slider_sticker".equals(A0q)) {
                        c84823qW.A0b = AbstractC69881Vx6.parseFromJson(c16l);
                    } else if ("music_asset_info".equals(A0q)) {
                        c84823qW.A0v = C4A1.parseFromJson(c16l);
                    } else if ("original_sound_info".equals(A0q)) {
                        c84823qW.A0w = C4A1.parseFromJson(c16l);
                    } else if ("should_render_soundwave".equals(A0q)) {
                        c84823qW.A1J = Boolean.valueOf(c16l.A0d());
                    } else if ("election_sticker".equals(A0q)) {
                        c84823qW.A0k = I2F.parseFromJson(c16l);
                    } else if ("anti_bully_sticker".equals(A0q)) {
                        c84823qW.A1D = ITD.parseFromJson(c16l);
                    } else if ("anti_bully_global_sticker".equals(A0q)) {
                        c84823qW.A1E = ITD.parseFromJson(c16l);
                    } else if ("voter_registration_sticker".equals(A0q)) {
                        c84823qW.A1H = ITD.parseFromJson(c16l);
                    } else if ("bloks_tappable_sticker".equals(A0q)) {
                        c84823qW.A1G = ITD.parseFromJson(c16l);
                    } else if ("bloks_sticker".equals(A0q)) {
                        c84823qW.A1F = ITD.parseFromJson(c16l);
                    } else if ("upcoming_event".equals(A0q)) {
                        c84823qW.A1B = IT3.parseFromJson(c16l);
                    } else if ("upcoming_event_media".equals(A0q)) {
                        c84823qW.A0t = IRM.parseFromJson(c16l);
                    } else if ("upcoming_event_sticker_source".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str11 = c16l.A1P();
                        }
                        UpcomingEventStickerSource upcomingEventStickerSource = (UpcomingEventStickerSource) UpcomingEventStickerSource.A01.get(str11);
                        if (upcomingEventStickerSource == null) {
                            upcomingEventStickerSource = UpcomingEventStickerSource.A06;
                        }
                        c84823qW.A0h = upcomingEventStickerSource;
                    } else if ("story_link".equals(A0q)) {
                        c84823qW.A0W = AbstractC108134tw.parseFromJson(c16l);
                    } else if ("reaction_sticker".equals(A0q)) {
                        c84823qW.A17 = AbstractC106064qM.parseFromJson(c16l);
                    } else if ("viewer_avatar_sticker".equals(A0q)) {
                        c84823qW.A0D = AbstractC102124ii.parseFromJson(c16l);
                    } else if ("author_avatar_sticker".equals(A0q)) {
                        c84823qW.A0C = AbstractC102124ii.parseFromJson(c16l);
                    } else if ("surface".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str12 = c16l.A1P();
                        }
                        c84823qW.A1k = str12;
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str13 = c16l.A1P();
                        }
                        c84823qW.A1o = str13;
                    } else if ("feature_linking_sticker".equals(A0q)) {
                        c84823qW.A0U = AbstractC40285Htp.parseFromJson(c16l);
                    } else if ("subscription_sticker".equals(A0q)) {
                        c84823qW.A0e = ADI.parseFromJson(c16l);
                    } else if ("subscription_shoutout_mention_sticker".equals(A0q)) {
                        c84823qW.A0c = IPF.parseFromJson(c16l);
                    } else if ("vcr_sticker".equals(A0q)) {
                        c84823qW.A0K = AbstractC2042191r.parseFromJson(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str14 = c16l.A1P();
                        }
                        c84823qW.A1Y = str14;
                    } else if ("media_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str15 = c16l.A1P();
                        }
                        c84823qW.A1b = str15;
                    } else if ("media_compound_str".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str16 = c16l.A1P();
                        }
                        c84823qW.A1a = str16;
                    } else if ("carousel_share_child_media_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str17 = c16l.A1P();
                        }
                        c84823qW.A1P = str17;
                    } else if ("media_owner_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str18 = c16l.A1P();
                        }
                        c84823qW.A1c = str18;
                    } else if ("product_type".equals(A0q)) {
                        c84823qW.A0n = (ProductType) ProductType.A01.get(c16l.A1Q());
                    } else if ("media_type".equals(A0q)) {
                        c84823qW.A0m = AbstractC40091ta.A00(Integer.valueOf(c16l.A1D()));
                    } else if ("clips_creation_entry_point".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str19 = c16l.A1P();
                        }
                        ClipsCreationEntryPoint clipsCreationEntryPoint = (ClipsCreationEntryPoint) ClipsCreationEntryPoint.A01.get(str19);
                        if (clipsCreationEntryPoint == null) {
                            clipsCreationEntryPoint = ClipsCreationEntryPoint.A06;
                        }
                        c84823qW.A0E = clipsCreationEntryPoint;
                    } else if ("collection_ad_thumbnail_position".equals(A0q)) {
                        c84823qW.A05 = c16l.A1D();
                    } else if ("upcoming_event_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str20 = c16l.A1P();
                        }
                        c84823qW.A1n = str20;
                    } else if ("merchant_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str21 = c16l.A1P();
                        }
                        c84823qW.A1d = str21;
                    } else if ("product_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList.add(A1P);
                                }
                            }
                        }
                        c84823qW.A1p = arrayList;
                    } else if ("server_sticker_burn_in_params".equals(A0q)) {
                        c84823qW.A13 = AEJ.parseFromJson(c16l);
                    } else if ("text_post_sticker".equals(A0q)) {
                        c84823qW.A0f = IPP.parseFromJson(c16l);
                    } else if ("whatsapp_channel_sticker".equals(A0q)) {
                        c84823qW.A0i = ADJ.parseFromJson(c16l);
                    } else if ("story_explore_shareable_grid".equals(A0q)) {
                        c84823qW.A0H = IO1.parseFromJson(c16l);
                    } else if ("explore_shareable_grid_metadata".equals(A0q)) {
                        c84823qW.A0G = IO0.parseFromJson(c16l);
                    } else if ("ig_bio_sticker".equals(A0q)) {
                        c84823qW.A0I = AbstractC225479xC.parseFromJson(c16l);
                    } else if ("attribution".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str22 = c16l.A1P();
                        }
                        c84823qW.A1O = str22;
                    } else if ("is_sticker".equals(A0q)) {
                        c84823qW.A1u = c16l.A0d();
                    } else if ("use_custom_title".equals(A0q)) {
                        c84823qW.A1v = c16l.A0d();
                    } else if ("custom_title".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str23 = c16l.A1P();
                        }
                        c84823qW.A1S = str23;
                    } else if ("display_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str24 = c16l.A1P();
                        }
                        c84823qW.A1h = str24;
                    } else if ("highlighted_media_ids".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str25 = c16l.A1P();
                        }
                        c84823qW.A1X = str25;
                    } else if ("is_hidden".equals(A0q)) {
                        c84823qW.A1t = c16l.A0d();
                    } else if ("is_fb_sticker".equals(A0q)) {
                        c84823qW.A1s = c16l.A0d();
                    } else if ("tap_state".equals(A0q)) {
                        c84823qW.A07 = c16l.A1D();
                    } else if ("tap_state_str_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str26 = c16l.A1P();
                        }
                        c84823qW.A1l = str26;
                    } else if ("str_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str27 = c16l.A1P();
                        }
                        c84823qW.A1j = str27;
                    } else if ("sticker_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str28 = c16l.A1P();
                        }
                        c84823qW.A1i = str28;
                    } else if ("object_type".equals(A0q)) {
                        EnumC75383a5 enumC75383a53 = (EnumC75383a5) EnumC75383a5.A01.get(c16l.A1Q());
                        if (enumC75383a53 == null) {
                            enumC75383a53 = EnumC75383a5.A1J;
                        }
                        c84823qW.A11 = enumC75383a53;
                    } else if ("image_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c84823qW.A1Z = str2;
                    } else if ("ring_glyph".equals(A0q)) {
                        c84823qW.A18 = AbstractC41346IRr.parseFromJson(c16l);
                    } else if ("story_public_collection".equals(A0q)) {
                        c84823qW.A0N = AbstractC41269IOk.parseFromJson(c16l);
                    } else if ("public_collection_metadata".equals(A0q)) {
                        c84823qW.A0M = HsH.parseFromJson(c16l);
                    }
                }
                c16l.A0z();
            }
            if (c84823qW.A0v == null && c84823qW.A0w == null) {
                if (c84823qW.A1C != null) {
                    enumC75383a5 = EnumC75383a5.A0n;
                } else if (c84823qW.A0u != null) {
                    enumC75383a5 = EnumC75383a5.A0j;
                } else if (c84823qW.A0l != null) {
                    enumC75383a5 = EnumC75383a5.A0d;
                } else if (c84823qW.A0U != null) {
                    enumC75383a5 = EnumC75383a5.A0Z;
                } else if (c84823qW.A0r != null) {
                    enumC75383a5 = EnumC75383a5.A0y;
                } else if (c84823qW.A0o != null) {
                    enumC75383a5 = EnumC75383a5.A0q;
                } else if (c84823qW.A0p != null) {
                    enumC75383a5 = EnumC75383a5.A0z;
                } else if (c84823qW.A0s != null) {
                    enumC75383a5 = EnumC75383a5.A1F;
                } else if (c84823qW.A0q != null) {
                    enumC75383a5 = EnumC75383a5.A10;
                } else if (c84823qW.A0R != null) {
                    enumC75383a5 = EnumC75383a5.A0O;
                } else if (c84823qW.A0z != null) {
                    enumC75383a5 = EnumC75383a5.A0b;
                } else if (c84823qW.A1T != null) {
                    enumC75383a5 = EnumC75383a5.A0X;
                } else if (c84823qW.A0P != null) {
                    enumC75383a5 = EnumC75383a5.A1D;
                } else if (c84823qW.A15 != null) {
                    enumC75383a5 = EnumC75383a5.A0x;
                } else if (c84823qW.A0O != null) {
                    enumC75383a5 = EnumC75383a5.A14;
                } else if (c84823qW.A16 != null) {
                    enumC75383a5 = EnumC75383a5.A15;
                } else {
                    StoryPromptTappableData storyPromptTappableData = c84823qW.A0Z;
                    if (storyPromptTappableData != null) {
                        Boolean bool = storyPromptTappableData.A0B;
                        if (bool != null && bool.booleanValue()) {
                            enumC75383a5 = EnumC75383a5.A0I;
                        } else {
                            enumC75383a5 = EnumC75383a5.A11;
                        }
                    } else {
                        C66645URj c66645URj = c84823qW.A0y;
                        if (c66645URj != null) {
                            if (c66645URj.A04 == ChatStickerStickerType.A09) {
                                c84823qW.A12 = EnumC75383a5.A0p;
                                c84823qW.A14 = new C8F9(null, null, null, null, null, c66645URj, "", "", null, null, null, false, false, false, false);
                                return c84823qW;
                            }
                            enumC75383a5 = EnumC75383a5.A0g;
                        } else if (c84823qW.A0a != null) {
                            enumC75383a5 = EnumC75383a5.A16;
                        } else if (c84823qW.A0b != null) {
                            enumC75383a5 = EnumC75383a5.A1C;
                        } else {
                            UpcomingEventImpl upcomingEventImpl = c84823qW.A1B;
                            if (upcomingEventImpl != null) {
                                str = upcomingEventImpl.A0B;
                            } else {
                                str = c84823qW.A1n;
                            }
                            if (str != null) {
                                enumC75383a5 = EnumC75383a5.A1K;
                            } else if (c84823qW.A1b != null) {
                                enumC75383a5 = EnumC75383a5.A0k;
                            } else {
                                String str29 = c84823qW.A1Y;
                                if (str29 != null) {
                                    if (str29.equals("sound_on_sticker")) {
                                        enumC75383a5 = EnumC75383a5.A1E;
                                    } else if (str29.equals("ar_effect_sticker")) {
                                        enumC75383a5 = EnumC75383a5.A08;
                                    }
                                }
                                if (c84823qW.A0k != null) {
                                    enumC75383a5 = EnumC75383a5.A0U;
                                } else if (c84823qW.A1D != null) {
                                    enumC75383a5 = EnumC75383a5.A06;
                                } else if (c84823qW.A1E != null) {
                                    enumC75383a5 = EnumC75383a5.A07;
                                } else if (c84823qW.A1H != null) {
                                    enumC75383a5 = EnumC75383a5.A1L;
                                } else if (c84823qW.A0W != null) {
                                    enumC75383a5 = EnumC75383a5.A0i;
                                } else if (c84823qW.A1F != null) {
                                    enumC75383a5 = EnumC75383a5.A0D;
                                } else if (c84823qW.A1G != null) {
                                    enumC75383a5 = EnumC75383a5.A0E;
                                } else if (c84823qW.A17 != null) {
                                    enumC75383a5 = EnumC75383a5.A17;
                                } else if (c84823qW.A19 != null) {
                                    enumC75383a5 = EnumC75383a5.A0A;
                                } else if (c84823qW.A0C != null) {
                                    enumC75383a5 = EnumC75383a5.A09;
                                } else if (c84823qW.A0e != null) {
                                    enumC75383a5 = EnumC75383a5.A1G;
                                } else if (c84823qW.A0c != null) {
                                    enumC75383a5 = EnumC75383a5.A1H;
                                } else if (c84823qW.A0S != null) {
                                    enumC75383a5 = EnumC75383a5.A0W;
                                } else if (c84823qW.A0T != null) {
                                    enumC75383a5 = EnumC75383a5.A0Y;
                                } else if (c84823qW.A0K != null) {
                                    enumC75383a5 = EnumC75383a5.A18;
                                } else if (c84823qW.A0V != null) {
                                    enumC75383a5 = EnumC75383a5.A0c;
                                } else if (c84823qW.A0d != null) {
                                    enumC75383a5 = EnumC75383a5.A0B;
                                } else if (c84823qW.A0f != null) {
                                    enumC75383a5 = EnumC75383a5.A1I;
                                } else if (c84823qW.A0i != null) {
                                    enumC75383a5 = EnumC75383a5.A1N;
                                } else if (c84823qW.A12 != EnumC75383a5.A0r) {
                                    if (c84823qW.A0G != null) {
                                        enumC75383a5 = EnumC75383a5.A0V;
                                    } else if (c84823qW.A0X != null) {
                                        enumC75383a5 = EnumC75383a5.A0t;
                                    } else if (c84823qW.A0M != null) {
                                        enumC75383a5 = EnumC75383a5.A13;
                                    } else {
                                        enumC75383a5 = EnumC75383a5.A1J;
                                    }
                                } else {
                                    return c84823qW;
                                }
                            }
                        }
                    }
                }
            } else {
                enumC75383a5 = EnumC75383a5.A0s;
            }
            c84823qW.A12 = enumC75383a5;
            return c84823qW;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C84823qW c84823qW) {
        anonymousClass182.A0d();
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c84823qW.A12.A00);
        String str = c84823qW.A1m;
        if (str != null) {
            anonymousClass182.A0S("template_sticker_id", str);
        }
        String str2 = c84823qW.A1U;
        if (str2 != null) {
            anonymousClass182.A0S("fillable_element_type", str2);
        }
        String str3 = c84823qW.A1V;
        if (str3 != null) {
            anonymousClass182.A0S("gallery_fillable_type", str3);
        }
        String str4 = c84823qW.A1Q;
        if (str4 != null) {
            anonymousClass182.A0S("color_string", str4);
        }
        anonymousClass182.A0P("x", c84823qW.A03);
        anonymousClass182.A0P("y", c84823qW.A04);
        anonymousClass182.A0Q("z", c84823qW.A09);
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, c84823qW.A02);
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, c84823qW.A00);
        anonymousClass182.A0P("rotation", c84823qW.A01);
        Float f = c84823qW.A1L;
        if (f != null) {
            anonymousClass182.A0P("start_time_ms", f.floatValue());
        }
        Float f2 = c84823qW.A1K;
        if (f2 != null) {
            anonymousClass182.A0P("end_time_ms", f2.floatValue());
        }
        anonymousClass182.A0T("is_consumption_disabled", c84823qW.A1r);
        String str5 = c84823qW.A1R;
        if (str5 != null) {
            anonymousClass182.A0S("consumption_disabled_reason", str5);
        }
        String str6 = c84823qW.A1N;
        if (str6 != null) {
            anonymousClass182.A0S("accessibility_label", str6);
        }
        if (c84823qW.A1C != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            User user = c84823qW.A1C;
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        if (c84823qW.A0u != null) {
            anonymousClass182.A0r("location");
            AbstractC84373pU.A00(anonymousClass182, c84823qW.A0u);
        }
        if (c84823qW.A0l != null) {
            anonymousClass182.A0r("hashtag");
            AbstractC109614wn.A00(anonymousClass182, c84823qW.A0l);
        }
        if (c84823qW.A0r != null) {
            anonymousClass182.A0r("product_sticker");
            IRH.A00(anonymousClass182, c84823qW.A0r);
        }
        if (c84823qW.A0o != null) {
            anonymousClass182.A0r("multi_product_sticker");
            IRE.A00(anonymousClass182, c84823qW.A0o);
        }
        if (c84823qW.A0p != null) {
            anonymousClass182.A0r("seller_collection_sticker");
            IRG.A00(anonymousClass182, c84823qW.A0p);
        }
        if (c84823qW.A0s != null) {
            anonymousClass182.A0r("storefront_sticker");
            IRK.A00(anonymousClass182, c84823qW.A0s);
        }
        if (c84823qW.A0q != null) {
            anonymousClass182.A0r("product_share_sticker");
            C38821H7n c38821H7n = c84823qW.A0q;
            anonymousClass182.A0d();
            ProductDetailsProductItemDict productDetailsProductItemDict = c38821H7n.A00;
            if (productDetailsProductItemDict != null) {
                anonymousClass182.A0r("product");
                AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
            }
            anonymousClass182.A0a();
        }
        if (c84823qW.A0R != null) {
            anonymousClass182.A0r("countdown_sticker");
            AbstractC69879Vx4.A00(anonymousClass182, c84823qW.A0R, true);
        }
        if (c84823qW.A0z != null) {
            anonymousClass182.A0r("fundraiser_sticker");
            AEH.A00(anonymousClass182, c84823qW.A0z, true);
        }
        String str7 = c84823qW.A1T;
        if (str7 != null) {
            anonymousClass182.A0S("fb_fundraiser_id", str7);
        }
        if (c84823qW.A0S != null) {
            anonymousClass182.A0r("fb_community_sticker");
            IP4.A00(anonymousClass182, c84823qW.A0S, true);
        }
        if (c84823qW.A0T != null) {
            anonymousClass182.A0r("fb_tag_sticker");
            IP5.A00(anonymousClass182, c84823qW.A0T);
        }
        if (c84823qW.A0P != null) {
            anonymousClass182.A0r("smb_support_sticker");
            AbstractC41278IOt.A00(anonymousClass182, c84823qW.A0P, true);
        }
        if (c84823qW.A0A != null) {
            anonymousClass182.A0r("support_personalized_ads_sticker");
            C31200Dnj c31200Dnj = c84823qW.A0A;
            anonymousClass182.A0d();
            String str8 = c31200Dnj.A00;
            if (str8 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
            }
            anonymousClass182.A0a();
        }
        if (c84823qW.A15 != null) {
            anonymousClass182.A0r("poll_sticker");
            AbstractC101354gs.A00(anonymousClass182, c84823qW.A15, true);
        }
        if (c84823qW.A0O != null) {
            anonymousClass182.A0r("question_sticker");
            ADF.A00(anonymousClass182, c84823qW.A0O, true);
        }
        if (c84823qW.A16 != null) {
            anonymousClass182.A0r("question_response_metadata");
            AEN.A00(anonymousClass182, c84823qW.A16);
        }
        if (c84823qW.A0Z != null) {
            anonymousClass182.A0r("prompt_sticker");
            AbstractC109294vv.A00(anonymousClass182, c84823qW.A0Z, true);
        }
        if (c84823qW.A0J != null) {
            anonymousClass182.A0r("karaoke_sticker");
            IOP.A00(anonymousClass182, c84823qW.A0J);
        }
        if (c84823qW.A0g != null) {
            anonymousClass182.A0r("clips_text_sticker");
            IPQ.A00(anonymousClass182, c84823qW.A0g);
        }
        if (c84823qW.A0X != null) {
            anonymousClass182.A0r("music_pick_sticker");
            IP8.A00(anonymousClass182, c84823qW.A0X);
        }
        if (c84823qW.A0d != null) {
            anonymousClass182.A0r("before_and_after_sticker");
            IPG.A00(anonymousClass182, c84823qW.A0d, true);
        }
        if (c84823qW.A0L != null) {
            anonymousClass182.A0r("photo_credit_sticker");
            H4U h4u = c84823qW.A0L;
            anonymousClass182.A0d();
            User user2 = h4u.A00;
            if (user2 != null) {
                anonymousClass182.A0r("producer");
                Parcelable.Creator creator2 = User.CREATOR;
                AbstractC38851rI.A08(anonymousClass182, user2);
            }
            anonymousClass182.A0a();
        }
        String str9 = c84823qW.A1f;
        if (str9 != null) {
            anonymousClass182.A0S("caption", str9);
        }
        if (c84823qW.A0Y != null) {
            anonymousClass182.A0r("notify_me_sticker");
            ADH.A00(anonymousClass182, c84823qW.A0Y, true);
        }
        if (c84823qW.A0Q != null) {
            anonymousClass182.A0r("achievement_sticker");
            AbstractC41283IOy.A00(anonymousClass182, c84823qW.A0Q, true);
        }
        if (c84823qW.A0V != null) {
            anonymousClass182.A0r("group_mention_sticker");
            ADG.A00(anonymousClass182, c84823qW.A0V);
        }
        if (c84823qW.A0y != null) {
            anonymousClass182.A0r("join_chat_sticker");
            AbstractC69978Vyv.A00(anonymousClass182, c84823qW.A0y, true);
        }
        if (c84823qW.A0a != null) {
            anonymousClass182.A0r("quiz_sticker");
            AbstractC69880Vx5.A00(anonymousClass182, c84823qW.A0a, true);
        }
        if (c84823qW.A0b != null) {
            anonymousClass182.A0r("slider_sticker");
            AbstractC69881Vx6.A00(anonymousClass182, c84823qW.A0b, true);
        }
        if (c84823qW.A0v != null) {
            anonymousClass182.A0r("music_asset_info");
            C4A1.A00(anonymousClass182, c84823qW.A0v, true);
        }
        if (c84823qW.A0w != null) {
            anonymousClass182.A0r("original_sound_info");
            C4A1.A00(anonymousClass182, c84823qW.A0w, true);
        }
        Boolean bool = c84823qW.A1J;
        if (bool != null) {
            anonymousClass182.A0T("should_render_soundwave", bool.booleanValue());
        }
        if (c84823qW.A0k != null) {
            anonymousClass182.A0r("election_sticker");
            H7X h7x = c84823qW.A0k;
            anonymousClass182.A0d();
            String str10 = h7x.A00;
            if (str10 != null) {
                anonymousClass182.A0S("find_location_text", str10);
            }
            String str11 = h7x.A01;
            if (str11 != null) {
                anonymousClass182.A0S("link", str11);
            }
            anonymousClass182.A0a();
        }
        if (c84823qW.A1D != null) {
            anonymousClass182.A0r("anti_bully_sticker");
            ITD.A00(anonymousClass182, c84823qW.A1D);
        }
        if (c84823qW.A1E != null) {
            anonymousClass182.A0r("anti_bully_global_sticker");
            ITD.A00(anonymousClass182, c84823qW.A1E);
        }
        if (c84823qW.A1H != null) {
            anonymousClass182.A0r("voter_registration_sticker");
            ITD.A00(anonymousClass182, c84823qW.A1H);
        }
        if (c84823qW.A1G != null) {
            anonymousClass182.A0r("bloks_tappable_sticker");
            ITD.A00(anonymousClass182, c84823qW.A1G);
        }
        if (c84823qW.A1F != null) {
            anonymousClass182.A0r("bloks_sticker");
            ITD.A00(anonymousClass182, c84823qW.A1F);
        }
        if (c84823qW.A1B != null) {
            anonymousClass182.A0r("upcoming_event");
            IT3.A00(anonymousClass182, c84823qW.A1B);
        }
        if (c84823qW.A0t != null) {
            anonymousClass182.A0r("upcoming_event_media");
            IRM.A00(anonymousClass182, c84823qW.A0t);
        }
        UpcomingEventStickerSource upcomingEventStickerSource = c84823qW.A0h;
        if (upcomingEventStickerSource != null) {
            anonymousClass182.A0S("upcoming_event_sticker_source", upcomingEventStickerSource.A00);
        }
        if (c84823qW.A0W != null) {
            anonymousClass182.A0r("story_link");
            AbstractC108134tw.A00(anonymousClass182, c84823qW.A0W, true);
        }
        if (c84823qW.A17 != null) {
            anonymousClass182.A0r("reaction_sticker");
            AbstractC106064qM.A00(anonymousClass182, c84823qW.A17);
        }
        if (c84823qW.A0D != null) {
            anonymousClass182.A0r("viewer_avatar_sticker");
            AbstractC102124ii.A00(anonymousClass182, c84823qW.A0D);
        }
        if (c84823qW.A0C != null) {
            anonymousClass182.A0r("author_avatar_sticker");
            AbstractC102124ii.A00(anonymousClass182, c84823qW.A0C);
        }
        String str12 = c84823qW.A1k;
        if (str12 != null) {
            anonymousClass182.A0S("surface", str12);
        }
        String str13 = c84823qW.A1o;
        if (str13 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str13);
        }
        if (c84823qW.A0U != null) {
            anonymousClass182.A0r("feature_linking_sticker");
            C38763H5d c38763H5d = c84823qW.A0U;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("tap_state", c38763H5d.A00);
            String str14 = c38763H5d.A01;
            if (str14 != null) {
                anonymousClass182.A0S("tap_state_str_id", str14);
            }
            anonymousClass182.A0a();
        }
        if (c84823qW.A0e != null) {
            anonymousClass182.A0r("subscription_sticker");
            ADI.A00(anonymousClass182, c84823qW.A0e);
        }
        if (c84823qW.A0c != null) {
            anonymousClass182.A0r("subscription_shoutout_mention_sticker");
            IPF.A00(anonymousClass182, c84823qW.A0c);
        }
        if (c84823qW.A0K != null) {
            anonymousClass182.A0r("vcr_sticker");
            AbstractC2042191r.A00(anonymousClass182, c84823qW.A0K, true);
        }
        String str15 = c84823qW.A1Y;
        if (str15 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str15);
        }
        String str16 = c84823qW.A1b;
        if (str16 != null) {
            anonymousClass182.A0S("media_id", str16);
        }
        String str17 = c84823qW.A1a;
        if (str17 != null) {
            anonymousClass182.A0S("media_compound_str", str17);
        }
        String str18 = c84823qW.A1P;
        if (str18 != null) {
            anonymousClass182.A0S("carousel_share_child_media_id", str18);
        }
        String str19 = c84823qW.A1c;
        if (str19 != null) {
            anonymousClass182.A0S("media_owner_id", str19);
        }
        ProductType productType = c84823qW.A0n;
        if (productType != null) {
            anonymousClass182.A0S("product_type", productType.A00);
        }
        EnumC40111tc enumC40111tc = c84823qW.A0m;
        if (enumC40111tc != null) {
            anonymousClass182.A0Q("media_type", enumC40111tc.A00);
        }
        ClipsCreationEntryPoint clipsCreationEntryPoint = c84823qW.A0E;
        if (clipsCreationEntryPoint != null) {
            anonymousClass182.A0S("clips_creation_entry_point", clipsCreationEntryPoint.A00);
        }
        anonymousClass182.A0Q("collection_ad_thumbnail_position", c84823qW.A05);
        String str20 = c84823qW.A1n;
        if (str20 != null) {
            anonymousClass182.A0S("upcoming_event_id", str20);
        }
        String str21 = c84823qW.A1d;
        if (str21 != null) {
            anonymousClass182.A0S("merchant_id", str21);
        }
        if (c84823qW.A1p != null) {
            C16V.A03(anonymousClass182, "product_ids");
            for (String str22 : c84823qW.A1p) {
                if (str22 != null) {
                    anonymousClass182.A0u(str22);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c84823qW.A13 != null) {
            anonymousClass182.A0r("server_sticker_burn_in_params");
            AEJ.A00(anonymousClass182, c84823qW.A13);
        }
        if (c84823qW.A0f != null) {
            anonymousClass182.A0r("text_post_sticker");
            IPP.A00(anonymousClass182, c84823qW.A0f, true);
        }
        if (c84823qW.A0i != null) {
            anonymousClass182.A0r("whatsapp_channel_sticker");
            ADJ.A00(anonymousClass182, c84823qW.A0i, true);
        }
        if (c84823qW.A0H != null) {
            anonymousClass182.A0r("story_explore_shareable_grid");
            IO1.A00(anonymousClass182, c84823qW.A0H);
        }
        if (c84823qW.A0G != null) {
            anonymousClass182.A0r("explore_shareable_grid_metadata");
            IO0.A00(anonymousClass182, c84823qW.A0G);
        }
        if (c84823qW.A0I != null) {
            anonymousClass182.A0r("ig_bio_sticker");
            C9Z9 c9z9 = c84823qW.A0I;
            anonymousClass182.A0d();
            C84463pp c84463pp = c9z9.A00;
            if (c84463pp != null) {
                anonymousClass182.A0r("bio_product");
                AbstractC84453po.A00(anonymousClass182, c84463pp);
            }
            anonymousClass182.A0a();
        }
        String str23 = c84823qW.A1O;
        if (str23 != null) {
            anonymousClass182.A0S("attribution", str23);
        }
        anonymousClass182.A0T("is_sticker", c84823qW.A1u);
        anonymousClass182.A0T("use_custom_title", c84823qW.A1v);
        String str24 = c84823qW.A1S;
        if (str24 != null) {
            anonymousClass182.A0S("custom_title", str24);
        }
        String str25 = c84823qW.A1h;
        if (str25 != null) {
            anonymousClass182.A0S("display_type", str25);
        }
        String str26 = c84823qW.A1X;
        if (str26 != null) {
            anonymousClass182.A0S("highlighted_media_ids", str26);
        }
        anonymousClass182.A0T("is_hidden", c84823qW.A1t);
        anonymousClass182.A0T("is_fb_sticker", c84823qW.A1s);
        anonymousClass182.A0Q("tap_state", c84823qW.A07);
        String str27 = c84823qW.A1l;
        if (str27 != null) {
            anonymousClass182.A0S("tap_state_str_id", str27);
        }
        String str28 = c84823qW.A1j;
        if (str28 != null) {
            anonymousClass182.A0S("str_id", str28);
        }
        String str29 = c84823qW.A1i;
        if (str29 != null) {
            anonymousClass182.A0S("sticker_type", str29);
        }
        EnumC75383a5 enumC75383a5 = c84823qW.A11;
        if (enumC75383a5 != null) {
            anonymousClass182.A0S("object_type", enumC75383a5.A00);
        }
        String str30 = c84823qW.A1Z;
        if (str30 != null) {
            anonymousClass182.A0S("image_id", str30);
        }
        if (c84823qW.A18 != null) {
            anonymousClass182.A0r("ring_glyph");
            AbstractC41346IRr.A00(anonymousClass182, c84823qW.A18, true);
        }
        if (c84823qW.A0N != null) {
            anonymousClass182.A0r("story_public_collection");
            AbstractC41269IOk.A00(anonymousClass182, c84823qW.A0N);
        }
        if (c84823qW.A0M != null) {
            anonymousClass182.A0r("public_collection_metadata");
            C38750H4q c38750H4q = c84823qW.A0M;
            anonymousClass182.A0d();
            String str31 = c38750H4q.A00;
            if (str31 != null) {
                anonymousClass182.A0S("collection_id", str31);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
