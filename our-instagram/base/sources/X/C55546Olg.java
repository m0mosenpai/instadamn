package X;

/* renamed from: X.Olg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55546Olg implements InterfaceC65463Tkf {
    public final /* synthetic */ InterfaceC24901Jp A00;

    @Override // X.InterfaceC65463Tkf
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        C14360o3.A0B(obj, 0);
        InterfaceC24901Jp interfaceC24901Jp = this.A00;
        if (interfaceC24901Jp.isActive()) {
            interfaceC24901Jp.resumeWith(obj);
        }
    }

    public C55546Olg(InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = interfaceC24901Jp;
    }

    @Override // X.InterfaceC65463Tkf
    public final /* bridge */ /* synthetic */ void DEG(Object obj) {
        Throwable th = (Throwable) obj;
        C14360o3.A0B(th, 0);
        InterfaceC24901Jp interfaceC24901Jp = this.A00;
        if (interfaceC24901Jp.isActive()) {
            interfaceC24901Jp.resumeWith(MSW.A1D(th));
        }
    }
}
