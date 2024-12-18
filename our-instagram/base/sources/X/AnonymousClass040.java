package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.040, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass040 {
    public static final View A00(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, viewGroup.getChildCount(), "Index: ", ", Size: "));
    }
}
