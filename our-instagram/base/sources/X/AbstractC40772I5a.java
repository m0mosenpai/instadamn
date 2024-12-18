package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I5a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40772I5a {
    public static Map A00(InterfaceC43550JLk interfaceC43550JLk) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43550JLk.CBD() != null) {
            A1I.put("ts", interfaceC43550JLk.CBD());
        }
        AbstractC37302Gc3.A1T(interfaceC43550JLk.CDj(), A1I);
        if (interfaceC43550JLk.CH3() != null) {
            A1I.put("vote", AbstractC166997dE.A0f(interfaceC43550JLk.CH3()));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
