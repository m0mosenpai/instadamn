package X;

/* loaded from: classes11.dex */
public final class WPH implements C00V {
    public final int A00;
    public final Object A01;

    public WPH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C00V
    public final /* bridge */ /* synthetic */ void Cv1(Object obj) {
        LRY lry;
        C19L c19l;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(obj, 0);
                lry = (LRY) this.A01;
                c19l = lry.A03;
                interfaceC23621Ds = null;
                i = 7;
                break;
            case 1:
                C14360o3.A0B(obj, 0);
                lry = (LRY) this.A01;
                c19l = lry.A03;
                interfaceC23621Ds = null;
                i = 8;
                break;
            default:
                Boolean bool = (Boolean) obj;
                C14360o3.A0B(bool, 0);
                if (bool.booleanValue()) {
                    C66390UFb c66390UFb = (C66390UFb) this.A01;
                    String A00 = C2FP.A0F().A00("FulfillmentOptionViewModel");
                    C2GS c2gs = c66390UFb.A06;
                    if (!C14360o3.A0K(A00, c2gs.A02())) {
                        c2gs.A0B(A00);
                        return;
                    }
                    return;
                }
                return;
        }
        AbstractC23641Du.A05(AnonymousClass191.A00, new MCH(obj, lry, interfaceC23621Ds, i), c19l);
    }
}
