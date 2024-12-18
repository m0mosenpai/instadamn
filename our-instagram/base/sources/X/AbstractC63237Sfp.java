package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sfp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63237Sfp {
    public static boolean A03(List list, List list2, boolean z, boolean z2) {
        if (list == list2) {
            return true;
        }
        if (!(z2 ^ z)) {
            if (!z) {
                return true;
            }
            if (list != null) {
                return list.equals(list2);
            }
            return false;
        }
        return false;
    }

    public static String A00(int i, Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        for (int i2 = 0; i2 < i; i2++) {
            A1C.append("  ");
        }
        String obj2 = A1C.toString();
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        try {
            if (obj instanceof Map) {
                A1C2.append("{");
                Iterator A15 = AbstractC166997dE.A15((Map) obj);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    Object key = A1K.getKey();
                    Object value = A1K.getValue();
                    int i3 = i + 2;
                    A1C2.append(AnonymousClass001.A15("\n", obj2, A00(i3, key), " ", ":", " ", A00(i3, value)));
                }
                A1C2.append(AnonymousClass001.A0g("\n", A02(obj2), "}"));
            } else if (obj instanceof Collection) {
                A1C2.append("[");
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    A1C2.append(AnonymousClass001.A0g("\n", obj2, A00(i + 2, it.next())));
                }
                A1C2.append(AnonymousClass001.A0g("\n", A02(obj2), "]"));
            } else if (obj instanceof InterfaceC95074Pr) {
                A1C2.append(A01((InterfaceC95074Pr) obj, AbstractC166987dD.A1C(), i));
            } else if (obj instanceof String) {
                StringBuilder A11 = AbstractC166997dE.A11("\"");
                A11.append(obj);
                A1C2.append(AbstractC166997dE.A0x("\"", A11));
            } else {
                AbstractC58318PtA.A1V(A1C2, obj);
            }
        } catch (RuntimeException e) {
            StringBuilder A1C3 = AbstractC166987dD.A1C();
            A1C3.append("Exception occured :");
            AbstractC58318PtA.A1U(A1C3, e);
            A1C2.append(AbstractC166997dE.A0x(e.getMessage(), A1C3));
        }
        return A1C2.toString();
    }

    public static String A01(InterfaceC95074Pr interfaceC95074Pr, StringBuilder sb, int i) {
        String obj;
        StringBuilder A1C;
        String str;
        if (interfaceC95074Pr == null) {
            return "null";
        }
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        for (int i2 = 0; i2 < i; i2++) {
            A1C2.append("  ");
        }
        String obj2 = A1C2.toString();
        Class<?> cls = interfaceC95074Pr.getClass();
        sb.append(cls.getSimpleName());
        sb.append(" ");
        sb.append("(");
        sb.append("\n");
        try {
            boolean z = true;
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType() == C95054Po.class) {
                    field.setAccessible(true);
                    C95054Po c95054Po = (C95054Po) field.get(interfaceC95074Pr);
                    String str2 = c95054Po.A01;
                    Object obj3 = cls.getDeclaredField(str2).get(interfaceC95074Pr);
                    if (!z) {
                        AbstractC50523MSb.A1N(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "\n", sb);
                    }
                    AbstractC58320PtC.A1N(obj2, str2, " ", sb);
                    sb.append(":");
                    sb.append(" ");
                    if (c95054Po.A02.containsKey("sensitive")) {
                        obj = "<SENSITIVE FIELD>";
                    } else if (obj3 == null) {
                        obj = "null";
                    } else {
                        if (obj3 instanceof Map) {
                            sb.append("{");
                            Iterator A15 = AbstractC166997dE.A15((Map) obj3);
                            while (A15.hasNext()) {
                                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                                Object key = A1K.getKey();
                                Object value = A1K.getValue();
                                sb.append("\n");
                                sb.append(obj2);
                                int i3 = i + 2;
                                AbstractC58320PtC.A1N(A00(i3, key), " ", ":", sb);
                                sb.append(" ");
                                sb.append(A00(i3, value));
                            }
                            A1C = AbstractC166997dE.A11("\n");
                            A1C.append(A02(obj2));
                            str = "}";
                        } else if (obj3 instanceof Collection) {
                            sb.append("[");
                            Iterator it = ((Collection) obj3).iterator();
                            while (it.hasNext()) {
                                sb.append(AnonymousClass001.A0g("\n", obj2, A00(i + 2, it.next())));
                            }
                            A1C = AbstractC166997dE.A11("\n");
                            A1C.append(A02(obj2));
                            str = "]";
                        } else if (obj3 instanceof InterfaceC95074Pr) {
                            A01((InterfaceC95074Pr) obj3, sb, i);
                            z = false;
                        } else if (obj3 instanceof String) {
                            A1C = AbstractC166987dD.A1C();
                            str = "\"";
                            A1C.append("\"");
                            A1C.append(obj3);
                        } else {
                            obj = obj3.toString();
                        }
                        obj = AbstractC166997dE.A0x(str, A1C);
                    }
                    sb.append(obj);
                    z = false;
                }
            }
            AbstractC50523MSb.A1N("\n", A02(obj2), sb);
            sb.append(")");
        } catch (Exception e) {
            StringBuilder A1C3 = AbstractC166987dD.A1C();
            A1C3.append("Exception occured :");
            AbstractC58318PtA.A1U(A1C3, e);
            A1C3.append(" ");
            sb.append(AbstractC166997dE.A0x(e.getMessage(), A1C3));
        }
        return sb.toString();
    }

    public static String A02(String str) {
        int length = str.length();
        if (length > 1) {
            return str.substring(0, length - 2);
        }
        return "";
    }
}
