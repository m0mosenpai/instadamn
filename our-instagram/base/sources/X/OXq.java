package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes9.dex */
public abstract class OXq {
    public static C51685MsG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51685MsG c51685MsG = new C51685MsG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1a(A0s)) {
                    c51685MsG.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("price_amount".equals(A0s)) {
                    c51685MsG.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("price_currency".equals(A0s)) {
                    c51685MsG.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("product_variants".equals(A0s)) {
                    c51685MsG.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("action".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                    c51685MsG.A01 = C05F.A0N;
                } else if ("formatted_price".equals(A0s)) {
                    c51685MsG.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("inventory_quantity".equals(A0s)) {
                    c51685MsG.A00 = c16l.A1D();
                } else if ("is_bip_order".equals(A0s)) {
                    c51685MsG.A07 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c51685MsG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static String A00(C51685MsG c51685MsG) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0O2 = MSW.A0O(A0O);
        A01(A0O2, c51685MsG);
        return MSX.A0e(A0O2, A0O);
    }

    public static void A01(AnonymousClass182 anonymousClass182, C51685MsG c51685MsG) {
        String str;
        anonymousClass182.A0d();
        String str2 = c51685MsG.A05;
        if (str2 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str2);
        }
        Integer num = c51685MsG.A02;
        if (num != null) {
            anonymousClass182.A0Q("price_amount", num.intValue());
        }
        String str3 = c51685MsG.A03;
        if (str3 != null) {
            anonymousClass182.A0S("price_currency", str3);
        }
        String str4 = c51685MsG.A06;
        if (str4 != null) {
            anonymousClass182.A0S("product_variants", str4);
        }
        Integer num2 = c51685MsG.A01;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str = "update";
                    break;
                case 2:
                    str = "delete";
                    break;
                case 3:
                    str = "";
                    break;
                default:
                    str = "create";
                    break;
            }
            anonymousClass182.A0S("action", str);
        }
        String str5 = c51685MsG.A04;
        if (str5 != null) {
            anonymousClass182.A0S("formatted_price", str5);
        }
        anonymousClass182.A0Q("inventory_quantity", c51685MsG.A00);
        anonymousClass182.A0T("is_bip_order", c51685MsG.A07);
        anonymousClass182.A0a();
    }
}
