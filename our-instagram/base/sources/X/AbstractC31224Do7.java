package X;

import java.util.List;

/* renamed from: X.Do7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31224Do7 {
    public static final boolean A02(List list, int i, boolean z, boolean z2) {
        C14360o3.A0B(list, 3);
        if (!A04(list, z, z2)) {
            if (!z && i == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A03(List list, boolean z) {
        AnonymousClass172 anonymousClass172;
        C14360o3.A0B(list, 1);
        if (z || (anonymousClass172 = (AnonymousClass172) AbstractC001800i.A0J(list)) == null || !anonymousClass172.isRestricted()) {
            return false;
        }
        return true;
    }

    public static final boolean A04(List list, boolean z, boolean z2) {
        C14360o3.A0B(list, 2);
        if (!z && !A03(list, z2)) {
            return false;
        }
        return true;
    }

    public static boolean A00(C2EC c2ec) {
        boolean isPending = c2ec.isPending();
        boolean CVQ = c2ec.CVQ();
        return A02(c2ec.BSH(), c2ec.BT2(), isPending, CVQ);
    }

    public static final boolean A01(C2EC c2ec) {
        if (A00(c2ec)) {
            if (!A03(c2ec.BSH(), c2ec.CVQ())) {
                return true;
            }
        }
        return false;
    }
}
