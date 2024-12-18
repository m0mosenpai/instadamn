package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes11.dex */
public final class UEG extends C02V {
    public final int A00;

    public UEG(int i) {
        this.A00 = i;
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.A00) {
            case 0:
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setSelected(true);
                return;
            case 1:
            case 2:
            default:
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setEnabled(true);
                return;
            case 3:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setRoleDescription("Button");
                return;
        }
    }
}
