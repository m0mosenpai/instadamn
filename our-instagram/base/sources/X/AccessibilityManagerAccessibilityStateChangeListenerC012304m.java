package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.04m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class AccessibilityManagerAccessibilityStateChangeListenerC012304m implements AccessibilityManager.AccessibilityStateChangeListener {
    public InterfaceC012204l A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC012304m)) {
            return false;
        }
        return this.A00.equals(((AccessibilityManagerAccessibilityStateChangeListenerC012304m) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.A00.onAccessibilityStateChanged(z);
    }
}
