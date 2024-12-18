package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class PV0 implements InterfaceC16130rD {
    public final int A00;
    public final Object A01;

    public PV0(WeakReference weakReference, int i) {
        this.A00 = i;
        this.A01 = weakReference;
    }

    @Override // X.InterfaceC16130rD
    public final /* bridge */ /* synthetic */ Object CES(Object obj, C0YR c0yr) {
        return ((Reference) this.A01).get();
    }
}
