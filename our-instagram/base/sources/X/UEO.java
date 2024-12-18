package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes11.dex */
public final class UEO extends C02V {
    @Override // X.C02V
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        super.A0S(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(AbstractC167007dF.A1O(nestedScrollView.getScrollRange()));
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r7 != 16908346) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    @Override // X.C02V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0V(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r0 = super.A0V(r6, r7, r8)
            r3 = 1
            if (r0 != 0) goto L7e
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            boolean r0 = r6.isEnabled()
            r4 = 0
            if (r0 == 0) goto L3f
            int r2 = r6.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r0 = r6.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 == 0) goto L2d
            boolean r0 = r6.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L2d
            int r2 = r1.height()
        L2d:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r7 == r0) goto L40
            r0 = 8192(0x2000, float:1.148E-41)
            if (r7 == r0) goto L58
            r0 = 16908344(0x1020038, float:2.3877386E-38)
            if (r7 == r0) goto L58
            r0 = 16908346(0x102003a, float:2.3877392E-38)
            if (r7 == r0) goto L40
        L3f:
            return r4
        L40:
            int r0 = r6.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r6.getPaddingTop()
            int r2 = r2 - r0
            int r1 = r6.getScrollY()
            int r1 = r1 + r2
            int r0 = r6.getScrollRange()
            int r2 = java.lang.Math.min(r1, r0)
            goto L6b
        L58:
            int r0 = r6.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r6.getPaddingTop()
            int r2 = r2 - r0
            int r0 = r6.getScrollY()
            int r0 = r0 - r2
            int r2 = java.lang.Math.max(r0, r4)
        L6b:
            int r0 = r6.getScrollY()
            if (r2 == r0) goto L3f
            int r0 = r6.getScrollX()
            int r1 = -r0
            int r0 = r6.getScrollY()
            int r2 = r2 - r0
            androidx.core.widget.NestedScrollView.A04(r6, r1, r2, r3)
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UEO.A0V(android.view.View, int, android.os.Bundle):boolean");
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int scrollRange;
        super.A0Y(view, accessibilityNodeInfoCompat);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfoCompat.mInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.addAction(C012804r.A0X);
                accessibilityNodeInfoCompat.addAction(C012804r.A0e);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.addAction(C012804r.A0Z);
                accessibilityNodeInfoCompat.addAction(C012804r.A0Y);
            }
        }
    }
}
