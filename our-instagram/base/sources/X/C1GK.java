package X;

/* renamed from: X.1GK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GK implements C1GL {
    public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C1GM.A00);
    public final InterfaceC14020nS A00;

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        if (c11r != null) {
            C1GR.A00(c11r, this.A00, c11r.getRunnableId(), 3, false, false);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C1GK(InterfaceC14020nS interfaceC14020nS) {
        this.A00 = interfaceC14020nS;
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        if (c11r != null) {
            C1GR.A00(c11r, this.A00, i, i2, z, z2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
