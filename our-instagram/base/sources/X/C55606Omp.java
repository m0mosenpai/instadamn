package X;

/* renamed from: X.Omp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55606Omp implements MPR {
    public final /* synthetic */ InterfaceC24901Jp A00;

    public C55606Omp(InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = interfaceC24901Jp;
    }

    @Override // X.MPR
    public final void Dpk(C22857A6a c22857A6a) {
        InterfaceC24901Jp interfaceC24901Jp = this.A00;
        if (interfaceC24901Jp.isActive()) {
            interfaceC24901Jp.resumeWith(AbstractC166997dE.A0b());
        }
    }

    @Override // X.MPR
    public final void onFailure(Exception exc) {
        InterfaceC24901Jp interfaceC24901Jp = this.A00;
        if (interfaceC24901Jp.isActive()) {
            interfaceC24901Jp.resumeWith(AbstractC166997dE.A0a());
        }
    }
}
