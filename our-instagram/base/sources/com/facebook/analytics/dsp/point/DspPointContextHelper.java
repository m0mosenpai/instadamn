package com.facebook.analytics.dsp.point;

import X.C129185sf;
import X.C129195sg;
import X.C14360o3;
import X.C4EJ;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes3.dex */
public final class DspPointContextHelper {
    public static final DspPointContextHelper A00 = new Object();

    public static final boolean A00(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f < i || f > i + view.getWidth() || f2 < i2 || f2 > i2 + view.getHeight()) {
            return false;
        }
        return true;
    }

    public static final boolean A01(View view, C129185sf c129185sf, C4EJ c4ej, C129195sg c129195sg, float f, float f2) {
        C14360o3.A0B(view, 2);
        C14360o3.A0B(c129195sg, 3);
        C14360o3.A0B(c4ej, 5);
        int visibility = view.getVisibility();
        if (visibility == 4 || visibility == 8 || !A00(view, f, f2)) {
            return false;
        }
        c129185sf.A00(view, c4ej);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                C14360o3.A0A(childAt);
                if (A01(childAt, c129185sf, c4ej, c129195sg, f, f2)) {
                    return true;
                }
            }
        }
        Object tag = view.getTag(R.id.dsp_skip_view_traversal);
        if (tag != null && (tag instanceof Boolean) && tag.equals(true)) {
            return false;
        }
        return view.isClickable();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00af -> B:11:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(android.view.View r16, X.C129185sf r17, X.C4EJ r18, X.C129195sg r19, X.InterfaceC23621Ds r20, float r21, float r22) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics.dsp.point.DspPointContextHelper.A02(android.view.View, X.5sf, X.4EJ, X.5sg, X.1Ds, float, float):java.lang.Object");
    }
}
