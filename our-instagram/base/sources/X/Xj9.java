package X;

import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import java.io.IOException;

/* loaded from: classes12.dex */
public abstract class Xj9 {
    public static XVZ parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum = null;
            IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum = null;
            String str = null;
            Integer num = null;
            IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = null;
            Integer num2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str2 = null;
            IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("background_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    iGAdsCardBackgroundTypeEnum = (IGAdsCardBackgroundTypeEnum) IGAdsCardBackgroundTypeEnum.A01.get(A1P4);
                    if (iGAdsCardBackgroundTypeEnum == null) {
                        iGAdsCardBackgroundTypeEnum = IGAdsCardBackgroundTypeEnum.A07;
                    }
                } else if ("click_area".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    iGAdsCardStickerClickAreaEnum = (IGAdsCardStickerClickAreaEnum) IGAdsCardStickerClickAreaEnum.A01.get(A1P3);
                    if (iGAdsCardStickerClickAreaEnum == null) {
                        iGAdsCardStickerClickAreaEnum = IGAdsCardStickerClickAreaEnum.A05;
                    }
                } else if ("context_headline".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("cta_highlight_dwell_time_duration_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("cta_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    iGAdsCardStickerCTATypeEnum = (IGAdsCardStickerCTATypeEnum) IGAdsCardStickerCTATypeEnum.A01.get(A1P2);
                    if (iGAdsCardStickerCTATypeEnum == null) {
                        iGAdsCardStickerCTATypeEnum = IGAdsCardStickerCTATypeEnum.A08;
                    }
                } else if ("dynamic_tooltip_time_duration_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("should_show_SUG".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("should_show_revamp_sticker_design".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("sticker_icon_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("sticker_size".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGAdsCardStickerSizeEnum = (IGAdsCardStickerSizeEnum) IGAdsCardStickerSizeEnum.A01.get(A1P);
                    if (iGAdsCardStickerSizeEnum == null) {
                        iGAdsCardStickerSizeEnum = IGAdsCardStickerSizeEnum.A06;
                    }
                }
                c16l.A0z();
            }
            return new XVZ(iGAdsCardBackgroundTypeEnum, iGAdsCardStickerCTATypeEnum, iGAdsCardStickerClickAreaEnum, iGAdsCardStickerSizeEnum, bool, bool2, num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
