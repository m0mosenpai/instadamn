package X;

import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class MXF implements Executor {
    public final InterfaceC14020nS A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.ATO(new MYX(this, runnable));
    }

    public MXF(InterfaceC14020nS interfaceC14020nS) {
        this.A00 = interfaceC14020nS;
    }
}
