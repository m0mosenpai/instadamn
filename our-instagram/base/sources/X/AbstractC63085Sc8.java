package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Sc8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63085Sc8 {
    public static C63136Sdh A00 = C63136Sdh.A01("k");

    public static ArrayList A00(SQ2 sq2, InterfaceC65311Thn interfaceC65311Thn, THX thx, float f, boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (thx.A0E() == C05F.A0j) {
            sq2.A03("Lottie doesn't support expressions.");
            return A1E;
        }
        thx.A0J();
        while (thx.A0Q()) {
            if (thx.A0D(A00) != 0) {
                thx.A0N();
            } else if (thx.A0E() == C05F.A00) {
                thx.A0I();
                if (thx.A0E() == C05F.A0u) {
                    C63136Sdh c63136Sdh = AbstractC63110SdE.A00;
                    A1E.add(new C63366SiP(interfaceC65311Thn.E3O(thx, f)));
                } else {
                    while (thx.A0Q()) {
                        A1E.add(AbstractC63110SdE.A01(sq2, interfaceC65311Thn, thx, f, true, z));
                    }
                }
                thx.A0K();
            } else {
                C63136Sdh c63136Sdh2 = AbstractC63110SdE.A00;
                A1E.add(new C63366SiP(interfaceC65311Thn.E3O(thx, f)));
            }
        }
        thx.A0L();
        A01(A1E);
        return A1E;
    }

    public static void A01(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C63366SiP c63366SiP = (C63366SiP) list.get(i2);
            i2++;
            C63366SiP c63366SiP2 = (C63366SiP) list.get(i2);
            c63366SiP.A07 = Float.valueOf(c63366SiP2.A0A);
            if (c63366SiP.A08 == null && c63366SiP2.A0E != null) {
                c63366SiP.A08 = c63366SiP2.A0E;
                if (c63366SiP instanceof C58811QAu) {
                    ((C58811QAu) c63366SiP).A04();
                }
            }
        }
        C63366SiP c63366SiP3 = (C63366SiP) list.get(i);
        if ((c63366SiP3.A0E == null || c63366SiP3.A08 == null) && list.size() > 1) {
            list.remove(c63366SiP3);
        }
    }
}
