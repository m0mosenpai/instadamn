package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Map;

/* renamed from: X.92K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92K {
    public final InterfaceC11380iw A00;

    public final void A00(AbstractC12990ll abstractC12990ll, Integer num, Map map) {
        String str;
        String str2;
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 2342162446669716914L) && !(abstractC12990ll instanceof UserSession)) {
            return;
        }
        C14360o3.A0A(abstractC12990ll);
        C18920wW A01 = AbstractC12220kQ.A01(this.A00, abstractC12990ll);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "push_notification_setting");
        if (num == C05F.A00) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        A00.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
        if (map != null) {
            str2 = map.toString();
        } else {
            str2 = null;
        }
        A00.AAP("extra_setting_data", str2);
        A00.Cht();
    }

    public C92K(InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC11380iw;
    }
}
