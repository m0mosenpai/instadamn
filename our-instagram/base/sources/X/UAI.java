package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes11.dex */
public final class UAI extends View.AccessibilityDelegate {
    public final /* synthetic */ boolean A00;

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean A1R = AbstractC167007dF.A1R(0, view, accessibilityNodeInfo);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(A1R);
        accessibilityNodeInfo.setChecked(this.A00);
        accessibilityNodeInfo.setSelected(false);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    public UAI(boolean z) {
        this.A00 = z;
    }
}
