package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.139 */
/* loaded from: classes.dex */
public final class AnonymousClass139 extends C13A {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass139.class, Object.class, "owner$volatile");
    public final InterfaceC16610sE A00;
    public volatile /* synthetic */ Object owner$volatile;

    public AnonymousClass139() {
        super(1);
        this.owner$volatile = C13G.A00;
        this.A00 = new C9E6(this, 7);
    }

    public static /* synthetic */ Object A00(InterfaceC23621Ds interfaceC23621Ds, AnonymousClass139 anonymousClass139) {
        boolean z;
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C13A.A02;
            int i2 = atomicIntegerFieldUpdater.get(anonymousClass139);
            int i3 = ((C13A) anonymousClass139).A00;
            if (i2 <= i3) {
                if (i2 <= 0) {
                    z = false;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(anonymousClass139, i2, i2 - 1)) {
                    A01.set(anonymousClass139, null);
                    z = true;
                    break;
                }
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(anonymousClass139);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(anonymousClass139, i, i3));
            }
        }
        if (!z) {
            C24891Jo A00 = AbstractC24881Jn.A00(C1E2.A02(interfaceC23621Ds));
            try {
                anonymousClass139.A03(new C124735ke(A00, anonymousClass139));
                Object A0E = A00.A0E();
                C1JX c1jx = C1JX.A02;
                if (A0E != c1jx) {
                    A0E = C0eB.A00;
                }
                if (A0E == c1jx) {
                    return A0E;
                }
            } catch (Throwable th) {
                A00.A0J();
                throw th;
            }
        }
        return C0eB.A00;
    }

    public final boolean A05() {
        if (Math.max(C13A.A02.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mutex@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[isLocked=");
        sb.append(A05());
        sb.append(",owner=");
        sb.append(A01.get(this));
        sb.append(']');
        return sb.toString();
    }

    public final void A04(Object obj) {
        while (A05()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C20730zt c20730zt = C13G.A00;
            if (obj2 != c20730zt) {
                if (obj2 != obj && obj != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("This mutex is locked by ");
                    sb.append(obj2);
                    sb.append(", but ");
                    sb.append(obj);
                    sb.append(" is expected");
                    throw new IllegalStateException(sb.toString());
                }
                if (C1E0.A00(this, obj2, c20730zt, atomicReferenceFieldUpdater)) {
                    A02();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
