package X;

import java.util.Iterator;

/* renamed from: X.9zi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226869zi {
    public static final boolean A00(C115475Kh c115475Kh, boolean z, boolean z2) {
        int i = z ? 1 : 0;
        if (z2) {
            i = (z ? 1 : 0) + 1;
        }
        Iterator it = AbstractC22785A3d.A00.iterator();
        while (it.hasNext()) {
            String str = ((EnumC223059sk) it.next()).A02;
            if (C14360o3.A0K(str, c115475Kh.A0M) && !z) {
                i++;
            }
            if (C14360o3.A0K(str, c115475Kh.A0N) && !z2) {
                i++;
            }
        }
        if (c115475Kh.A08 - c115475Kh.A09 < i * C8S8.DEFAULT_SWIPE_ANIMATION_DURATION) {
            return false;
        }
        return true;
    }
}
