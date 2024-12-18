package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Ibu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41662Ibu {
    public static final void A00(Context context, UserSession userSession, String str) {
        AbstractC167017dG.A1N(context, userSession);
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36310890471162214L)) {
            AbstractC191798eb.A04(context, new C191778eZ(userSession), "com.bloks.www.bloks.commerce.shoppingcart", AbstractC167017dG.A0r("_PRELOAD_ID_KEY_", "GlobalCart"), I7M.A00(userSession).longValue());
        }
        if (str != null) {
            AbstractC37300Gc1.A0G(userSession).A09(str);
            if (C18U.A06(c06090Tz, userSession, 36310890471162214L)) {
                if (C18U.A06(C06090Tz.A05, userSession, 36310890471752045L)) {
                    HashMap A0r = AbstractC167017dG.A0r("params", AnonymousClass001.A0g("{\"client_input_params\":{\"merchant-id\":", str, "},\"server_params\":{\"prefetch_view_only\":1}}"));
                    long longValue = I7M.A00(userSession).longValue();
                    AbstractC191798eb.A03(context, new C191778eZ(userSession), "com.bloks.www.bloks.commerce.shoppingcart.merchantview", AnonymousClass001.A0R("MerchantCart_", str), A0r, longValue);
                    return;
                }
                C1563470e A0G = AbstractC37300Gc1.A0G(userSession);
                C14360o3.A07(A0G);
                AbstractC191798eb.A04(context, new C191778eZ(userSession), "com.bloks.www.bloks.commerce.shoppingcart.merchantview", AbstractC06930Yk.A02(AbstractC25229BEm.A1b("_PRELOAD_ID_KEY_", AnonymousClass001.A0R("MerchantCart_", str), AbstractC166987dD.A1L("shopping_cart_id", A0G.A09(str)))), I7M.A00(userSession).longValue());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r3.equals("bottom_sheet_pdp") != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r3.equals(r0) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L2a
            int r1 = r3.hashCode()
            r0 = -1885092824(0xffffffff8fa3c428, float:-1.6148598E-29)
            if (r1 == r0) goto L1f
            r0 = -799490724(0xffffffffd058bd5c, float:-1.4545154E10)
            if (r1 == r0) goto L22
            r0 = 2121699592(0x7e769108, float:8.1935783E37)
            if (r1 != r0) goto L2a
            java.lang.String r0 = "bottom_sheet_pdp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2a
        L1e:
            return r2
        L1f:
            java.lang.String r0 = "live_viewer_product_feed"
            goto L24
        L22:
            java.lang.String r0 = "igtv_viewer_product_feed"
        L24:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1e
        L2a:
            java.lang.String r0 = "igtv_product_feed"
            boolean r0 = X.C14360o3.A0K(r4, r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "live_product_feed"
            boolean r0 = X.C14360o3.A0K(r4, r0)
            if (r0 != 0) goto L1e
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41662Ibu.A02(java.lang.String, java.lang.String):boolean");
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        if (C18U.A06(C06090Tz.A05, userSession, 36310890471620972L)) {
            HashMap hashMap = null;
            if (str2 != null) {
                hashMap = AbstractC166987dD.A1G();
                hashMap.put("merchant_id", str2);
            }
            C62862tP A04 = C62862tP.A04(fragmentActivity, AbstractC31171DnF.A0D(str), userSession);
            C1GL c1gl = A04.A07;
            AbstractC192798gL A05 = C192108fB.A05(userSession, "com.bloks.www.bloks.commerce.cart.first.pivot.data.async", hashMap);
            A05.A00(new C32392EOt(A04, 14));
            c1gl.schedule(A05);
        }
    }
}
