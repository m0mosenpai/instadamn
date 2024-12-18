package X;

/* renamed from: X.Omk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55603Omk implements InterfaceC178837wv {
    public final int A00;
    public final Object A01;

    public C55603Omk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC178837wv
    public final void DRi(AbstractC223559ty abstractC223559ty) {
        if (this.A00 != 0) {
            C14360o3.A0B(abstractC223559ty, 0);
            ((OJJ) this.A01).A00(abstractC223559ty);
        } else {
            C14360o3.A0B(abstractC223559ty, 0);
            MX1.A01(((MXA) this.A01).A03).A0B(false, abstractC223559ty.getMessage());
        }
    }
}
