package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class OOS {
    public static ShareMediaLoggingInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ShareMediaLoggingInfo shareMediaLoggingInfo = new ShareMediaLoggingInfo();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("media_type".equals(A0s)) {
                        shareMediaLoggingInfo.A05 = c16l.A1D();
                    } else if ("camera_position".equals(A0s)) {
                        shareMediaLoggingInfo.A01 = c16l.A1D();
                    } else if ("capture_format".equals(A0s)) {
                        shareMediaLoggingInfo.A02 = c16l.A1D();
                    } else {
                        ArrayList arrayList = null;
                        ArrayList arrayList2 = null;
                        ArrayList arrayList3 = null;
                        ArrayList arrayList4 = null;
                        ArrayList arrayList5 = null;
                        HashMap hashMap = null;
                        ArrayList arrayList6 = null;
                        HashMap hashMap2 = null;
                        ArrayList arrayList7 = null;
                        ArrayList arrayList8 = null;
                        ArrayList arrayList9 = null;
                        ArrayList arrayList10 = null;
                        HashMap hashMap3 = null;
                        ArrayList arrayList11 = null;
                        ArrayList arrayList12 = null;
                        ArrayList arrayList13 = null;
                        if ("camera_tools".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList2 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList2);
                                }
                            }
                            C14360o3.A0B(arrayList2, 0);
                            shareMediaLoggingInfo.A0e = arrayList2;
                        } else if ("media_source".equals(A0s)) {
                            shareMediaLoggingInfo.A04 = c16l.A1D();
                        } else if ("color_effect_id".equals(A0s)) {
                            shareMediaLoggingInfo.A03 = c16l.A1D();
                        } else if ("effect_ids".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList3 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList3);
                                }
                            }
                            shareMediaLoggingInfo.A0g = arrayList3;
                        } else if ("effect_instance_ids".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList4 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList4);
                                }
                            }
                            shareMediaLoggingInfo.A0h = arrayList4;
                        } else if ("effect_attribution_id".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList5 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList5);
                                }
                            }
                            shareMediaLoggingInfo.A0f = arrayList5;
                        } else if ("effect_indexes".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap = AbstractC166987dD.A1G();
                                while (c16l.A1J() != c16r2) {
                                    AbstractC31179DnN.A1F(c16l, hashMap);
                                }
                            }
                            shareMediaLoggingInfo.A0a = hashMap;
                        } else if ("greenscreen_sources".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList6 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList6);
                                }
                            }
                            shareMediaLoggingInfo.A0j = arrayList6;
                        } else if ("original_media_folder".equals(A0s)) {
                            shareMediaLoggingInfo.A0V = AbstractC167017dG.A0m(c16l);
                        } else if ("music_sticker_extras".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap2 = AbstractC166987dD.A1G();
                                while (c16l.A1J() != c16r2) {
                                    AbstractC31179DnN.A1F(c16l, hashMap2);
                                }
                            }
                            shareMediaLoggingInfo.A0b = hashMap2;
                        } else if ("has_postcapture_doodle".equals(A0s)) {
                            shareMediaLoggingInfo.A0v = c16l.A0d();
                        } else if ("postcapture_caption_length".equals(A0s)) {
                            shareMediaLoggingInfo.A06 = c16l.A1D();
                        } else if ("precapture_effect_ids".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList7 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList7);
                                }
                            }
                            shareMediaLoggingInfo.A0l = arrayList7;
                        } else if ("post_capture_effect_instance_ids".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList8 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList8);
                                }
                            }
                            shareMediaLoggingInfo.A0m = arrayList8;
                        } else if ("postcapture_sticker_ids".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList9 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList9);
                                }
                            }
                            shareMediaLoggingInfo.A0n = arrayList9;
                        } else if ("postcapture_sticker_types".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList10 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList10);
                                }
                            }
                            shareMediaLoggingInfo.A0o = arrayList10;
                        } else if ("post_capture_sticker_ids_and_types".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap3 = AbstractC166987dD.A1G();
                                while (c16l.A1J() != c16r2) {
                                    AbstractC31179DnN.A1F(c16l, hashMap3);
                                }
                            }
                            C14360o3.A0B(hashMap3, 0);
                            shareMediaLoggingInfo.A0c = hashMap3;
                        } else if ("audio_or_effect_media_id".equals(A0s)) {
                            shareMediaLoggingInfo.A0L = AbstractC167017dG.A0m(c16l);
                        } else if ("audio_or_effect_media_ranking_token".equals(A0s)) {
                            shareMediaLoggingInfo.A0M = AbstractC167017dG.A0m(c16l);
                        } else if ("link_type".equals(A0s)) {
                            shareMediaLoggingInfo.A0S = AbstractC167017dG.A0m(c16l);
                        } else if ("link_content".equals(A0s)) {
                            shareMediaLoggingInfo.A0R = AbstractC167017dG.A0m(c16l);
                        } else if ("num_stop_motion_capture_frames".equals(A0s)) {
                            shareMediaLoggingInfo.A0G = AbstractC166997dE.A0h(c16l);
                        } else if ("variant_id".equals(A0s)) {
                            shareMediaLoggingInfo.A0Z = AbstractC167017dG.A0m(c16l);
                        } else if ("video_original_length_ms".equals(A0s)) {
                            shareMediaLoggingInfo.A0H = AbstractC166997dE.A0h(c16l);
                        } else if ("video_trimmed_length_ms".equals(A0s)) {
                            shareMediaLoggingInfo.A0I = AbstractC166997dE.A0h(c16l);
                        } else if ("create_mode_format".equals(A0s)) {
                            shareMediaLoggingInfo.A0N = AbstractC167017dG.A0m(c16l);
                        } else if ("is_clips_edited".equals(A0s)) {
                            shareMediaLoggingInfo.A0w = c16l.A0d();
                        } else if ("music_browse_category".equals(A0s)) {
                            shareMediaLoggingInfo.A0E = OPV.parseFromJson(c16l);
                        } else if ("is_from_story_drafts".equals(A0s)) {
                            shareMediaLoggingInfo.A0x = c16l.A0d();
                        } else if ("story_draft_save_time".equals(A0s)) {
                            shareMediaLoggingInfo.A09 = c16l.A0y();
                        } else if ("media_transformation".equals(A0s)) {
                            shareMediaLoggingInfo.A0C = AbstractC53892NsO.parseFromJson(c16l);
                        } else if ("is_gradient_background_visible".equals(A0s)) {
                            shareMediaLoggingInfo.A0z = c16l.A0d();
                        } else if ("custom_background_color".equals(A0s)) {
                            shareMediaLoggingInfo.A0F = AbstractC166997dE.A0h(c16l);
                        } else if ("is_gallery_layout".equals(A0s)) {
                            shareMediaLoggingInfo.A0y = c16l.A0d();
                        } else if ("gallery_suggestions_info".equals(A0s)) {
                            shareMediaLoggingInfo.A0D = LBV.parseFromJson(c16l);
                        } else if ("auto_created_source_ids".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList11 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList11);
                                }
                            }
                            shareMediaLoggingInfo.A0d = arrayList11;
                        } else if ("uses_detected_highlight".equals(A0s)) {
                            shareMediaLoggingInfo.A13 = c16l.A0d();
                        } else if ("last_crop_region".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList12 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    Long A0h = AbstractC31173DnH.A0h(c16l);
                                    if (A0h != null) {
                                        arrayList12.add(A0h);
                                    }
                                }
                            }
                            shareMediaLoggingInfo.A0k = arrayList12;
                        } else if ("smart_crop_region".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList13 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    Long A0h2 = AbstractC31173DnH.A0h(c16l);
                                    if (A0h2 != null) {
                                        arrayList13.add(A0h2);
                                    }
                                }
                            }
                            shareMediaLoggingInfo.A0p = arrayList13;
                        } else if ("template_browser_entrypoint".equals(A0s)) {
                            shareMediaLoggingInfo.A08 = c16l.A1D();
                        } else if ("acr_browser_entrypoint".equals(A0s)) {
                            shareMediaLoggingInfo.A00 = c16l.A1D();
                        } else if ("acr_type".equals(A0s)) {
                            shareMediaLoggingInfo.A0A = C9JF.A00(AbstractC167017dG.A0m(c16l));
                        } else if ("allow_translate_text_stickers".equals(A0s)) {
                            shareMediaLoggingInfo.A0q = c16l.A0d();
                        } else if ("creation_layout_footer_position".equals(A0s)) {
                            String A0m = AbstractC167017dG.A0m(c16l);
                            C14360o3.A0B(A0m, 0);
                            shareMediaLoggingInfo.A0O = A0m;
                        } else if ("reused_text_id".equals(A0s)) {
                            shareMediaLoggingInfo.A0Y = AbstractC167017dG.A0m(c16l);
                        } else if ("has_modified_reused_text".equals(A0s)) {
                            shareMediaLoggingInfo.A0r = c16l.A0d();
                        } else if ("has_modified_reused_text_position".equals(A0s)) {
                            shareMediaLoggingInfo.A0s = c16l.A0d();
                        } else if ("has_modified_reused_text_style".equals(A0s)) {
                            shareMediaLoggingInfo.A0t = c16l.A0d();
                        } else if ("has_modified_reused_text_timing".equals(A0s)) {
                            shareMediaLoggingInfo.A0u = c16l.A0d();
                        } else if ("newly_created_sticker".equals(A0s)) {
                            shareMediaLoggingInfo.A10 = c16l.A0d();
                        } else if ("ar_ad_client_token".equals(A0s)) {
                            shareMediaLoggingInfo.A0K = AbstractC167017dG.A0m(c16l);
                        } else if ("sticker_insert_surface".equals(A0s)) {
                            shareMediaLoggingInfo.A07 = c16l.A1D();
                        } else if ("is_roll_call_late".equals(A0s)) {
                            shareMediaLoggingInfo.A12 = c16l.A0d();
                        } else if ("prompt_sticker_type".equals(A0s)) {
                            shareMediaLoggingInfo.A0X = AbstractC167017dG.A0m(c16l);
                        } else if ("prompt_sticker_prompt".equals(A0s)) {
                            shareMediaLoggingInfo.A0W = AbstractC167017dG.A0m(c16l);
                        } else if ("prompt_sticker_id".equals(A0s)) {
                            shareMediaLoggingInfo.A0J = AbstractC31173DnH.A0h(c16l);
                        } else if ("media_upload_metadata".equals(A0s)) {
                            MediaUploadMetadata parseFromJson = AbstractC93554Hv.parseFromJson(c16l);
                            C14360o3.A0B(parseFromJson, 0);
                            shareMediaLoggingInfo.A0B = parseFromJson;
                        } else if ("magic_mod_tools".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    Long A0h3 = AbstractC31173DnH.A0h(c16l);
                                    if (A0h3 != null) {
                                        arrayList.add(A0h3);
                                    }
                                }
                            }
                            shareMediaLoggingInfo.A0i = arrayList;
                        } else if ("magic_mod_gen_ai_response_id".equals(A0s)) {
                            shareMediaLoggingInfo.A0U = AbstractC167017dG.A0m(c16l);
                        } else if ("magic_mod_gen_ai_content_id".equals(A0s)) {
                            shareMediaLoggingInfo.A0T = AbstractC167017dG.A0m(c16l);
                        } else if ("imagine_generation_type".equals(A0s)) {
                            shareMediaLoggingInfo.A0Q = AbstractC167017dG.A0m(c16l);
                        } else if ("ify_gen_ai_content_id".equals(A0s)) {
                            shareMediaLoggingInfo.A0P = AbstractC167017dG.A0m(c16l);
                        } else if ("is_preview_clip".equals(A0s)) {
                            shareMediaLoggingInfo.A11 = c16l.A0d();
                        }
                    }
                    c16l.A0z();
                } else {
                    return shareMediaLoggingInfo;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ShareMediaLoggingInfo shareMediaLoggingInfo) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("media_type", shareMediaLoggingInfo.A05);
        anonymousClass182.A0Q("camera_position", shareMediaLoggingInfo.A01);
        anonymousClass182.A0Q("capture_format", shareMediaLoggingInfo.A02);
        if (shareMediaLoggingInfo.A0e != null) {
            C16V.A03(anonymousClass182, "camera_tools");
            Iterator it = shareMediaLoggingInfo.A0e.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0Q("media_source", shareMediaLoggingInfo.A04);
        anonymousClass182.A0Q("color_effect_id", shareMediaLoggingInfo.A03);
        if (shareMediaLoggingInfo.A0g != null) {
            C16V.A03(anonymousClass182, "effect_ids");
            Iterator it2 = shareMediaLoggingInfo.A0g.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it2);
            }
            anonymousClass182.A0Z();
        }
        if (shareMediaLoggingInfo.A0h != null) {
            C16V.A03(anonymousClass182, "effect_instance_ids");
            Iterator it3 = shareMediaLoggingInfo.A0h.iterator();
            while (it3.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it3);
            }
            anonymousClass182.A0Z();
        }
        if (shareMediaLoggingInfo.A0f != null) {
            C16V.A03(anonymousClass182, "effect_attribution_id");
            Iterator it4 = shareMediaLoggingInfo.A0f.iterator();
            while (it4.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it4);
            }
            anonymousClass182.A0Z();
        }
        if (shareMediaLoggingInfo.A0a != null) {
            anonymousClass182.A0r("effect_indexes");
            anonymousClass182.A0d();
            Iterator A14 = AbstractC166997dE.A14(shareMediaLoggingInfo.A0a);
            while (A14.hasNext()) {
                AbstractC37303Gc4.A14(anonymousClass182, A14);
            }
            anonymousClass182.A0a();
        }
        if (shareMediaLoggingInfo.A0j != null) {
            C16V.A03(anonymousClass182, "greenscreen_sources");
            Iterator it5 = shareMediaLoggingInfo.A0j.iterator();
            while (it5.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it5);
            }
            anonymousClass182.A0Z();
        }
        String str = shareMediaLoggingInfo.A0V;
        if (str != null) {
            anonymousClass182.A0S("original_media_folder", str);
        }
        if (shareMediaLoggingInfo.A0b != null) {
            anonymousClass182.A0r("music_sticker_extras");
            anonymousClass182.A0d();
            Iterator A142 = AbstractC166997dE.A14(shareMediaLoggingInfo.A0b);
            while (A142.hasNext()) {
                AbstractC37303Gc4.A14(anonymousClass182, A142);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("has_postcapture_doodle", shareMediaLoggingInfo.A0v);
        anonymousClass182.A0Q("postcapture_caption_length", shareMediaLoggingInfo.A06);
        if (shareMediaLoggingInfo.A0l != null) {
            C16V.A03(anonymousClass182, "precapture_effect_ids");
            Iterator it6 = shareMediaLoggingInfo.A0l.iterator();
            while (it6.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it6);
            }
            anonymousClass182.A0Z();
        }
        if (shareMediaLoggingInfo.A0m != null) {
            C16V.A03(anonymousClass182, "post_capture_effect_instance_ids");
            Iterator it7 = shareMediaLoggingInfo.A0m.iterator();
            while (it7.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it7);
            }
            anonymousClass182.A0Z();
        }
        if (shareMediaLoggingInfo.A0n != null) {
            C16V.A03(anonymousClass182, "postcapture_sticker_ids");
            Iterator it8 = shareMediaLoggingInfo.A0n.iterator();
            while (it8.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it8);
            }
            anonymousClass182.A0Z();
        }
        if (shareMediaLoggingInfo.A0o != null) {
            C16V.A03(anonymousClass182, "postcapture_sticker_types");
            Iterator it9 = shareMediaLoggingInfo.A0o.iterator();
            while (it9.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it9);
            }
            anonymousClass182.A0Z();
        }
        if (shareMediaLoggingInfo.A0c != null) {
            anonymousClass182.A0r("post_capture_sticker_ids_and_types");
            anonymousClass182.A0d();
            Iterator A143 = AbstractC166997dE.A14(shareMediaLoggingInfo.A0c);
            while (A143.hasNext()) {
                AbstractC37303Gc4.A14(anonymousClass182, A143);
            }
            anonymousClass182.A0a();
        }
        String str2 = shareMediaLoggingInfo.A0L;
        if (str2 != null) {
            anonymousClass182.A0S("audio_or_effect_media_id", str2);
        }
        String str3 = shareMediaLoggingInfo.A0M;
        if (str3 != null) {
            anonymousClass182.A0S("audio_or_effect_media_ranking_token", str3);
        }
        String str4 = shareMediaLoggingInfo.A0S;
        if (str4 != null) {
            anonymousClass182.A0S("link_type", str4);
        }
        String str5 = shareMediaLoggingInfo.A0R;
        if (str5 != null) {
            anonymousClass182.A0S("link_content", str5);
        }
        Integer num = shareMediaLoggingInfo.A0G;
        if (num != null) {
            anonymousClass182.A0Q("num_stop_motion_capture_frames", num.intValue());
        }
        String str6 = shareMediaLoggingInfo.A0Z;
        if (str6 != null) {
            anonymousClass182.A0S("variant_id", str6);
        }
        Integer num2 = shareMediaLoggingInfo.A0H;
        if (num2 != null) {
            anonymousClass182.A0Q("video_original_length_ms", num2.intValue());
        }
        Integer num3 = shareMediaLoggingInfo.A0I;
        if (num3 != null) {
            anonymousClass182.A0Q("video_trimmed_length_ms", num3.intValue());
        }
        String str7 = shareMediaLoggingInfo.A0N;
        if (str7 != null) {
            anonymousClass182.A0S("create_mode_format", str7);
        }
        anonymousClass182.A0T("is_clips_edited", shareMediaLoggingInfo.A0w);
        if (shareMediaLoggingInfo.A0E != null) {
            anonymousClass182.A0r("music_browse_category");
            OPV.A00(anonymousClass182, shareMediaLoggingInfo.A0E);
        }
        anonymousClass182.A0T("is_from_story_drafts", shareMediaLoggingInfo.A0x);
        anonymousClass182.A0R("story_draft_save_time", shareMediaLoggingInfo.A09);
        if (shareMediaLoggingInfo.A0C != null) {
            anonymousClass182.A0r("media_transformation");
            MediaTransformation mediaTransformation = shareMediaLoggingInfo.A0C;
            anonymousClass182.A0d();
            anonymousClass182.A0P("translation_x", mediaTransformation.A01);
            anonymousClass182.A0P("translation_y", mediaTransformation.A02);
            anonymousClass182.A0P("zoom", mediaTransformation.A03);
            anonymousClass182.A0P("rotation", mediaTransformation.A00);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("is_gradient_background_visible", shareMediaLoggingInfo.A0z);
        Integer num4 = shareMediaLoggingInfo.A0F;
        if (num4 != null) {
            anonymousClass182.A0Q("custom_background_color", num4.intValue());
        }
        anonymousClass182.A0T("is_gallery_layout", shareMediaLoggingInfo.A0y);
        if (shareMediaLoggingInfo.A0D != null) {
            anonymousClass182.A0r("gallery_suggestions_info");
            LBV.A00(anonymousClass182, shareMediaLoggingInfo.A0D);
        }
        if (shareMediaLoggingInfo.A0d != null) {
            C16V.A03(anonymousClass182, "auto_created_source_ids");
            Iterator it10 = shareMediaLoggingInfo.A0d.iterator();
            while (it10.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it10);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("uses_detected_highlight", shareMediaLoggingInfo.A13);
        if (shareMediaLoggingInfo.A0k != null) {
            C16V.A03(anonymousClass182, "last_crop_region");
            Iterator it11 = shareMediaLoggingInfo.A0k.iterator();
            while (it11.hasNext()) {
                AbstractC50522MSa.A1L(anonymousClass182, it11);
            }
            anonymousClass182.A0Z();
        }
        if (shareMediaLoggingInfo.A0p != null) {
            C16V.A03(anonymousClass182, "smart_crop_region");
            Iterator it12 = shareMediaLoggingInfo.A0p.iterator();
            while (it12.hasNext()) {
                AbstractC50522MSa.A1L(anonymousClass182, it12);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0Q("template_browser_entrypoint", shareMediaLoggingInfo.A08);
        anonymousClass182.A0Q("acr_browser_entrypoint", shareMediaLoggingInfo.A00);
        ACRType aCRType = shareMediaLoggingInfo.A0A;
        if (aCRType != null) {
            anonymousClass182.A0S("acr_type", aCRType.A00);
        }
        anonymousClass182.A0T("allow_translate_text_stickers", shareMediaLoggingInfo.A0q);
        String str8 = shareMediaLoggingInfo.A0O;
        if (str8 != null) {
            anonymousClass182.A0S("creation_layout_footer_position", str8);
        }
        String str9 = shareMediaLoggingInfo.A0Y;
        if (str9 != null) {
            anonymousClass182.A0S("reused_text_id", str9);
        }
        anonymousClass182.A0T("has_modified_reused_text", shareMediaLoggingInfo.A0r);
        anonymousClass182.A0T("has_modified_reused_text_position", shareMediaLoggingInfo.A0s);
        anonymousClass182.A0T("has_modified_reused_text_style", shareMediaLoggingInfo.A0t);
        anonymousClass182.A0T("has_modified_reused_text_timing", shareMediaLoggingInfo.A0u);
        anonymousClass182.A0T("newly_created_sticker", shareMediaLoggingInfo.A10);
        String str10 = shareMediaLoggingInfo.A0K;
        if (str10 != null) {
            anonymousClass182.A0S("ar_ad_client_token", str10);
        }
        anonymousClass182.A0Q("sticker_insert_surface", shareMediaLoggingInfo.A07);
        anonymousClass182.A0T("is_roll_call_late", shareMediaLoggingInfo.A12);
        String str11 = shareMediaLoggingInfo.A0X;
        if (str11 != null) {
            anonymousClass182.A0S("prompt_sticker_type", str11);
        }
        String str12 = shareMediaLoggingInfo.A0W;
        if (str12 != null) {
            anonymousClass182.A0S("prompt_sticker_prompt", str12);
        }
        Long l = shareMediaLoggingInfo.A0J;
        if (l != null) {
            anonymousClass182.A0R("prompt_sticker_id", l.longValue());
        }
        if (shareMediaLoggingInfo.A0B != null) {
            anonymousClass182.A0r("media_upload_metadata");
            AbstractC93554Hv.A00(anonymousClass182, shareMediaLoggingInfo.A0B);
        }
        if (shareMediaLoggingInfo.A0i != null) {
            C16V.A03(anonymousClass182, "magic_mod_tools");
            Iterator it13 = shareMediaLoggingInfo.A0i.iterator();
            while (it13.hasNext()) {
                AbstractC50522MSa.A1L(anonymousClass182, it13);
            }
            anonymousClass182.A0Z();
        }
        String str13 = shareMediaLoggingInfo.A0U;
        if (str13 != null) {
            anonymousClass182.A0S("magic_mod_gen_ai_response_id", str13);
        }
        String str14 = shareMediaLoggingInfo.A0T;
        if (str14 != null) {
            anonymousClass182.A0S("magic_mod_gen_ai_content_id", str14);
        }
        String str15 = shareMediaLoggingInfo.A0Q;
        if (str15 != null) {
            anonymousClass182.A0S("imagine_generation_type", str15);
        }
        String str16 = shareMediaLoggingInfo.A0P;
        if (str16 != null) {
            anonymousClass182.A0S("ify_gen_ai_content_id", str16);
        }
        anonymousClass182.A0T("is_preview_clip", shareMediaLoggingInfo.A11);
        anonymousClass182.A0a();
    }
}
