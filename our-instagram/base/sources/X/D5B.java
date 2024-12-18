package X;

import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class D5B extends AbstractC23611Dp implements InterfaceC16610sE {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5B(C27339C4u c27339C4u, WriteWithAICreationViewModel writeWithAICreationViewModel, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = 2;
        this.A03 = writeWithAICreationViewModel;
        this.A04 = str;
        this.A00 = c27339C4u;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C33094Eiy c33094Eiy;
        String str;
        int i;
        D5B d5b;
        int i2 = this.A02;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        Object obj4 = this.A03;
        switch (i2) {
            case 0:
                c33094Eiy = (C33094Eiy) obj4;
                str = this.A04;
                i = 0;
                d5b = new D5B(c33094Eiy, str, interfaceC23621Ds, i);
                d5b.A00 = obj;
                break;
            case 1:
                c33094Eiy = (C33094Eiy) obj4;
                str = this.A04;
                i = 1;
                d5b = new D5B(c33094Eiy, str, interfaceC23621Ds, i);
                d5b.A00 = obj;
                break;
            default:
                String str2 = this.A04;
                d5b = new D5B((C27339C4u) this.A00, (WriteWithAICreationViewModel) obj4, str2, interfaceC23621Ds);
                break;
        }
        d5b.A01 = obj2;
        return d5b.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        List list;
        Map map;
        C33094Eiy c33094Eiy;
        String str;
        List list2;
        List list3;
        String str2;
        String str3;
        String str4;
        switch (this.A02) {
            case 0:
                AbstractC09560e7.A00(obj);
                list2 = (List) this.A00;
                list = (List) this.A01;
                c33094Eiy = (C33094Eiy) this.A03;
                str = this.A04;
                map = AbstractC06930Yk.A0E();
                list3 = C16930sl.A00;
                break;
            case 1:
                AbstractC09560e7.A00(obj);
                list = (List) this.A00;
                map = (Map) this.A01;
                c33094Eiy = (C33094Eiy) this.A03;
                str = this.A04;
                list2 = C16930sl.A00;
                list3 = list2;
                break;
            default:
                AbstractC09560e7.A00(obj);
                Object obj2 = this.A01;
                WriteWithAICreationViewModel writeWithAICreationViewModel = (WriteWithAICreationViewModel) this.A03;
                C05A c05a = writeWithAICreationViewModel.A0A;
                CAU cau = AbstractC25235BEs.A0g(c05a).A01;
                if (cau instanceof C27339C4u) {
                    C27339C4u c27339C4u = (C27339C4u) cau;
                    if (c27339C4u.A03.isEmpty()) {
                        boolean z = obj2 instanceof CancellationException;
                        String str5 = this.A04;
                        C27339C4u c27339C4u2 = (C27339C4u) this.A00;
                        List list4 = null;
                        if (c27339C4u2 != null) {
                            list4 = c27339C4u2.A03;
                            str2 = c27339C4u2.A00;
                            str3 = c27339C4u2.A01;
                            str4 = c27339C4u2.A02;
                        } else {
                            str2 = null;
                            str3 = null;
                            str4 = null;
                        }
                        WriteWithAICreationViewModel.A05(writeWithAICreationViewModel, AbstractC25235BEs.A0g(c05a).A03, str5, str2, str3, str4, AbstractC25235BEs.A0g(c05a).A04, list4, z);
                    } else {
                        String str6 = this.A04;
                        List list5 = c27339C4u.A04;
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (Object obj3 : list5) {
                            if (obj3 instanceof C29529Czh) {
                                A1E.add(obj3);
                            }
                        }
                        WriteWithAICreationViewModel.A07(writeWithAICreationViewModel, str6, c27339C4u.A00, c27339C4u.A01, c27339C4u.A02, AbstractC25235BEs.A0g(c05a).A04, A1E, false, false);
                    }
                }
                return C0eB.A00;
        }
        return C33094Eiy.A00(c33094Eiy, str, list2, list, list3, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5B(C33094Eiy c33094Eiy, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = c33094Eiy;
        this.A04 = str;
    }
}
