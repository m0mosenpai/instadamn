package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.EuE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33664EuE {
    public static Map A00(InterfaceC37262GbF interfaceC37262GbF) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37262GbF.BJ1() != null) {
            List<InterfaceC37273GbQ> BJ1 = interfaceC37262GbF.BJ1();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC37273GbQ interfaceC37273GbQ : BJ1) {
                if (interfaceC37273GbQ != null) {
                    A1E.add(interfaceC37273GbQ.F7o());
                }
            }
            A1I.put("interests", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
