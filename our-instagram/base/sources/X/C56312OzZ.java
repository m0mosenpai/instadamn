package X;

/* renamed from: X.OzZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56312OzZ implements InterfaceC25188BCl {
    public final /* synthetic */ C54635OBk A00;
    public final /* synthetic */ C128175qm A01;

    public C56312OzZ(C54635OBk c54635OBk, C128175qm c128175qm) {
        this.A00 = c54635OBk;
        this.A01 = c128175qm;
    }

    @Override // X.InterfaceC25188BCl
    public final void onFailure() {
        this.A00.A02.invoke(this.A01);
    }

    @Override // X.InterfaceC25188BCl
    public final void onSuccess() {
        this.A00.A01.invoke();
    }
}
