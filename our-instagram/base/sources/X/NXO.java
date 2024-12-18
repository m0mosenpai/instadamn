package X;

/* loaded from: classes9.dex */
public final class NXO extends AbstractC86353t7 {
    public final int A00;
    public final Object A01;

    public NXO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DB6() {
        if (this.A00 != 0) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((O9B) this.A01).A01);
            C57164PZi.A03(A0Z, AbstractC141776au.A00(A0Z), 25);
            return;
        }
        C52776NXh c52776NXh = (C52776NXh) this.A01;
        if (c52776NXh.A09) {
            return;
        }
        C54748OGw c54748OGw = c52776NXh.A01;
        if (c54748OGw == null) {
            C14360o3.A0F("logger");
            throw C00O.createAndThrow();
        }
        c54748OGw.A00(C05F.A0N);
    }
}
