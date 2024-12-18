package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.Map;

/* renamed from: X.EZr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32667EZr extends AbstractRunnableC14200nk {
    public final /* synthetic */ C28741aC A00;
    public final /* synthetic */ FPZ A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ Map A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32667EZr(C28741aC c28741aC, FPZ fpz, Map map, Map map2, int i) {
        super(1213736202, i, false, false);
        this.A00 = c28741aC;
        this.A03 = map;
        this.A02 = map2;
        this.A01 = fpz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C28741aC c28741aC = this.A00;
        Map map = this.A03;
        Map map2 = this.A02;
        FPZ fpz = this.A01;
        boolean A0G = C28741aC.A0G(c28741aC, fpz, map, map2);
        UserSession userSession = c28741aC.A01;
        C2FQ A00 = C2FO.A00(userSession);
        IGFOAMessagingReadyLogger A002 = C47272Eu.A00(userSession);
        QuickPerformanceLogger quickPerformanceLogger = fpz.A01;
        int i = fpz.A00;
        if (A0G) {
            quickPerformanceLogger.markerEnd(20122304, i, (short) 167);
            A00.A01();
            if (A002 != null) {
                A002.onOfflineMessageProcessed();
                return;
            }
            return;
        }
        quickPerformanceLogger.markerEnd(20122304, i, (short) 168);
        A00.A02();
        if (A002 == null) {
            return;
        }
        A002.onOfflineMessageProcessedFailed();
    }
}
