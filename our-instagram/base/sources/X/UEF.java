package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes11.dex */
public final class UEF extends C02V {
    public final int A00;

    public UEF(int i) {
        this.A00 = i;
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.A00) {
            case 0:
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClickable(false);
                accessibilityNodeInfoCompat.removeAction(C012804r.A08);
                return;
            case 1:
                boolean A1a = AbstractC167017dG.A1a(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setFocusable(A1a);
                accessibilityNodeInfoCompat.setClickable(A1a);
                return;
            default:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(16);
                return;
        }
    }
}
