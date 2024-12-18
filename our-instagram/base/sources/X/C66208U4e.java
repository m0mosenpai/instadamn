package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.U4e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66208U4e {
    public static final String A00(Integer num, String str, List list, int i) {
        String str2;
        C14360o3.A0B(str, 1);
        if (list != null) {
            str2 = C6AS.A00(num, list.subList(0, i));
        } else {
            str2 = null;
        }
        String A01 = C6AS.A01(str, str2);
        C14360o3.A07(A01);
        return A01;
    }

    public final Object A02(C6FQ c6fq, String str, int i) {
        C14360o3.A0B(str, 1);
        List list = c6fq.A0D;
        if (list != null) {
            if (i <= list.size()) {
                Object A03 = C6AM.A03(c6fq, A00(C05F.A00, str, list, i));
                if (A03 == null) {
                    return C6AM.A03(c6fq, str);
                }
                return A03;
            }
            throw new IllegalArgumentException(AbstractC111324zv.A00(1569));
        }
        throw new IllegalArgumentException("Keypath must be set on environment if trying to getVariableWithScope on a depth larger than 0.");
    }

    public static final Map A01(C6FQ c6fq) {
        Map map = c6fq.A0E;
        if (map == null) {
            C6FG c6fg = c6fq.A03;
            if (c6fg != null) {
                AnonymousClass630 A02 = AnonymousClass634.A02(c6fg);
                C14360o3.A07(A02);
                if (AbstractC79383gk.A03()) {
                    C103054kg c103054kg = A02.A07;
                    if (c103054kg != null) {
                        Map map2 = c103054kg.A01.A08;
                        int size = map2.size();
                        if (size != 0) {
                            if (size != 1) {
                                map = new HashMap(map2);
                            } else {
                                Map.Entry entry = (Map.Entry) AbstractC001800i.A09(map2.entrySet());
                                map = AbstractC06930Yk.A02(new C09530e4(entry.getKey(), entry.getValue()));
                            }
                        } else {
                            map = AbstractC06930Yk.A0E();
                        }
                    } else {
                        C6AV c6av = A02.A05;
                        if (c6av != null) {
                            map = c6av.A07;
                        } else {
                            map = Collections.emptyMap();
                        }
                    }
                    C14360o3.A07(map);
                } else {
                    throw new RuntimeException("Expanded Variables can only be read from the UI Thread");
                }
            } else {
                throw new IllegalStateException("no BloksContext or variables override");
            }
        }
        return map;
    }
}
