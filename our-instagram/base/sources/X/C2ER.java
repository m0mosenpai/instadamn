package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2ER, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ER extends AtomicBoolean implements InterfaceC41801wU {
    public final InterfaceC42071wx A00;
    public final C2EQ A01;

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.A01.A03(this);
        }
    }

    public C2ER(InterfaceC42071wx interfaceC42071wx, C2EQ c2eq) {
        this.A00 = interfaceC42071wx;
        this.A01 = c2eq;
    }
}
