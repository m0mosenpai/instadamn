package X;

import com.facebook.react.modules.intent.IntentModule;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.Sbz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63077Sbz {
    public static final void A02(Object obj, String str, StringBuilder sb, int i) {
        String A00;
        if (obj instanceof List) {
            Iterator A1J = AbstractC25226BEj.A1J(obj);
            while (A1J.hasNext()) {
                A02(A1J.next(), str, sb, i);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator A15 = AbstractC166997dE.A15((Map) obj);
            while (A15.hasNext()) {
                A02(A15.next(), str, sb, i);
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            AbstractC64535TIr abstractC64535TIr = AbstractC64535TIr.A01;
            A00 = AbstractC62237S3i.A00(new RZ1(((String) obj).getBytes(SVC.A04)));
        } else if (obj instanceof AbstractC64535TIr) {
            sb.append(": \"");
            A00 = AbstractC62237S3i.A00((AbstractC64535TIr) obj);
        } else {
            String str2 = "}";
            if (obj instanceof RaB) {
                sb.append(" {");
                A01((TEY) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                A02(entry.getKey(), "key", sb, i4);
                A02(entry.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE, sb, i4);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
            } else {
                sb.append(": ");
                str2 = obj.toString();
            }
            sb.append(str2);
            return;
        }
        sb.append(A00);
        sb.append('\"');
    }

    public static final String A00(String str) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        for (int i = 0; i < str.length(); i++) {
            AbstractC58321PtD.A1R(A1C, AbstractC58323PtF.A01(str, A1C, i));
        }
        return A1C.toString();
    }

    public static void A01(TEY tey, StringBuilder sb, int i) {
        String str;
        boolean z;
        int A0H;
        Object obj;
        Method method;
        String A00;
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        TreeSet treeSet = new TreeSet();
        for (Method method2 : tey.getClass().getDeclaredMethods()) {
            AbstractC58323PtF.A1S(method2, treeSet, A1G2, A1G);
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            if (A1B.startsWith("get")) {
                str = A1B.substring(3);
            } else {
                str = A1B;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String A0s = AbstractC58323PtF.A0s(str);
                method = (Method) A1G.get(A1B);
                if (method != null && method.getReturnType().equals(List.class)) {
                    A00 = A00(A0s);
                    A02(RaB.A02(tey, method, new Object[0]), A00, sb, i);
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String A0R = AnonymousClass001.A0R(str.substring(0, 1).toLowerCase(), str.substring(1, str.length() - 3));
                method = (Method) A1G.get(A1B);
                if (method != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && AbstractC58322PtE.A1X(method)) {
                    A00 = A00(A0R);
                    A02(RaB.A02(tey, method, new Object[0]), A00, sb, i);
                }
            }
            if (A1G2.get(AnonymousClass001.A0R("set", str)) != null && (!str.endsWith("Bytes") || !AbstractC58323PtF.A1Z(str, A1G))) {
                String A0R2 = AnonymousClass001.A0R(str.substring(0, 1).toLowerCase(), str.substring(1));
                Method A0u = AbstractC58322PtE.A0u("get", str, A1G);
                Method A0u2 = AbstractC58322PtE.A0u("has", str, A1G);
                if (A0u != null) {
                    Object A02 = RaB.A02(tey, A0u, new Object[0]);
                    if (A0u2 == null) {
                        if (A02 instanceof Boolean) {
                            z = !AbstractC166987dD.A1a(A02);
                        } else {
                            if (A02 instanceof Integer) {
                                A0H = AbstractC166987dD.A0H(A02);
                            } else if (A02 instanceof Float) {
                                A0H = Float.floatToRawIntBits(AbstractC166987dD.A09(A02));
                            } else if (A02 instanceof Double) {
                                A0H = (Double.doubleToRawLongBits(MSW.A00(A02)) > 0L ? 1 : (Double.doubleToRawLongBits(MSW.A00(A02)) == 0L ? 0 : -1));
                            } else {
                                if (A02 instanceof String) {
                                    obj = "";
                                } else if (A02 instanceof AbstractC64535TIr) {
                                    obj = AbstractC64535TIr.A01;
                                } else {
                                    if (A02 instanceof TEY) {
                                        if (A02 == ((InterfaceC65446TkI) A02).AwH()) {
                                        }
                                    } else if (A02 instanceof Enum) {
                                        A0H = ((Enum) A02).ordinal();
                                    }
                                    A02(A02, A00(A0R2), sb, i);
                                }
                                z = A02.equals(obj);
                            }
                            if (A0H != 0) {
                                A02(A02, A00(A0R2), sb, i);
                            }
                        }
                        if (!z) {
                            A02(A02, A00(A0R2), sb, i);
                        }
                    } else if (AbstractC166987dD.A1a(RaB.A02(tey, A0u2, new Object[0]))) {
                        A02(A02, A00(A0R2), sb, i);
                    }
                }
            }
        }
        C62964SZh c62964SZh = ((RaB) tey).unknownFields;
        if (c62964SZh != null) {
            for (int i2 = 0; i2 < c62964SZh.A00; i2++) {
                A02(c62964SZh.A02[i2], String.valueOf(c62964SZh.A01[i2] >>> 3), sb, i);
            }
        }
    }
}
