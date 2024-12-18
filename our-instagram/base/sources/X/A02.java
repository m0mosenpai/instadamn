package X;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes4.dex */
public abstract class A02 {
    public static final void A00(Context context, String str) {
        AccessibilityManager accessibilityManager;
        C14360o3.A0B(context, 0);
        Object systemService = context.getSystemService("accessibility");
        if ((systemService instanceof AccessibilityManager) && (accessibilityManager = (AccessibilityManager) systemService) != null && AbstractC56862jK.A02(accessibilityManager, true)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            C14360o3.A07(obtain);
            obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            obtain.getText().add(AbstractC166997dE.A0r(context.getResources(), str, 2131956365));
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }
}
