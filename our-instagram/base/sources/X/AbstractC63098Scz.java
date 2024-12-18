package X;

import com.facebook.react.modules.intent.IntentModule;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.Scz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63098Scz {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void A00(AbstractC58532Px0 messageLite, StringBuilder buffer, int indent) {
        boolean z;
        int A0H;
        Object obj;
        Method method;
        int length;
        HashSet A1H = AbstractC166987dD.A1H();
        HashMap A1G = AbstractC166987dD.A1G();
        TreeMap treeMap = new TreeMap();
        for (Method method2 : messageLite.getClass().getDeclaredMethods()) {
            if (!Modifier.isStatic(method2.getModifiers()) && method2.getName().length() >= 3) {
                if (method2.getName().startsWith("set")) {
                    A1H.add(method2.getName());
                } else if (AbstractC58322PtE.A1X(method2) && method2.getParameterTypes().length == 0) {
                    AbstractC58323PtF.A1T(method2, A1G, treeMap);
                }
            }
        }
        Iterator A14 = AbstractC166997dE.A14(treeMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            String substring = AbstractC31172DnG.A17(A1K).substring(3);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method = (Method) A1K.getValue()) != null && method.getReturnType().equals(List.class)) {
                length = substring.length() - 4;
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) A1K.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && AbstractC58322PtE.A1X(method)) {
                length = substring.length() - 3;
            } else if (A1H.contains(AnonymousClass001.A0R("set", substring)) && (!substring.endsWith("Bytes") || !AbstractC58323PtF.A1Z(substring, treeMap))) {
                Method method3 = (Method) A1K.getValue();
                Method A0u = AbstractC58322PtE.A0u("has", substring, A1G);
                if (method3 != null) {
                    Object A08 = AbstractC58533Px1.A08(messageLite, method3, new Object[0]);
                    if (A0u == null) {
                        if (A08 instanceof Boolean) {
                            z = !AbstractC166987dD.A1a(A08);
                        } else {
                            if (A08 instanceof Integer) {
                                A0H = AbstractC166987dD.A0H(A08);
                            } else if (A08 instanceof Float) {
                                A0H = Float.floatToRawIntBits(AbstractC166987dD.A09(A08));
                            } else if (A08 instanceof Double) {
                                A0H = (Double.doubleToRawLongBits(MSW.A00(A08)) > 0L ? 1 : (Double.doubleToRawLongBits(MSW.A00(A08)) == 0L ? 0 : -1));
                            } else {
                                if (A08 instanceof String) {
                                    obj = "";
                                } else if (A08 instanceof AbstractC58536Px4) {
                                    obj = AbstractC58536Px4.A01;
                                } else {
                                    if (A08 instanceof AbstractC58532Px0) {
                                        if (A08 == ((AbstractC58533Px1) ((InterfaceC65280ThD) A08)).A0F(C05F.A0j)) {
                                        }
                                    } else if (A08 instanceof Enum) {
                                        A0H = ((Enum) A08).ordinal();
                                    }
                                    A01(A08, substring, buffer, indent);
                                }
                                z = A08.equals(obj);
                            }
                            if (A0H != 0) {
                                A01(A08, substring, buffer, indent);
                            }
                        }
                        if (!z) {
                            A01(A08, substring, buffer, indent);
                        }
                    } else if (AbstractC166987dD.A1a(AbstractC58533Px1.A08(messageLite, A0u, new Object[0]))) {
                        A01(A08, substring, buffer, indent);
                    }
                }
            }
            A01(AbstractC58533Px1.A08(messageLite, method, new Object[0]), substring.substring(0, length), buffer, indent);
        }
        C58555PxV c58555PxV = ((AbstractC58533Px1) messageLite).unknownFields;
        if (c58555PxV != null) {
            for (int i = 0; i < c58555PxV.A00; i++) {
                A01(c58555PxV.A04[i], String.valueOf(c58555PxV.A03[i] >>> 3), buffer, indent);
            }
        }
    }

    public static void A01(Object buffer, String indent, StringBuilder name, int object) {
        String A002;
        if (buffer instanceof List) {
            Iterator A1J = AbstractC25226BEj.A1J(buffer);
            while (A1J.hasNext()) {
                A01(A1J.next(), indent, name, object);
            }
            return;
        }
        if (buffer instanceof Map) {
            Iterator A15 = AbstractC166997dE.A15((Map) buffer);
            while (A15.hasNext()) {
                A01(A15.next(), indent, name, object);
            }
            return;
        }
        name.append('\n');
        int i = object;
        while (i > 0) {
            char[] cArr = A00;
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            name.append(cArr, 0, i2);
            i -= i2;
        }
        if (!indent.isEmpty()) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            AbstractC58321PtD.A1R(A1C, AbstractC58318PtA.A00(indent));
            for (int i3 = 1; i3 < indent.length(); i3++) {
                AbstractC58321PtD.A1R(A1C, AbstractC58323PtF.A01(indent, A1C, i3));
            }
            indent = A1C.toString();
        }
        name.append(indent);
        if (buffer instanceof String) {
            name.append(": \"");
            InterfaceC65432Tk3 interfaceC65432Tk3 = AbstractC58536Px4.A02;
            A002 = S3V.A00(new C58535Px3(((String) buffer).getBytes(AbstractC62398S9x.A04)));
        } else if (buffer instanceof AbstractC58536Px4) {
            name.append(": \"");
            A002 = S3V.A00((AbstractC58536Px4) buffer);
        } else {
            if (buffer instanceof AbstractC58533Px1) {
                name.append(" {");
                A00((AbstractC58532Px0) buffer, name, object + 2);
            } else if (buffer instanceof Map.Entry) {
                name.append(" {");
                Map.Entry entry = (Map.Entry) buffer;
                int i4 = object + 2;
                A01(entry.getKey(), "key", name, i4);
                A01(entry.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE, name, i4);
            } else {
                name.append(": ");
                name.append(buffer);
                return;
            }
            name.append("\n");
            while (object > 0) {
                char[] cArr2 = A00;
                int i5 = 80;
                if (object <= 80) {
                    i5 = object;
                }
                name.append(cArr2, 0, i5);
                object -= i5;
            }
            name.append("}");
            return;
        }
        name.append(A002);
        name.append('\"');
    }
}
