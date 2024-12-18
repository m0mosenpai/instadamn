package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.5sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129245sm {
    public static final C129245sm A00 = new Object();

    public static final Fragment A00(Fragment fragment, C129245sm c129245sm) {
        List list;
        int size;
        if (fragment.isAdded()) {
            list = fragment.getChildFragmentManager().A0U.A04();
            C14360o3.A0A(list);
        } else {
            list = C16930sl.A00;
        }
        if (list.isEmpty() || list.size() - 1 < 0) {
            return fragment;
        }
        while (true) {
            int i = size - 1;
            Fragment fragment2 = (Fragment) list.get(size);
            if (fragment2 != null && fragment2.isResumed() && fragment2.mUserVisibleHint && !fragment2.isHidden()) {
                return A00(fragment2, c129245sm);
            }
            if (i < 0) {
                return fragment;
            }
            size = i;
        }
    }
}
