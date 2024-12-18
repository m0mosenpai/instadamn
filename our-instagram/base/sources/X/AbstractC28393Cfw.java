package X;

import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Cfw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28393Cfw {
    public static final void A01(UserSession userSession, String str) {
        C14360o3.A0B(str, 1);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "open_creator_tools";
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "ig_open_creator_tool");
        if (A0f.isSampled()) {
            A0f.AAP("event", "reliability");
            A0f.AAP("error_message", str);
            A0f.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, RealtimeConstants.SEND_FAIL);
            A0f.Cht();
        }
    }

    public static final void A03(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "open_creator_tools";
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "ig_open_creator_tool");
        if (A0f.isSampled()) {
            A0f.AAP("event", "click");
            A0f.AAP("screen", str);
            A0f.AAP("target", str2);
            A0f.Cht();
        }
    }

    public static final void A02(UserSession userSession, String str) {
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "open_creator_tools";
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "ig_open_creator_tool");
        if (A0f.isSampled()) {
            A0f.AAP("event", "impression");
            A0f.AAP("screen", str);
            A0f.Cht();
        }
    }

    public static final String A00(ValuePropsFlow valuePropsFlow) {
        switch (valuePropsFlow.ordinal()) {
            case 2:
                return "value_prop_insights";
            case 3:
            default:
                return "accounts";
            case 4:
                return "value_prop_inspiration";
            case 5:
                return "value_prop_bonuses";
            case 6:
                return "value_prop_subscriptions";
            case 7:
                return "value_prop_badges";
            case 8:
                return "value_prop_creator_marketplace";
        }
    }
}
