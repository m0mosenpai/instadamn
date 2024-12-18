package X;

import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;

/* renamed from: X.6AI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;
    public final SettableFuture A09;
    public final SettableFuture A0A;
    public final C42201xA A0B;
    public final C42201xA A0C;
    public final C42201xA A0D;
    public final C42201xA A0E;
    public final UserSession A0F;
    public final C2FQ A0G;
    public final IGFOAMessagingReadyLogger A0H;
    public final Integer[] A0I = {0, 0, 0, 0, 0};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1vN] */
    public final void A00() {
        this.A00 = 3;
        UserSession userSession = this.A0F;
        if (userSession != null) {
            C6CF A00 = C6CE.A00(userSession);
            if (A00.A00() && C6CB.A02(A00.A00, 36315928475733809L)) {
                AbstractC25651Mw.A00(userSession).E4s(new Object());
            }
        }
    }

    public final void A01() {
        C2FQ c2fq = this.A0G;
        if (c2fq != null) {
            C006802i c006802i = c2fq.A02;
            int i = c2fq.A01;
            int i2 = c2fq.A00;
            c006802i.markerPoint(i, i2, "act_login_end");
            c006802i.markerAnnotate(i, i2, "end_reason", "act_login_fail");
            C2FQ.A00(c2fq);
            c006802i.markerEnd(i, i2, (short) 3);
        }
        IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = this.A0H;
        if (iGFOAMessagingReadyLogger != null) {
            iGFOAMessagingReadyLogger.onLogActLoginEnd();
            iGFOAMessagingReadyLogger.onEndFlowFail("act_login_fail");
        }
        this.A01 = 3;
        this.A0D.accept(3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public C6AI(UserSession userSession, C2FQ c2fq, IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger) {
        this.A0F = userSession;
        this.A0G = c2fq;
        this.A0H = iGFOAMessagingReadyLogger;
        System.currentTimeMillis();
        this.A00 = 99;
        this.A01 = 99;
        this.A05 = -1L;
        this.A06 = -1L;
        this.A02 = -1;
        this.A0A = new Object();
        this.A09 = new Object();
        this.A0D = AbstractC42021ws.A01(99);
        this.A0B = AbstractC42021ws.A01(99);
        this.A0C = AbstractC42021ws.A01("");
        this.A0E = AbstractC42021ws.A01(false);
    }
}
