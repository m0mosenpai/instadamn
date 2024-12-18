package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Sx9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63983Sx9 implements InterfaceC121045dw {
    public CountDownLatch A00 = new CountDownLatch(1);
    public boolean A01 = true;

    @Override // X.InterfaceC121045dw
    public final synchronized void DO6(boolean z) {
        this.A01 = z;
        this.A00.countDown();
    }
}
