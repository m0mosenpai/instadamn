package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6DJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DJ extends AbstractC42051wv {
    public final C6DH A01;
    public final C6DA A02;
    public final int A00 = 1;
    public final AtomicInteger A03 = new AtomicInteger();

    public C6DJ(C6DH c6dh, C6DA c6da) {
        this.A02 = c6da;
        this.A01 = c6dh;
    }

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        C6DA c6da = this.A02;
        c6da.EpF(interfaceC42071wx);
        if (this.A03.incrementAndGet() == this.A00) {
            c6da.A03(this.A01);
        }
    }
}
