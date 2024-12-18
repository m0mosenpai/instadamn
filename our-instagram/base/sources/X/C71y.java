package X;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.71y, reason: invalid class name */
/* loaded from: classes3.dex */
public class C71y {
    public static RectF A00(View view, TabLayout tabLayout) {
        float left;
        float top;
        float right;
        float bottom;
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.A0M && (view instanceof C154316wg)) {
            C154316wg c154316wg = (C154316wg) view;
            int contentWidth = c154316wg.getContentWidth();
            int contentHeight = c154316wg.getContentHeight();
            int A00 = (int) AbstractC126235nK.A00(c154316wg.getContext(), 24);
            if (contentWidth < A00) {
                contentWidth = A00;
            }
            int left2 = (c154316wg.getLeft() + c154316wg.getRight()) / 2;
            int top2 = (c154316wg.getTop() + c154316wg.getBottom()) / 2;
            int i = contentWidth / 2;
            int i2 = left2 - i;
            int i3 = top2 - (contentHeight / 2);
            int i4 = i + left2;
            int i5 = top2 + (left2 / 2);
            left = i2;
            top = i3;
            right = i4;
            bottom = i5;
        } else {
            left = view.getLeft();
            top = view.getTop();
            right = view.getRight();
            bottom = view.getBottom();
        }
        return new RectF(left, top, right, bottom);
    }
}
