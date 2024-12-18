package X;

/* loaded from: classes11.dex */
public final class U7O implements InterfaceC09670ek, C07W {
    public final int A00;
    public final Object A01;

    public U7O(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        switch (this.A00) {
            case 0:
                ((C65969TxM) this.A01).A00(false);
                return;
            case 1:
                C14360o3.A0B(c07r, 1);
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
