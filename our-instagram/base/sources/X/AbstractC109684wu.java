package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.List;

/* renamed from: X.4wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109684wu {
    public static C109834xB parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGLiveBadgeSettings iGLiveBadgeSettings = null;
            Integer num = null;
            Boolean bool = null;
            C109804x7 c109804x7 = null;
            LiveUserPaySupportTier liveUserPaySupportTier = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("badge_setting".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    iGLiveBadgeSettings = AbstractC109824x9.A00(A1P2);
                } else if ("badges_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("max_amount_reached".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("pay_config".equals(A0q)) {
                    c109804x7 = AbstractC109694wv.parseFromJson(c16l);
                } else if ("viewer_support_tier".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    liveUserPaySupportTier = AbstractC109714wx.A00(A1P);
                }
                c16l.A0z();
            }
            return new C109834xB(iGLiveBadgeSettings, liveUserPaySupportTier, c109804x7, bool, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109834xB c109834xB) {
        anonymousClass182.A0d();
        IGLiveBadgeSettings iGLiveBadgeSettings = c109834xB.A00;
        if (iGLiveBadgeSettings != null) {
            anonymousClass182.A0S("badge_setting", iGLiveBadgeSettings.A00);
        }
        Integer num = c109834xB.A04;
        if (num != null) {
            anonymousClass182.A0Q("badges_count", num.intValue());
        }
        Boolean bool = c109834xB.A03;
        if (bool != null) {
            anonymousClass182.A0T("max_amount_reached", bool.booleanValue());
        }
        C109804x7 c109804x7 = c109834xB.A02;
        if (c109804x7 != null) {
            anonymousClass182.A0r("pay_config");
            anonymousClass182.A0d();
            C109784x5 c109784x5 = c109804x7.A03;
            if (c109784x5 != null) {
                anonymousClass182.A0r("consumption_sheet_config");
                anonymousClass182.A0d();
                String str = c109784x5.A00;
                if (str != null) {
                    anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str);
                }
                String str2 = c109784x5.A01;
                if (str2 != null) {
                    anonymousClass182.A0S("privacy_disclaimer", str2);
                }
                String str3 = c109784x5.A02;
                if (str3 != null) {
                    anonymousClass182.A0S("privacy_disclaimer_link", str3);
                }
                String str4 = c109784x5.A03;
                if (str4 != null) {
                    anonymousClass182.A0S("privacy_disclaimer_link_text", str4);
                }
                String str5 = c109784x5.A04;
                if (str5 != null) {
                    anonymousClass182.A0S(DialogModule.KEY_TITLE, str5);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0R("digital_non_consumable_product_id", c109804x7.A00);
            anonymousClass182.A0R("digital_product_id", c109804x7.A01);
            anonymousClass182.A0R("payee_id", c109804x7.A02);
            InterfaceC109764x3 interfaceC109764x3 = c109804x7.A04;
            if (interfaceC109764x3 != null) {
                anonymousClass182.A0r("pinned_row_config");
                C109754x2 Ew2 = interfaceC109764x3.Ew2();
                anonymousClass182.A0d();
                String str6 = Ew2.A00;
                if (str6 != null) {
                    anonymousClass182.A0S("button_title", str6);
                }
                String str7 = Ew2.A01;
                if (str7 != null) {
                    anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str7);
                }
                anonymousClass182.A0a();
            }
            List<C109724wz> list = c109804x7.A05;
            if (list != null) {
                C16V.A03(anonymousClass182, "tier_infos");
                for (C109724wz c109724wz : list) {
                    if (c109724wz != null) {
                        anonymousClass182.A0d();
                        anonymousClass182.A0R("digital_product_id", c109724wz.A00);
                        String str8 = c109724wz.A02;
                        if (str8 != null) {
                            anonymousClass182.A0S("sku", str8);
                        }
                        LiveUserPaySupportTier liveUserPaySupportTier = c109724wz.A01;
                        if (liveUserPaySupportTier != null) {
                            anonymousClass182.A0S("support_tier", liveUserPaySupportTier.A00);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        LiveUserPaySupportTier liveUserPaySupportTier2 = c109834xB.A01;
        if (liveUserPaySupportTier2 != null) {
            anonymousClass182.A0S("viewer_support_tier", liveUserPaySupportTier2.A00);
        }
        anonymousClass182.A0a();
    }
}
