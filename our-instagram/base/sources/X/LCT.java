package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import kotlin.Deprecated;

/* loaded from: classes8.dex */
public abstract class LCT {
    public static final Long A01(UserSession userSession, C3o9 c3o9) {
        C14360o3.A0B(c3o9, 1);
        return AbstractC28761aE.A00(userSession).BX2(JRE.A01(c3o9));
    }

    @Deprecated(message = "Please use `DirectThreadStore#getExtendedThread(threadKey)?.ephemeralityParams` instead.")
    public static final L1W A00(UserSession userSession, DirectThreadKey directThreadKey) {
        AbstractC167017dG.A1N(userSession, directThreadKey);
        C81663kb A03 = C2DU.A03((C2DU) AbstractC28761aE.A00(userSession), directThreadKey);
        if (A03 != null) {
            return A03.B2W();
        }
        return null;
    }
}
