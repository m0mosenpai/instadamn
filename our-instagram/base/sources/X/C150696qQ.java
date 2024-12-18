package X;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.6qQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150696qQ {
    public final C150736qU A00;
    public C150746qX flmEffectsDeletionManager;

    public C150696qQ(C150706qR c150706qR, C150716qS c150716qS, C0Gd c0Gd, C40701ud c40701ud, ScheduledExecutorService scheduledExecutorService) {
        C14360o3.A0B(scheduledExecutorService, 1);
        C14360o3.A0B(c150706qR, 2);
        C14360o3.A0B(c150716qS, 3);
        C14360o3.A0B(c0Gd, 4);
        C14360o3.A0B(c40701ud, 5);
        C150736qU c150736qU = new C150736qU(new C150726qT(c40701ud), scheduledExecutorService);
        this.A00 = c150736qU;
        this.flmEffectsDeletionManager = new C150746qX(c150736qU, c150716qS.A01(), c150706qR, c0Gd, c40701ud);
    }
}
