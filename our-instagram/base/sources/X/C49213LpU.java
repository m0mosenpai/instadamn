package X;

/* renamed from: X.LpU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49213LpU implements InterfaceC50470MPy {
    public final /* synthetic */ C132035xe A00;
    public final /* synthetic */ C132025xd A01;

    public C49213LpU(C132035xe c132035xe, C132025xd c132025xd) {
        this.A01 = c132025xd;
        this.A00 = c132035xe;
    }

    @Override // X.InterfaceC50470MPy
    public final void onFailure() {
        this.A00.A00();
    }

    @Override // X.InterfaceC50470MPy
    public final void onSuccess() {
        C132025xd c132025xd = this.A01;
        c132025xd.A00.A02(AbstractC46875KoI.A00(c132025xd.A01).A00(), new C49710Lxf(this.A00, c132025xd, false));
    }
}
