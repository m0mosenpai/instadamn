package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.13D, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C13D {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C13D.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C13D.class, Object.class, "_prev$volatile");
    public volatile /* synthetic */ Object _next$volatile;
    public volatile /* synthetic */ Object _prev$volatile;

    public abstract boolean A03();

    public final C13D A00() {
        Object obj = A00.get(this);
        if (obj == C3JN.A00) {
            return null;
        }
        return (C13D) obj;
    }

    public final void A01() {
        A01.set(this, null);
    }

    public final void A02() {
        C13D c13d;
        Object obj;
        C13D c13d2;
        C13D A002;
        if (A00() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            while (true) {
                c13d = (C13D) obj2;
                if (c13d == null || !c13d.A03()) {
                    break;
                } else {
                    obj2 = atomicReferenceFieldUpdater.get(c13d);
                }
            }
            C13D A003 = A00();
            C14360o3.A0A(A003);
            while (A003.A03() && (A002 = A003.A00()) != null) {
                A003 = A002;
            }
            do {
                obj = atomicReferenceFieldUpdater.get(A003);
                c13d2 = c13d;
                if (obj == null) {
                    c13d2 = null;
                }
            } while (!C1E0.A00(A003, obj, c13d2, atomicReferenceFieldUpdater));
            if (c13d != null) {
                A00.set(c13d, A003);
            }
            if (!A003.A03() || A003.A00() == null) {
                if (c13d == null || !c13d.A03()) {
                    return;
                }
            }
        }
    }
}
