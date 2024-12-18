package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.12u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C214212u extends C12T implements InterfaceC214312v {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A05 = AtomicIntegerFieldUpdater.newUpdater(C214212u.class, "runningWorkers$volatile");
    public final int A00;
    public final Object A01;
    public final C12T A02;
    public final C213512n A03;
    public final /* synthetic */ InterfaceC214312v A04;
    public volatile /* synthetic */ int runningWorkers$volatile;

    @Override // X.InterfaceC214312v
    public final C19D CPF(Runnable runnable, C12W c12w, long j) {
        return this.A04.CPF(runnable, c12w, j);
    }

    @Override // X.InterfaceC214312v
    public final void EM7(InterfaceC24901Jp interfaceC24901Jp, long j) {
        this.A04.EM7(interfaceC24901Jp, j);
    }

    public static final Runnable A00(C214212u c214212u) {
        Runnable runnable;
        while (true) {
            C213512n c213512n = c214212u.A03;
            runnable = (Runnable) c213512n.A01();
            if (runnable != null) {
                break;
            }
            synchronized (c214212u.A01) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
                atomicIntegerFieldUpdater.decrementAndGet(c214212u);
                if (c213512n.A00() != 0) {
                    atomicIntegerFieldUpdater.incrementAndGet(c214212u);
                } else {
                    runnable = null;
                }
            }
            break;
        }
        return runnable;
    }

    @Override // X.C12T
    public final void A04(Runnable runnable, C12W c12w) {
        boolean z;
        Runnable A00;
        this.A03.A02(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
        int i = atomicIntegerFieldUpdater.get(this);
        int i2 = this.A00;
        if (i < i2) {
            synchronized (this.A01) {
                if (atomicIntegerFieldUpdater.get(this) < i2) {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z && (A00 = A00(this)) != null) {
                this.A02.A04(new RunnableC51692Ys(A00, this), this);
            }
        }
    }

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        boolean z;
        Runnable A00;
        this.A03.A02(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
        int i = atomicIntegerFieldUpdater.get(this);
        int i2 = this.A00;
        if (i < i2) {
            synchronized (this.A01) {
                if (atomicIntegerFieldUpdater.get(this) < i2) {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z && (A00 = A00(this)) != null) {
                this.A02.A05(new RunnableC51692Ys(A00, this), this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C214212u(C12T c12t, int i) {
        InterfaceC214312v interfaceC214312v;
        this.A02 = c12t;
        this.A00 = i;
        this.A04 = (!(c12t instanceof InterfaceC214312v) || (interfaceC214312v = (InterfaceC214312v) c12t) == null) ? AbstractC214412w.A00 : interfaceC214312v;
        this.A03 = new C213512n(false);
        this.A01 = new Object();
    }

    @Override // X.C12T
    public final C12T A03(int i) {
        AbstractC214112t.A00(i);
        if (i >= this.A00) {
            return this;
        }
        AbstractC214112t.A00(i);
        return new C214212u(this, i);
    }
}
