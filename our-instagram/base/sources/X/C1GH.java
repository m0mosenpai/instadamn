package X;

import android.os.SystemClock;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.1GH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GH extends C19Q implements C1G4 {
    public final C1GI A00;
    public final C1G4 A01;

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        c26511Qg.A01(new C19Q() { // from class: X.1Rb
            public Long A00;

            @Override // X.C19Q, X.C19O
            public final void onResponseStarted(C1QW c1qw2, C1QY c1qy2, C3JQ c3jq) {
                C14360o3.A0B(c1qw2, 0);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Long l = this.A00;
                if (l != null) {
                    long longValue = elapsedRealtime - l.longValue();
                    C1GI c1gi = C1GH.this.A00;
                    synchronized (c1gi) {
                        boolean A0D = AbstractC15820qc.A0D();
                        String host = c1qw2.A09.getHost();
                        C14360o3.A07(host);
                        if (A0D) {
                            host = AnonymousClass001.A0R(host, "_wifi");
                        }
                        Map map = c1gi.A01;
                        C3JR c3jr = (C3JR) map.get(host);
                        if (c3jr == null) {
                            c3jr = new C3JR(c1gi);
                            map.put(host, c3jr);
                        }
                        synchronized (c3jr) {
                            Queue queue = c3jr.A01;
                            if (queue.size() >= 10) {
                                Object remove = queue.remove();
                                if (remove != null) {
                                    c3jr.A00 -= ((Number) remove).longValue();
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            queue.add(Long.valueOf(longValue));
                            c3jr.A00 += longValue;
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // X.C19Q, X.C19O
            public final void onRequestUploadAttemptStart(C1QW c1qw2) {
                if (this.A00 == null) {
                    this.A00 = Long.valueOf(SystemClock.elapsedRealtime());
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
        });
        InterfaceC27191Tt startRequest = this.A01.startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    public C1GH(C1G4 c1g4) {
        this.A01 = c1g4;
        C1GI c1gi = C1GI.A02;
        if (c1gi == null) {
            c1gi = new C1GI();
            C1GI.A02 = c1gi;
        }
        C14360o3.A0C(c1gi, "null cannot be cast to non-null type com.instagram.common.api.base.LatencyEstimatorRecorder");
        this.A00 = c1gi;
    }
}
