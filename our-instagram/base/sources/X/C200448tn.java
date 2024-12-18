package X;

import java.io.Serializable;

/* renamed from: X.8tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C200448tn implements InterfaceC200458to, Serializable {
    public final ConcurrentMapC200188tN A00;

    @Override // X.InterfaceC200458to
    public final Object BFG(Object key) {
        ConcurrentMapC200188tN concurrentMapC200188tN = this.A00;
        key.getClass();
        int A00 = concurrentMapC200188tN.A00(key);
        return concurrentMapC200188tN.A01(A00).A09(key, A00);
    }

    public C200448tn(ConcurrentMapC200188tN localCache) {
        this.A00 = localCache;
    }
}
