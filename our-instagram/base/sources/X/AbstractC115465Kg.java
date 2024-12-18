package X;

import com.facebook.location.platform.api.Location;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5Kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115465Kg {
    public static C115475Kh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C115475Kh c115475Kh = new C115475Kh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("source_video".equals(A0q)) {
                    C115525Km parseFromJson = AbstractC115555Kp.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c115475Kh.A0G = parseFromJson;
                } else if ("recording_settings".equals(A0q)) {
                    C115545Ko parseFromJson2 = AbstractC115565Kq.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c115475Kh.A0F = parseFromJson2;
                } else if ("recording_speed".equals(A0q)) {
                    c115475Kh.A00 = (float) c16l.A0U();
                } else if ("trimmed_start_time_ms".equals(A0q)) {
                    c115475Kh.A09 = c16l.A1D();
                } else if ("trimmed_end_time_ms".equals(A0q)) {
                    c115475Kh.A08 = c16l.A1D();
                } else if ("is_from_draft".equals(A0q)) {
                    c115475Kh.A0R = c16l.A0d();
                } else if ("is_replaced".equals(A0q)) {
                    c115475Kh.A0T = c16l.A0d();
                } else if ("text_mode_gradient_colors".equals(A0q)) {
                    c115475Kh.A0E = AbstractC14610oZ.parseFromJson(c16l);
                } else if ("fill_screen".equals(A0q)) {
                    c115475Kh.A0O = c16l.A0d();
                } else if ("is_non_transcoded_prefill_video".equals(A0q)) {
                    c115475Kh.A0S = c16l.A0d();
                } else if ("min_trim_time_ms".equals(A0q)) {
                    c115475Kh.A03 = c16l.A1D();
                } else if ("max_trim_time_ms".equals(A0q)) {
                    c115475Kh.A02 = c16l.A1D();
                } else if ("min_trim_start_time_ms".equals(A0q)) {
                    c115475Kh.A05 = c16l.A1D();
                } else if ("is_transcoded".equals(A0q)) {
                    c115475Kh.A0U = c16l.A0d();
                } else {
                    String str = null;
                    if ("complianceError".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c115475Kh.A0I = str;
                    } else if ("auto_created_reels_segment_info".equals(A0q)) {
                        c115475Kh.A0D = MWV.parseFromJson(c16l);
                    } else if ("transition_in_effect".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c115475Kh.A0M = str;
                    } else if ("transition_out_effect".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c115475Kh.A0N = str;
                    } else if ("take_index".equals(A0q)) {
                        c115475Kh.A07 = c16l.A1D();
                    } else if ("alternate_takes".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c115475Kh.A0L = str;
                    } else if ("segment_start_time_ms".equals(A0q)) {
                        c115475Kh.A06 = c16l.A1D();
                    } else if ("segment_end_time_ms".equals(A0q)) {
                        c115475Kh.A04 = c16l.A1D();
                    } else if ("import_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c115475Kh.A0J = str;
                    } else if ("video_split_meta_data".equals(A0q)) {
                        c115475Kh.A0C = AbstractC38007Gnt.parseFromJson(c16l);
                    } else if ("has_video_slip".equals(A0q)) {
                        c115475Kh.A0Q = c16l.A0d();
                    } else if ("has_template_reusable_asset".equals(A0q)) {
                        c115475Kh.A0P = c16l.A0d();
                    } else if ("prefilled_index".equals(A0q)) {
                        c115475Kh.A0H = Integer.valueOf(c16l.A1D());
                    } else if ("layout_transform".equals(A0q)) {
                        c115475Kh.A0A = AbstractC202168ww.parseFromJson(c16l);
                    } else if ("original_medium_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c115475Kh.A0K = str;
                    } else if ("volume".equals(A0q)) {
                        c115475Kh.A01 = (float) c16l.A0U();
                    } else if ("magic_cut_metadata".equals(A0q)) {
                        c115475Kh.A0B = AbstractC53915Nso.parseFromJson(c16l);
                    }
                }
                c16l.A0z();
            }
            c115475Kh.A0F();
            return c115475Kh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C115475Kh c115475Kh) {
        anonymousClass182.A0d();
        if (c115475Kh.A0G != null) {
            anonymousClass182.A0r("source_video");
            C115525Km c115525Km = c115475Kh.A0G;
            anonymousClass182.A0d();
            String str = c115525Km.A0F;
            if (str != null) {
                anonymousClass182.A0S("file_path", str);
            }
            String str2 = c115525Km.A0G;
            if (str2 != null) {
                anonymousClass182.A0S("original_file_path", str2);
            }
            String str3 = c115525Km.A0E;
            if (str3 != null) {
                anonymousClass182.A0S("cover_thumbnail_path", str3);
            }
            anonymousClass182.A0R("date_taken", c115525Km.A0A);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c115525Km.A09);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c115525Km.A05);
            anonymousClass182.A0Q("colorTransfer", c115525Km.A01);
            anonymousClass182.A0Q("orientation", c115525Km.A07);
            String str4 = c115525Km.A0D;
            if (str4 != null) {
                anonymousClass182.A0S("camera_position", str4);
            }
            anonymousClass182.A0Q("camera_id", c115525Km.A00);
            anonymousClass182.A0Q("origin", c115525Km.A08);
            anonymousClass182.A0Q("duration_ms", c115525Km.A04);
            anonymousClass182.A0Q("trim_start_time_ms", c115525Km.A03);
            anonymousClass182.A0Q("trim_end_time_ms", c115525Km.A02);
            String str5 = c115525Km.A0H;
            if (str5 != null) {
                anonymousClass182.A0S("original_media_folder", str5);
            }
            anonymousClass182.A0Q("in_flight_video_calculated_duration_ms", c115525Km.A06);
            if (c115525Km.A0B != null) {
                anonymousClass182.A0r("media_upload_metadata");
                AbstractC93554Hv.A00(anonymousClass182, c115525Km.A0B);
            }
            anonymousClass182.A0T("was_photo", c115525Km.A0K);
            String str6 = c115525Km.A0I;
            if (str6 != null) {
                anonymousClass182.A0S("source_photo_file_path", str6);
            }
            if (c115525Km.A0J != null) {
                C16V.A03(anonymousClass182, "external_media_segment_info");
                for (C51743MtS c51743MtS : c115525Km.A0J) {
                    if (c51743MtS != null) {
                        AbstractC23030ADm.A00(c51743MtS, anonymousClass182);
                    }
                }
                anonymousClass182.A0Z();
            }
            Boolean bool = c115525Km.A0C;
            if (bool != null) {
                anonymousClass182.A0T("is_remix", bool.booleanValue());
            }
            anonymousClass182.A0a();
        }
        if (c115475Kh.A0F != null) {
            anonymousClass182.A0r("recording_settings");
            C115545Ko c115545Ko = c115475Kh.A0F;
            anonymousClass182.A0d();
            anonymousClass182.A0P(Location.SPEED, c115545Ko.A00);
            anonymousClass182.A0Q("timer_duration_ms", c115545Ko.A01);
            anonymousClass182.A0T("ghost_mode_on", c115545Ko.A05);
            if (c115545Ko.A04 != null) {
                C16V.A03(anonymousClass182, "camera_tool");
                for (String str7 : c115545Ko.A04) {
                    if (str7 != null) {
                        anonymousClass182.A0u(str7);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c115545Ko.A02 != null) {
                C16V.A03(anonymousClass182, "camera_ar_effect_list");
                for (CameraAREffect cameraAREffect : c115545Ko.A02) {
                    if (cameraAREffect != null) {
                        AbstractC120315cU.A00(anonymousClass182, cameraAREffect);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c115545Ko.A03 != null) {
                C16V.A03(anonymousClass182, "camera_tools_struct");
                for (CameraToolInfo cameraToolInfo : c115545Ko.A03) {
                    if (cameraToolInfo != null) {
                        C51S.A00(anonymousClass182, cameraToolInfo);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0P("recording_speed", c115475Kh.A00);
        anonymousClass182.A0Q("trimmed_start_time_ms", c115475Kh.A09);
        anonymousClass182.A0Q("trimmed_end_time_ms", c115475Kh.A08);
        anonymousClass182.A0T("is_from_draft", c115475Kh.A0R);
        anonymousClass182.A0T("is_replaced", c115475Kh.A0T);
        if (c115475Kh.A0E != null) {
            anonymousClass182.A0r("text_mode_gradient_colors");
            AbstractC14610oZ.A00(anonymousClass182, c115475Kh.A0E);
        }
        anonymousClass182.A0T("fill_screen", c115475Kh.A0O);
        anonymousClass182.A0T("is_non_transcoded_prefill_video", c115475Kh.A0S);
        anonymousClass182.A0Q("min_trim_time_ms", c115475Kh.A03);
        anonymousClass182.A0Q("max_trim_time_ms", c115475Kh.A02);
        anonymousClass182.A0Q("min_trim_start_time_ms", c115475Kh.A05);
        anonymousClass182.A0T("is_transcoded", c115475Kh.A0U);
        String str8 = c115475Kh.A0I;
        if (str8 != null) {
            anonymousClass182.A0S("complianceError", str8);
        }
        if (c115475Kh.A0D != null) {
            anonymousClass182.A0r("auto_created_reels_segment_info");
            MWV.A00(c115475Kh.A0D, anonymousClass182);
        }
        String str9 = c115475Kh.A0M;
        if (str9 != null) {
            anonymousClass182.A0S("transition_in_effect", str9);
        }
        String str10 = c115475Kh.A0N;
        if (str10 != null) {
            anonymousClass182.A0S("transition_out_effect", str10);
        }
        anonymousClass182.A0Q("take_index", c115475Kh.A07);
        String str11 = c115475Kh.A0L;
        if (str11 != null) {
            anonymousClass182.A0S("alternate_takes", str11);
        }
        anonymousClass182.A0Q("segment_start_time_ms", c115475Kh.A06);
        anonymousClass182.A0Q("segment_end_time_ms", c115475Kh.A04);
        String str12 = c115475Kh.A0J;
        if (str12 != null) {
            anonymousClass182.A0S("import_id", str12);
        }
        if (c115475Kh.A0C != null) {
            anonymousClass182.A0r("video_split_meta_data");
            C38008Gnu c38008Gnu = c115475Kh.A0C;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("split_time", c38008Gnu.A00);
            anonymousClass182.A0T("is_split_point_at_start", c38008Gnu.A02);
            anonymousClass182.A0Q("trimmed_duration_after_split", c38008Gnu.A01);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("has_video_slip", c115475Kh.A0Q);
        anonymousClass182.A0T("has_template_reusable_asset", c115475Kh.A0P);
        Integer num = c115475Kh.A0H;
        if (num != null) {
            anonymousClass182.A0Q("prefilled_index", num.intValue());
        }
        if (c115475Kh.A0A != null) {
            anonymousClass182.A0r("layout_transform");
            AbstractC202168ww.A00(c115475Kh.A0A, anonymousClass182);
        }
        String str13 = c115475Kh.A0K;
        if (str13 != null) {
            anonymousClass182.A0S("original_medium_id", str13);
        }
        anonymousClass182.A0P("volume", c115475Kh.A01);
        if (c115475Kh.A0B != null) {
            anonymousClass182.A0r("magic_cut_metadata");
            C51737MtK c51737MtK = c115475Kh.A0B;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("trim_start_time_ms", c51737MtK.A01);
            anonymousClass182.A0Q("trim_end_time_ms", c51737MtK.A00);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
