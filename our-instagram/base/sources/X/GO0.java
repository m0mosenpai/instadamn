package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallFunnelSessionId;

/* loaded from: classes6.dex */
public final class GO0 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ RtcCallFunnelSessionId A01;

    public GO0(UserSession userSession, RtcCallFunnelSessionId rtcCallFunnelSessionId) {
        this.A00 = userSession;
        this.A01 = rtcCallFunnelSessionId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC55155OdJ.A03(this.A00, this.A01, C05F.A0Y);
    }
}
