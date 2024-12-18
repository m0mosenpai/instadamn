package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6JO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JO extends AtomicInteger implements InterfaceC41801wU {
    public Object A00;
    public final InterfaceC42071wx A01;
    public final C6JK A02;
    public volatile boolean A03;

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A03) {
            this.A03 = true;
            this.A02.A00(this);
        }
    }

    public C6JO(InterfaceC42071wx interfaceC42071wx, C6JK c6jk) {
        this.A02 = c6jk;
        this.A01 = interfaceC42071wx;
    }
}
