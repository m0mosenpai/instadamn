package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2N3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2N3 {
    public final C2LA A00;
    public final InterfaceC48882Mg A01;
    public final Map A02 = new HashMap();
    public final C2L5 A03;

    static {
        C48442Kl.A01("DelayedWorkTracker");
    }

    public C2N3(C2L5 immediateScheduler, C2LA runnableScheduler, InterfaceC48882Mg clock) {
        this.A01 = clock;
        this.A00 = runnableScheduler;
        this.A03 = immediateScheduler;
    }
}
