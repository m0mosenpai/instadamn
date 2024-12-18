package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DIT extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIT(Object obj, Object obj2, Object obj3, float f, float f2, float f3, int i, long j, long j2, boolean z) {
        super(1);
        this.A03 = i;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A04 = j;
        this.A07 = obj;
        this.A09 = z;
        this.A05 = j2;
        this.A06 = obj2;
        this.A08 = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, X.699] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Float valueOf;
        Float valueOf2;
        Object obj2;
        if (this.A03 != 0) {
            C137576Ld c137576Ld = (C137576Ld) obj;
            C14360o3.A0B(c137576Ld, 0);
            C119145aW c119145aW = new C119145aW(C5YC.A02(c137576Ld.A00.Bxc()) / c137576Ld.Awk());
            C119145aW c119145aW2 = new C119145aW(0.0f);
            if (c119145aW.compareTo(c119145aW2) < 0) {
                c119145aW = c119145aW2;
            }
            float f = c119145aW.A00;
            float f2 = this.A01;
            float f3 = this.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A06;
            List A0a = AbstractC001800i.A0a((Iterable) interfaceC74953Yl.getValue());
            int i = (int) (f / (f2 + f3));
            ArrayList A1E = AbstractC166987dD.A1E();
            if (!A0a.isEmpty()) {
                if (i >= 1) {
                    float size = A0a.size() / i;
                    A1E.add(AbstractC001800i.A0I(A0a));
                    int i2 = i - 1;
                    for (int i3 = 1; i3 < i2; i3++) {
                        double d = i3 * size;
                        double floor = Math.floor(d);
                        int ceil = (int) Math.ceil(d);
                        int i4 = (int) floor;
                        float f4 = (float) (d - floor);
                        if (i4 < A0a.size() && ceil < A0a.size()) {
                            float A04 = AbstractC167007dF.A04(A0a, i4);
                            obj2 = Float.valueOf(A04 + ((AbstractC167007dF.A04(A0a, ceil) - A04) * f4));
                        } else {
                            obj2 = A1E.get(i3 - 1);
                        }
                        A1E.add(obj2);
                    }
                    if (i >= 2 && A0a.size() >= 2) {
                        A1E.add(AbstractC001800i.A0K(A0a));
                    }
                }
            } else {
                for (int i5 = 0; i5 < i; i5++) {
                    A1E.add(Float.valueOf(0.0f));
                }
            }
            interfaceC74953Yl.Egh(A1E);
            float f5 = this.A02;
            long j = this.A04;
            DRU A00 = DRU.A00(new DIT(this.A07, interfaceC74953Yl, this.A08, f5, f2, f3, 0, j, this.A05, this.A09), 25);
            ?? obj3 = new Object();
            obj3.A00 = A00;
            c137576Ld.A01 = obj3;
            return obj3;
        }
        InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
        List list = (List) AbstractC25226BEj.A1A(this.A06);
        float f6 = this.A02;
        float f7 = this.A01;
        float f8 = this.A00;
        long j2 = this.A04;
        Iterator it = list.iterator();
        float f9 = 0.0f;
        while (it.hasNext()) {
            C119145aW c119145aW3 = new C119145aW(AbstractC166987dD.A09(it.next()) * f6);
            C119145aW c119145aW4 = new C119145aW(f7);
            if (c119145aW3.compareTo(c119145aW4) < 0) {
                c119145aW3 = c119145aW4;
            }
            float f10 = c119145aW3.A00;
            long A002 = AbstractC119395aw.A00(f9, A0c.EqT(AbstractC25227BEk.A00(f6, f10)));
            long A003 = C5YB.A00(A0c.EqT(f7), A0c.EqT(f10));
            float EqT = A0c.EqT(f7);
            A0c.AR4(null, C119815bf.A00, 1.0f, 3, j2, A002, A003, AbstractC137636Lj.A00(EqT, EqT));
            f9 += AbstractC25226BEj.A00(A0c, f8, A0c.EqT(f7));
        }
        float f11 = ((C66625UPn) AbstractC25226BEj.A1C(this.A07)).A01;
        InterfaceC74953Yl interfaceC74953Yl2 = (InterfaceC74953Yl) this.A08;
        float A03 = f11 * AbstractC25231BEo.A03(interfaceC74953Yl2);
        if (this.A09) {
            valueOf = Float.valueOf((-1.0f) * A03);
            valueOf2 = Float.valueOf(AbstractC25231BEo.A03(interfaceC74953Yl2));
        } else {
            valueOf = Float.valueOf(A03);
            valueOf2 = Float.valueOf(0.0f);
        }
        float floatValue = valueOf.floatValue();
        A0c.AR1(null, C119815bf.A00, 1.0f, 5, this.A05, AbstractC119395aw.A00(valueOf2.floatValue(), 0.0f), C5YB.A00(floatValue, A0c.EqT(f6)));
        return C0eB.A00;
    }
}
