package X;

/* renamed from: X.LpT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49212LpT implements InterfaceC50470MPy {
    public final /* synthetic */ C132065xh A00;
    public final /* synthetic */ L6Q A01;

    @Override // X.InterfaceC50470MPy
    public final void onFailure() {
    }

    public C49212LpT(C132065xh c132065xh, L6Q l6q) {
        this.A00 = c132065xh;
        this.A01 = l6q;
    }

    @Override // X.InterfaceC50470MPy
    public final void onSuccess() {
        C132065xh c132065xh = this.A00;
        L6Q l6q = this.A01;
        C41761wQ A0S = AbstractC31174DnI.A0S();
        A0S.A02(l6q.A00(), new C49704LxZ(A0S, c132065xh));
    }
}
