package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DI5 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C6NO A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ InterfaceC16660sJ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DI5(C6NO c6no, List list, List list2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3) {
        super(1);
        this.A04 = list;
        this.A03 = c6no;
        this.A02 = i;
        this.A06 = interfaceC16660sJ;
        this.A05 = list2;
        this.A01 = i2;
        this.A00 = i3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5AW c5aw = (C5AW) obj;
        C14360o3.A0B(c5aw, 0);
        List list = this.A04;
        int i = this.A02;
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            c5aw.A07((C59W) obj2, i2 * i, 0);
            i2 = i3;
        }
        List Ep4 = this.A03.Ep4(EnumC27365C5u.A02, C5UA.A03(new C30485DbU(25, this.A06, this.A05), -1188583079));
        int i4 = this.A01;
        int i5 = this.A00;
        Iterator it = Ep4.iterator();
        while (it.hasNext()) {
            c5aw.A07(((InterfaceC1131559d) it.next()).CpF(AbstractC119035aK.A02(i4, i5)), 0, 0);
        }
        return C0eB.A00;
    }
}
