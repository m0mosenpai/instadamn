package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GB6 implements GY7 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C32546EUw A01;

    public GB6(UserSession userSession, C32546EUw c32546EUw) {
        this.A01 = c32546EUw;
        this.A00 = userSession;
    }

    @Override // X.GY7
    public final void onFinished() {
        UserSession userSession = this.A00;
        EVQ evq = this.A01.A02;
        CallerContext callerContext = EVQ.A0B;
        AbstractC31525Dt9.A08(evq.A04, evq.A07, userSession);
    }
}
