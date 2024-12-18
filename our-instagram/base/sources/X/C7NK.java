package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.7NK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NK {
    public final ReentrantReadWriteLock A01 = new ReentrantReadWriteLock();
    public final C7NL A00 = new C7NL(this);

    public final void A00() {
        C18C.A0F(this.A01.writeLock().isHeldByCurrentThread());
    }
}
