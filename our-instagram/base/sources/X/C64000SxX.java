package X;

/* renamed from: X.SxX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64000SxX implements InterfaceC48212Jk {
    public final /* synthetic */ C62610SIs A00;

    public C64000SxX(C62610SIs c62610SIs) {
        this.A00 = c62610SIs;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C62610SIs c62610SIs = this.A00;
        AbstractC167007dF.A1C(th);
        C41061vE c41061vE = c62610SIs.A02.A07;
        String str = c62610SIs.A04;
        String str2 = c62610SIs.A00.A02;
        C14360o3.A07(str2);
        c41061vE.A03(str, str2, th.getMessage());
        InterfaceC196048lu interfaceC196048lu = c62610SIs.A03;
        if (interfaceC196048lu != null) {
            interfaceC196048lu.onFailure();
        }
    }
}
