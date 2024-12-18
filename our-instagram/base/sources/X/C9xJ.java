package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xJ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xJ {
    public static Map A00(InterfaceC106844rl interfaceC106844rl) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC106844rl.B2A() != null) {
            A1I.put(AbstractC43591JPw.A00(38), interfaceC106844rl.B2A());
        }
        if (interfaceC106844rl.getStartTimestamp() != null) {
            A1I.put("start_timestamp", interfaceC106844rl.getStartTimestamp());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
