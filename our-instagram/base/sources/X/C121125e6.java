package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.5e6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121125e6 {
    public final ReentrantReadWriteLock A00 = new ReentrantReadWriteLock();
    public final boolean A01;

    public final void A00() {
        if (!this.A01 && !this.A00.writeLock().isHeldByCurrentThread()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public C121125e6(boolean z) {
        this.A01 = z;
    }
}
