package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125935mk {
    public static C19260xA A00(Map map) {
        C19260xA c19260xA = new C19260xA();
        for (Map.Entry entry : map.entrySet()) {
            String A0G = C6BQ.A0G(entry.getKey());
            Object A03 = A03(entry.getValue());
            if (A03 == null) {
                A03 = null;
            }
            C19260xA.A00(c19260xA, A03, A0G);
        }
        return c19260xA;
    }

    public static Object A03(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            C0x9 c0x9 = new C0x9();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Object A03 = A03(it.next());
                if (A03 == null) {
                    str = null;
                } else if (!(A03 instanceof C0x9) && !(A03 instanceof C19260xA)) {
                    if (A03 instanceof Long) {
                        c0x9.A02(((Number) A03).longValue());
                    } else if (A03 instanceof Boolean) {
                        c0x9.A05(((Boolean) A03).booleanValue());
                    } else {
                        str = (String) A03;
                    }
                } else {
                    c0x9.A00.add(A03);
                }
                c0x9.A04(str);
            }
            return c0x9;
        }
        if (obj instanceof Map) {
            return A00((Map) obj);
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            long longValue = number.longValue();
            if (number.doubleValue() == ((long) r5)) {
                return Long.valueOf(longValue);
            }
        }
        return C6BQ.A0G(obj);
    }

    public static Object A01(C6FQ c6fq, C6FW c6fw) {
        InterfaceC11380iw A08;
        if (!AbstractC125945ml.A00()) {
            String str = (String) c6fw.A03(0);
            final String str2 = (String) c6fw.A00.get(1);
            Map map = (Map) c6fw.A03(2);
            if (str2 != null) {
                A08 = new InterfaceC11380iw() { // from class: X.5mn
                    public static final String __redex_internal_original_name = "BKBloksActionLoggingLogEventImpl$1";

                    @Override // X.InterfaceC11380iw
                    public final String getModuleName() {
                        return str2;
                    }
                };
            } else {
                A08 = C6BQ.A08(c6fq);
            }
            C19280xC A00 = C19280xC.A00(A08, str);
            A00.A07.add(EnumC11440j2.A03);
            A00.A04(A00(map));
            A00.A0C("nav_chain", C1QM.A00.A02.A00);
            AbstractC11060iN.A00(C6BQ.A0B(c6fq)).EHW(A00);
        }
        return null;
    }

    public static Object A02(C6FQ c6fq, C6FW c6fw) {
        InterfaceC11380iw A08;
        if (!AbstractC125945ml.A00()) {
            String str = (String) c6fw.A03(0);
            String str2 = (String) c6fw.A00.get(1);
            Map map = (Map) c6fw.A03(2);
            if (str2 != null) {
                A08 = new C29131Csy(str2);
            } else {
                A08 = C6BQ.A08(c6fq);
            }
            C19280xC A00 = C19280xC.A00(A08, str);
            A00.A07.add(EnumC11440j2.A03);
            A00.A04(A00(map));
            AbstractC11060iN.A00(C6BQ.A0B(c6fq)).EIu(A00);
        }
        return null;
    }
}
