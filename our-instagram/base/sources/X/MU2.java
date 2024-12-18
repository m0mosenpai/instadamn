package X;

/* loaded from: classes9.dex */
public final class MU2 implements InterfaceC09670ek, C07W {
    public final int A00;
    public final Object A01;

    public MU2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C55023OWx c55023OWx;
        switch (this.A00) {
            case 0:
                C5TM c5tm = (C5TM) this.A01;
                if (c07r != C07R.ON_DESTROY) {
                    return;
                }
                c5tm.A04();
                return;
            case 1:
                ((InterfaceC24741Ir) this.A01).F8s(c07r);
                return;
            case 2:
                C14360o3.A0B(c07r, 1);
                if (c07r != C07R.ON_RESUME) {
                    return;
                }
                OJB ojb = (OJB) this.A01;
                if (CXC.A00(ojb.A03, ojb.A04) == 0) {
                    return;
                }
                ojb.A00();
                return;
            case 3:
                C14360o3.A0B(c07x, 0);
                C14360o3.A0B(c07r, 1);
                ((InterfaceC16620sF) ((InterfaceC74963Ym) this.A01).getValue()).invoke(c07x, c07r);
                return;
            case 4:
                C14360o3.A0B(c07r, 1);
                if (c07r != C07R.ON_DESTROY || (c55023OWx = ((C56355P0q) this.A01).A03.A05) == null) {
                    return;
                }
                c55023OWx.A01();
                return;
            default:
                C14360o3.A0B(c07r, 1);
                if (c07r == C07R.ON_PAUSE) {
                    ((InterfaceC16820sZ) this.A01).invoke();
                    return;
                }
                return;
        }
    }
}
