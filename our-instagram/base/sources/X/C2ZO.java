package X;

/* renamed from: X.2ZO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ZO {
    public static final C2ZO A01 = new Object();
    public volatile boolean A00;

    public final synchronized void A00() {
        this.A00 = true;
        notifyAll();
    }

    public final synchronized void A01() {
        while (!this.A00) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
