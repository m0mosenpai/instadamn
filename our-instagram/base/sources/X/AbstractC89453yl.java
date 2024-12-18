package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89453yl {
    public static C89463ym parseFromJson(C16L c16l) {
        Object obj;
        int i;
        C14360o3.A0B(c16l, 0);
        try {
            C89463ym c89463ym = new C89463ym();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("badge_count_map".equals(A0q)) {
                    HashMap hashMap = null;
                    if (c16l.A11() == c16r) {
                        HashMap hashMap2 = new HashMap();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                hashMap2.put(A1P, null);
                            } else {
                                Integer valueOf = Integer.valueOf(c16l.A1D());
                                if (valueOf != null) {
                                    hashMap2.put(A1P, valueOf);
                                }
                            }
                        }
                        hashMap = hashMap2;
                    }
                    C14360o3.A0B(hashMap, 0);
                    c89463ym.A01 = hashMap;
                } else if ("total_count".equals(A0q)) {
                    c89463ym.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            for (Object obj2 : c89463ym.A01.keySet()) {
                C14360o3.A07(obj2);
                String str = (String) obj2;
                Integer num = (Integer) c89463ym.A01.get(str);
                C14360o3.A0B(str, 0);
                Iterator<E> it = EnumC54222eY.A04.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (C14360o3.A0K(((EnumC54222eY) obj).A01, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Object obj3 = (InterfaceC54232eZ) obj;
                if (obj3 == null) {
                    obj3 = new GAO(str, str);
                }
                Map map = c89463ym.A02;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                map.put(obj3, Integer.valueOf(i));
            }
            return c89463ym;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
