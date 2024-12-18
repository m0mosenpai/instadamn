package X;

import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import com.instagram.api.schemas.IGAdsGenericCardFormatEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.api.schemas.IGAdsRrFormatEnum;
import com.instagram.api.schemas.IGAdsStickerCardRevampTypographyHierarchyEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4oq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105334oq {
    public static C105344ox parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        String A1P7;
        String A1P8;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum = null;
            IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum = null;
            Integer num = null;
            IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = null;
            Integer num2 = null;
            IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum = null;
            String str = null;
            IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum = null;
            ArrayList arrayList = null;
            String str2 = null;
            Integer num3 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            C105364p0 c105364p0 = null;
            String str6 = null;
            String str7 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum = null;
            IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum = null;
            String str8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("background_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P8 = null;
                    } else {
                        A1P8 = c16l.A1P();
                    }
                    iGAdsCardBackgroundTypeEnum = (IGAdsCardBackgroundTypeEnum) IGAdsCardBackgroundTypeEnum.A01.get(A1P8);
                    if (iGAdsCardBackgroundTypeEnum == null) {
                        iGAdsCardBackgroundTypeEnum = IGAdsCardBackgroundTypeEnum.A07;
                    }
                } else if ("click_area".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P7 = null;
                    } else {
                        A1P7 = c16l.A1P();
                    }
                    iGAdsCardStickerClickAreaEnum = (IGAdsCardStickerClickAreaEnum) IGAdsCardStickerClickAreaEnum.A01.get(A1P7);
                    if (iGAdsCardStickerClickAreaEnum == null) {
                        iGAdsCardStickerClickAreaEnum = IGAdsCardStickerClickAreaEnum.A05;
                    }
                } else if ("cta_highlight_dwell_time_duration_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("cta_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P6 = null;
                    } else {
                        A1P6 = c16l.A1P();
                    }
                    iGAdsCardStickerCTATypeEnum = (IGAdsCardStickerCTATypeEnum) IGAdsCardStickerCTATypeEnum.A01.get(A1P6);
                    if (iGAdsCardStickerCTATypeEnum == null) {
                        iGAdsCardStickerCTATypeEnum = IGAdsCardStickerCTATypeEnum.A08;
                    }
                } else if ("dynamic_tooltip_time_duration_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("format_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P5 = null;
                    } else {
                        A1P5 = c16l.A1P();
                    }
                    iGAdsGenericCardFormatEnum = (IGAdsGenericCardFormatEnum) IGAdsGenericCardFormatEnum.A01.get(A1P5);
                    if (iGAdsGenericCardFormatEnum == null) {
                        iGAdsGenericCardFormatEnum = IGAdsGenericCardFormatEnum.A04;
                    }
                } else if ("headline".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("info_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    iGAdsGenericCardInfoTypeEnum = (IGAdsGenericCardInfoTypeEnum) IGAdsGenericCardInfoTypeEnum.A01.get(A1P4);
                    if (iGAdsGenericCardInfoTypeEnum == null) {
                        iGAdsGenericCardInfoTypeEnum = IGAdsGenericCardInfoTypeEnum.A0D;
                    }
                } else if ("info_types".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P3 = null;
                            } else {
                                A1P3 = c16l.A1P();
                            }
                            IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum2 = (IGAdsGenericCardInfoTypeEnum) IGAdsGenericCardInfoTypeEnum.A01.get(A1P3);
                            if (iGAdsGenericCardInfoTypeEnum2 == null) {
                                iGAdsGenericCardInfoTypeEnum2 = IGAdsGenericCardInfoTypeEnum.A0D;
                            }
                            arrayList.add(iGAdsGenericCardInfoTypeEnum2);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("join_date_str".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("number_of_followers".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("payment_options".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("price_range".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("return_policy".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("rr_info".equals(A0q)) {
                    c105364p0 = AbstractC68548VVb.parseFromJson(c16l);
                } else if ("shipping_policy".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("short_caption".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("should_show_SUG".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("should_show_revamp_sticker_design".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("should_show_url_in_tooltip".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("sticker_size".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    iGAdsCardStickerSizeEnum = (IGAdsCardStickerSizeEnum) IGAdsCardStickerSizeEnum.A01.get(A1P2);
                    if (iGAdsCardStickerSizeEnum == null) {
                        iGAdsCardStickerSizeEnum = IGAdsCardStickerSizeEnum.A06;
                    }
                } else if ("typography_hierarchy_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGAdsStickerCardRevampTypographyHierarchyEnum = (IGAdsStickerCardRevampTypographyHierarchyEnum) IGAdsStickerCardRevampTypographyHierarchyEnum.A01.get(A1P);
                    if (iGAdsStickerCardRevampTypographyHierarchyEnum == null) {
                        iGAdsStickerCardRevampTypographyHierarchyEnum = IGAdsStickerCardRevampTypographyHierarchyEnum.A06;
                    }
                } else if ("website_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C105344ox(iGAdsCardBackgroundTypeEnum, iGAdsCardStickerCTATypeEnum, iGAdsCardStickerClickAreaEnum, iGAdsCardStickerSizeEnum, iGAdsGenericCardFormatEnum, iGAdsGenericCardInfoTypeEnum, iGAdsStickerCardRevampTypographyHierarchyEnum, c105364p0, bool, bool2, bool3, num, num2, num3, str, str2, str3, str4, str5, str6, str7, str8, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C105344ox c105344ox) {
        anonymousClass182.A0d();
        IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum = c105344ox.A00;
        if (iGAdsCardBackgroundTypeEnum != null) {
            anonymousClass182.A0S("background_type", iGAdsCardBackgroundTypeEnum.A00);
        }
        IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum = c105344ox.A02;
        if (iGAdsCardStickerClickAreaEnum != null) {
            anonymousClass182.A0S("click_area", iGAdsCardStickerClickAreaEnum.A00);
        }
        Integer num = c105344ox.A0B;
        if (num != null) {
            anonymousClass182.A0Q("cta_highlight_dwell_time_duration_ms", num.intValue());
        }
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = c105344ox.A01;
        if (iGAdsCardStickerCTATypeEnum != null) {
            anonymousClass182.A0S("cta_type", iGAdsCardStickerCTATypeEnum.A00);
        }
        Integer num2 = c105344ox.A0C;
        if (num2 != null) {
            anonymousClass182.A0Q("dynamic_tooltip_time_duration_ms", num2.intValue());
        }
        IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum = c105344ox.A04;
        if (iGAdsGenericCardFormatEnum != null) {
            anonymousClass182.A0S("format_type", iGAdsGenericCardFormatEnum.A00);
        }
        String str = c105344ox.A0E;
        if (str != null) {
            anonymousClass182.A0S("headline", str);
        }
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum = c105344ox.A05;
        if (iGAdsGenericCardInfoTypeEnum != null) {
            anonymousClass182.A0S("info_type", iGAdsGenericCardInfoTypeEnum.A00);
        }
        List<IGAdsGenericCardInfoTypeEnum> list = c105344ox.A0M;
        if (list != null) {
            C16V.A03(anonymousClass182, "info_types");
            for (IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum2 : list) {
                if (iGAdsGenericCardInfoTypeEnum2 != null) {
                    anonymousClass182.A0u(iGAdsGenericCardInfoTypeEnum2.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        String str2 = c105344ox.A0F;
        if (str2 != null) {
            anonymousClass182.A0S("join_date_str", str2);
        }
        Integer num3 = c105344ox.A0D;
        if (num3 != null) {
            anonymousClass182.A0Q("number_of_followers", num3.intValue());
        }
        String str3 = c105344ox.A0G;
        if (str3 != null) {
            anonymousClass182.A0S("payment_options", str3);
        }
        String str4 = c105344ox.A0H;
        if (str4 != null) {
            anonymousClass182.A0S("price_range", str4);
        }
        String str5 = c105344ox.A0I;
        if (str5 != null) {
            anonymousClass182.A0S("return_policy", str5);
        }
        C105364p0 c105364p0 = c105344ox.A07;
        if (c105364p0 != null) {
            anonymousClass182.A0r("rr_info");
            anonymousClass182.A0d();
            UQx uQx = c105364p0.A00;
            if (uQx != null) {
                anonymousClass182.A0r(AbstractC111324zv.A00(851));
                anonymousClass182.A0d();
                Float f = uQx.A00;
                if (f != null) {
                    anonymousClass182.A0P("avg_rating", f.floatValue());
                }
                Integer num4 = uQx.A02;
                if (num4 != null) {
                    anonymousClass182.A0Q("review_count", num4.intValue());
                }
                Float f2 = uQx.A01;
                if (f2 != null) {
                    anonymousClass182.A0P(AbstractC111324zv.A00(1241), f2.floatValue());
                }
                anonymousClass182.A0a();
            }
            C66644URi c66644URi = c105364p0.A02;
            if (c66644URi != null) {
                anonymousClass182.A0r(AbstractC111324zv.A00(1189));
                anonymousClass182.A0d();
                UQy uQy = c66644URi.A00;
                if (uQy != null) {
                    anonymousClass182.A0r(AbstractC111324zv.A00(872));
                    anonymousClass182.A0d();
                    String str6 = uQy.A01;
                    if (str6 != null) {
                        anonymousClass182.A0S("dimension", str6);
                    }
                    String str7 = uQy.A02;
                    if (str7 != null) {
                        anonymousClass182.A0S("rating_text", str7);
                    }
                    Integer num5 = uQy.A00;
                    if (num5 != null) {
                        anonymousClass182.A0Q(AbstractC111324zv.A00(1242), num5.intValue());
                    }
                    String str8 = uQy.A03;
                    if (str8 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(1243), str8);
                    }
                    anonymousClass182.A0a();
                }
                UQz uQz = c66644URi.A01;
                if (uQz != null) {
                    anonymousClass182.A0r(AbstractC111324zv.A00(1206));
                    anonymousClass182.A0d();
                    String str9 = uQz.A00;
                    if (str9 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(1207), str9);
                    }
                    String str10 = uQz.A01;
                    if (str10 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(1239), str10);
                    }
                    anonymousClass182.A0a();
                }
                UR0 ur0 = c66644URi.A02;
                if (ur0 != null) {
                    anonymousClass182.A0r(AbstractC111324zv.A00(1346));
                    anonymousClass182.A0d();
                    String str11 = ur0.A00;
                    if (str11 != null) {
                        anonymousClass182.A0S("rating_text", str11);
                    }
                    String str12 = ur0.A01;
                    if (str12 != null) {
                        anonymousClass182.A0S("topic_text", str12);
                    }
                    List<String> list2 = ur0.A02;
                    if (list2 != null) {
                        C16V.A03(anonymousClass182, "topics");
                        for (String str13 : list2) {
                            if (str13 != null) {
                                anonymousClass182.A0u(str13);
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0a();
            }
            IGAdsRrFormatEnum iGAdsRrFormatEnum = c105364p0.A01;
            if (iGAdsRrFormatEnum != null) {
                anonymousClass182.A0S("rr_format", iGAdsRrFormatEnum.A00);
            }
            anonymousClass182.A0a();
        }
        String str14 = c105344ox.A0J;
        if (str14 != null) {
            anonymousClass182.A0S("shipping_policy", str14);
        }
        String str15 = c105344ox.A0K;
        if (str15 != null) {
            anonymousClass182.A0S("short_caption", str15);
        }
        Boolean bool = c105344ox.A09;
        if (bool != null) {
            anonymousClass182.A0T("should_show_SUG", bool.booleanValue());
        }
        Boolean bool2 = c105344ox.A08;
        if (bool2 != null) {
            anonymousClass182.A0T("should_show_revamp_sticker_design", bool2.booleanValue());
        }
        Boolean bool3 = c105344ox.A0A;
        if (bool3 != null) {
            anonymousClass182.A0T("should_show_url_in_tooltip", bool3.booleanValue());
        }
        IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum = c105344ox.A03;
        if (iGAdsCardStickerSizeEnum != null) {
            anonymousClass182.A0S("sticker_size", iGAdsCardStickerSizeEnum.A00);
        }
        IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum = c105344ox.A06;
        if (iGAdsStickerCardRevampTypographyHierarchyEnum != null) {
            anonymousClass182.A0S("typography_hierarchy_type", iGAdsStickerCardRevampTypographyHierarchyEnum.A00);
        }
        String str16 = c105344ox.A0L;
        if (str16 != null) {
            anonymousClass182.A0S("website_name", str16);
        }
        anonymousClass182.A0a();
    }
}
