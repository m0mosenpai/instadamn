package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.2kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57622kb implements InterfaceC57632kc {
    public Object A00;
    public CountDownLatch A01 = new CountDownLatch(1);
    public final /* synthetic */ long A02;
    public final /* synthetic */ C25301Lk A03;

    public C57622kb(C25301Lk c25301Lk, long j) {
        this.A03 = c25301Lk;
        this.A02 = j;
    }

    @Override // X.InterfaceC57632kc
    public final void DEF(Exception exc) {
        this.A01.countDown();
    }

    @Override // X.InterfaceC57632kc
    public final void onResult(Object obj) {
        this.A01.countDown();
        this.A00 = obj;
    }
}
