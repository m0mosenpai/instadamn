package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes11.dex */
public final class UEW extends AnonymousClass051 {
    public final /* synthetic */ C2Y4 A00;

    @Override // X.AnonymousClass051
    public final AccessibilityNodeInfoCompat A00(int i) {
        int i2;
        C2Y4 c2y4 = this.A00;
        if (i == 2) {
            i2 = c2y4.A00;
        } else {
            i2 = c2y4.A01;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return createAccessibilityNodeInfo(i2);
    }

    public UEW(C2Y4 c2y4) {
        this.A00 = c2y4;
    }

    @Override // X.AnonymousClass051
    public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(this.A00.A0b(i).mInfo));
    }

    @Override // X.AnonymousClass051
    public final boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        C2Y4 c2y4 = this.A00;
        if (i != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            return c2y4.A0m(i, i2, bundle);
                        }
                        if (c2y4.A00 == i) {
                            c2y4.A00 = Integer.MIN_VALUE;
                            c2y4.A03.invalidate();
                            i4 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
                        } else {
                            return false;
                        }
                    } else {
                        AccessibilityManager accessibilityManager = c2y4.A04;
                        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = c2y4.A00) == i) {
                            return false;
                        }
                        if (i3 != Integer.MIN_VALUE) {
                            c2y4.A00 = Integer.MIN_VALUE;
                            c2y4.A03.invalidate();
                            c2y4.A0d(i3, Constants.LOAD_RESULT_PGO_ATTEMPTED);
                        }
                        c2y4.A00 = i;
                        c2y4.A03.invalidate();
                        i4 = Constants.LOAD_RESULT_PGO;
                    }
                    c2y4.A0d(i, i4);
                    return true;
                }
                return c2y4.A0k(i);
            }
            return c2y4.A0l(i);
        }
        return c2y4.A03.performAccessibilityAction(i2, bundle);
    }
}
