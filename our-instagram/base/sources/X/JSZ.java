package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class JSZ extends AbstractC151006r1 {
    public final C41781wS A00;
    public final XO1 A01;
    public final XO1 A02;
    public final C142966cw A03;
    public volatile boolean A04;

    @Override // X.AbstractC151006r1
    public final InterfaceC41801wU A00(Runnable runnable) {
        if (this.A04) {
            return EnumC137086Im.INSTANCE;
        }
        return this.A03.A02(this.A02, runnable, TimeUnit.MILLISECONDS, 0L);
    }

    @Override // X.AbstractC151006r1
    public final InterfaceC41801wU A01(Runnable runnable, TimeUnit timeUnit, long j) {
        if (this.A04) {
            return EnumC137086Im.INSTANCE;
        }
        return this.A03.A02(this.A00, runnable, timeUnit, j);
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A04) {
            this.A04 = true;
            this.A01.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XO1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1wU, java.lang.Object, X.1wS] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1wU, java.lang.Object, X.XO1] */
    public JSZ(C142966cw c142966cw) {
        this.A03 = c142966cw;
        ?? obj = new Object();
        this.A02 = obj;
        ?? obj2 = new Object();
        this.A00 = obj2;
        ?? obj3 = new Object();
        this.A01 = obj3;
        obj3.A7o(obj);
        obj3.A7o(obj2);
    }
}
