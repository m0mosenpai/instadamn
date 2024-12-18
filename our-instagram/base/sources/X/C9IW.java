package X;

import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9IW, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9IW {
    public static C8r2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C8r2 c8r2 = new C8r2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                boolean z = true;
                if ("free_transform_edits".equals(A0q)) {
                    C203428yz parseFromJson = AbstractC203418yy.parseFromJson(c16l);
                    if (parseFromJson == null) {
                        z = false;
                        parseFromJson = null;
                    }
                    c8r2.A04 = new C198988qy(z, parseFromJson);
                } else if ("audio_state_edits".equals(A0q)) {
                    c8r2.A02 = C9IX.parseFromJson(c16l);
                } else if ("video_filter_setting".equals(A0q)) {
                    c8r2.A08 = AbstractC916247x.parseFromJson(c16l);
                } else if ("is_audio_muted".equals(A0q)) {
                    c8r2.A0C = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    String str = null;
                    ArrayList arrayList2 = null;
                    if ("post_capture_ar_effectId".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c8r2.A09 = str;
                    } else if ("post_capture_ar_effect".equals(A0q)) {
                        c8r2.A00 = AbstractC120315cU.parseFromJson(c16l);
                    } else if ("visual_info".equals(A0q)) {
                        c8r2.A05 = AbstractC203438z0.parseFromJson(c16l);
                    } else if ("transform_matrix_configs".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                TransformMatrixConfig parseFromJson2 = C55Y.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList2.add(parseFromJson2);
                                }
                            }
                        }
                        c8r2.A0B = arrayList2;
                    } else if ("transform_matrix_config".equals(A0q)) {
                        c8r2.A01 = C55Y.parseFromJson(c16l);
                    } else if ("render_dynamic_drawables_first".equals(A0q)) {
                        c8r2.A0D = c16l.A0d();
                    } else if ("media_audio_overlay_info".equals(A0q)) {
                        c8r2.A07 = AnonymousClass481.parseFromJson(c16l);
                    } else if ("clips_voiceover_edits".equals(A0q)) {
                        c8r2.A03 = C9IZ.parseFromJson(c16l);
                    } else if ("story_image_regions".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5NJ parseFromJson3 = C5NI.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        c8r2.A0A = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c8r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C8r2 c8r2) {
        anonymousClass182.A0d();
        C198988qy c198988qy = c8r2.A04;
        if (c198988qy != null) {
            C8z3.A00(anonymousClass182, c198988qy);
        }
        if (c8r2.A02 != null) {
            anonymousClass182.A0r("audio_state_edits");
            C22943A9n c22943A9n = c8r2.A02;
            anonymousClass182.A0d();
            anonymousClass182.A0T("is_video", c22943A9n.A04);
            anonymousClass182.A0T("is_video_muted", c22943A9n.A05);
            anonymousClass182.A0T("did_user_mute_audio", c22943A9n.A00);
            anonymousClass182.A0T("has_music_sticker", c22943A9n.A02);
            anonymousClass182.A0T("is_music_burned_into_video", c22943A9n.A03);
            anonymousClass182.A0T("force_play_video_audio", c22943A9n.A01);
            anonymousClass182.A0a();
        }
        if (c8r2.A08 != null) {
            anonymousClass182.A0r("video_filter_setting");
            AbstractC916247x.A00(anonymousClass182, c8r2.A08);
        }
        anonymousClass182.A0T("is_audio_muted", c8r2.A0C);
        String str = c8r2.A09;
        if (str != null) {
            anonymousClass182.A0S("post_capture_ar_effectId", str);
        }
        if (c8r2.A00 != null) {
            anonymousClass182.A0r("post_capture_ar_effect");
            AbstractC120315cU.A00(anonymousClass182, c8r2.A00);
        }
        if (c8r2.A05 != null) {
            anonymousClass182.A0r("visual_info");
            AbstractC203438z0.A00(anonymousClass182, c8r2.A05);
        }
        if (c8r2.A0B != null) {
            C16V.A03(anonymousClass182, "transform_matrix_configs");
            for (TransformMatrixConfig transformMatrixConfig : c8r2.A0B) {
                if (transformMatrixConfig != null) {
                    C55Y.A00(anonymousClass182, transformMatrixConfig);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c8r2.A01 != null) {
            anonymousClass182.A0r("transform_matrix_config");
            C55Y.A00(anonymousClass182, c8r2.A01);
        }
        anonymousClass182.A0T("render_dynamic_drawables_first", c8r2.A0D);
        if (c8r2.A07 != null) {
            anonymousClass182.A0r("media_audio_overlay_info");
            AnonymousClass481.A00(anonymousClass182, c8r2.A07);
        }
        if (c8r2.A03 != null) {
            anonymousClass182.A0r("clips_voiceover_edits");
            C9IV c9iv = c8r2.A03;
            anonymousClass182.A0d();
            if (c9iv.A05 != null) {
                C16V.A03(anonymousClass182, "clips_voiceover_segments");
                for (C24239Ap6 c24239Ap6 : c9iv.A05) {
                    if (c24239Ap6 != null) {
                        anonymousClass182.A0d();
                        anonymousClass182.A0Q("start_time_ms", c24239Ap6.A01);
                        anonymousClass182.A0Q("end_time_ms", c24239Ap6.A00);
                        String str2 = c24239Ap6.A06;
                        if (str2 != null) {
                            anonymousClass182.A0S("file_path", str2);
                        }
                        anonymousClass182.A0Q("trimmed_start_time_ms", c24239Ap6.A03);
                        anonymousClass182.A0Q("trimmed_end_time_ms", c24239Ap6.A02);
                        if (c24239Ap6.A07 != null) {
                            C16V.A03(anonymousClass182, "waveform");
                            for (Number number : c24239Ap6.A07) {
                                if (number != null) {
                                    anonymousClass182.A0g(number.floatValue());
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        anonymousClass182.A0Q("snippet_start_time_ms", c24239Ap6.A05);
                        anonymousClass182.A0T("is_recording_segment", c24239Ap6.A08);
                        anonymousClass182.A0Q("sequence_number", c24239Ap6.A04);
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0P("video_volume", c9iv.A03);
            anonymousClass182.A0P("audio_overlay_volume", c9iv.A00);
            anonymousClass182.A0P("voiceover_volume", c9iv.A04);
            anonymousClass182.A0P("sound_effects_volume", c9iv.A01);
            anonymousClass182.A0P("sticker_volume", c9iv.A02);
            anonymousClass182.A0a();
        }
        if (c8r2.A0A != null) {
            C16V.A03(anonymousClass182, "story_image_regions");
            for (C5NJ c5nj : c8r2.A0A) {
                if (c5nj != null) {
                    C5NI.A00(anonymousClass182, c5nj);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
