package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50172Sg extends C1UX {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(C50172Sg.class, "_decision$volatile");
    public volatile /* synthetic */ int _decision$volatile;

    @Override // X.C1UX, X.AbstractC23681Dy
    public final void A0X(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A00;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    InterfaceC23621Ds A02 = C1E2.A02(((C1UX) this).A00);
                    if (obj instanceof C1JW) {
                        Throwable th = ((C1JW) obj).A00;
                        C14360o3.A0B(th, 0);
                        obj = new C09540e5(th);
                    }
                    C1E6.A00(obj, A02);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    @Override // X.C1UX, X.AnonymousClass198
    public final void A0J(Object obj) {
        A0X(obj);
    }
}
