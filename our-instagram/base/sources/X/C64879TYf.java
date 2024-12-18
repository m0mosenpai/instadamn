package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.TYf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64879TYf extends PhantomReference {
    public final Runnable A00;
    public final java.util.Set A01;

    public /* synthetic */ C64879TYf(Object obj, Runnable runnable, ReferenceQueue referenceQueue, java.util.Set set) {
        super(obj, referenceQueue);
        this.A01 = set;
        this.A00 = runnable;
    }
}
