package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.2qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61192qh extends PhantomReference {
    public final Runnable A00;

    public C61192qh(Object obj, Runnable runnable, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = runnable;
    }
}
