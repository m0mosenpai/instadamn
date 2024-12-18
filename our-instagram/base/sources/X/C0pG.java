package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0pG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0pG extends AnonymousClass109 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C0pG.class, Object.class, "_state$volatile");
    public volatile /* synthetic */ Object _state$volatile;

    @Override // X.AnonymousClass109
    public final /* bridge */ /* synthetic */ boolean A00(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, C10E.A00);
        return true;
    }

    @Override // X.AnonymousClass109
    public final /* bridge */ /* synthetic */ InterfaceC23621Ds[] A01(Object obj) {
        A00.set(this, null);
        return C10A.A00;
    }
}
