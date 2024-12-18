package X;

/* renamed from: X.Wno, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71092Wno implements InterfaceC70493Ek {
    public final int A00;
    public final Object A01;

    public C71092Wno(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC70493Ek
    public final void DeM() {
        switch (this.A00) {
            case 0:
                V0N.A00((V0N) this.A01);
                return;
            case 1:
                V16 v16 = (V16) this.A01;
                V16.A09(v16);
                V16.A04(v16);
                return;
            case 2:
                V15 v15 = (V15) this.A01;
                v15.A00 = 0;
                v15.A0G.clear();
                v15.A0C = false;
                V15.A02(v15, false);
                return;
            default:
                ((C65823Tug) this.A01).A0F.DcU();
                return;
        }
    }
}
