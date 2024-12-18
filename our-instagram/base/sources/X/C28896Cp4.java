package X;

/* renamed from: X.Cp4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28896Cp4 implements InterfaceC65307Thj {
    public final int A00;
    public final Object A01;

    public C28896Cp4(InterfaceC24901Jp interfaceC24901Jp, int i) {
        this.A00 = i;
        this.A01 = interfaceC24901Jp;
    }

    @Override // X.InterfaceC65307Thj
    public final void onResult(Object obj) {
        if (this.A00 != 0) {
            Throwable th = (Throwable) obj;
            InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
            if (!(!(C24891Jo.A04.get(interfaceC23621Ds) instanceof C13E))) {
                if (th == null) {
                    C14360o3.A0E("LOAD_PARAM");
                    throw C00O.createAndThrow();
                }
                interfaceC23621Ds.resumeWith(new C09540e5(th));
                return;
            }
            return;
        }
        InterfaceC23621Ds interfaceC23621Ds2 = (InterfaceC23621Ds) this.A01;
        if (!(!(C24891Jo.A04.get(interfaceC23621Ds2) instanceof C13E))) {
            interfaceC23621Ds2.resumeWith(obj);
        }
    }
}
