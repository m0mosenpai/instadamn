package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.0uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18100uu extends WeakReference implements C0TD {
    public final Object A00;

    @Override // X.C0TD
    public final Object BFE() {
        return this.A00;
    }

    public C18100uu(Object obj, Object obj2, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = obj2;
    }
}
