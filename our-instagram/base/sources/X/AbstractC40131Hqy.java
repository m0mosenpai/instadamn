package X;

import com.instagram.api.schemas.OverlayAdTapDestinationEnum;
import com.instagram.api.schemas.OverlayAdsFormatEnum;
import java.io.IOException;

/* renamed from: X.Hqy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40131Hqy {
    public static C5G3 parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Integer num = null;
            H4R h4r = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str = null;
            OverlayAdsFormatEnum overlayAdsFormatEnum = null;
            Integer num2 = null;
            String str2 = null;
            OverlayAdTapDestinationEnum overlayAdTapDestinationEnum = null;
            Integer num3 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            H4R h4r2 = null;
            Integer num4 = null;
            Integer num5 = null;
            H4R h4r3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("apply_blur".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("apply_full_bleed_thumbnail".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("apply_partial_width".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("apply_vertical_safezone".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("delay_time_ms".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("description_text_style".equals(A0s)) {
                    h4r = AbstractC41264IOf.parseFromJson(c16l);
                } else if ("enable_long_press".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("enable_swipe_left_to_dismiss".equals(A0s)) {
                    bool6 = AbstractC166997dE.A0d(c16l);
                } else if ("end_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("format".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    overlayAdsFormatEnum = (OverlayAdsFormatEnum) OverlayAdsFormatEnum.A01.get(A1P2);
                    if (overlayAdsFormatEnum == null) {
                        overlayAdsFormatEnum = OverlayAdsFormatEnum.A07;
                    }
                } else if ("highlight_time_ms".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("initial_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("overlay_ad_tap_destination".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    overlayAdTapDestinationEnum = (OverlayAdTapDestinationEnum) OverlayAdTapDestinationEnum.A01.get(A1P);
                    if (overlayAdTapDestinationEnum == null) {
                        overlayAdTapDestinationEnum = OverlayAdTapDestinationEnum.A06;
                    }
                } else if ("overlay_ads_height".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("should_discard_overlay_ads".equals(A0s)) {
                    bool7 = AbstractC166997dE.A0d(c16l);
                } else if ("show_border".equals(A0s)) {
                    bool8 = AbstractC166997dE.A0d(c16l);
                } else if ("show_dismiss_button".equals(A0s)) {
                    bool9 = AbstractC166997dE.A0d(c16l);
                } else if ("show_tap_feedback".equals(A0s)) {
                    bool10 = AbstractC166997dE.A0d(c16l);
                } else if ("sponsored_text_style".equals(A0s)) {
                    h4r2 = AbstractC41264IOf.parseFromJson(c16l);
                } else if ("text_spacing".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("thumbnail_size".equals(A0s)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if ("title_text_style".equals(A0s)) {
                    h4r3 = AbstractC41264IOf.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C5G3(overlayAdTapDestinationEnum, overlayAdsFormatEnum, h4r, h4r2, h4r3, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, num, num2, num3, num4, num5, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
