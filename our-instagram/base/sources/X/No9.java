package X;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes9.dex */
public abstract class No9 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object obj;
        Object A0a = MSY.A0a(c6fw);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            obj = c6fg.A00.getSystemService("accessibility");
        } else {
            obj = null;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) obj;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            obtain.getText().add(A0a);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        return null;
    }
}
