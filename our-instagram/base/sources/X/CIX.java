package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CIX {
    public static final List A00(C1132359l[] c1132359lArr) {
        ArrayList A17 = AbstractC25225BEi.A17(c1132359lArr.length);
        for (C1132359l c1132359l : c1132359lArr) {
            long j = c1132359l.A00;
            long j2 = C1132359l.A09;
            A17.add(AbstractC25225BEi.A0S(C5AC.A02(AbstractC1132459m.A0G, (C1132359l.A03(j2) * 0.19999999f) + (C1132359l.A03(j) * 0.8f), (C1132359l.A02(j2) * 0.19999999f) + (C1132359l.A02(j) * 0.8f), (C1132359l.A01(j2) * 0.19999999f) + (C1132359l.A01(j) * 0.8f), 1.0f)));
        }
        return A17;
    }
}
