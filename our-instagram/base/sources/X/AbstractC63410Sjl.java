package X;

import java.util.List;

/* renamed from: X.Sjl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63410Sjl {
    public static final C63031Sb3 A00;
    public static final C63031Sb3 A01;
    public static final Class A02;

    static {
        Class<?> cls;
        C63031Sb3 c63031Sb3 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        A02 = cls;
        try {
            Class<?> cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            if (cls2 != null) {
                c63031Sb3 = (C63031Sb3) AbstractC58320PtC.A0s(cls2);
            }
        } catch (Throwable unused2) {
        }
        A00 = c63031Sb3;
        A01 = new C63031Sb3();
    }

    public static C63031Sb3 A0C() {
        return A00;
    }

    public static C63031Sb3 A0D() {
        return A01;
    }

    public static boolean A0V(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int A00(InterfaceC65591TnW interfaceC65591TnW, Object obj, int i) {
        return ROC.A00(i << 3) + ROC.A02((InterfaceC65665Tqv) obj, interfaceC65591TnW);
    }

    public static Object A0E(C63031Sb3 c63031Sb3, Object obj, Object obj2, int i, int i2) {
        if (obj2 == null) {
            obj2 = c63031Sb3.A03(obj);
        }
        c63031Sb3.A07(obj2, i, i2);
        return obj2;
    }

    public static void A0G(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FH6(i, z, list);
        }
    }

    public static void A0H(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FFK(i, z, list);
        }
    }

    public static void A0I(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FFM(i, z, list);
        }
    }

    public static void A0J(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FFR(i, z, list);
        }
    }

    public static void A0K(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FFT(i, z, list);
        }
    }

    public static void A0L(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FG2(i, z, list);
        }
    }

    public static void A0M(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FGU(i, z, list);
        }
    }

    public static void A0N(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FGi(i, z, list);
        }
    }

    public static void A0O(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FGo(i, z, list);
        }
    }

    public static void A0P(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FGr(i, z, list);
        }
    }

    public static void A0Q(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FGu(i, z, list);
        }
    }

    public static void A0R(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FGx(i, z, list);
        }
    }

    public static void A0S(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FGz(i, z, list);
        }
    }

    public static void A0T(InterfaceC65599Tno interfaceC65599Tno, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC65599Tno.FH3(i, z, list);
        }
    }

    public static void A0U(Class cls) {
        Class cls2;
        if (!RO8.class.isAssignableFrom(cls) && (cls2 = A02) != null && !cls2.isAssignableFrom(cls)) {
            throw AbstractC166987dD.A12("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static int A01(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RO9) {
            RO9 ro9 = (RO9) list;
            i = 0;
            while (i2 < size) {
                i += ROC.A01(ro9.A04(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ROC.A01(AbstractC31176DnK.A01(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A02(List list) {
        return list.size() * 4;
    }

    public static int A03(List list) {
        return list.size() * 8;
    }

    public static int A04(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RO9) {
            RO9 ro9 = (RO9) list;
            i = 0;
            while (i2 < size) {
                i += ROC.A01(ro9.A04(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ROC.A01(AbstractC31176DnK.A01(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ROC.A01(AbstractC58320PtC.A0A(list, i2));
        }
        return i;
    }

    public static int A06(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RO9) {
            RO9 ro9 = (RO9) list;
            i = 0;
            while (i2 < size) {
                int A04 = ro9.A04(i2);
                i += ROC.A00((A04 >> 31) ^ (A04 + A04));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int A012 = AbstractC31176DnK.A01(list, i2);
                i += ROC.A00((A012 >> 31) ^ (A012 + A012));
                i2++;
            }
        }
        return i;
    }

    public static int A07(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long A0A = AbstractC58320PtC.A0A(list, i2);
            i += ROC.A01((A0A >> 63) ^ (A0A + A0A));
        }
        return i;
    }

    public static int A08(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RO9) {
            RO9 ro9 = (RO9) list;
            i = 0;
            while (i2 < size) {
                i += ROC.A00(ro9.A04(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ROC.A00(AbstractC31176DnK.A01(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A09(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ROC.A01(AbstractC58320PtC.A0A(list, i2));
        }
        return i;
    }

    public static int A0A(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (SSM.A08(i) + 4);
    }

    public static int A0B(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (SSM.A08(i) + 8);
    }

    public static void A0F(C63031Sb3 c63031Sb3, Object obj, Object obj2) {
        c63031Sb3.A08(obj, c63031Sb3.A04(c63031Sb3.A02(obj), c63031Sb3.A02(obj2)));
    }
}
