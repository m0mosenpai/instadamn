package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.W2b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70083W2b {
    public final List A01 = new ArrayList();
    public final X25 A00 = new X25(C05F.A00);
    public final java.util.Set A03 = new HashSet();
    public final java.util.Set A02 = new HashSet();

    public static final boolean A00(C84923qg c84923qg) {
        C14360o3.A0B(c84923qg, 0);
        if (!AbstractC16960so.A1Q(EnumC84933qh.A03, EnumC84933qh.A02).contains(c84923qg.A06)) {
            if (c84923qg.A0P) {
                if (c84923qg.A01 > 0) {
                    List<C84923qg> list = c84923qg.A0L;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (C84923qg c84923qg2 : list) {
                            if (c84923qg2.A0l && !c84923qg2.A0P) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
