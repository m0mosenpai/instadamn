package X;

/* renamed from: X.CwE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29319CwE implements InterfaceC37128GXp {
    public final int A00;
    public final Object A01;

    public C29319CwE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC37128GXp
    public final void DhE() {
        switch (this.A00) {
            case 0:
                C7VL.A00((C7VL) this.A01).generateResponses(false);
                return;
            case 1:
                C36673GEt.A00((C36673GEt) this.A01);
                return;
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
        }
    }
}
