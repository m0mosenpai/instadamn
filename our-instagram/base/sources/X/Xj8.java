package X;

import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class Xj8 {
    public static Map A00(YQS yqs) {
        String str;
        String str2;
        String str3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str4 = null;
        if (yqs.Af5() != null) {
            IGAdsCardBackgroundTypeEnum Af5 = yqs.Af5();
            if (Af5 != null) {
                str3 = Af5.A00;
            } else {
                str3 = null;
            }
            A1I.put("background_type", str3);
        }
        if (yqs.Ank() != null) {
            IGAdsCardStickerClickAreaEnum Ank = yqs.Ank();
            if (Ank != null) {
                str2 = Ank.A00;
            } else {
                str2 = null;
            }
            A1I.put("click_area", str2);
        }
        if (yqs.ArM() != null) {
            A1I.put("context_headline", yqs.ArM());
        }
        if (yqs.Atf() != null) {
            A1I.put("cta_highlight_dwell_time_duration_ms", yqs.Atf());
        }
        if (yqs.Atq() != null) {
            IGAdsCardStickerCTATypeEnum Atq = yqs.Atq();
            if (Atq != null) {
                str = Atq.A00;
            } else {
                str = null;
            }
            A1I.put("cta_type", str);
        }
        if (yqs.B04() != null) {
            A1I.put("dynamic_tooltip_time_duration_ms", yqs.B04());
        }
        if (yqs.Bvj() != null) {
            A1I.put("should_show_SUG", yqs.Bvj());
        }
        if (yqs.Bve() != null) {
            A1I.put("should_show_revamp_sticker_design", yqs.Bve());
        }
        if (yqs.C0b() != null) {
            A1I.put("sticker_icon_url", yqs.C0b());
        }
        if (yqs.C0f() != null) {
            IGAdsCardStickerSizeEnum C0f = yqs.C0f();
            if (C0f != null) {
                str4 = C0f.A00;
            }
            A1I.put("sticker_size", str4);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
