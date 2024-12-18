package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Rsb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61720Rsb {
    public static final boolean A00(C62620SJd c62620SJd, C51760Mtj c51760Mtj) {
        List A12;
        C14360o3.A0B(c62620SJd, 0);
        String str = c62620SJd.A09.A01;
        if (str == null || (A12 = AbstractC43592JPx.A12(str, (Map) c62620SJd.A0L.A02)) == null) {
            return false;
        }
        return A12.contains(new C50627MWo(c51760Mtj, C05F.A01));
    }
}
