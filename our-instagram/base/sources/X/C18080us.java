package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.0us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18080us extends PhantomReference implements C0TD {
    public final Object A00;

    @Override // X.C0TD
    public final Object BFE() {
        return this.A00;
    }

    public C18080us(Object obj, Object obj2, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = obj2;
    }
}
