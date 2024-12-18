package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S5S {
    public static final C58252li A00(Map map) {
        C14360o3.A0B(map, 0);
        SF6 sf6 = new SF6(map.keySet());
        ArrayList A1E = AbstractC166987dD.A1E();
        C58252li A0I = AbstractC58318PtA.A0I();
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            SMY smy = (SMY) A16.next();
            A0I.A0E(smy.A02, new C63617SqP(3, A1E, A0I, sf6, smy));
        }
        return A0I;
    }
}
