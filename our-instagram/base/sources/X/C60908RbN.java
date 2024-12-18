package X;

import com.facebook.proxygen.RequestStats;
import com.facebook.proxygen.RequestStatsObserver;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.RbN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60908RbN extends RcZ {
    public final /* synthetic */ C64119Szb A00;

    public C60908RbN(C64119Szb c64119Szb) {
        this.A00 = c64119Szb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C64119Szb c64119Szb = this.A00;
            C62685SLz c62685SLz = c64119Szb.A09;
            c62685SLz.A00 = "done";
            RequestStatsObserver requestStatsObserver = c64119Szb.A07;
            RequestStats requestStats = requestStatsObserver.getRequestStats();
            if (requestStats != null) {
                C64119Szb.A01(c64119Szb, requestStats.getFlowTimeData());
                c62685SLz.A00(requestStats);
            }
            C1QW c1qw = c64119Szb.A08;
            AbstractC63079Sc1.A01(null, requestStatsObserver, c1qw);
            C1Bs c1Bs = c64119Szb.A04;
            C23301Br c23301Br = c64119Szb.A05;
            if (c23301Br != null && c1Bs != null) {
                c23301Br.A00(c1Bs);
            }
            c64119Szb.A0A.A01(c1qw, TraceFieldType.RspBodySize, c64119Szb.A00);
            c64119Szb.A02.onEOM();
        } catch (IllegalStateException e) {
            C0w9.A07("LigerAsyncInterface_eom", e);
        }
    }

    public final String toString() {
        return AnonymousClass001.A0R("LigerAsyncResponseHandler.onEOM: ", this.A00.A08.A09.toString());
    }
}
