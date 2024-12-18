package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class ISX {
    public static void A01(Context context, AbstractC018607g abstractC018607g, UserSession userSession, JHP jhp, String str, String str2) {
        C1ON A00 = A00(userSession, String.valueOf(AbstractC13880nE.A0A(context)), str, str2, null);
        A00.A00 = new C39026HGc(userSession, jhp, str, 2);
        C1GJ.A00(context, abstractC018607g, A00);
    }

    public static C1ON A00(UserSession userSession, String str, String str2, String str3, String str4) {
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0L("commerce/products/%s/group/", str2);
        A0N.A0H("source_media_id", str4);
        A0N.A9s("merchant_id", str3);
        A0N.A9s("device_width", str);
        A0N.A9s("include_variant_specific_sectional_items", "false");
        A0N.A9s("shopping_bag_enabled", "false");
        return AbstractC31172DnG.A0S(A0N, HAY.class, ISY.class);
    }
}
