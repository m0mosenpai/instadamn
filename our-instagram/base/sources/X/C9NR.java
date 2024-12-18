package X;

import android.os.Parcelable;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;

/* renamed from: X.9NR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9NR {
    public static C195868lW parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            C195868lW c195868lW = new C195868lW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    c195868lW.A0K = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    c195868lW.A08 = c16l.A1D();
                } else if ("original_width".equals(A0q)) {
                    c195868lW.A0B = c16l.A1D();
                } else if ("original_height".equals(A0q)) {
                    c195868lW.A0A = c16l.A1D();
                } else if ("crop_rect_left".equals(A0q)) {
                    c195868lW.A03 = c16l.A1D();
                } else if ("crop_rect_top".equals(A0q)) {
                    c195868lW.A05 = c16l.A1D();
                } else if ("crop_rect_right".equals(A0q)) {
                    c195868lW.A04 = c16l.A1D();
                } else if ("crop_rect_bottom".equals(A0q)) {
                    c195868lW.A02 = c16l.A1D();
                } else if ("orientation".equals(A0q)) {
                    c195868lW.A09 = c16l.A1D();
                } else if ("full_video_duration_ms".equals(A0q)) {
                    c195868lW.A07 = c16l.A1D();
                } else if ("start_time_ms".equals(A0q)) {
                    c195868lW.A0H = c16l.A1D();
                } else if ("start_seek_time_ms".equals(A0q)) {
                    c195868lW.A0G = c16l.A1D();
                } else if ("end_time_ms".equals(A0q)) {
                    c195868lW.A06 = c16l.A1D();
                } else {
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    HashSet hashSet = null;
                    ArrayList arrayList = null;
                    HashSet hashSet2 = null;
                    HashSet hashSet3 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    ArrayList arrayList2 = null;
                    ArrayList arrayList3 = null;
                    String str12 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    String str13 = null;
                    ArrayList arrayList6 = null;
                    String str14 = null;
                    String str15 = null;
                    String str16 = null;
                    ArrayList arrayList7 = null;
                    if ("segment_group_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c195868lW.A0p = str2;
                    } else if ("segment_index".equals(A0q)) {
                        c195868lW.A0D = c16l.A1D();
                    } else if ("segment_count".equals(A0q)) {
                        c195868lW.A0C = c16l.A1D();
                    } else if ("camera_position".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        c195868lW.A0f = str3;
                    } else if ("mirrored".equals(A0q)) {
                        c195868lW.A1J = c16l.A0d();
                    } else if ("file_path".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        C14360o3.A0B(str4, 0);
                        c195868lW.A0k = str4;
                    } else if ("cover_file_path".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        c195868lW.A0h = str5;
                    } else if ("imported".equals(A0q)) {
                        c195868lW.A18 = c16l.A0d();
                    } else if ("date_added".equals(A0q)) {
                        c195868lW.A0L = c16l.A0y();
                    } else if ("date_taken".equals(A0q)) {
                        c195868lW.A0M = c16l.A0y();
                    } else if ("is_boomerang".equals(A0q)) {
                        c195868lW.A1I = c16l.A0d();
                    } else if ("is_rollcall_v2".equals(A0q)) {
                        c195868lW.A1E = c16l.A0d();
                    } else if ("should_background_cover_media".equals(A0q)) {
                        c195868lW.A1K = c16l.A0d();
                    } else if ("original_background_gradient".equals(A0q)) {
                        c195868lW.A0T = AbstractC14610oZ.parseFromJson(c16l);
                    } else if ("camera_id".equals(A0q)) {
                        c195868lW.A01 = c16l.A1D();
                    } else if ("ar_effect_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str6 = c16l.A1P();
                        }
                        c195868lW.A0m = str6;
                    } else if ("ar_effect".equals(A0q)) {
                        c195868lW.A0P = AbstractC120315cU.parseFromJson(c16l);
                    } else if ("effect_persisted_metadata".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str7 = c16l.A1P();
                        }
                        c195868lW.A0j = str7;
                    } else if ("capture_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str8 = c16l.A1P();
                        }
                        c195868lW.A0g = str8;
                    } else if ("camera_tools".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                    hashSet.add(A1P3);
                                }
                            }
                        }
                        c195868lW.A11 = hashSet;
                    } else if ("camera_tool_infos".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5JB parseFromJson = C5JA.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c195868lW.A0y = arrayList;
                    } else if ("auto_created_source_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet2 = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                    hashSet2.add(A1P2);
                                }
                            }
                        }
                        c195868lW.A10 = hashSet2;
                    } else if ("product_info".equals(A0q)) {
                        c195868lW.A0W = AEB.parseFromJson(c16l);
                    } else if ("story_gated_feature".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet3 = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    hashSet3.add(A1P);
                                }
                            }
                        }
                        C14360o3.A0B(hashSet3, 0);
                        c195868lW.A12 = hashSet3;
                    } else if ("source_type".equals(A0q)) {
                        c195868lW.A0F = c16l.A1D();
                    } else if ("reshare_source".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str9 = c16l.A1P();
                        }
                        c195868lW.A0o = str9;
                    } else if ("archived_media_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str10 = c16l.A1P();
                        }
                        c195868lW.A0d = str10;
                    } else if ("format_variant".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str11 = c16l.A1P();
                        }
                        c195868lW.A0l = str11;
                    } else if ("medium".equals(A0q)) {
                        c195868lW.A0R = C8IR.parseFromJson(c16l);
                    } else if ("music_overlay_sticker_model".equals(A0q)) {
                        c195868lW.A0V = C4A1.parseFromJson(c16l);
                    } else if ("clips_segments_metadata".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5JD parseFromJson2 = C5JC.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList2.add(parseFromJson2);
                                }
                            }
                        }
                        c195868lW.A0v = arrayList2;
                    } else if ("external_media_segment_info".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C51743MtS parseFromJson3 = AbstractC23030ADm.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList3.add(parseFromJson3);
                                }
                            }
                        }
                        c195868lW.A0w = arrayList3;
                    } else if ("is_created_with_sound_sync".equals(A0q)) {
                        c195868lW.A16 = c16l.A0d();
                    } else if ("template_clips_media_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str12 = c16l.A1P();
                        }
                        c195868lW.A0s = str12;
                    } else if ("is_boomerang_v2".equals(A0q)) {
                        c195868lW.A13 = c16l.A0d();
                    } else if ("is_post_capture_variant".equals(A0q)) {
                        c195868lW.A1A = c16l.A0d();
                    } else if ("is_clips_remix".equals(A0q)) {
                        c195868lW.A15 = c16l.A0d();
                    } else if ("num_times_post_capture_trim".equals(A0q)) {
                        c195868lW.A0c = Integer.valueOf(c16l.A1D());
                    } else if ("clips_camera_ar_effects".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList4 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                CameraAREffect parseFromJson4 = AbstractC120315cU.parseFromJson(c16l);
                                if (parseFromJson4 != null) {
                                    arrayList4.add(parseFromJson4);
                                }
                            }
                        }
                        c195868lW.A0u = arrayList4;
                    } else if ("color_range".equals(A0q)) {
                        c195868lW.A0Z = Integer.valueOf(c16l.A1D());
                    } else if ("color_standard".equals(A0q)) {
                        c195868lW.A0a = Integer.valueOf(c16l.A1D());
                    } else if ("color_transfer".equals(A0q)) {
                        c195868lW.A0b = Integer.valueOf(c16l.A1D());
                    } else if ("concurrent_video".equals(A0q)) {
                        c195868lW.A0X = parseFromJson(c16l);
                    } else if ("magic_mod_tool_data".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList5 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                OTK parseFromJson5 = AbstractC54873OOl.parseFromJson(c16l);
                                if (parseFromJson5 != null) {
                                    arrayList5.add(parseFromJson5);
                                }
                            }
                        }
                        c195868lW.A0x = arrayList5;
                    } else if ("is_normalized".equals(A0q)) {
                        c195868lW.A19 = c16l.A0d();
                    } else if ("is_reversed".equals(A0q)) {
                        c195868lW.A1D = c16l.A0d();
                    } else if ("has_audio".equals(A0q)) {
                        c195868lW.A1H = c16l.A0d();
                    } else if ("text_mode_gradient_colors".equals(A0q)) {
                        c195868lW.A0U = AbstractC14610oZ.parseFromJson(c16l);
                    } else if ("is_saved_instagram_story".equals(A0q)) {
                        c195868lW.A1F = c16l.A0d();
                    } else if ("is_captured_draft".equals(A0q)) {
                        c195868lW.A14 = c16l.A0d();
                    } else if ("from_story_drafts".equals(A0q)) {
                        c195868lW.A17 = c16l.A0d();
                    } else if ("is_trimmed".equals(A0q)) {
                        c195868lW.A1G = c16l.A0d();
                    } else if ("is_reshare".equals(A0q)) {
                        c195868lW.A1C = c16l.A0d();
                    } else if ("trimmed_start_pos_ms".equals(A0q)) {
                        c195868lW.A0J = c16l.A1D();
                    } else if ("trimmed_end_pos_ms".equals(A0q)) {
                        c195868lW.A0I = c16l.A1D();
                    } else if ("segmented_duration_ms".equals(A0q)) {
                        c195868lW.A0E = c16l.A1D();
                    } else if ("cache_type".equals(A0q)) {
                        c195868lW.A00 = c16l.A1D();
                    } else if ("media_upload_metadata".equals(A0q)) {
                        MediaUploadMetadata parseFromJson6 = AbstractC93554Hv.parseFromJson(c16l);
                        C14360o3.A0B(parseFromJson6, 0);
                        c195868lW.A0S = parseFromJson6;
                    } else if ("attribution_content_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str13 = c16l.A1P();
                        }
                        c195868lW.A0e = str13;
                    } else if ("original_audio_creation_params".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList6 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                MusicOverlayStickerModel parseFromJson7 = C4A1.parseFromJson(c16l);
                                if (parseFromJson7 != null) {
                                    arrayList6.add(parseFromJson7);
                                }
                            }
                        }
                        c195868lW.A0z = arrayList6;
                    } else if ("media_composition".equals(A0q)) {
                        c195868lW.A0O = MediaComposition.A00(c16l.A1P());
                    } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str14 = c16l.A1P();
                        }
                        c195868lW.A0i = str14;
                    } else if ("original_camera_destination_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str15 = c16l.A1P();
                        }
                        c195868lW.A0n = str15;
                    } else if ("was_photo".equals(A0q)) {
                        c195868lW.A1L = c16l.A0d();
                    } else if ("source_photo_file_path".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str16 = c16l.A1P();
                        }
                        c195868lW.A0r = str16;
                    } else if ("all_clips_media_receivers_from_chat".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList7 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator = User.CREATOR;
                                User A00 = AbstractC38851rI.A00(c16l, false);
                                if (A00 != null) {
                                    arrayList7.add(A00);
                                }
                            }
                        }
                        c195868lW.A0t = arrayList7;
                    } else if ("source_chat_thread_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c195868lW.A0q = str;
                    } else if ("is_remix".equals(A0q)) {
                        c195868lW.A0Y = Boolean.valueOf(c16l.A0d());
                    } else if ("is_quicksnap_recap".equals(A0q)) {
                        c195868lW.A1B = c16l.A0d();
                    }
                }
                c16l.A0z();
            }
            return c195868lW;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C195868lW c195868lW) {
        Medium medium;
        anonymousClass182.A0d();
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c195868lW.A0K);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c195868lW.A08);
        anonymousClass182.A0Q("original_width", c195868lW.A0B);
        anonymousClass182.A0Q("original_height", c195868lW.A0A);
        anonymousClass182.A0Q("crop_rect_left", c195868lW.A03);
        anonymousClass182.A0Q("crop_rect_top", c195868lW.A05);
        anonymousClass182.A0Q("crop_rect_right", c195868lW.A04);
        anonymousClass182.A0Q("crop_rect_bottom", c195868lW.A02);
        anonymousClass182.A0Q("orientation", c195868lW.A09);
        anonymousClass182.A0Q("full_video_duration_ms", c195868lW.A07);
        anonymousClass182.A0Q("start_time_ms", c195868lW.A0H);
        anonymousClass182.A0Q("start_seek_time_ms", c195868lW.A0G);
        anonymousClass182.A0Q("end_time_ms", c195868lW.A06);
        String str = c195868lW.A0p;
        if (str != null) {
            anonymousClass182.A0S("segment_group_id", str);
        }
        anonymousClass182.A0Q("segment_index", c195868lW.A0D);
        anonymousClass182.A0Q("segment_count", c195868lW.A0C);
        String str2 = c195868lW.A0f;
        if (str2 != null) {
            anonymousClass182.A0S("camera_position", str2);
        }
        anonymousClass182.A0T("mirrored", c195868lW.A1J);
        String str3 = c195868lW.A0k;
        if (str3 != null) {
            anonymousClass182.A0S("file_path", str3);
        }
        String str4 = c195868lW.A0h;
        if (str4 != null) {
            anonymousClass182.A0S("cover_file_path", str4);
        }
        anonymousClass182.A0T("imported", c195868lW.A18);
        anonymousClass182.A0R("date_added", c195868lW.A0L);
        anonymousClass182.A0R("date_taken", c195868lW.A0M);
        anonymousClass182.A0T("is_boomerang", c195868lW.A1I);
        anonymousClass182.A0T("is_rollcall_v2", c195868lW.A1E);
        anonymousClass182.A0T("should_background_cover_media", c195868lW.A1K);
        if (c195868lW.A0T != null) {
            anonymousClass182.A0r("original_background_gradient");
            AbstractC14610oZ.A00(anonymousClass182, c195868lW.A0T);
        }
        anonymousClass182.A0Q("camera_id", c195868lW.A01);
        String str5 = c195868lW.A0m;
        if (str5 != null) {
            anonymousClass182.A0S("ar_effect_id", str5);
        }
        if (c195868lW.A0P != null) {
            anonymousClass182.A0r("ar_effect");
            AbstractC120315cU.A00(anonymousClass182, c195868lW.A0P);
        }
        String str6 = c195868lW.A0j;
        if (str6 != null) {
            anonymousClass182.A0S("effect_persisted_metadata", str6);
        }
        String str7 = c195868lW.A0g;
        if (str7 != null) {
            anonymousClass182.A0S("capture_type", str7);
        }
        if (c195868lW.A11 != null) {
            C16V.A03(anonymousClass182, "camera_tools");
            Iterator it = c195868lW.A11.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        if (c195868lW.A0y != null) {
            C16V.A03(anonymousClass182, "camera_tool_infos");
            for (C5JB c5jb : c195868lW.A0y) {
                if (c5jb != null) {
                    C5JA.A00(anonymousClass182, c5jb);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c195868lW.A10 != null) {
            C16V.A03(anonymousClass182, "auto_created_source_ids");
            Iterator it2 = c195868lW.A10.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it2);
            }
            anonymousClass182.A0Z();
        }
        if (c195868lW.A0W != null) {
            anonymousClass182.A0r("product_info");
            AEB.A00(anonymousClass182, c195868lW.A0W);
        }
        C16V.A03(anonymousClass182, "story_gated_feature");
        Iterator it3 = c195868lW.A12.iterator();
        while (it3.hasNext()) {
            AbstractC167017dG.A1F(anonymousClass182, it3);
        }
        anonymousClass182.A0Z();
        anonymousClass182.A0Q("source_type", c195868lW.A0F);
        String str8 = c195868lW.A0o;
        if (str8 != null) {
            anonymousClass182.A0S("reshare_source", str8);
        }
        String str9 = c195868lW.A0d;
        if (str9 != null) {
            anonymousClass182.A0S("archived_media_id", str9);
        }
        String str10 = c195868lW.A0l;
        if (str10 != null) {
            anonymousClass182.A0S("format_variant", str10);
        }
        if (c195868lW.A0R != null) {
            anonymousClass182.A0r("medium");
            C8IR.A00(anonymousClass182, c195868lW.A0R);
        }
        if (c195868lW.A0V != null) {
            anonymousClass182.A0r("music_overlay_sticker_model");
            C4A1.A00(anonymousClass182, c195868lW.A0V, true);
        }
        if (c195868lW.A0v != null) {
            C16V.A03(anonymousClass182, "clips_segments_metadata");
            for (C5JD c5jd : c195868lW.A0v) {
                if (c5jd != null) {
                    C5JC.A00(anonymousClass182, c5jd);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c195868lW.A0w != null) {
            C16V.A03(anonymousClass182, "external_media_segment_info");
            for (C51743MtS c51743MtS : c195868lW.A0w) {
                if (c51743MtS != null) {
                    AbstractC23030ADm.A00(c51743MtS, anonymousClass182);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("is_created_with_sound_sync", c195868lW.A16);
        String str11 = c195868lW.A0s;
        if (str11 != null) {
            anonymousClass182.A0S("template_clips_media_id", str11);
        }
        anonymousClass182.A0T("is_boomerang_v2", c195868lW.A13);
        anonymousClass182.A0T("is_post_capture_variant", c195868lW.A1A);
        anonymousClass182.A0T("is_clips_remix", c195868lW.A15);
        Integer num = c195868lW.A0c;
        if (num != null) {
            anonymousClass182.A0Q("num_times_post_capture_trim", num.intValue());
        }
        if (c195868lW.A0u != null) {
            C16V.A03(anonymousClass182, "clips_camera_ar_effects");
            for (CameraAREffect cameraAREffect : c195868lW.A0u) {
                if (cameraAREffect != null) {
                    AbstractC120315cU.A00(anonymousClass182, cameraAREffect);
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num2 = c195868lW.A0Z;
        if (num2 != null) {
            anonymousClass182.A0Q("color_range", num2.intValue());
        }
        Integer num3 = c195868lW.A0a;
        if (num3 != null) {
            anonymousClass182.A0Q("color_standard", num3.intValue());
        }
        Integer num4 = c195868lW.A0b;
        if (num4 != null) {
            anonymousClass182.A0Q("color_transfer", num4.intValue());
        }
        if (c195868lW.A0X != null) {
            anonymousClass182.A0r("concurrent_video");
            A00(anonymousClass182, c195868lW.A0X);
        }
        if (c195868lW.A0x != null) {
            C16V.A03(anonymousClass182, "magic_mod_tool_data");
            for (OTK otk : c195868lW.A0x) {
                if (otk != null) {
                    AbstractC54873OOl.A00(anonymousClass182, otk);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("is_normalized", c195868lW.A19);
        anonymousClass182.A0T("is_reversed", c195868lW.A1D);
        anonymousClass182.A0T("has_audio", c195868lW.A1H);
        if (c195868lW.A0U != null) {
            anonymousClass182.A0r("text_mode_gradient_colors");
            AbstractC14610oZ.A00(anonymousClass182, c195868lW.A0U);
        }
        anonymousClass182.A0T("is_saved_instagram_story", c195868lW.A1F);
        anonymousClass182.A0T("is_captured_draft", c195868lW.A14);
        anonymousClass182.A0T("from_story_drafts", c195868lW.A17);
        anonymousClass182.A0T("is_trimmed", c195868lW.A1G);
        anonymousClass182.A0T("is_reshare", c195868lW.A1C);
        anonymousClass182.A0Q("trimmed_start_pos_ms", c195868lW.A0J);
        anonymousClass182.A0Q("trimmed_end_pos_ms", c195868lW.A0I);
        anonymousClass182.A0Q("segmented_duration_ms", c195868lW.A0E);
        anonymousClass182.A0Q("cache_type", c195868lW.A00);
        c195868lW.A02();
        anonymousClass182.A0r("media_upload_metadata");
        AbstractC93554Hv.A00(anonymousClass182, c195868lW.A02());
        String str12 = c195868lW.A0e;
        if (str12 != null) {
            anonymousClass182.A0S("attribution_content_url", str12);
        }
        if (c195868lW.A0z != null) {
            C16V.A03(anonymousClass182, "original_audio_creation_params");
            for (MusicOverlayStickerModel musicOverlayStickerModel : c195868lW.A0z) {
                if (musicOverlayStickerModel != null) {
                    C4A1.A00(anonymousClass182, musicOverlayStickerModel, true);
                }
            }
            anonymousClass182.A0Z();
        }
        MediaComposition mediaComposition = c195868lW.A0O;
        if (mediaComposition != null) {
            try {
                anonymousClass182.A0S("media_composition", mediaComposition.A09().toString());
            } catch (JSONException e) {
                throw new IOException(e);
            }
        }
        String str13 = c195868lW.A0i;
        if (str13 != null) {
            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str13);
        }
        String str14 = c195868lW.A0n;
        if (str14 != null) {
            anonymousClass182.A0S("original_camera_destination_type", str14);
        }
        anonymousClass182.A0T("was_photo", c195868lW.A1L);
        String str15 = c195868lW.A0r;
        if (str15 != null) {
            anonymousClass182.A0S("source_photo_file_path", str15);
        }
        if (c195868lW.A0t != null) {
            C16V.A03(anonymousClass182, "all_clips_media_receivers_from_chat");
            Iterator it4 = c195868lW.A0t.iterator();
            while (it4.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, it4);
            }
            anonymousClass182.A0Z();
        }
        String str16 = c195868lW.A0q;
        if (str16 != null) {
            anonymousClass182.A0S("source_chat_thread_name", str16);
        }
        Boolean bool = c195868lW.A0Y;
        if (bool != null || ((medium = c195868lW.A0R) != null && (bool = medium.A0K) != null)) {
            anonymousClass182.A0T("is_remix", bool.booleanValue());
        }
        anonymousClass182.A0T("is_quicksnap_recap", c195868lW.A1B);
        anonymousClass182.A0a();
    }
}
