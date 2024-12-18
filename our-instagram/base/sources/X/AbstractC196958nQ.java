package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.8nQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196958nQ {
    public static C183978Ee parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            C18160v1 c18160v1 = null;
            Integer num = null;
            Integer num2 = null;
            String str3 = null;
            Integer num3 = null;
            Integer num4 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Long l = null;
            Long l2 = null;
            Integer num5 = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            String str4 = null;
            CameraAREffect cameraAREffect = null;
            String str5 = null;
            String str6 = null;
            C184758Hq c184758Hq = null;
            Integer num9 = null;
            String str7 = null;
            String str8 = null;
            Boolean bool7 = null;
            Medium medium = null;
            C18160v1 c18160v12 = null;
            Integer num10 = null;
            Boolean bool8 = null;
            String str9 = null;
            Integer num11 = null;
            MusicOverlayStickerModel musicOverlayStickerModel = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str10 = null;
            Long l3 = null;
            Integer num12 = null;
            Float f = null;
            Integer num13 = null;
            Float f2 = null;
            Integer num14 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Integer num15 = null;
            Integer num16 = null;
            MediaUploadMetadata mediaUploadMetadata = null;
            String str11 = null;
            Boolean bool14 = null;
            String str12 = null;
            C183978Ee c183978Ee = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            C183978Ee c183978Ee2 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            Boolean bool15 = null;
            HashSet hashSet = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("file_path".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_place_holder".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("should_background_cover_media".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("original_background_gradient".equals(A0q)) {
                    c18160v1 = AbstractC14610oZ.parseFromJson(c16l);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("original_media_path".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("color_transfer".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("rotation".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("mirrored".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("imported".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_rollcall_v2".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_music_first_story".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("date_added".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("date_taken".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("story_gated_feature".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        hashSet = new HashSet();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                hashSet.add(A1P3);
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                } else if ("crop_rect_left".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("crop_rect_top".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("crop_rect_right".equals(A0q)) {
                    num7 = Integer.valueOf(c16l.A1D());
                } else if ("crop_rect_bottom".equals(A0q)) {
                    num8 = Integer.valueOf(c16l.A1D());
                } else if ("ar_effect_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("ar_effect".equals(A0q)) {
                    cameraAREffect = AbstractC120315cU.parseFromJson(c16l);
                } else if ("capture_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("effect_persisted_metadata".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("product_info".equals(A0q)) {
                    c184758Hq = AEB.parseFromJson(c16l);
                } else if ("source_type".equals(A0q)) {
                    num9 = Integer.valueOf(c16l.A1D());
                } else if ("reshare_source".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("archived_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("is_captured_in_video_chat".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("medium".equals(A0q)) {
                    medium = C8IR.parseFromJson(c16l);
                } else if ("text_mode_gradient_colors".equals(A0q)) {
                    c18160v12 = AbstractC14610oZ.parseFromJson(c16l);
                } else if ("dominant_color".equals(A0q)) {
                    num10 = Integer.valueOf(c16l.A1D());
                } else if ("is_capture_screenshot".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("camera_position".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("camera_id".equals(A0q)) {
                    num11 = Integer.valueOf(c16l.A1D());
                } else if ("music_overlay_sticker_model".equals(A0q)) {
                    musicOverlayStickerModel = C4A1.parseFromJson(c16l);
                } else if ("is_saved_instagram_story".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("is_captured_draft".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("from_story_drafts".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("sub_media_source".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList.add(A1P2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("ar_effect_list".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList2.add(A1P);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("format_variant".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("exposure_time".equals(A0q)) {
                    l3 = Long.valueOf(c16l.A0y());
                } else if ("iso_sensitivity".equals(A0q)) {
                    num12 = Integer.valueOf(c16l.A1D());
                } else if ("aperture".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("awb_mode".equals(A0q)) {
                    num13 = Integer.valueOf(c16l.A1D());
                } else if ("focal_length".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if ("flash_mode".equals(A0q)) {
                    num14 = Integer.valueOf(c16l.A1D());
                } else if ("flash_on".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                } else if ("did_flash_fire".equals(A0q)) {
                    bool13 = Boolean.valueOf(c16l.A0d());
                } else if ("zoom_level".equals(A0q)) {
                    num15 = Integer.valueOf(c16l.A1D());
                } else if ("scene_mode".equals(A0q)) {
                    num16 = Integer.valueOf(c16l.A1D());
                } else if ("media_upload_metadata".equals(A0q)) {
                    mediaUploadMetadata = AbstractC93554Hv.parseFromJson(c16l);
                } else if ("attribution_content_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("is_upload_resize_step_enabled".equals(A0q)) {
                    bool14 = Boolean.valueOf(c16l.A0d());
                } else if ("maker_note".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("concurrent_photo".equals(A0q)) {
                    c183978Ee = parseFromJson(c16l);
                } else if ("last_crop_rect".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf = Long.valueOf(c16l.A0y());
                            if (valueOf != null) {
                                arrayList3.add(valueOf);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("smart_crop_rect".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf2 = Long.valueOf(c16l.A0y());
                            if (valueOf2 != null) {
                                arrayList4.add(valueOf2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("magic_mod_tool_data".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            OTK parseFromJson = AbstractC54873OOl.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList5.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("magic_mod_original_photo".equals(A0q)) {
                    c183978Ee2 = parseFromJson(c16l);
                } else if ("magic_mod_gen_ai_request_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("magic_mod_gen_ai_response_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("magic_mod_gen_ai_content_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if ("prompt_summary_gen_ai_request_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str16 = null;
                    } else {
                        str16 = c16l.A1P();
                    }
                } else if ("prompt_summary_gen_ai_response_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str17 = null;
                    } else {
                        str17 = c16l.A1P();
                    }
                } else if ("imagine_creation_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str18 = null;
                    } else {
                        str18 = c16l.A1P();
                    }
                } else if ("is_hd".equals(A0q)) {
                    bool15 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            C183978Ee c183978Ee3 = new C183978Ee();
            if (str != null) {
                c183978Ee3.A0h = str;
            }
            if (str2 != null) {
                c183978Ee3.A0D(str2);
            }
            if (bool != null) {
                c183978Ee3.A16 = bool.booleanValue();
            }
            if (bool2 != null) {
                c183978Ee3.A1A = bool2.booleanValue();
            }
            if (c18160v1 != null) {
                c183978Ee3.A0H = c18160v1;
            }
            if (num != null) {
                c183978Ee3.A09 = num.intValue();
            }
            if (num2 != null) {
                c183978Ee3.A06 = num2.intValue();
            }
            if (str3 != null) {
                c183978Ee3.A0k = str3;
            }
            if (num3 != null) {
                c183978Ee3.A01 = num3.intValue();
            }
            if (num4 != null) {
                c183978Ee3.A07 = num4.intValue();
            }
            if (bool3 != null) {
                c183978Ee3.A14 = bool3.booleanValue();
            }
            if (bool4 != null) {
                c183978Ee3.A13 = bool4.booleanValue();
            }
            if (bool5 != null) {
                c183978Ee3.A17 = bool5.booleanValue();
            }
            if (bool6 != null) {
                c183978Ee3.A15 = bool6.booleanValue();
            }
            if (l != null) {
                c183978Ee3.A0A = l.longValue();
            }
            if (l2 != null) {
                c183978Ee3.A0B = l2.longValue();
            }
            if (hashSet != null) {
                c183978Ee3.A0t = hashSet;
            }
            if (num5 != null) {
                c183978Ee3.A03 = num5.intValue();
            }
            if (num6 != null) {
                c183978Ee3.A05 = num6.intValue();
            }
            if (num7 != null) {
                c183978Ee3.A04 = num7.intValue();
            }
            if (num8 != null) {
                c183978Ee3.A02 = num8.intValue();
            }
            if (str4 != null) {
                c183978Ee3.A0X = str4;
            }
            if (cameraAREffect != null) {
                c183978Ee3.A0E = cameraAREffect;
            }
            if (str5 != null) {
                c183978Ee3.A0b = str5;
            }
            if (str6 != null) {
                c183978Ee3.A0c = str6;
            }
            if (c184758Hq != null) {
                c183978Ee3.A0K = c184758Hq;
            }
            if (num9 != null) {
                c183978Ee3.A08 = num9.intValue();
            }
            if (str7 != null) {
                c183978Ee3.A0n = str7;
            }
            if (str8 != null) {
                c183978Ee3.A0Y = str8;
            }
            if (bool7 != null) {
                c183978Ee3.A0w = bool7.booleanValue();
            }
            if (medium != null) {
                c183978Ee3.A0F = medium;
            }
            if (c18160v12 != null) {
                c183978Ee3.A0I = c18160v12;
            }
            if (num10 != null) {
                c183978Ee3.A0R = num10;
            }
            if (bool8 != null) {
                c183978Ee3.A0v = bool8.booleanValue();
            }
            if (str9 != null) {
                c183978Ee3.A0a = str9;
            }
            if (num11 != null) {
                c183978Ee3.A00 = num11.intValue();
            }
            if (musicOverlayStickerModel != null) {
                c183978Ee3.A0J = musicOverlayStickerModel;
            }
            if (bool9 != null) {
                c183978Ee3.A18 = bool9.booleanValue();
            }
            if (bool10 != null) {
                c183978Ee3.A0x = bool10.booleanValue();
            }
            if (bool11 != null) {
                c183978Ee3.A11 = bool11.booleanValue();
            }
            if (arrayList != null) {
                c183978Ee3.A0s = arrayList;
            }
            if (arrayList2 != null) {
                c183978Ee3.A0o = arrayList2;
            }
            if (str10 != null) {
                c183978Ee3.A0d = str10;
            }
            if (l3 != null) {
                c183978Ee3.A0W = l3;
            }
            if (num12 != null) {
                c183978Ee3.A0T = num12;
            }
            if (f != null) {
                c183978Ee3.A0O = f;
            }
            if (num13 != null) {
                c183978Ee3.A0Q = num13;
            }
            if (f2 != null) {
                c183978Ee3.A0P = f2;
            }
            if (num14 != null) {
                c183978Ee3.A0S = num14;
            }
            if (bool12 != null) {
                c183978Ee3.A10 = bool12.booleanValue();
            }
            if (bool13 != null) {
                c183978Ee3.A0N = bool13;
            }
            if (num15 != null) {
                c183978Ee3.A0V = num15;
            }
            if (num16 != null) {
                c183978Ee3.A0U = num16;
            }
            if (mediaUploadMetadata != null) {
                c183978Ee3.A0G = mediaUploadMetadata;
            }
            if (str11 != null) {
                c183978Ee3.A0Z = str11;
            }
            if (bool14 != null) {
                c183978Ee3.A19 = bool14.booleanValue();
            }
            if (str12 != null) {
                c183978Ee3.A0j = str12;
            }
            if (c183978Ee != null) {
                c183978Ee3.A0L = c183978Ee;
            }
            if (arrayList3 != null) {
                c183978Ee3.A0q = arrayList3;
            }
            if (arrayList4 != null) {
                c183978Ee3.A0r = arrayList4;
            }
            if (arrayList5 != null) {
                c183978Ee3.A0p = arrayList5;
            }
            if (c183978Ee2 != null) {
                c183978Ee3.A0M = c183978Ee2;
            }
            if (str13 != null) {
                c183978Ee3.A0f = str13;
            }
            if (str14 != null) {
                c183978Ee3.A0g = str14;
            }
            if (str15 != null) {
                c183978Ee3.A0e = str15;
            }
            if (str16 != null) {
                c183978Ee3.A0l = str16;
            }
            if (str17 != null) {
                c183978Ee3.A0m = str17;
            }
            if (str18 != null) {
                c183978Ee3.A0i = str18;
            }
            if (bool15 != null) {
                c183978Ee3.A12 = bool15.booleanValue();
            }
            return c183978Ee3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C183978Ee c183978Ee) {
        Medium medium;
        anonymousClass182.A0d();
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c183978Ee.A0h);
        if (c183978Ee.A06() != null) {
            anonymousClass182.A0S("file_path", c183978Ee.A06());
        }
        anonymousClass182.A0T("is_place_holder", c183978Ee.A16);
        anonymousClass182.A0T("should_background_cover_media", c183978Ee.A1A);
        if (c183978Ee.A0H != null) {
            anonymousClass182.A0r("original_background_gradient");
            AbstractC14610oZ.A00(anonymousClass182, c183978Ee.A0H);
        }
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c183978Ee.A09);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c183978Ee.A06);
        if (c183978Ee.A07() != null) {
            anonymousClass182.A0S("original_media_path", c183978Ee.A07());
        }
        anonymousClass182.A0Q("color_transfer", c183978Ee.A01);
        anonymousClass182.A0Q("rotation", c183978Ee.A07);
        anonymousClass182.A0T("mirrored", c183978Ee.A14);
        anonymousClass182.A0T("imported", c183978Ee.A13);
        anonymousClass182.A0T("is_rollcall_v2", c183978Ee.A17);
        anonymousClass182.A0T("is_music_first_story", c183978Ee.A15);
        anonymousClass182.A0R("date_added", c183978Ee.A0A);
        long j = c183978Ee.A0B;
        if (j <= 0) {
            j = c183978Ee.A0A;
        }
        anonymousClass182.A0R("date_taken", j);
        C16V.A03(anonymousClass182, "story_gated_feature");
        for (String str : c183978Ee.A0t) {
            if (str != null) {
                anonymousClass182.A0u(str);
            }
        }
        anonymousClass182.A0Z();
        anonymousClass182.A0Q("crop_rect_left", c183978Ee.A03);
        anonymousClass182.A0Q("crop_rect_top", c183978Ee.A05);
        anonymousClass182.A0Q("crop_rect_right", c183978Ee.A04);
        anonymousClass182.A0Q("crop_rect_bottom", c183978Ee.A02);
        String A05 = c183978Ee.A05();
        if (A05 != null) {
            anonymousClass182.A0S("ar_effect_id", A05);
        }
        if (c183978Ee.A0E != null) {
            anonymousClass182.A0r("ar_effect");
            AbstractC120315cU.A00(anonymousClass182, c183978Ee.A0E);
        }
        String str2 = c183978Ee.A0b;
        if (str2 != null) {
            anonymousClass182.A0S("capture_type", str2);
        }
        String str3 = c183978Ee.A0c;
        if (str3 != null) {
            anonymousClass182.A0S("effect_persisted_metadata", str3);
        }
        if (c183978Ee.A0K != null) {
            anonymousClass182.A0r("product_info");
            AEB.A00(anonymousClass182, c183978Ee.A0K);
        }
        anonymousClass182.A0Q("source_type", c183978Ee.A08);
        String str4 = c183978Ee.A0n;
        if (str4 != null) {
            anonymousClass182.A0S("reshare_source", str4);
        }
        String str5 = c183978Ee.A0Y;
        if (str5 != null) {
            anonymousClass182.A0S("archived_media_id", str5);
        }
        anonymousClass182.A0T("is_captured_in_video_chat", c183978Ee.A0w);
        if (c183978Ee.A0F != null) {
            anonymousClass182.A0r("medium");
            C8IR.A00(anonymousClass182, c183978Ee.A0F);
        }
        if (c183978Ee.A0I != null) {
            anonymousClass182.A0r("text_mode_gradient_colors");
            AbstractC14610oZ.A00(anonymousClass182, c183978Ee.A0I);
        }
        Integer num = c183978Ee.A0R;
        if (num != null) {
            anonymousClass182.A0Q("dominant_color", num.intValue());
        }
        anonymousClass182.A0T("is_capture_screenshot", c183978Ee.A0v);
        String str6 = c183978Ee.A0a;
        if (str6 != null) {
            anonymousClass182.A0S("camera_position", str6);
        }
        anonymousClass182.A0Q("camera_id", c183978Ee.A00);
        if (c183978Ee.A0J != null) {
            anonymousClass182.A0r("music_overlay_sticker_model");
            C4A1.A00(anonymousClass182, c183978Ee.A0J, true);
        }
        anonymousClass182.A0T("is_saved_instagram_story", c183978Ee.A18);
        anonymousClass182.A0T("is_captured_draft", c183978Ee.A0x);
        anonymousClass182.A0T("from_story_drafts", c183978Ee.A11);
        if (c183978Ee.A0s != null) {
            C16V.A03(anonymousClass182, "sub_media_source");
            for (String str7 : c183978Ee.A0s) {
                if (str7 != null) {
                    anonymousClass182.A0u(str7);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c183978Ee.A0o != null) {
            C16V.A03(anonymousClass182, "ar_effect_list");
            for (String str8 : c183978Ee.A0o) {
                if (str8 != null) {
                    anonymousClass182.A0u(str8);
                }
            }
            anonymousClass182.A0Z();
        }
        String str9 = c183978Ee.A0d;
        if (str9 != null) {
            anonymousClass182.A0S("format_variant", str9);
        }
        Long l = c183978Ee.A0W;
        if (l != null) {
            anonymousClass182.A0R("exposure_time", l.longValue());
        }
        Integer num2 = c183978Ee.A0T;
        if (num2 != null) {
            anonymousClass182.A0Q("iso_sensitivity", num2.intValue());
        }
        Float f = c183978Ee.A0O;
        if (f != null) {
            anonymousClass182.A0P("aperture", f.floatValue());
        }
        Integer num3 = c183978Ee.A0Q;
        if (num3 != null) {
            anonymousClass182.A0Q("awb_mode", num3.intValue());
        }
        Float f2 = c183978Ee.A0P;
        if (f2 != null) {
            anonymousClass182.A0P("focal_length", f2.floatValue());
        }
        Integer num4 = c183978Ee.A0S;
        if (num4 != null) {
            anonymousClass182.A0Q("flash_mode", num4.intValue());
        }
        anonymousClass182.A0T("flash_on", c183978Ee.A10);
        Boolean bool = c183978Ee.A0N;
        if (bool != null) {
            anonymousClass182.A0T("did_flash_fire", bool.booleanValue());
        }
        Integer num5 = c183978Ee.A0V;
        if (num5 != null) {
            anonymousClass182.A0Q("zoom_level", num5.intValue());
        }
        Integer num6 = c183978Ee.A0U;
        if (num6 != null) {
            anonymousClass182.A0Q("scene_mode", num6.intValue());
        }
        c183978Ee.A01();
        anonymousClass182.A0r("media_upload_metadata");
        AbstractC93554Hv.A00(anonymousClass182, c183978Ee.A01());
        String str10 = c183978Ee.A0Z;
        if (str10 != null || ((medium = c183978Ee.A0F) != null && (str10 = medium.A0N) != null)) {
            anonymousClass182.A0S("attribution_content_url", str10);
        }
        anonymousClass182.A0T("is_upload_resize_step_enabled", c183978Ee.A19);
        anonymousClass182.A0S("maker_note", c183978Ee.A0j);
        if (c183978Ee.A0L != null) {
            anonymousClass182.A0r("concurrent_photo");
            A00(anonymousClass182, c183978Ee.A0L);
        }
        if (c183978Ee.A0q != null) {
            C16V.A03(anonymousClass182, "last_crop_rect");
            for (Number number : c183978Ee.A0q) {
                if (number != null) {
                    anonymousClass182.A0i(number.longValue());
                }
            }
            anonymousClass182.A0Z();
        }
        if (c183978Ee.A0r != null) {
            C16V.A03(anonymousClass182, "smart_crop_rect");
            for (Number number2 : c183978Ee.A0r) {
                if (number2 != null) {
                    anonymousClass182.A0i(number2.longValue());
                }
            }
            anonymousClass182.A0Z();
        }
        if (c183978Ee.A0p != null) {
            C16V.A03(anonymousClass182, "magic_mod_tool_data");
            for (OTK otk : c183978Ee.A0p) {
                if (otk != null) {
                    AbstractC54873OOl.A00(anonymousClass182, otk);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c183978Ee.A0M != null) {
            anonymousClass182.A0r("magic_mod_original_photo");
            A00(anonymousClass182, c183978Ee.A0M);
        }
        String str11 = c183978Ee.A0f;
        if (str11 != null) {
            anonymousClass182.A0S("magic_mod_gen_ai_request_id", str11);
        }
        String str12 = c183978Ee.A0g;
        if (str12 != null) {
            anonymousClass182.A0S("magic_mod_gen_ai_response_id", str12);
        }
        String str13 = c183978Ee.A0e;
        if (str13 != null) {
            anonymousClass182.A0S("magic_mod_gen_ai_content_id", str13);
        }
        String str14 = c183978Ee.A0l;
        if (str14 != null) {
            anonymousClass182.A0S("prompt_summary_gen_ai_request_id", str14);
        }
        String str15 = c183978Ee.A0m;
        if (str15 != null) {
            anonymousClass182.A0S("prompt_summary_gen_ai_response_id", str15);
        }
        String str16 = c183978Ee.A0i;
        if (str16 != null) {
            anonymousClass182.A0S("imagine_creation_type", str16);
        }
        anonymousClass182.A0T("is_hd", c183978Ee.A12);
        anonymousClass182.A0a();
    }
}
