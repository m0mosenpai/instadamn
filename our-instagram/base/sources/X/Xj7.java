package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import com.instagram.api.schemas.IGAdsGenericCardFormatEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.api.schemas.IGAdsStickerCardRevampTypographyHierarchyEnum;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class Xj7 {
    public static Map A00(InterfaceC105354oy interfaceC105354oy) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str7 = null;
        if (interfaceC105354oy.Af5() != null) {
            IGAdsCardBackgroundTypeEnum Af5 = interfaceC105354oy.Af5();
            if (Af5 != null) {
                str6 = Af5.A00;
            } else {
                str6 = null;
            }
            A1I.put("background_type", str6);
        }
        if (interfaceC105354oy.Ank() != null) {
            IGAdsCardStickerClickAreaEnum Ank = interfaceC105354oy.Ank();
            if (Ank != null) {
                str5 = Ank.A00;
            } else {
                str5 = null;
            }
            A1I.put("click_area", str5);
        }
        if (interfaceC105354oy.Atf() != null) {
            A1I.put("cta_highlight_dwell_time_duration_ms", interfaceC105354oy.Atf());
        }
        if (interfaceC105354oy.Atq() != null) {
            IGAdsCardStickerCTATypeEnum Atq = interfaceC105354oy.Atq();
            if (Atq != null) {
                str4 = Atq.A00;
            } else {
                str4 = null;
            }
            A1I.put("cta_type", str4);
        }
        if (interfaceC105354oy.B04() != null) {
            A1I.put("dynamic_tooltip_time_duration_ms", interfaceC105354oy.B04());
        }
        if (interfaceC105354oy.B84() != null) {
            IGAdsGenericCardFormatEnum B84 = interfaceC105354oy.B84();
            if (B84 != null) {
                str3 = B84.A00;
            } else {
                str3 = null;
            }
            A1I.put(AbstractC111324zv.A00(2400), str3);
        }
        if (interfaceC105354oy.BDM() != null) {
            A1I.put("headline", interfaceC105354oy.BDM());
        }
        if (interfaceC105354oy.BHZ() != null) {
            IGAdsGenericCardInfoTypeEnum BHZ = interfaceC105354oy.BHZ();
            if (BHZ != null) {
                str2 = BHZ.A00;
            } else {
                str2 = null;
            }
            A1I.put("info_type", str2);
        }
        if (interfaceC105354oy.BHb() != null) {
            List<IGAdsGenericCardInfoTypeEnum> BHb = interfaceC105354oy.BHb();
            if (BHb != null) {
                arrayList = AbstractC167017dG.A0q(BHb);
                for (IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum : BHb) {
                    C14360o3.A0B(iGAdsGenericCardInfoTypeEnum, 0);
                    arrayList.add(iGAdsGenericCardInfoTypeEnum.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put("info_types", arrayList);
        }
        if (interfaceC105354oy.BKK() != null) {
            A1I.put(AbstractC111324zv.A00(2647), interfaceC105354oy.BKK());
        }
        if (interfaceC105354oy.BYE() != null) {
            A1I.put("number_of_followers", interfaceC105354oy.BYE());
        }
        if (interfaceC105354oy.Bbs() != null) {
            A1I.put("payment_options", interfaceC105354oy.Bbs());
        }
        if (interfaceC105354oy.BgB() != null) {
            A1I.put("price_range", interfaceC105354oy.BgB());
        }
        if (interfaceC105354oy.Bp2() != null) {
            A1I.put(AbstractC111324zv.A00(5235), interfaceC105354oy.Bp2());
        }
        if (interfaceC105354oy.Bpm() != null) {
            InterfaceC105374p1 Bpm = interfaceC105354oy.Bpm();
            if (Bpm != null) {
                treeUpdaterJNI = Bpm.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("rr_info", treeUpdaterJNI);
        }
        if (interfaceC105354oy.Bud() != null) {
            A1I.put(AbstractC111324zv.A00(5323), interfaceC105354oy.Bud());
        }
        if (interfaceC105354oy.Bur() != null) {
            A1I.put("short_caption", interfaceC105354oy.Bur());
        }
        if (interfaceC105354oy.Bvj() != null) {
            A1I.put("should_show_SUG", interfaceC105354oy.Bvj());
        }
        if (interfaceC105354oy.Bve() != null) {
            A1I.put("should_show_revamp_sticker_design", interfaceC105354oy.Bve());
        }
        if (interfaceC105354oy.Bvm() != null) {
            A1I.put("should_show_url_in_tooltip", interfaceC105354oy.Bvm());
        }
        if (interfaceC105354oy.C0f() != null) {
            IGAdsCardStickerSizeEnum C0f = interfaceC105354oy.C0f();
            if (C0f != null) {
                str = C0f.A00;
            } else {
                str = null;
            }
            A1I.put("sticker_size", str);
        }
        if (interfaceC105354oy.CC2() != null) {
            IGAdsStickerCardRevampTypographyHierarchyEnum CC2 = interfaceC105354oy.CC2();
            if (CC2 != null) {
                str7 = CC2.A00;
            }
            A1I.put("typography_hierarchy_type", str7);
        }
        if (interfaceC105354oy.CHS() != null) {
            A1I.put("website_name", interfaceC105354oy.CHS());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
