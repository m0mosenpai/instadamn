package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;

/* loaded from: classes11.dex */
public final class UEQ extends C02V {
    public final Rect A00 = new Rect();
    public final /* synthetic */ SlidingPaneLayout A01;

    public UEQ(SlidingPaneLayout slidingPaneLayout) {
        this.A01 = slidingPaneLayout;
    }

    @Override // X.C02V
    public final boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (!this.A01.A04(view)) {
            return super.A0X(viewGroup, view, accessibilityEvent);
        }
        return false;
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.mInfo);
        super.A01.onInitializeAccessibilityNodeInfo(view, obtain);
        Rect rect = this.A00;
        obtain.getBoundsInScreen(rect);
        accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
        accessibilityNodeInfoCompat.mInfo.setVisibleToUser(obtain.isVisibleToUser());
        accessibilityNodeInfoCompat.mInfo.setPackageName(obtain.getPackageName());
        accessibilityNodeInfoCompat.setClassName(obtain.getClassName());
        accessibilityNodeInfoCompat.setContentDescription(obtain.getContentDescription());
        accessibilityNodeInfoCompat.setEnabled(obtain.isEnabled());
        accessibilityNodeInfoCompat.setClickable(obtain.isClickable());
        accessibilityNodeInfoCompat.mInfo.setFocusable(obtain.isFocusable());
        accessibilityNodeInfoCompat.mInfo.setFocused(obtain.isFocused());
        accessibilityNodeInfoCompat.mInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
        accessibilityNodeInfoCompat.mInfo.setSelected(obtain.isSelected());
        accessibilityNodeInfoCompat.mInfo.setLongClickable(obtain.isLongClickable());
        accessibilityNodeInfoCompat.addAction(obtain.getActions());
        accessibilityNodeInfoCompat.mInfo.setMovementGranularities(obtain.getMovementGranularities());
        accessibilityNodeInfoCompat.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        accessibilityNodeInfoCompat.mVirtualDescendantId = -1;
        accessibilityNodeInfoCompat.mInfo.setSource(view);
        Object parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
        }
        SlidingPaneLayout slidingPaneLayout = this.A01;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = slidingPaneLayout.getChildAt(i);
            if (!slidingPaneLayout.A04(childAt) && childAt.getVisibility() == 0) {
                childAt.setImportantForAccessibility(1);
                accessibilityNodeInfoCompat.mInfo.addChild(childAt);
            }
        }
    }

    @Override // X.C02V
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        super.A0S(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }
}
