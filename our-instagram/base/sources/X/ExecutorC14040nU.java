package X;

import java.util.concurrent.Executor;

/* renamed from: X.0nU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC14040nU implements Executor {
    public final int A00;
    public final int A01;
    public final InterfaceC14020nS A02;
    public final boolean A03;
    public final boolean A04;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        InterfaceC14020nS interfaceC14020nS = this.A02;
        final int i = this.A01;
        final int i2 = this.A00;
        final boolean z = this.A04;
        final boolean z2 = this.A03;
        interfaceC14020nS.ATO(new AbstractRunnableC14200nk(i, i2, z, z2) { // from class: X.0vS
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    public ExecutorC14040nU(InterfaceC14020nS interfaceC14020nS, int i, int i2, boolean z, boolean z2) {
        this.A02 = interfaceC14020nS;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z;
        this.A03 = z2;
    }
}
