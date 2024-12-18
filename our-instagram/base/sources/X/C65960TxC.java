package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.TxC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65960TxC implements InterfaceC57988PnY {
    public int A00;
    public C65956Tx8 A01;
    public final int A02;
    public final XDu A03;
    public final InterfaceC169497hP A04;
    public final InterfaceC169497hP A05;
    public final boolean A06;
    public final InterfaceC72014XFc A07;
    public final XB6 A08;
    public final XB8 A09;

    public final String A02(UQE uqe) {
        C14360o3.A0B(uqe, 0);
        C9JQ BjO = this.A05.BjO(uqe);
        List list = BjO.A06;
        String str = BjO.A04;
        if (list != null && str != null) {
            return str;
        }
        return "";
    }

    public final String A03(String str) {
        C14360o3.A0B(str, 0);
        C9JQ BjP = this.A05.BjP(str);
        List list = BjP.A06;
        String str2 = BjP.A04;
        if (list != null && str2 != null) {
            return str2;
        }
        return "";
    }

    private final ArrayList A00(String str) {
        ArrayList arrayList = new ArrayList();
        int size = this.A01.A00.size();
        for (int i = 0; i < size; i++) {
            Object obj = this.A01.A00.get(i);
            Object obj2 = this.A01.A01.get(i);
            if (obj instanceof AbstractC65924TwV) {
                AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) obj;
                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
                Tx0 tx0 = (Tx0) obj2;
                if (abstractC65924TwV.A05(str) && this.A07.Ein(abstractC65924TwV, obj2) && !C14360o3.A0K(tx0.A09, "bootstrap") && !(obj instanceof HYY)) {
                    arrayList.add(abstractC65924TwV);
                }
                if (arrayList.size() >= this.A00) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static final List A01(C65960TxC c65960TxC, String str) {
        InterfaceC169497hP interfaceC169497hP = c65960TxC.A05;
        if (interfaceC169497hP instanceof C208199Jd) {
            C14360o3.A0C(interfaceC169497hP, "null cannot be cast to non-null type com.instagram.search.common.typeahead.manager.EndpointTypeaheadCache<*>");
            C14360o3.A0B(str, 0);
            Map map = (Map) ((C208199Jd) interfaceC169497hP).A00.get(str);
            if (map != null) {
                return AbstractC001800i.A0a(map.keySet());
            }
            return C16930sl.A00;
        }
        return new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.VJW, java.lang.Object] */
    public final void A04() {
        ArrayList arrayList;
        ArrayList A0U;
        C65956Tx8 E4n;
        ArrayList arrayList2;
        List list;
        if (this.A08.CZT()) {
            E4n = this.A03.E4m();
        } else {
            String E6U = this.A09.E6U();
            if (this.A06) {
                List A01 = A01(this, E6U);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    UQE uqe = new UQE(E6U, (String) it.next(), 10);
                    C9JQ BjO = this.A05.BjO(uqe);
                    Integer num = BjO.A01;
                    List list2 = BjO.A06;
                    if ((num == C05F.A0C || num == C05F.A01) && list2 != null) {
                        arrayList2 = new ArrayList(list2);
                    } else {
                        arrayList2 = new ArrayList();
                    }
                    if (this.A00 <= 0) {
                        list = new ArrayList();
                    } else {
                        InterfaceC169497hP interfaceC169497hP = this.A04;
                        list = interfaceC169497hP.BjO(uqe).A06;
                        if (list == null) {
                            list = A00(uqe.A01);
                            interfaceC169497hP.AA3(uqe, null, list);
                        }
                    }
                    String A02 = A02(uqe);
                    ?? obj = new Object();
                    obj.A02 = arrayList2;
                    obj.A01 = list;
                    obj.A00 = A02;
                    arrayList3.add(obj);
                }
                E4n = this.A03.E4l(E6U, arrayList3);
            } else {
                C9JQ BjP = this.A05.BjP(E6U);
                Integer num2 = BjP.A01;
                List list3 = BjP.A06;
                if ((num2 == C05F.A0C || num2 == C05F.A01) && list3 != null) {
                    arrayList = new ArrayList(list3);
                } else {
                    arrayList = new ArrayList();
                }
                if (this.A00 <= 0) {
                    A0U = new ArrayList();
                } else {
                    InterfaceC169497hP interfaceC169497hP2 = this.A04;
                    List list4 = interfaceC169497hP2.BjP(E6U).A06;
                    if (list4 == null) {
                        list4 = A00(E6U);
                        interfaceC169497hP2.AA5(E6U, null, list4);
                    }
                    A0U = AbstractC001800i.A0U(list4);
                }
                E4n = this.A03.E4n(E6U, A03(E6U), arrayList, A0U);
            }
        }
        this.A01 = E4n;
    }

    @Override // X.InterfaceC57988PnY
    public final C65956Tx8 B2L() {
        return this.A01;
    }

    public C65960TxC(InterfaceC72014XFc interfaceC72014XFc, XB6 xb6, XB8 xb8, XDu xDu, InterfaceC169497hP interfaceC169497hP, int i, boolean z) {
        JQ0.A1O(interfaceC169497hP, xb8, xb6, xDu, interfaceC72014XFc);
        this.A05 = interfaceC169497hP;
        this.A09 = xb8;
        this.A08 = xb6;
        this.A03 = xDu;
        this.A07 = interfaceC72014XFc;
        this.A06 = z;
        this.A04 = new C208199Jd();
        this.A01 = U24.A00();
        this.A02 = i;
        this.A00 = i;
    }
}
