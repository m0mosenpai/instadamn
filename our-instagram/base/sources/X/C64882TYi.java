package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.TYi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64882TYi extends WeakReference {
    public final int A00;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this != obj) {
                C64882TYi c64882TYi = (C64882TYi) obj;
                if (this.A00 != c64882TYi.A00 || get() != c64882TYi.get()) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public C64882TYi(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        this.A00 = System.identityHashCode(th);
    }
}
