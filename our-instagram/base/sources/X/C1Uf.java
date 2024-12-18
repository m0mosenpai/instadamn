package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Uf, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Uf implements C19B {
    public final C27281Uc A00;
    public volatile /* synthetic */ Object _exceptionsHolder$volatile;
    public volatile /* synthetic */ int _isCompleting$volatile = 0;
    public volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C1Uf.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(C1Uf.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(C1Uf.class, Object.class, "_exceptionsHolder$volatile");

    public C1Uf(Throwable th, C27281Uc c27281Uc) {
        this.A00 = c27281Uc;
        this._rootCause$volatile = th;
    }

    public final void A00(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (th == obj) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A02;
        Object obj2 = atomicReferenceFieldUpdater2.get(this);
        if (obj2 == null) {
            atomicReferenceFieldUpdater2.set(this, th);
            return;
        }
        if (obj2 instanceof Throwable) {
            if (th == obj2) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj2);
            arrayList.add(th);
            atomicReferenceFieldUpdater2.set(this, arrayList);
            return;
        }
        if (obj2 instanceof ArrayList) {
            ((AbstractCollection) obj2).add(th);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State is ");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.C19B
    public final C27281Uc BNj() {
        return this.A00;
    }

    @Override // X.C19B
    public final boolean isActive() {
        if (A03.get(this) != null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Finishing[cancelling=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        boolean z = false;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            z = true;
        }
        sb.append(z);
        sb.append(", completing=");
        boolean z2 = false;
        if (A01.get(this) != 0) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(", rootCause=");
        sb.append(atomicReferenceFieldUpdater.get(this));
        sb.append(", exceptions=");
        sb.append(A02.get(this));
        sb.append(", list=");
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }
}
