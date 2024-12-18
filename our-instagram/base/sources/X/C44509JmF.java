package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.JmF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44509JmF extends AbstractC52922bZ {
    public final C05A A00;
    public final UserSession A01;

    public C44509JmF(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C10E.A00(KAN.A00);
    }

    public final void A00(C55555Olp c55555Olp, String str) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("event_name", "start_animation");
        A0q.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str);
        c55555Olp.A02(AbstractC166987dD.A1L("avatar_animation_event", A0q));
    }
}
