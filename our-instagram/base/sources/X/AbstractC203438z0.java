package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.feed.media.ReelCTA;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8z0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203438z0 {
    public static C187028Qv parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C187028Qv c187028Qv = new C187028Qv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                ArrayList arrayList10 = null;
                String str2 = null;
                if ("reel_ctas".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ReelCTA parseFromJson = C40D.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c187028Qv.A0D = arrayList;
                } else if ("captions".equals(A0q)) {
                    c187028Qv.A06 = AbstractC203448z1.parseFromJson(c16l);
                } else if ("media_gating_info".equals(A0q)) {
                    c187028Qv.A02 = AbstractC41243INj.parseFromJson(c16l);
                } else if ("branded_content_tags".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            BrandedContentTag parseFromJson2 = AbstractC54880OPb.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    }
                    c187028Qv.A0A = arrayList2;
                } else if ("branded_content_project_metadata".equals(A0q)) {
                    c187028Qv.A03 = ONL.parseFromJson(c16l);
                } else if ("is_paid_partnership_label".equals(A0q)) {
                    c187028Qv.A0Q = c16l.A0d();
                } else if ("create_pa_boost_post_access_token".equals(A0q)) {
                    c187028Qv.A0N = c16l.A0d();
                } else if ("reel_assets".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C5NG parseFromJson3 = C5NF.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    }
                    c187028Qv.A0C = arrayList3;
                } else if ("reel_interactives".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C84823qW parseFromJson4 = AbstractC1123155i.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList4.add(parseFromJson4);
                            }
                        }
                    }
                    c187028Qv.A0E = arrayList4;
                } else if ("static_stickers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C84823qW parseFromJson5 = AbstractC1123155i.parseFromJson(c16l);
                            if (parseFromJson5 != null) {
                                arrayList5.add(parseFromJson5);
                            }
                        }
                    }
                    c187028Qv.A0F = arrayList5;
                } else if ("drawing_state_snapshot".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C72792XnD parseFromJson6 = AbstractC69987Vz6.parseFromJson(c16l);
                            if (parseFromJson6 != null) {
                                arrayList6.add(parseFromJson6);
                            }
                        }
                    }
                    c187028Qv.A0B = arrayList6;
                } else if ("text_format_types".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList7 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList7.add(A1P);
                            }
                        }
                    }
                    c187028Qv.A0I = arrayList7;
                } else if ("text_drawable_metadata_list".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList8 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C1123355k parseFromJson7 = AbstractC1123255j.parseFromJson(c16l);
                            if (parseFromJson7 != null) {
                                arrayList8.add(parseFromJson7);
                            }
                        }
                    }
                    c187028Qv.A0H = arrayList8;
                } else if ("story_captions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList9 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C55m parseFromJson8 = AbstractC1123455l.parseFromJson(c16l);
                            if (parseFromJson8 != null) {
                                arrayList9.add(parseFromJson8);
                            }
                        }
                    }
                    c187028Qv.A0G = arrayList9;
                } else if ("timed_sticker_drawable_metadata_list".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList10 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C5QG parseFromJson9 = C5QF.parseFromJson(c16l);
                            if (parseFromJson9 != null) {
                                arrayList10.add(parseFromJson9);
                            }
                        }
                    }
                    c187028Qv.A0J = arrayList10;
                } else if ("view_mode".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c187028Qv.A08 = str2;
                } else if ("is_viewport_filled".equals(A0q)) {
                    c187028Qv.A0R = c16l.A0d();
                } else if ("has_strokes_marked_internal".equals(A0q)) {
                    c187028Qv.A0O = c16l.A0d();
                } else if ("is_from_stories_remix_mode".equals(A0q)) {
                    c187028Qv.A0P = c16l.A0d();
                } else if ("target_view_size_provider_width".equals(A0q)) {
                    c187028Qv.A01 = c16l.A1D();
                } else if ("target_view_size_provider_height".equals(A0q)) {
                    c187028Qv.A00 = c16l.A1D();
                } else if ("gen_ai_detection_method".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c187028Qv.A04 = AbstractC85933sM.A00(str);
                }
                c16l.A0z();
            }
            c187028Qv.A0M = AbstractC09440dt.A01(new C187038Qw(c187028Qv));
            c187028Qv.A0L = AbstractC09440dt.A01(new C187048Qx(c187028Qv));
            return c187028Qv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C187028Qv c187028Qv) {
        anonymousClass182.A0d();
        if (c187028Qv.A0D != null) {
            C16V.A03(anonymousClass182, "reel_ctas");
            for (ReelCTA reelCTA : c187028Qv.A0D) {
                if (reelCTA != null) {
                    C40D.A00(anonymousClass182, reelCTA);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c187028Qv.A06 != null) {
            anonymousClass182.A0r("captions");
            C8PM c8pm = c187028Qv.A06;
            anonymousClass182.A0d();
            if (c8pm.A00 != null) {
                C16V.A03(anonymousClass182, "captions");
                for (String str : c8pm.A00) {
                    if (str != null) {
                        anonymousClass182.A0u(str);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        if (c187028Qv.A02 != null) {
            anonymousClass182.A0r("media_gating_info");
            AbstractC41243INj.A00(anonymousClass182, c187028Qv.A02);
        }
        if (c187028Qv.A0A != null) {
            C16V.A03(anonymousClass182, "branded_content_tags");
            for (BrandedContentTag brandedContentTag : c187028Qv.A0A) {
                if (brandedContentTag != null) {
                    AbstractC54880OPb.A00(anonymousClass182, brandedContentTag);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c187028Qv.A03 != null) {
            anonymousClass182.A0r("branded_content_project_metadata");
            ONL.A00(anonymousClass182, c187028Qv.A03);
        }
        anonymousClass182.A0T("is_paid_partnership_label", c187028Qv.A0Q);
        anonymousClass182.A0T("create_pa_boost_post_access_token", c187028Qv.A0N);
        if (c187028Qv.A0C != null) {
            C16V.A03(anonymousClass182, "reel_assets");
            for (C5NG c5ng : c187028Qv.A0C) {
                if (c5ng != null) {
                    C5NF.A00(anonymousClass182, c5ng);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c187028Qv.A0E != null) {
            C16V.A03(anonymousClass182, "reel_interactives");
            for (C84823qW c84823qW : c187028Qv.A0E) {
                if (c84823qW != null) {
                    AbstractC1123155i.A00(anonymousClass182, c84823qW);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c187028Qv.A0F != null) {
            C16V.A03(anonymousClass182, "static_stickers");
            for (C84823qW c84823qW2 : c187028Qv.A0F) {
                if (c84823qW2 != null) {
                    AbstractC1123155i.A00(anonymousClass182, c84823qW2);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c187028Qv.A0B != null) {
            C16V.A03(anonymousClass182, "drawing_state_snapshot");
            for (C72792XnD c72792XnD : c187028Qv.A0B) {
                if (c72792XnD != null) {
                    AbstractC69987Vz6.A00(anonymousClass182, c72792XnD);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c187028Qv.A0I != null) {
            C16V.A03(anonymousClass182, "text_format_types");
            for (String str2 : c187028Qv.A0I) {
                if (str2 != null) {
                    anonymousClass182.A0u(str2);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c187028Qv.A0H != null) {
            C16V.A03(anonymousClass182, "text_drawable_metadata_list");
            for (C1123355k c1123355k : c187028Qv.A0H) {
                if (c1123355k != null) {
                    AbstractC1123255j.A00(anonymousClass182, c1123355k);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c187028Qv.A0G != null) {
            C16V.A03(anonymousClass182, "story_captions");
            for (C55m c55m : c187028Qv.A0G) {
                if (c55m != null) {
                    AbstractC1123455l.A00(anonymousClass182, c55m);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c187028Qv.A0J != null) {
            C16V.A03(anonymousClass182, "timed_sticker_drawable_metadata_list");
            for (C5QG c5qg : c187028Qv.A0J) {
                if (c5qg != null) {
                    C5QF.A00(anonymousClass182, c5qg);
                }
            }
            anonymousClass182.A0Z();
        }
        String str3 = c187028Qv.A08;
        if (str3 != null) {
            anonymousClass182.A0S("view_mode", str3);
        }
        anonymousClass182.A0T("is_viewport_filled", c187028Qv.A0R);
        anonymousClass182.A0T("has_strokes_marked_internal", c187028Qv.A0O);
        anonymousClass182.A0T("is_from_stories_remix_mode", c187028Qv.A0P);
        anonymousClass182.A0Q("target_view_size_provider_width", c187028Qv.A01);
        anonymousClass182.A0Q("target_view_size_provider_height", c187028Qv.A00);
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = c187028Qv.A04;
        if (mediaGenAIDetectionMethod != null) {
            anonymousClass182.A0S("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        anonymousClass182.A0a();
    }
}
