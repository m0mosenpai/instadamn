package X;

/* renamed from: X.Leq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48614Leq implements InterfaceC57936Pmg {
    public final /* synthetic */ InterfaceC24901Jp A00;

    public C48614Leq(InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = interfaceC24901Jp;
    }

    @Override // X.InterfaceC57936Pmg
    public final void Cxw(String str) {
        InterfaceC24901Jp interfaceC24901Jp = this.A00;
        if (interfaceC24901Jp.isActive()) {
            interfaceC24901Jp.resumeWith(str);
        }
    }
}
