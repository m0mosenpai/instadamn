package X;

import com.instagram.api.schemas.OverlayAdsTextStyleEnum;
import java.io.IOException;

/* renamed from: X.IOf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41264IOf {
    public static H4R parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            OverlayAdsTextStyleEnum overlayAdsTextStyleEnum = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("size".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    overlayAdsTextStyleEnum = (OverlayAdsTextStyleEnum) OverlayAdsTextStyleEnum.A01.get(A1P);
                    if (overlayAdsTextStyleEnum == null) {
                        overlayAdsTextStyleEnum = OverlayAdsTextStyleEnum.A05;
                    }
                }
                c16l.A0z();
            }
            return new H4R(overlayAdsTextStyleEnum, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H4R h4r) {
        anonymousClass182.A0d();
        String str = h4r.A02;
        if (str != null) {
            anonymousClass182.A0S("color", str);
        }
        Integer num = h4r.A01;
        if (num != null) {
            anonymousClass182.A0Q("size", num.intValue());
        }
        OverlayAdsTextStyleEnum overlayAdsTextStyleEnum = h4r.A00;
        if (overlayAdsTextStyleEnum != null) {
            anonymousClass182.A0S("style", overlayAdsTextStyleEnum.A00);
        }
        anonymousClass182.A0a();
    }
}
