package X;

/* renamed from: X.4UP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UP {
    public boolean A00;
    public final C2A7 A01;

    public final synchronized void A00() {
        boolean z = false;
        while (!this.A00) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void A01() {
        this.A00 = false;
    }

    public final synchronized boolean A02() {
        boolean z;
        z = false;
        if (!this.A00) {
            z = true;
            this.A00 = true;
            notifyAll();
        }
        return z;
    }

    public C4UP(C2A7 c2a7) {
        this.A01 = c2a7;
    }

    public C4UP() {
        this(C2A7.A00);
    }
}
