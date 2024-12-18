package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0E1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0E1 implements C0JO {
    public long A00;
    public final C0JM A01;

    @Override // X.C0JO
    public final long now() {
        long max = Math.max(this.A00, this.A01.now());
        this.A00 = max;
        return max;
    }

    @Override // X.C0JO
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    public C0E1(C0JM c0jm) {
        this.A01 = c0jm;
        this.A00 = c0jm.now();
    }
}
