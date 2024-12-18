package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3x6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88493x6 {
    public static String A00(C110204xp c110204xp) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A01(A0A, c110204xp);
        A0A.close();
        return stringWriter.toString();
    }

    public static C110204xp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C110094xe c110094xe = null;
            C110124xh c110124xh = null;
            Integer num = null;
            C38704H2p c38704H2p = null;
            ArrayList arrayList = null;
            Boolean bool = null;
            C38698H2j c38698H2j = null;
            C211809a7 c211809a7 = null;
            C110154xk c110154xk = null;
            ArrayList arrayList2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("attribution_info".equals(A0q)) {
                    c110094xe = AbstractC110084xd.parseFromJson(c16l);
                } else if ("effects_info".equals(A0q)) {
                    c110124xh = AbstractC110114xg.parseFromJson(c16l);
                } else if ("min_num_segments".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("reusable_media_assets_info".equals(A0q)) {
                    c38704H2p = AbstractC110194xo.parseFromJson(c16l);
                } else if ("segments_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C110064xb parseFromJson = AbstractC110054xa.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("should_hide_cta".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("smart_template_info".equals(A0q)) {
                    c38698H2j = AbstractC110174xm.parseFromJson(c16l);
                } else if ("template_clips_media_id".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("timed_stickers_info".equals(A0q)) {
                    c211809a7 = AbstractC110184xn.parseFromJson(c16l);
                } else if ("timed_texts_info".equals(A0q)) {
                    c110154xk = AbstractC110144xj.parseFromJson(c16l);
                } else if ("transition_effects_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C5J1 parseFromJson2 = C5J0.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("segments_info", "ClipsTemplateInfoImpl");
            } else if (l == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("template_clips_media_id", "ClipsTemplateInfoImpl");
            } else {
                return new C110204xp(c38698H2j, c110094xe, c110124xh, c38704H2p, c211809a7, c110154xk, bool, num, arrayList, arrayList2, l.longValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A01(AnonymousClass182 anonymousClass182, C110204xp c110204xp) {
        anonymousClass182.A0d();
        C110094xe c110094xe = c110204xp.A02;
        if (c110094xe != null) {
            anonymousClass182.A0r("attribution_info");
            anonymousClass182.A0d();
            ImageInfo imageInfo = c110094xe.A00;
            if (imageInfo != null) {
                anonymousClass182.A0r("image_versions2");
                AbstractC39101rj.A00(anonymousClass182, imageInfo.F5B());
            }
            String str = c110094xe.A01;
            if (str != null) {
                anonymousClass182.A0S("owner_username", str);
            }
            String str2 = c110094xe.A02;
            if (str2 != null) {
                anonymousClass182.A0S("template_media_id", str2);
            }
            anonymousClass182.A0a();
        }
        C110124xh c110124xh = c110204xp.A03;
        if (c110124xh != null) {
            anonymousClass182.A0r("effects_info");
            anonymousClass182.A0d();
            Long l = c110124xh.A00;
            if (l != null) {
                anonymousClass182.A0R("overall_effect_id", l.longValue());
            }
            List<C38703H2o> list = c110124xh.A01;
            if (list != null) {
                C16V.A03(anonymousClass182, "segment_effects_info");
                for (C38703H2o c38703H2o : list) {
                    if (c38703H2o != null) {
                        anonymousClass182.A0d();
                        anonymousClass182.A0R("effect_id", c38703H2o.A01);
                        anonymousClass182.A0Q("segment_index", c38703H2o.A00);
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        Integer num = c110204xp.A08;
        if (num != null) {
            anonymousClass182.A0Q("min_num_segments", num.intValue());
        }
        C38704H2p c38704H2p = c110204xp.A04;
        if (c38704H2p != null) {
            anonymousClass182.A0r("reusable_media_assets_info");
            anonymousClass182.A0d();
            List<VideoVersion> list2 = c38704H2p.A00;
            if (list2 != null) {
                C16V.A03(anonymousClass182, "video_versions");
                for (VideoVersion videoVersion : list2) {
                    if (videoVersion != null) {
                        AbstractC40001tP.A00(anonymousClass182, videoVersion);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        List<InterfaceC110074xc> list3 = c110204xp.A09;
        if (list3 != null) {
            C16V.A03(anonymousClass182, "segments_info");
            for (InterfaceC110074xc interfaceC110074xc : list3) {
                if (interfaceC110074xc != null) {
                    C110064xb EsD = interfaceC110074xc.EsD();
                    anonymousClass182.A0d();
                    anonymousClass182.A0R("duration_in_ms", EsD.A00);
                    Integer num2 = EsD.A01;
                    if (num2 != null) {
                        anonymousClass182.A0Q("reusable_template_media_asset_end_time_ms", num2.intValue());
                    }
                    Integer num3 = EsD.A02;
                    if (num3 != null) {
                        anonymousClass182.A0Q("reusable_template_media_asset_start_time_ms", num3.intValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool = c110204xp.A07;
        if (bool != null) {
            anonymousClass182.A0T("should_hide_cta", bool.booleanValue());
        }
        C38698H2j c38698H2j = c110204xp.A01;
        if (c38698H2j != null) {
            anonymousClass182.A0r("smart_template_info");
            anonymousClass182.A0d();
            String str3 = c38698H2j.A00;
            if (str3 != null) {
                anonymousClass182.A0S("effect_id", str3);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0R("template_clips_media_id", c110204xp.A00);
        JK2 jk2 = c110204xp.A05;
        if (jk2 != null) {
            anonymousClass182.A0r("timed_stickers_info");
            C211809a7 F4M = jk2.F4M();
            anonymousClass182.A0d();
            List<BE5> list4 = F4M.A00;
            if (list4 != null) {
                C16V.A03(anonymousClass182, "sticker_info_list");
                for (BE5 be5 : list4) {
                    if (be5 != null) {
                        C211749Zz Es9 = be5.Es9();
                        anonymousClass182.A0d();
                        anonymousClass182.A0P("end_time_ms", Es9.A00);
                        anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, Es9.A01);
                        anonymousClass182.A0P("offset_x", Es9.A02);
                        anonymousClass182.A0P("offset_y", Es9.A03);
                        anonymousClass182.A0P("rotation_degree", Es9.A04);
                        anonymousClass182.A0P("scale", Es9.A05);
                        anonymousClass182.A0P("start_time_ms", Es9.A06);
                        String str4 = Es9.A0A;
                        if (str4 != null) {
                            anonymousClass182.A0S("sticker_id", str4);
                        }
                        ClipsTemplatesStickerType clipsTemplatesStickerType = Es9.A09;
                        if (clipsTemplatesStickerType != null) {
                            anonymousClass182.A0S("sticker_type", clipsTemplatesStickerType.A00);
                        }
                        anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, Es9.A07);
                        anonymousClass182.A0Q("z_index", Es9.A08);
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        C110154xk c110154xk = c110204xp.A06;
        if (c110154xk != null) {
            anonymousClass182.A0r("timed_texts_info");
            anonymousClass182.A0d();
            List<C93094Fl> list5 = c110154xk.A00;
            if (list5 != null) {
                C16V.A03(anonymousClass182, "text_info_list");
                for (C93094Fl c93094Fl : list5) {
                    if (c93094Fl != null) {
                        AbstractC93044Fd.A00(anonymousClass182, c93094Fl);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        List<C5J2> list6 = c110204xp.A0A;
        if (list6 != null) {
            C16V.A03(anonymousClass182, "transition_effects_info");
            for (C5J2 c5j2 : list6) {
                if (c5j2 != null) {
                    C5J1 EsE = c5j2.EsE();
                    anonymousClass182.A0d();
                    anonymousClass182.A0R("duration_in_ms", EsE.A00);
                    Integer num4 = EsE.A02;
                    if (num4 != null) {
                        anonymousClass182.A0Q("index", num4.intValue());
                    }
                    String str5 = EsE.A03;
                    if (str5 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str5);
                    }
                    anonymousClass182.A0R("start_time_in_ms", EsE.A01);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
