package X;

/* renamed from: X.Ptf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58344Ptf implements InterfaceC09670ek {
    public final InterfaceC65626Tpm A00;
    public final InterfaceC09670ek A01;

    public C58344Ptf(InterfaceC65626Tpm interfaceC65626Tpm, InterfaceC09670ek interfaceC09670ek) {
        C14360o3.A0B(interfaceC65626Tpm, 1);
        this.A00 = interfaceC65626Tpm;
        this.A01 = interfaceC09670ek;
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C14360o3.A0B(c07x, 0);
        C14360o3.A0B(c07r, 1);
        switch (c07r) {
            case ON_CREATE:
                this.A00.onCreate(c07x);
                break;
            case ON_START:
                this.A00.onStart(c07x);
                break;
            case ON_RESUME:
                this.A00.onResume(c07x);
                break;
            case ON_PAUSE:
                this.A00.onPause(c07x);
                break;
            case ON_STOP:
                this.A00.onStop(c07x);
                break;
            case ON_DESTROY:
                this.A00.onDestroy(c07x);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC09670ek interfaceC09670ek = this.A01;
        if (interfaceC09670ek != null) {
            interfaceC09670ek.DoQ(c07r, c07x);
        }
    }
}
