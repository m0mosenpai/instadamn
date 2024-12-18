package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import org.json.JSONObject;

/* renamed from: X.I6b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40799I6b {
    public static final void A00(Context context, AbstractC018607g abstractC018607g, UserSession userSession, JHO jho, Product product, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        AbstractC25233BEq.A0x(2, userSession, str, str2);
        JSONObject A04 = AnonymousClass566.A04(userSession);
        String str6 = product.A0H;
        if (z) {
            str5 = "ads/app/products/%s/hero_carousel_content/";
        } else {
            str5 = "commerce/products/%s/hero_carousel_content/";
        }
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0L(str5, str6);
        A0M.A9s("merchant_id", str2);
        A0M.A0H("permission_id", str4);
        A0M.A9s(AbstractC111324zv.A00(64), A04.toString());
        A0M.A9s("device_width", String.valueOf(AbstractC13880nE.A0A(context)));
        A0M.A0R(HAX.class, ISU.class);
        if (str.equals(str6)) {
            A0M.A0H("pinned_media_id", str3);
            A0M.A9s("should_show_all_catalogs_last", "true");
        }
        C1ON A0N = A0M.A0N();
        C39030HGg.A00(A0N, jho, 18);
        C1GJ.A00(context, abstractC018607g, A0N);
    }
}
