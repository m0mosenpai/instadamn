package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.LinkedHashSet;

/* renamed from: X.Cbf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28191Cbf {
    public static final LinkedHashSet A00(ViewGroup viewGroup, C28191Cbf c28191Cbf, int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (C14360o3.A0K(childAt.getTag(R.id.bk_extension_viewtag_int), Integer.valueOf(i))) {
                linkedHashSet.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                linkedHashSet.addAll(A00((ViewGroup) childAt, c28191Cbf, i));
            }
        }
        return linkedHashSet;
    }

    public final LinkedHashSet A01(ViewGroup viewGroup, int i) {
        return A00(viewGroup, this, i);
    }
}
