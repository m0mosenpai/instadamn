package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.1O3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1O3 {
    public final C1O4 A00;
    public final ConcurrentLinkedQueue A01;

    public final C59722oF A00() {
        C59722oF c59722oF = (C59722oF) this.A01.poll();
        if (c59722oF == null) {
            return new C59722oF(this);
        }
        return c59722oF;
    }

    public C1O3(C1O4 c1o4) {
        this.A01 = new ConcurrentLinkedQueue();
        this.A00 = c1o4;
    }

    public C1O3() {
        this.A01 = new ConcurrentLinkedQueue();
        this.A00 = new C1O4(5);
    }
}
