package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.GOa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36905GOa implements Runnable {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;

    public RunnableC36905GOa(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!AbstractC33578Esq.A00) {
            UserSession userSession = this.A01;
            BusinessFlowAnalyticsLogger A00 = AbstractC151606s6.A00(EnumC151596s5.A07, this.A00, userSession, null);
            Y7A y7a = new Y7A("self_profile", "self_profile", "onboarding_checklist", null, null, null, null, null);
            if (A00 != null) {
                A00.CmQ(y7a);
            }
            AbstractC33578Esq.A00 = true;
        }
    }
}
