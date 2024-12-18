package X;

/* renamed from: X.5Zj, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Zj extends AbstractC114345Dz implements InterfaceC118825Zk {
    public String A00;
    public InterfaceC16820sZ A01;
    public InterfaceC16820sZ A02;

    @Override // X.InterfaceC118825Zk
    public final void FAA(InterfaceC118065Vq interfaceC118065Vq, C5XO c5xo, C5XQ c5xq, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z) {
        boolean z2;
        C6KM c6km;
        if (!C14360o3.A0K(this.A00, str)) {
            this.A00 = str;
            AbstractC114335Dx.A02(this).A0M();
        }
        boolean z3 = false;
        boolean z4 = false;
        if (this.A02 == null) {
            z4 = true;
        }
        boolean z5 = false;
        if (interfaceC16820sZ2 == null) {
            z5 = true;
        }
        if (z4 != z5) {
            A0I();
            AbstractC114335Dx.A02(this).A0M();
            z2 = true;
        } else {
            z2 = false;
        }
        this.A02 = interfaceC16820sZ2;
        boolean z6 = false;
        if (this.A01 == null) {
            z6 = true;
        }
        if (interfaceC16820sZ3 == null) {
            z3 = true;
        }
        if (z6 != z3) {
            z2 = true;
        }
        this.A01 = interfaceC16820sZ3;
        if (((AbstractC114345Dz) this).A08 != z) {
            z2 = true;
        }
        A0J(interfaceC118065Vq, c5xo, c5xq, str2, interfaceC16820sZ, z);
        if (z2 && (c6km = ((AbstractC114345Dz) this).A05) != null) {
            c6km.EJp();
        }
    }
}
