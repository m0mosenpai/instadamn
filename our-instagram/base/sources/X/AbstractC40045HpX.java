package X;

import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HpX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40045HpX {
    public static Map A00(InterfaceC43538JKy interfaceC43538JKy) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC43538JKy.AnH();
        A1I.put("chat_id", Long.valueOf(interfaceC43538JKy.AnH()));
        interfaceC43538JKy.BJW();
        A1I.put("inviter_id", Long.valueOf(interfaceC43538JKy.BJW()));
        if (interfaceC43538JKy.C0H() != null) {
            IGLiveFriendChatGuestStatus C0H = interfaceC43538JKy.C0H();
            C14360o3.A0B(C0H, 0);
            A1I.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, C0H.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
