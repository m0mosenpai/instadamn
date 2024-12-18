package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.MZj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50691MZj extends View.AccessibilityDelegate {
    public final int A00;
    public final Object A01;

    public C50691MZj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (this.A00 != 0) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            return;
        }
        AbstractC167017dG.A1N(view, accessibilityEvent);
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(((C43830JZt) this.A01).A0D.A07);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        if (this.A00 != 0) {
            AbstractC167017dG.A1N(view, accessibilityNodeInfo);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            String str2 = ((ViewOnFocusChangeListenerC55349OiB) this.A01).A0A.A00;
            if (str2 != null && str2.length() != 0) {
                str = AbstractC167007dF.A0f(view.getContext(), str2, 2131961881);
            } else {
                str = null;
            }
            accessibilityNodeInfo.setError(str);
            return;
        }
        boolean A1a = AbstractC167017dG.A1a(view, accessibilityNodeInfo);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(A1a);
        accessibilityNodeInfo.setChecked(((C43830JZt) this.A01).A0D.A07);
    }
}
