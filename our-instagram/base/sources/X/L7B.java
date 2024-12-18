package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class L7B {
    public final /* synthetic */ C159697Eh A00;
    public final /* synthetic */ C47385Kwa A01;
    public final /* synthetic */ AtomicBoolean A02;

    public L7B(C159697Eh c159697Eh, C47385Kwa c47385Kwa, AtomicBoolean atomicBoolean) {
        this.A00 = c159697Eh;
        this.A02 = atomicBoolean;
        this.A01 = c47385Kwa;
    }

    public final void A00() {
        this.A02.set(true);
        this.A01.A00.A01();
    }
}
