package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public abstract class F1t {
    public static final void A00(UserSession userSession, DirectThreadKey directThreadKey, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = directThreadKey.A00;
        if (str != null) {
            AbstractC31177DnL.A1M(AbstractC31173DnH.A0c(C1AT.A01(userSession), C1AV.A0a), "BROADCAST_CHAT_CREATION_KEY", str, z);
        }
    }
}
