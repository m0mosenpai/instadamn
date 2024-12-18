package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7oE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173627oE {
    public static final boolean A00(C173617oD c173617oD, EnumC173197nX enumC173197nX, EnumC173517o3 enumC173517o3, EnumC173527o4 enumC173527o4) {
        C173577o9 c173577o9 = (C173577o9) c173617oD.A01.get(enumC173517o3);
        if (c173577o9 != null) {
            List<C173567o8> list = c173577o9.A01;
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                for (C173567o8 c173567o8 : list) {
                    if (c173567o8.A00 == EnumC173197nX.IG && c173567o8.A04.contains(enumC173527o4) && c173567o8.A01 == EnumC173547o6.IGNORE) {
                        return true;
                    }
                }
            }
            if (!z || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C173567o8 c173567o82 = (C173567o8) it.next();
                    if (c173567o82.A00 == EnumC173197nX.IG && c173567o82.A04.contains(enumC173527o4)) {
                        EnumC173547o6 enumC173547o6 = c173567o82.A01;
                        EnumC173547o6 enumC173547o62 = EnumC173547o6.ALLOW;
                        if (enumC173547o6 == enumC173547o62) {
                            List<C173567o8> list2 = c173577o9.A00;
                            if ((list2 instanceof Collection) && list2.isEmpty()) {
                                return false;
                            }
                            for (C173567o8 c173567o83 : list2) {
                                if (c173567o83.A00 == enumC173197nX && c173567o83.A04.contains(enumC173527o4) && AbstractC001800i.A0u(AbstractC16960so.A1Q(enumC173547o62, EnumC173547o6.IGNORE), c173567o83.A01)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
