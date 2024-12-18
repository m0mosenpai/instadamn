package X;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CBW {
    public static final void A00(C113525Ap c113525Ap, InterfaceC16660sJ interfaceC16660sJ, int i) {
        C57S c57s = new C57S(new C113525Ap[16]);
        while (true) {
            c57s.A05(c57s.A00, c113525Ap.A08(false, false));
            while (true) {
                int i2 = c57s.A00;
                if (i2 != 0) {
                    c113525Ap = (C113525Ap) c57s.A00(i2 - 1);
                    C59U A05 = c113525Ap.A05();
                    if (A05 == null || !A05.A0j()) {
                        C113505An c113505An = c113525Ap.A05;
                        C113565At c113565At = AbstractC113545Ar.A0B;
                        Map map = c113505An.A02;
                        if (!map.containsKey(c113565At) && !map.containsKey(AbstractC113545Ar.A03)) {
                            C59U A052 = c113525Ap.A05();
                            if (A052 != null) {
                                C28268CdD A00 = AbstractC27486CBh.A00(AbstractC119495b6.A01(A052));
                                if (A00.A01 < A00.A02 && A00.A03 < A00.A00) {
                                    Object A002 = C5B6.A00(c113505An, AbstractC120875de.A0K);
                                    C6OK c6ok = (C6OK) C5B6.A00(c113505An, AbstractC113545Ar.A0W);
                                    if (A002 != null && c6ok != null && AbstractC166987dD.A09(c6ok.A00.invoke()) > 0.0f) {
                                        int i3 = i + 1;
                                        interfaceC16660sJ.invoke(new CU2(A052, c113525Ap, A00, i3));
                                        A00(c113525Ap, interfaceC16660sJ, i3);
                                    }
                                }
                            } else {
                                AbstractC28290Cdc.A02("Expected semantics node to have a coordinator.");
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
