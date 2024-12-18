package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.SQl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62769SQl {
    public static final void A00(C62620SJd c62620SJd, C50627MWo c50627MWo) {
        C14360o3.A0B(c62620SJd, 0);
        String str = c62620SJd.A09.A01;
        if (str != null) {
            C51760Mtj c51760Mtj = c62620SJd.A0L;
            ((List) AbstractC43594JPz.A0s(str, (Map) c51760Mtj.A02)).add(c50627MWo);
            String A02 = AbstractC63387Sj3.A02(str);
            if (A02 != null) {
                ((List) AbstractC43594JPz.A0s(A02, (Map) c51760Mtj.A01)).add(c50627MWo);
            }
        }
    }

    public static void A01(C62620SJd c62620SJd, C51760Mtj c51760Mtj, Integer num) {
        A00(c62620SJd, new C50627MWo(c51760Mtj, num));
    }
}
