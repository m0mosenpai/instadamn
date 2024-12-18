package X;

import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.RequestStats;
import com.facebook.proxygen.RequestStatsObserver;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.RbO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60909RbO extends RcZ {
    public final /* synthetic */ HTTPRequestError A00;
    public final /* synthetic */ C64119Szb A01;

    public C60909RbO(HTTPRequestError hTTPRequestError, C64119Szb c64119Szb) {
        this.A01 = c64119Szb;
        this.A00 = hTTPRequestError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64119Szb c64119Szb;
        C62685SLz c62685SLz;
        try {
            HTTPRequestError hTTPRequestError = this.A00;
            if (hTTPRequestError.mErrCode == HTTPRequestError.ProxygenError.Canceled) {
                c64119Szb = this.A01;
                c62685SLz = c64119Szb.A09;
                c62685SLz.A00 = "cancelled";
            } else {
                c64119Szb = this.A01;
                c62685SLz = c64119Szb.A09;
                c62685SLz.A00 = "error";
            }
            RequestStatsObserver requestStatsObserver = c64119Szb.A07;
            RequestStats requestStats = requestStatsObserver.getRequestStats();
            if (requestStats != null) {
                c62685SLz.A00(requestStats);
                C64119Szb.A01(c64119Szb, requestStats.getFlowTimeData());
            }
            c64119Szb.A01 = new C61030Rdy(hTTPRequestError);
            C1QW c1qw = c64119Szb.A08;
            AbstractC63079Sc1.A01(hTTPRequestError, requestStatsObserver, c1qw);
            c64119Szb.A0A.A01(c1qw, TraceFieldType.RspBodySize, c64119Szb.A00);
            c64119Szb.A02.DED(c64119Szb.A01);
        } catch (IllegalStateException e) {
            C0w9.A07("LigerAsyncInterface_error", e);
        }
    }

    public final String toString() {
        return AnonymousClass001.A0R("LigerAsyncResponseHandler.onError: ", this.A01.A08.A09.toString());
    }
}
