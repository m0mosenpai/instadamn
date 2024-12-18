package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.Pk6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57779Pk6 extends C19G {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C57779Pk6.class, "_invoked$volatile");
    public final InterfaceC16660sJ A00;
    public volatile /* synthetic */ int _invoked$volatile;

    @Override // X.C19I
    public final void A05(Throwable th) {
        if (A01.compareAndSet(this, 0, 1)) {
            this.A00.invoke(th);
        }
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C0eB.A00;
    }

    public C57779Pk6(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
