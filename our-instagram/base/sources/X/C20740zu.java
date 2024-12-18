package X;

/* renamed from: X.0zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20740zu implements InterfaceC23621Ds, InterfaceC23631Dt {
    public final InterfaceC23621Ds A00;
    public final C12W A01;

    @Override // X.InterfaceC23631Dt
    public final InterfaceC23631Dt getCallerFrame() {
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        if (interfaceC23621Ds instanceof InterfaceC23631Dt) {
            return (InterfaceC23631Dt) interfaceC23621Ds;
        }
        return null;
    }

    @Override // X.InterfaceC23621Ds
    public final C12W getContext() {
        return this.A01;
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        this.A00.resumeWith(obj);
    }

    public C20740zu(InterfaceC23621Ds interfaceC23621Ds, C12W c12w) {
        this.A00 = interfaceC23621Ds;
        this.A01 = c12w;
    }
}
