package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LI5 {
    public Long A00;
    public boolean A01;
    public boolean A02;
    public final UserFlowLogger A03;
    public final UserSession A04;

    public /* synthetic */ LI5(UserSession userSession) {
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(C006802i.A0p, true, false);
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = userFlowLoggerImpl;
    }

    public static final void A00(AbstractC47323KvY abstractC47323KvY, LI5 li5) {
        A01(li5, new C50172MDz(41, abstractC47323KvY, li5));
    }

    public static final void A01(LI5 li5, InterfaceC16820sZ interfaceC16820sZ) {
        if (C18U.A06(C06090Tz.A05, li5.A04, 36323560624500070L)) {
            interfaceC16820sZ.invoke();
        }
    }
}
