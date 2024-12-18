package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;

/* renamed from: X.KmM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46765KmM {
    public static final void A00(UserSession userSession, C7X3 c7x3, String str) {
        IGFOAMessagingLocalSendSpeedLogger A00;
        AbstractC167017dG.A1P(c7x3, userSession);
        c7x3.A02(str, "ThreadKey is null");
        if (str != null && (A00 = C7R5.A00(userSession, AbstractC43593JPy.A0r(str))) != null) {
            A00.onEndFlowFail("ThreadKey is null");
        }
    }
}
