package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.2jK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56862jK {
    public static boolean A02(AccessibilityManager accessibilityManager, boolean z) {
        if (z && Boolean.getBoolean("is_accessibility_enabled")) {
            return true;
        }
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public static boolean A00(Context context) {
        AccessibilityManager accessibilityManager;
        if (Boolean.getBoolean("is_accessibility_enabled")) {
            return true;
        }
        if (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null) {
            return false;
        }
        return accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean A01(Context context, boolean z) {
        AccessibilityManager accessibilityManager;
        if (context != null) {
            accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            accessibilityManager = null;
        }
        return A02(accessibilityManager, z);
    }
}
