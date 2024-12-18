package X;

import java.util.List;

/* renamed from: X.6wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC154256wa {
    public static final int A00(List list, int i) {
        Object A0O = AbstractC001800i.A0O(list, i);
        if (A0O == null) {
            C0w9.A03("clips_grid_item_access_out_of_bounds", AnonymousClass001.A0n("Trying to access item at index ", ", but only ", " items were available.", i, list.size()));
        } else if (!(A0O instanceof C153996w8) && !(A0O instanceof C154006w9) && !(A0O instanceof C154016wA) && !(A0O instanceof C154026wB) && !(A0O instanceof C153966w5) && !(A0O instanceof C153986w7)) {
            if ((A0O instanceof C153956w4) || (A0O instanceof C153976w6) || (A0O instanceof C27063Bwm)) {
                return 3;
            }
            throw new IllegalStateException(MSV.A00(18));
        }
        return 1;
    }
}
