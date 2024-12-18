package X;

/* renamed from: X.La9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48333La9 implements InterfaceC1350869h {
    public final int A00;
    public final Object A01;

    public C48333La9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1350869h
    public final void cancel() {
        switch (this.A00) {
            case 0:
                C1ON c1on = (C1ON) this.A01;
                c1on.A00 = new C67936V3b(2);
                c1on.cancel();
                return;
            case 1:
                ((U7H) this.A01).A01.cancel(true);
                return;
            default:
                ((C43655JSn) this.A01).A03.A01();
                return;
        }
    }
}
