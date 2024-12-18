package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* renamed from: X.2XS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XS {
    public static final C2XS A00 = new Object();
    public static volatile boolean A01;
    public static volatile boolean A02;

    public static final boolean A00(AccessibilityManager accessibilityManager) {
        boolean z;
        if (!A02) {
            synchronized (A00) {
                if (!Boolean.getBoolean("is_accessibility_enabled")) {
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        if (!accessibilityManager.isTouchExplorationEnabled()) {
                            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                            if (enabledAccessibilityServiceList != null) {
                                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                                    if ((accessibilityServiceInfo.eventTypes & C3OO.FLAG_MOVED) != 2048 || (accessibilityServiceInfo.getCapabilities() & 1) != 1) {
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    A01 = z;
                    A02 = true;
                }
                z = true;
                A01 = z;
                A02 = true;
            }
        }
        return A01;
    }
}
