package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.F2t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34091F2t {
    public static final C7TQ A00(UserSession userSession, InterfaceC83733oI interfaceC83733oI) {
        C7TQ c7tp;
        AbstractC167017dG.A1N(userSession, interfaceC83733oI);
        if (interfaceC83733oI instanceof MsysThreadId) {
            c7tp = new G5I(userSession);
        } else {
            c7tp = new C7TP(userSession, new G5K(interfaceC83733oI), AbstractC28761aE.A00(userSession));
        }
        return c7tp;
    }
}
