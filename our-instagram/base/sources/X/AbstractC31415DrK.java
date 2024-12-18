package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DrK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31415DrK {
    public static float A00(Context context) {
        return Settings.System.getFloat(context.getContentResolver(), "font_scale", 1.0f);
    }

    public static boolean A01(Context context, String str) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager != null && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) != null) {
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (it.hasNext()) {
                if (it.next().getId().contains(str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
