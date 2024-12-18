package X;

import java.util.Map;

/* renamed from: X.9aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212059aa extends AbstractC51572Yf {
    public final AbstractC50812Vc A00;
    public final C09530e4[] A01;
    public final C09530e4[] A02;

    public C212059aa(AbstractC50812Vc abstractC50812Vc, C09530e4[] c09530e4Arr, C09530e4[] c09530e4Arr2) {
        C14360o3.A0B(abstractC50812Vc, 3);
        this.A01 = c09530e4Arr;
        this.A02 = c09530e4Arr2;
        this.A00 = abstractC50812Vc;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C09530e4[] c09530e4Arr = this.A01;
        if (c09530e4Arr != null) {
            for (C09530e4 c09530e4 : c09530e4Arr) {
                Class cls = (Class) c09530e4.A00;
                Object obj = c09530e4.A01;
                C2XE c2xe = c76223bS.A05;
                if (!c2xe.A0B) {
                    c2xe.A07 = AbstractC170427iv.A00(c2xe.A07);
                    c2xe.A0B = true;
                }
                C2XU c2xu = c2xe.A07;
                if (c2xu != null) {
                    C14360o3.A0B(cls, 0);
                    C170187iX c170187iX = new C170187iX(cls);
                    Map map = c2xu.A00;
                    C14360o3.A06(map);
                    map.put(c170187iX, obj);
                }
            }
        }
        C09530e4[] c09530e4Arr2 = this.A02;
        if (c09530e4Arr2 != null) {
            for (C09530e4 c09530e42 : c09530e4Arr2) {
                InterfaceC75873as interfaceC75873as = (InterfaceC75873as) c09530e42.A00;
                Object obj2 = c09530e42.A01;
                C2XE c2xe2 = c76223bS.A05;
                if (!c2xe2.A0B) {
                    c2xe2.A07 = AbstractC170427iv.A00(c2xe2.A07);
                    c2xe2.A0B = true;
                }
                C2XU c2xu2 = c2xe2.A07;
                if (c2xu2 != null) {
                    c2xu2.A01(interfaceC75873as, obj2);
                }
            }
        }
        return this.A00;
    }
}
