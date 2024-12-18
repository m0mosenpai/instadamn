package X;

/* renamed from: X.TtI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C65743TtI implements InterfaceC51052Wb {
    public C6TH A00;
    public C79243gV A01;
    public boolean A02;
    public final C2WS A03;
    public final C51092Wf A04;

    public C51092Wf A00() {
        return this.A04;
    }

    public final void A01(C79243gV c79243gV) {
        if (!C14360o3.A0K(this.A01, c79243gV)) {
            if (c79243gV == null) {
                A00().A0C();
            }
            this.A01 = c79243gV;
            this.A03.requestLayout();
        }
    }

    public C65743TtI(C2WS c2ws) {
        this.A03 = c2ws;
        this.A04 = new C51092Wf(c2ws, C1LN.A01);
    }

    @Override // X.InterfaceC51052Wb
    public final void Ctb() {
        AbstractC87343us.A00(this.A03, A00());
    }

    @Override // X.InterfaceC51052Wb
    public final void DeQ(Long l) {
        AbstractC87343us.A02(A00(), l);
    }

    @Override // X.InterfaceC51052Wb
    public final void Dwi() {
        AbstractC87343us.A01(A00());
    }

    @Override // X.InterfaceC51052Wb
    public final void setRenderTreeUpdateListener(InterfaceC66812zy interfaceC66812zy) {
        A00().A0H(interfaceC66812zy);
    }
}
