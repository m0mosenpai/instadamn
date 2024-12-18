package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC133245zq extends AtomicInteger implements Runnable, InterfaceC135996De {
    public final InterfaceC42071wx A00;
    public final Object A01;

    @Override // X.InterfaceC136006Df
    public final int EJ7(int i) {
        if ((i & 1) != 0) {
            lazySet(1);
            return 1;
        }
        return 0;
    }

    @Override // X.InterfaceC136016Dg
    public final void clear() {
        lazySet(3);
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        set(3);
    }

    @Override // X.InterfaceC136016Dg
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public RunnableC133245zq(InterfaceC42071wx interfaceC42071wx, Object obj) {
        this.A00 = interfaceC42071wx;
        this.A01 = obj;
    }

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        if (get() != 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC136016Dg
    public final Object poll() {
        if (get() == 1) {
            lazySet(3);
            return this.A01;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            InterfaceC42071wx interfaceC42071wx = this.A00;
            interfaceC42071wx.DVo(this.A01);
            if (get() == 2) {
                lazySet(3);
                interfaceC42071wx.onComplete();
            }
        }
    }
}
