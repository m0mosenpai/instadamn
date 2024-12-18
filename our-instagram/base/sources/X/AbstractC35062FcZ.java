package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.FcZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35062FcZ {
    public static final C47584Kzu A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C47584Kzu) userSession.A01(C47584Kzu.class, new C50160MDn(userSession, 2));
    }

    public static C006802i A01(DirectShareSheetFragment directShareSheetFragment) {
        return A02(directShareSheetFragment.A0H).A00;
    }

    public static C006802i A00(UserSession userSession) {
        return A02(userSession).A00;
    }
}
