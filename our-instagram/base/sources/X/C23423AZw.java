package X;

/* renamed from: X.AZw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23423AZw implements InterfaceC25159BBe {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C23423AZw(InterfaceC176207sd interfaceC176207sd, Throwable th, int i) {
        this.A00 = i;
        this.A01 = interfaceC176207sd;
        this.A02 = th;
    }

    @Override // X.InterfaceC25159BBe
    public final void onFinished() {
        ((InterfaceC176207sd) this.A01).onError((Throwable) this.A02);
    }
}
