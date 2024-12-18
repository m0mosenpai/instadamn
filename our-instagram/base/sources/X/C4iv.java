package X;

import android.view.View;

/* renamed from: X.4iv, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4iv {
    public static int A00(View view, View view2, AbstractC70763Fo abstractC70763Fo, AbstractC70663Fe abstractC70663Fe, C3F5 c3f5, boolean z) {
        if (abstractC70663Fe.A0T() != 0 && c3f5.A00() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(AbstractC70663Fe.A0C(view) - AbstractC70663Fe.A0C(view2)) + 1;
            }
            return Math.min(abstractC70763Fo.A07(), abstractC70763Fo.A08(view2) - abstractC70763Fo.A0D(view));
        }
        return 0;
    }

    public static int A01(View view, View view2, AbstractC70763Fo abstractC70763Fo, AbstractC70663Fe abstractC70663Fe, C3F5 c3f5, boolean z) {
        int A00;
        if (abstractC70663Fe.A0T() != 0 && (A00 = c3f5.A00()) != 0 && view != null && view2 != null) {
            if (z) {
                return (int) (((abstractC70763Fo.A08(view2) - abstractC70763Fo.A0D(view)) / (Math.abs(AbstractC70663Fe.A0C(view) - AbstractC70663Fe.A0C(view2)) + 1)) * c3f5.A00());
            }
            return A00;
        }
        return 0;
    }

    public static int A02(View view, View view2, AbstractC70763Fo abstractC70763Fo, AbstractC70663Fe abstractC70663Fe, C3F5 c3f5, boolean z, boolean z2) {
        int max;
        if (abstractC70663Fe.A0T() == 0 || c3f5.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(AbstractC70663Fe.A0C(view), AbstractC70663Fe.A0C(view2));
        int max2 = Math.max(AbstractC70663Fe.A0C(view), AbstractC70663Fe.A0C(view2));
        if (z2) {
            max = Math.max(0, (c3f5.A00() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z) {
            return Math.round((max * (Math.abs(abstractC70763Fo.A08(view2) - abstractC70763Fo.A0D(view)) / (Math.abs(AbstractC70663Fe.A0C(view) - AbstractC70663Fe.A0C(view2)) + 1))) + (abstractC70763Fo.A06() - abstractC70763Fo.A0D(view)));
        }
        return max;
    }
}
