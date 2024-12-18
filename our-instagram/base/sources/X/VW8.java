package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VW8 {
    public static final int A00(List list, int i) {
        C14360o3.A0B(list, 0);
        int binarySearch = Collections.binarySearch(list, Integer.valueOf(i));
        if (binarySearch < 0) {
            return Math.min(Math.max(0, ((-binarySearch) - 1) - 1), list.size() - 1);
        }
        return binarySearch;
    }
}
