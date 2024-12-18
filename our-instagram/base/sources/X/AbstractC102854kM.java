package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4kM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102854kM {
    public static Object A00(InterfaceC102764kD interfaceC102764kD) {
        String str;
        if (interfaceC102764kD.E3x() == C05F.A0C) {
            return A01(interfaceC102764kD);
        }
        Integer E3x = interfaceC102764kD.E3x();
        Integer num = C05F.A00;
        if (E3x == num) {
            ArrayList arrayList = new ArrayList();
            if (interfaceC102764kD.E3x() != num) {
                return arrayList;
            }
            while (interfaceC102764kD.Csy() != C05F.A01) {
                arrayList.add(A00(interfaceC102764kD));
            }
            return arrayList;
        }
        if (interfaceC102764kD.E3x() == C05F.A1I) {
            return null;
        }
        if (interfaceC102764kD.E3x() == C05F.A1F) {
            return Boolean.valueOf(interfaceC102764kD.E3y().AE8());
        }
        if (interfaceC102764kD.E3x() == C05F.A15) {
            Number Ctf = interfaceC102764kD.E3y().Ctf();
            if (Ctf instanceof Long) {
                return Long.valueOf(Ctf.longValue());
            }
            return Double.valueOf(Ctf.doubleValue());
        }
        if (interfaceC102764kD.E3x() == C05F.A0j) {
            return interfaceC102764kD.E3y().Ep1();
        }
        Integer E3x2 = interfaceC102764kD.E3x();
        if (E3x2 != null) {
            str = AbstractC62263S4i.A00(E3x2);
        } else {
            str = "null";
        }
        throw new IllegalStateException(AnonymousClass001.A0R("unsupported token type ", str));
    }

    public static HashMap A01(InterfaceC102764kD interfaceC102764kD) {
        if (interfaceC102764kD.E3x() == C05F.A0C) {
            HashMap hashMap = new HashMap();
            while (interfaceC102764kD.Csy() != C05F.A0N) {
                String E3u = interfaceC102764kD.E3u();
                interfaceC102764kD.Csy();
                hashMap.put(E3u, A00(interfaceC102764kD));
            }
            return hashMap;
        }
        return null;
    }
}
