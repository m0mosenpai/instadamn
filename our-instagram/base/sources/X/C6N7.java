package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6N7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6N7 {
    public final C6N2 A00;
    public final InterfaceC16820sZ A01;
    public final Map A02 = new LinkedHashMap();

    public final Object A00(Object obj) {
        if (obj == null) {
            return null;
        }
        C6O6 c6o6 = (C6O6) this.A02.get(obj);
        if (c6o6 != null) {
            return c6o6.A02;
        }
        C6O2 c6o2 = (C6O2) this.A01.invoke();
        int BHP = c6o2.BHP(obj);
        if (BHP != -1) {
            return c6o2.ArA(BHP);
        }
        return null;
    }

    public final InterfaceC16620sF A01(Object obj, Object obj2, int i) {
        Map map = this.A02;
        C6O6 c6o6 = (C6O6) map.get(obj);
        if (c6o6 == null || c6o6.A00 != i || !C14360o3.A0K(c6o6.A02, obj2)) {
            c6o6 = new C6O6(this, obj, obj2, i);
            map.put(obj, c6o6);
        }
        InterfaceC16620sF interfaceC16620sF = c6o6.A01;
        if (interfaceC16620sF == null) {
            C5TR c5tr = new C5TR(1403994769, true, new C207169Ev(0, c6o6.A04, c6o6));
            c6o6.A01 = c5tr;
            return c5tr;
        }
        return interfaceC16620sF;
    }

    public C6N7(C6N2 c6n2, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c6n2;
        this.A01 = interfaceC16820sZ;
    }
}
