package X;

import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IOQ {
    public static H45 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            Long l2 = null;
            IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("chat_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("inviter_id".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGLiveFriendChatGuestStatus = (IGLiveFriendChatGuestStatus) IGLiveFriendChatGuestStatus.A01.get(A1P);
                    if (iGLiveFriendChatGuestStatus == null) {
                        iGLiveFriendChatGuestStatus = IGLiveFriendChatGuestStatus.A08;
                    }
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("chat_id", c16l, "LiveChatInfo");
            } else if (l2 != null || !(c16l instanceof C07950bF)) {
                if (iGLiveFriendChatGuestStatus == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, c16l, "LiveChatInfo");
                } else {
                    return new H45(iGLiveFriendChatGuestStatus, l.longValue(), l2.longValue());
                }
            } else {
                AbstractC166997dE.A1V("inviter_id", c16l, "LiveChatInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H45 h45) {
        anonymousClass182.A0d();
        anonymousClass182.A0R("chat_id", h45.A00);
        anonymousClass182.A0R("inviter_id", h45.A01);
        IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus = h45.A02;
        if (iGLiveFriendChatGuestStatus != null) {
            anonymousClass182.A0S(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, iGLiveFriendChatGuestStatus.A00);
        }
        anonymousClass182.A0a();
    }
}
