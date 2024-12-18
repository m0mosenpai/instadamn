package X;

import java.util.concurrent.locks.LockSupport;

/* renamed from: X.2SX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2SX extends AbstractC23681Dy {
    public final AnonymousClass130 A00;
    public final Thread A01;

    public C2SX(Thread thread, C12W c12w, AnonymousClass130 anonymousClass130) {
        super(c12w, true, true);
        this.A01 = thread;
        this.A00 = anonymousClass130;
    }

    @Override // X.AnonymousClass198
    public final boolean A0S() {
        return true;
    }

    @Override // X.AnonymousClass198
    public final void A0J(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.A01;
        if (!C14360o3.A0K(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
