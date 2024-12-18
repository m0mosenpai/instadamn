package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class D5E extends AbstractC23611Dp implements InterfaceC16600sD {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5E(C33094Eiy c33094Eiy, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(4, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = c33094Eiy;
        this.A05 = str;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A03;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj4;
        C33094Eiy c33094Eiy = (C33094Eiy) this.A04;
        String str = this.A05;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        D5E d5e = new D5E(c33094Eiy, str, interfaceC23621Ds, i);
        d5e.A00 = obj;
        d5e.A01 = obj2;
        d5e.A02 = obj3;
        return d5e.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        AbstractC09560e7.A00(obj);
        List list = (List) this.A00;
        List list2 = (List) this.A01;
        Object obj2 = this.A02;
        if (i != 0) {
            return C33094Eiy.A00((C33094Eiy) this.A04, this.A05, list, list2, C16930sl.A00, (Map) obj2);
        }
        return C33094Eiy.A00((C33094Eiy) this.A04, this.A05, list, list2, (List) obj2, AbstractC06930Yk.A0E());
    }
}
