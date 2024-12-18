package X;

import java.util.List;

/* renamed from: X.PuP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58385PuP {
    public static final AbstractC58385PuP A00 = new Object();
    public static final AbstractC58385PuP A01 = new Object();

    public final List A01(Object obj, long j) {
        if (this instanceof Q7R) {
            InterfaceC65688TsA interfaceC65688TsA = (InterfaceC65688TsA) AbstractC58403Puh.A00(obj, j);
            if (!((TZ1) interfaceC65688TsA).A00) {
                InterfaceC65688TsA Cq3 = interfaceC65688TsA.Cq3(AbstractC58320PtC.A01(interfaceC65688TsA));
                C58400Pue.A06(obj, j, Cq3);
                return Cq3;
            }
            return interfaceC65688TsA;
        }
        return C58384PuO.A00(obj, 10, j);
    }
}
