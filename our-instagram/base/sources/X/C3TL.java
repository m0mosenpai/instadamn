package X;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3TL, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3TL {
    public static final C3TM A00 = new Object();

    public static final int A00(String str, String str2, SerialDescriptor serialDescriptor, AbstractC73763Sg abstractC73763Sg) {
        C14360o3.A0B(abstractC73763Sg, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        int A01 = A01(str, serialDescriptor, abstractC73763Sg);
        if (A01 != -3) {
            return A01;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(serialDescriptor.BtR());
        sb.append(" does not contain element with name '");
        sb.append(str);
        sb.append('\'');
        sb.append(str2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final int A01(String str, SerialDescriptor serialDescriptor, AbstractC73763Sg abstractC73763Sg) {
        C14360o3.A0B(abstractC73763Sg, 1);
        C14360o3.A0B(str, 2);
        C73783Si c73783Si = abstractC73763Sg.A00;
        if (c73783Si.A08 && C14360o3.A0K(serialDescriptor.BKw(), C4DE.A00)) {
            str = str.toLowerCase(Locale.ROOT);
            C14360o3.A07(str);
        } else {
            C14360o3.A0K(serialDescriptor.BKw(), C3TE.A00);
            int B0t = serialDescriptor.B0t(str);
            if (B0t != -3 || !c73783Si.A0E) {
                return B0t;
            }
        }
        Number number = (Number) A02(serialDescriptor, abstractC73763Sg).get(str);
        if (number != null) {
            return number.intValue();
        }
        return -3;
    }

    public static final Map A02(final SerialDescriptor serialDescriptor, final AbstractC73763Sg abstractC73763Sg) {
        Object invoke;
        C73813Sl c73813Sl = abstractC73763Sg.A01;
        C3TM c3tm = A00;
        InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.Wyh
            /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
            
                if (X.C14360o3.A0K(r7.BKw(), X.C4DE.A00) == false) goto L6;
             */
            @Override // X.InterfaceC16820sZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    r9 = this;
                    kotlinx.serialization.descriptors.SerialDescriptor r7 = kotlinx.serialization.descriptors.SerialDescriptor.this
                    X.3Sg r0 = r2
                    java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
                    r6.<init>()
                    X.3Si r0 = r0.A00
                    boolean r0 = r0.A08
                    if (r0 == 0) goto L1c
                    X.3RG r1 = r7.BKw()
                    X.4DE r0 = X.C4DE.A00
                    boolean r0 = X.C14360o3.A0K(r1, r0)
                    r8 = 1
                    if (r0 != 0) goto L1d
                L1c:
                    r8 = 0
                L1d:
                    X.3RG r1 = r7.BKw()
                    X.3TE r0 = X.C3TE.A00
                    X.C14360o3.A0K(r1, r0)
                    int r5 = r7.B10()
                    r4 = 0
                L2b:
                    if (r4 >= r5) goto L7c
                    java.util.List r0 = r7.B0p(r4)
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r2 = r0.iterator()
                L3a:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L4c
                    java.lang.Object r1 = r2.next()
                    boolean r0 = r1 instanceof kotlinx.serialization.json.JsonNames
                    if (r0 == 0) goto L3a
                    r3.add(r1)
                    goto L3a
                L4c:
                    java.lang.Object r0 = X.AbstractC001800i.A0N(r3)
                    kotlinx.serialization.json.JsonNames r0 = (kotlinx.serialization.json.JsonNames) r0
                    if (r0 == 0) goto L6c
                    java.lang.String[] r3 = r0.names()
                    if (r3 == 0) goto L6c
                    int r2 = r3.length
                    r1 = 0
                L5c:
                    if (r1 >= r2) goto L6c
                    r0 = r3[r1]
                    if (r8 == 0) goto L66
                    java.lang.String r0 = X.AbstractC167007dF.A0h(r0)
                L66:
                    X.C3TL.A03(r0, r6, r7, r4)
                    int r1 = r1 + 1
                    goto L5c
                L6c:
                    if (r8 == 0) goto L79
                    java.lang.String r0 = r7.B0v(r4)
                    java.lang.String r0 = X.AbstractC167007dF.A0h(r0)
                    X.C3TL.A03(r0, r6, r7, r4)
                L79:
                    int r4 = r4 + 1
                    goto L2b
                L7c:
                    boolean r0 = r6.isEmpty()
                    if (r0 == 0) goto L86
                    X.0sk r6 = X.AbstractC06930Yk.A0E()
                L86:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C71684Wyh.invoke():java.lang.Object");
            }
        };
        C14360o3.A0B(c3tm, 1);
        Map map = c73813Sl.A00;
        Map map2 = (Map) map.get(serialDescriptor);
        if (map2 == null || (invoke = map2.get(c3tm)) == null) {
            invoke = interfaceC16820sZ.invoke();
            C14360o3.A0B(invoke, 2);
            Object obj = map.get(serialDescriptor);
            if (obj == null) {
                obj = new ConcurrentHashMap(2);
                map.put(serialDescriptor, obj);
            }
            ((Map) obj).put(c3tm, invoke);
        }
        return (Map) invoke;
    }

    public static final void A03(String str, Map map, SerialDescriptor serialDescriptor, int i) {
        String str2;
        if (C14360o3.A0K(serialDescriptor.BKw(), C4DE.A00)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The suggested name '");
        sb.append(str);
        sb.append("' for ");
        sb.append(str2);
        sb.append(' ');
        sb.append(serialDescriptor.B0v(i));
        sb.append(" is already one of the names for ");
        sb.append(str2);
        sb.append(' ');
        sb.append(serialDescriptor.B0v(((Number) AbstractC09990gB.A0I(str, map)).intValue()));
        sb.append(" in ");
        sb.append(serialDescriptor);
        String obj = sb.toString();
        C14360o3.A0B(obj, 1);
        throw new IllegalArgumentException(obj);
    }
}
