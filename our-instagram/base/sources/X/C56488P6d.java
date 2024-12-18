package X;

/* renamed from: X.P6d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56488P6d implements InterfaceC53852dP {
    public final /* synthetic */ C47Z A00;
    public final /* synthetic */ C40121td A01;
    public final /* synthetic */ InterfaceC23621Ds A02;

    @Override // X.InterfaceC53852dP
    public final void DHI(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        if (C14360o3.A0K(c47z.A3t, this.A00.A3t) && c47z.A6J == c47z.A1f) {
            InterfaceC23621Ds interfaceC23621Ds = this.A02;
            interfaceC23621Ds.resumeWith(c47z.A1C);
            this.A01.A0I(this);
            C57Z.A01(null, interfaceC23621Ds.getContext());
        }
    }

    @Override // X.InterfaceC53852dP
    public final /* synthetic */ void DSR(C47Z c47z) {
    }

    public C56488P6d(C47Z c47z, C40121td c40121td, InterfaceC23621Ds interfaceC23621Ds) {
        this.A00 = c47z;
        this.A02 = interfaceC23621Ds;
        this.A01 = c40121td;
    }
}
