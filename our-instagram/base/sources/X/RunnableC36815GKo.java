package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* renamed from: X.GKo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36815GKo implements Runnable {
    public final /* synthetic */ ELW A00;

    public RunnableC36815GKo(ELW elw) {
        this.A00 = elw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ELW elw = this.A00;
        InterfaceC37222GaX interfaceC37222GaX = elw.A01;
        String str = "controller";
        if (interfaceC37222GaX != null) {
            interfaceC37222GaX.EUd(EnumC151596s5.A04);
            InterfaceC37222GaX interfaceC37222GaX2 = elw.A01;
            if (interfaceC37222GaX2 != null) {
                ((BusinessConversionActivity) interfaceC37222GaX2).CnD(null);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = elw.A00;
                if (businessFlowAnalyticsLogger == null) {
                    str = "logger";
                } else {
                    businessFlowAnalyticsLogger.CjL(new Y7A("renew", elw.A03, null, null, null, elw.A02(), null, null));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
