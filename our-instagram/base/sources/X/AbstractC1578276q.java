package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.76q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1578276q {
    public static final Comparator A01 = C1578376r.A00;
    public static final Comparator A00 = C1578476s.A00;

    public static final String A00(Context context, int i) {
        Integer valueOf = Integer.valueOf(i);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        String quantityString = context.getResources().getQuantityString(R.plurals.direct_activity_indicator_seen_by_count, i, C84963qk.A04(resources, valueOf, 1000, true, false));
        C14360o3.A07(quantityString);
        return quantityString;
    }

    public static final List A01(java.util.Set set) {
        if (set != null && !set.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(set);
            C01T.A1D(arrayList, A01);
            return arrayList;
        }
        return C16930sl.A00;
    }
}
