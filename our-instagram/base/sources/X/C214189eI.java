package X;

import java.util.concurrent.ExecutionException;

/* renamed from: X.9eI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214189eI extends C200448tn implements C2n2, InterfaceC200458to {
    public C214189eI(C200148tJ builder, AbstractC200978ue loader) {
        super(new ConcurrentMapC200188tN(builder, loader));
    }

    public final void A00(Object key) {
        ConcurrentMapC200188tN concurrentMapC200188tN = this.A00;
        key.getClass();
        int A00 = concurrentMapC200188tN.A00(key);
        concurrentMapC200188tN.A01(A00).A05(concurrentMapC200188tN.A0D, key, A00, false);
    }

    @Override // X.C2n2
    public final Object apply(Object key) {
        try {
            return this.A00.A02(key);
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
