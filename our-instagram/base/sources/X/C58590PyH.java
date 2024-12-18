package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.PyH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58590PyH extends C103434lJ {
    public static final C58591PyI A01 = new Object();
    public Map A00 = AbstractC06930Yk.A0E();

    public static final C58590PyH A00(C16L c16l) {
        long currentMonotonicTimestamp = C006802i.A0p.currentMonotonicTimestamp();
        C58590PyH c58590PyH = new C58590PyH();
        HashMap A012 = AbstractC102854kM.A01(new C102754kC(c16l));
        c58590PyH.A00 = A012;
        C58588PyF c58588PyF = new C58588PyF(c16l, AbstractC166997dE.A14(A012));
        c58588PyF.Csy();
        C102824kJ c102824kJ = AbstractC102784kF.A00(null, c58588PyF).A00;
        if (c102824kJ != null) {
            long currentMonotonicTimestamp2 = C006802i.A0p.currentMonotonicTimestamp();
            c58590PyH.A02 = c102824kJ;
            c58590PyH.A01 = currentMonotonicTimestamp;
            ((C103434lJ) c58590PyH).A00 = currentMonotonicTimestamp2;
            return c58590PyH;
        }
        throw MSW.A0y("failed to parse bloks payload");
    }
}
