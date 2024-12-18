package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class DID extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final long A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DID(Object obj, Object obj2, float f, float f2, float f3, float f4, int i, long j) {
        super(1);
        this.A04 = i;
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A05 = j;
        this.A00 = f4;
        this.A07 = obj;
        this.A06 = obj2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A04 != 0) {
            COW cow = (COW) obj;
            C14360o3.A0B(cow, 0);
            if (((C26310BkH) this.A07).A00.A0B) {
                float f = this.A03;
                long A00 = CXD.A00(f, 0.0f);
                List list = cow.A00;
                list.add(new C26095Bgf(A00, 1));
                list.add(new C26095Bgf(CXD.A00(f, AbstractC25228BEl.A0A((C2YS) this.A06, this.A05)), 0));
            }
            float f2 = this.A03;
            long A002 = CXD.A00(f2, 0.0f);
            List list2 = cow.A00;
            list2.add(new C26095Bgf(A002, 1));
            float f3 = this.A01;
            list2.add(new C26098Bgi(CXD.A00(f2, f3), CXD.A00(this.A02, f3), 1));
            list2.add(new C26095Bgf(CXD.A00(this.A00, f3), 0));
        } else {
            InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
            AbstractC25230BEn.A19(interfaceC1129057z);
            float A003 = AbstractC25226BEj.A00(interfaceC1129057z, this.A03, AbstractC25229BEm.A00(interfaceC1129057z) * 0.8333333f);
            float f4 = this.A02;
            float EqT = A003 - interfaceC1129057z.EqT(f4 / 2.0f);
            float f5 = this.A01;
            long A004 = AbstractC119395aw.A00(A003, A003);
            long j = this.A05;
            float f6 = this.A00;
            C2DC c2dc = (C2DC) this.A07;
            C5YV c5yv = (C5YV) this.A06;
            AnonymousClass588 AzL = interfaceC1129057z.AzL();
            AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
            AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
            long A08 = AbstractC25227BEk.A08(anonymousClass586);
            try {
                C58A c58a = anonymousClass587.A01;
                c58a.EL7(A004, f5);
                interfaceC1129057z.AQe(null, C119815bf.A00, interfaceC1129057z.EqT(f6), 1.0f, 3, j, AbstractC119395aw.A00(A003, A003));
                c58a.F8X(EqT, EqT);
                try {
                    c2dc.A01(c5yv, interfaceC1129057z, 1.0f, C5YB.A00(interfaceC1129057z.EqT(f4), interfaceC1129057z.EqT(f4)));
                } finally {
                    float f7 = -EqT;
                    c58a.F8X(f7, f7);
                }
            } finally {
                AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
            }
        }
        return C0eB.A00;
    }
}
