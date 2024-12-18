package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JSn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43655JSn {
    public boolean A00;
    public final C42221xC A01;
    public final AbstractC42211xB A02;
    public final C42221xC A04;
    public final C42221xC A05;
    public final C42221xC A06;
    public final C41761wQ A03 = new C41761wQ(null);
    public final HashMap A08 = AbstractC166987dD.A1G();
    public final AbstractC42211xB A07 = C2EP.A00().A0V();

    public final void A00() {
        C41761wQ c41761wQ = this.A03;
        JQn.A00(this.A04, c41761wQ, this, 55);
        for (AbstractC46516KiF abstractC46516KiF : this.A08.values()) {
            C42221xC A00 = abstractC46516KiF.A00(this.A06.A0M(new C43601JQh(abstractC46516KiF, 9)).A0K(new JQI(30)).A0K(new C43597JQd(abstractC46516KiF, 60)));
            AbstractC42211xB abstractC42211xB = this.A07;
            abstractC42211xB.getClass();
            c41761wQ.A02(A00, new JQn(abstractC42211xB, 54));
        }
    }

    public final void A01(MNN mnn) {
        this.A07.accept(mnn);
    }

    public C43655JSn(C42221xC c42221xC, C5Fn c5Fn, List list, List list2) {
        C45682KJt A0V = AbstractC42021ws.A01(new C43618JRb(null)).A0V();
        this.A02 = A0V;
        this.A05 = c42221xC.A0K(new JQI(25)).A0G().A0A();
        this.A01 = AbstractC43592JPx.A0Q(new JQI(26), A0V.A0M(new C43651JSj(1))).A0B();
        final HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC46517KiG abstractC46517KiG = (AbstractC46517KiG) it.next();
            A1G.put(abstractC46517KiG.A01(), abstractC46517KiG);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            AbstractC46516KiF abstractC46516KiF = (AbstractC46516KiF) it2.next();
            this.A08.put(abstractC46516KiF.A01(), abstractC46516KiF);
        }
        C42221xC A08 = C42221xC.A08(Arrays.asList(this.A05.A0G(), this.A07));
        final JQI jqi = new JQI(27);
        AbstractC42051wv abstractC42051wv = A08.A00;
        C6D4 c6d4 = new C6D4() { // from class: X.Jba
            @Override // X.C6D4
            public final Object apply(Object obj) {
                return ((C42221xC) C6D2.this.apply(obj)).A00;
            }
        };
        int i = AbstractC137366Kh.A00;
        AbstractC42141x4.A00(i, "prefetch");
        C42221xC A0O = new C42221xC(new C72103XNx(abstractC42051wv, c6d4, C05F.A00, i)).A0O(c5Fn);
        AbstractC42211xB abstractC42211xB = this.A02;
        YO2 yo2 = new YO2() { // from class: X.JRZ
            @Override // X.YO2
            public final Object apply(Object obj, Object obj2) {
                Object obj3;
                C43655JSn c43655JSn = C43655JSn.this;
                HashMap hashMap = A1G;
                MNN mnn = (MNN) obj;
                C43618JRb c43618JRb = (C43618JRb) obj2;
                if (mnn instanceof C43997Jck) {
                    obj3 = ((C43997Jck) mnn).A00;
                    if (obj3 == null) {
                        C0w9.A03("ReduxStore", "initial state is null");
                    }
                    c43655JSn.A00 = true;
                } else {
                    AbstractC46517KiG abstractC46517KiG2 = (AbstractC46517KiG) hashMap.get(mnn.getClass());
                    obj3 = c43618JRb.A00;
                    if (obj3 == null) {
                        C0w9.A03("ReduxStore", "State is null");
                    }
                    if (abstractC46517KiG2 != null) {
                        mnn.toString();
                        Object cast = abstractC46517KiG2.A01().cast(mnn);
                        cast.getClass();
                        return abstractC46517KiG2.A00((MNN) cast, (InterfaceC37093GWc) obj3);
                    }
                }
                return new C43617JRa(obj3, Collections.emptyList());
            }
        };
        AbstractC42051wv abstractC42051wv2 = A0O.A00;
        AbstractC42051wv abstractC42051wv3 = ((C42221xC) abstractC42211xB).A00;
        C72091XNl c72091XNl = new C72091XNl(yo2);
        AbstractC42141x4.A01(abstractC42051wv3, "other is null");
        C42221xC A0E = new C42221xC(new C72104XNy(c72091XNl, abstractC42051wv2, abstractC42051wv3)).A0E();
        this.A06 = A0E.A0J(new JQI(28)).A0E();
        this.A04 = A0E.A0K(new JQI(29));
    }
}
