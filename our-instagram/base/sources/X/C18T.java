package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.18T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C18T extends WeakReference implements C18K {
    public final C18P A00;

    @Override // X.C18K
    public final C18P B2O() {
        return this.A00;
    }

    public C18T(C18P queue, Object referent, ReferenceQueue entry) {
        super(referent, entry);
        this.A00 = queue;
    }

    @Override // X.C18K
    public final C18K AKu(C18P queue, ReferenceQueue entry) {
        return new C18T(queue, get(), entry);
    }
}
