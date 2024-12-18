package X;

/* renamed from: X.IqM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42419IqM implements InterfaceC71925XAj {
    public final int A00;
    public final Object A01;

    public C42419IqM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71925XAj
    public final void DcU() {
        if (this.A00 != 0) {
            C38934HCh c38934HCh = (C38934HCh) this.A01;
            if (!c38934HCh.A0K.isLoading()) {
                C38934HCh.A05(c38934HCh, true);
                return;
            }
            return;
        }
        ((C38288GsX) this.A01).A0C();
    }
}
