package X;

/* renamed from: X.3Bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69793Bn implements InterfaceC25681Mz {
    public C25671My A00;
    public final Object A01 = new Object();

    @Override // X.InterfaceC25681Mz
    public final InterfaceC25681Mz A9E(InterfaceC41501vz interfaceC41501vz, Class cls) {
        C14360o3.A0B(cls, 0);
        C14360o3.A0B(interfaceC41501vz, 1);
        C25671My c25671My = this.A00;
        if (c25671My != null) {
            c25671My.A03(interfaceC41501vz, cls, this.A01);
            return this;
        }
        throw new IllegalStateException("group was already destroyed");
    }

    @Override // X.InterfaceC25681Mz
    public final InterfaceC25681Mz EFf(InterfaceC41501vz interfaceC41501vz, Class cls) {
        C14360o3.A0B(cls, 0);
        C25671My c25671My = this.A00;
        if (c25671My != null) {
            c25671My.A02(interfaceC41501vz, cls);
        }
        return this;
    }

    @Override // X.InterfaceC25681Mz
    public final /* bridge */ /* synthetic */ void E4s(Object obj) {
        InterfaceC41141vN interfaceC41141vN = (InterfaceC41141vN) obj;
        C25671My c25671My = this.A00;
        if (c25671My != null) {
            c25671My.E4s(interfaceC41141vN);
            return;
        }
        throw new IllegalStateException("group was already destroyed");
    }

    public C69793Bn(C25671My c25671My) {
        this.A00 = c25671My;
    }
}
