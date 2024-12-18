package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.3po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84453po {
    public static C84463pp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l2 = null;
            Boolean bool = null;
            Long l3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("inventory_quantity".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("is_bip_order".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("price_amount".equals(A0q)) {
                    l3 = Long.valueOf(c16l.A0y());
                } else if ("price_currency".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("product_variants".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "IGBioProductDict");
            } else if (l2 != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_bip_order", "IGBioProductDict");
                } else if (l3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("price_amount", "IGBioProductDict");
                } else if (str == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("price_currency", "IGBioProductDict");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("product_variants", "IGBioProductDict");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(DialogModule.KEY_TITLE, "IGBioProductDict");
                } else {
                    return new C84463pp(str, str2, str3, l.longValue(), l2.longValue(), l3.longValue(), bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("inventory_quantity", "IGBioProductDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C84463pp c84463pp) {
        anonymousClass182.A0d();
        anonymousClass182.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c84463pp.A00);
        anonymousClass182.A0R("inventory_quantity", c84463pp.A01);
        anonymousClass182.A0T("is_bip_order", c84463pp.A06);
        anonymousClass182.A0R("price_amount", c84463pp.A02);
        String str = c84463pp.A03;
        if (str != null) {
            anonymousClass182.A0S("price_currency", str);
        }
        String str2 = c84463pp.A04;
        if (str2 != null) {
            anonymousClass182.A0S("product_variants", str2);
        }
        String str3 = c84463pp.A05;
        if (str3 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str3);
        }
        anonymousClass182.A0a();
    }
}
