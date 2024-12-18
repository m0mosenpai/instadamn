package X;

import com.instagram.api.schemas.ACRType;
import java.io.IOException;

/* renamed from: X.5JC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5JC {
    public static C5JD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C5JD c5jd = new C5JD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("recording_speed".equals(A0q)) {
                    c5jd.A03 = c16l.A1D();
                } else if ("index".equals(A0q)) {
                    c5jd.A02 = c16l.A1D();
                } else {
                    String str = null;
                    if ("face_effect_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c5jd.A0B = str;
                    } else if ("source_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c5jd.A0H = str;
                    } else if ("duration_in_ms".equals(A0q)) {
                        c5jd.A01 = c16l.A1D();
                    } else if ("audio_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c5jd.A0A = str;
                    } else if ("is_from_drafts".equals(A0q)) {
                        c5jd.A0K = c16l.A0d();
                    } else if ("file_path".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c5jd.A0C = str;
                    } else if ("source_photo_file_path".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c5jd.A0G = str;
                    } else if ("camera_position".equals(A0q)) {
                        c5jd.A00 = c16l.A1D();
                    } else if ("media_folder".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c5jd.A0D = str;
                    } else if ("can_share_to_facebook".equals(A0q)) {
                        c5jd.A0I = c16l.A0d();
                    } else if ("can_share_to_facebook_expansion".equals(A0q)) {
                        c5jd.A07 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_non_transcoded_prefill_video".equals(A0q)) {
                        c5jd.A0L = c16l.A0d();
                    } else if ("auto_created_reels_metadata".equals(A0q)) {
                        c5jd.A06 = C5JF.parseFromJson(c16l);
                    } else if ("original_media_type".equals(A0q)) {
                        EnumC40111tc A00 = AbstractC40091ta.A00(Integer.valueOf(c16l.A1D()));
                        C14360o3.A0B(A00, 0);
                        c5jd.A05 = A00;
                    } else if ("trimmed_start_time_ms".equals(A0q)) {
                        c5jd.A04 = c16l.A1D();
                    } else if ("original_segment_hash".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c5jd.A0F = str;
                    } else if ("is_remix".equals(A0q)) {
                        c5jd.A0M = c16l.A0d();
                    } else if ("metagallery_media_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c5jd.A0E = str;
                    } else if ("has_reusable_template_asset".equals(A0q)) {
                        c5jd.A0J = c16l.A0d();
                    } else if ("reusable_template_media_asset_start_time_ms".equals(A0q)) {
                        c5jd.A09 = Integer.valueOf(c16l.A1D());
                    } else if ("reusable_template_media_asset_end_time_ms".equals(A0q)) {
                        c5jd.A08 = Integer.valueOf(c16l.A1D());
                    }
                }
                c16l.A0z();
            }
            return c5jd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5JD c5jd) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("recording_speed", c5jd.A03);
        anonymousClass182.A0Q("index", c5jd.A02);
        String str = c5jd.A0B;
        if (str != null) {
            anonymousClass182.A0S("face_effect_id", str);
        }
        String str2 = c5jd.A0H;
        if (str2 != null) {
            anonymousClass182.A0S("source_type", str2);
        }
        anonymousClass182.A0Q("duration_in_ms", c5jd.A01);
        String str3 = c5jd.A0A;
        if (str3 != null) {
            anonymousClass182.A0S("audio_type", str3);
        }
        anonymousClass182.A0T("is_from_drafts", c5jd.A0K);
        String str4 = c5jd.A0C;
        if (str4 != null) {
            anonymousClass182.A0S("file_path", str4);
        }
        String str5 = c5jd.A0G;
        if (str5 != null) {
            anonymousClass182.A0S("source_photo_file_path", str5);
        }
        anonymousClass182.A0Q("camera_position", c5jd.A00);
        String str6 = c5jd.A0D;
        if (str6 != null) {
            anonymousClass182.A0S("media_folder", str6);
        }
        anonymousClass182.A0T("can_share_to_facebook", c5jd.A0I);
        Boolean bool = c5jd.A07;
        if (bool != null) {
            anonymousClass182.A0T("can_share_to_facebook_expansion", bool.booleanValue());
        }
        anonymousClass182.A0T("is_non_transcoded_prefill_video", c5jd.A0L);
        if (c5jd.A06 != null) {
            anonymousClass182.A0r("auto_created_reels_metadata");
            C9ZE c9ze = c5jd.A06;
            anonymousClass182.A0d();
            String str7 = c9ze.A03;
            if (str7 != null) {
                anonymousClass182.A0S("source_media_collection_id", str7);
            }
            Long l = c9ze.A01;
            if (l != null) {
                anonymousClass182.A0R("source_media_id", l.longValue());
            }
            Long l2 = c9ze.A02;
            if (l2 != null) {
                anonymousClass182.A0R("source_medium_id", l2.longValue());
            }
            ACRType aCRType = c9ze.A00;
            if (aCRType != null) {
                anonymousClass182.A0S("acr_type", aCRType.A00);
            }
            String str8 = c9ze.A04;
            if (str8 != null) {
                anonymousClass182.A0S("template_clips_media_id", str8);
            }
            anonymousClass182.A0a();
        }
        EnumC40111tc enumC40111tc = c5jd.A05;
        if (enumC40111tc != null) {
            anonymousClass182.A0Q("original_media_type", enumC40111tc.A00);
        }
        anonymousClass182.A0Q("trimmed_start_time_ms", c5jd.A04);
        String str9 = c5jd.A0F;
        if (str9 != null) {
            anonymousClass182.A0S("original_segment_hash", str9);
        }
        anonymousClass182.A0T("is_remix", c5jd.A0M);
        String str10 = c5jd.A0E;
        if (str10 != null) {
            anonymousClass182.A0S("metagallery_media_id", str10);
        }
        anonymousClass182.A0T("has_reusable_template_asset", c5jd.A0J);
        Integer num = c5jd.A09;
        if (num != null) {
            anonymousClass182.A0Q("reusable_template_media_asset_start_time_ms", num.intValue());
        }
        Integer num2 = c5jd.A08;
        if (num2 != null) {
            anonymousClass182.A0Q("reusable_template_media_asset_end_time_ms", num2.intValue());
        }
        anonymousClass182.A0a();
    }
}
