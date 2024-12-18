package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.RsV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61714RsV {
    public static Integer A00(C5G6 c5g6, C58883QEt c58883QEt, Integer num, String str, Map map, boolean z) {
        Integer num2;
        List A12;
        String A02;
        List A122;
        String A022 = AbstractC63387Sj3.A02(str);
        boolean containsKey = map.containsKey(A022);
        Integer num3 = C05F.A00;
        if (c5g6.A04.A07(true)) {
            C62620SJd c62620SJd = c5g6.A00;
            C51760Mtj c51760Mtj = new C51760Mtj(num3, num, num3, 3);
            containsKey = false;
            C14360o3.A0B(c62620SJd, 0);
            QIh qIh = c62620SJd.A09;
            String str2 = qIh.A01;
            if (str2 != null && (A02 = AbstractC63387Sj3.A02(str2)) != null && (A122 = AbstractC43592JPx.A12(A02, (Map) c62620SJd.A0L.A01)) != null) {
                containsKey = A122.contains(new C50627MWo(c51760Mtj, C05F.A01));
            }
            C51760Mtj c51760Mtj2 = new C51760Mtj(num3, num, num3, 3);
            z = false;
            String str3 = qIh.A01;
            if (str3 != null && (A12 = AbstractC43592JPx.A12(str3, (Map) c62620SJd.A0L.A02)) != null) {
                z = A12.contains(new C50627MWo(c51760Mtj2, C05F.A0C));
            }
        }
        if (containsKey && (!AbstractC166987dD.A1a(map.get(A022)) || z)) {
            num2 = num3;
        } else {
            num2 = C05F.A01;
        }
        C62620SJd c62620SJd2 = c5g6.A00;
        boolean A00 = AbstractC61720Rsb.A00(c62620SJd2, new C51760Mtj(num3, num, num3, 3));
        if (c58883QEt != null && !A00 && num2 == num3) {
            if (c62620SJd2.A09.A00 < 2) {
                return C05F.A01;
            }
            return num3;
        }
        return num2;
    }
}
