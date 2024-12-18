package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes11.dex */
public final class UAH extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        AbstractC167007dF.A1K(view, accessibilityNodeInfo);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.removeAction(16);
    }
}
