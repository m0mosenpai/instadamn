package X;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class Q0B {
    public static final Q0E A00(Q06 q06, List list) {
        C192948ga c192948ga;
        C102794kG c102794kG;
        C102824kJ c102824kJ;
        HashMap A1G = AbstractC166987dD.A1G();
        String str = null;
        String str2 = null;
        for (C62516SEs c62516SEs : q06.A00) {
            String str3 = c62516SEs.A01;
            if (str3 != null && (c192948ga = c62516SEs.A00) != null && (c102794kG = c192948ga.A00) != null && (c102824kJ = c102794kG.A00) != null) {
                if (str2 == null) {
                    str2 = c102824kJ.A05;
                }
                if (str == null) {
                    str = c102824kJ.A04;
                }
                A1G.put(str3, C1338462s.A03(null, c102824kJ, list));
            }
        }
        return new Q0E(A1G, str, str2);
    }
}
