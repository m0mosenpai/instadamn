package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.6Re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC138976Re extends WeakReference implements C18P {
    public final int A00;

    @Override // X.C18P
    public C18P BWo() {
        return null;
    }

    @Override // X.C18P
    public final int BD2() {
        return this.A00;
    }

    public AbstractC138976Re(Object queue, ReferenceQueue key, int hash) {
        super(queue, key);
        this.A00 = hash;
    }

    @Override // X.C18P
    public final Object getKey() {
        return get();
    }
}
