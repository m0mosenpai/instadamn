package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class O7F {
    public final UserFlowLoggerImpl A00;
    public final UserSession A01;

    public /* synthetic */ O7F(UserSession userSession) {
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(C006802i.A0p);
        this.A01 = userSession;
        this.A00 = userFlowLoggerImpl;
    }
}
