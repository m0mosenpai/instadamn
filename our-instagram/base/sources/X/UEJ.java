package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes11.dex */
public final class UEJ extends C02V {
    public final int A00;
    public final Object A01;
    public final String A02;

    public UEJ(String str, Object obj, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.A00 != 0) {
            AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
            super.A0Y(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.addAction(new C012804r(16, this.A02));
            accessibilityNodeInfoCompat.setContentDescription(((C51311MlY) this.A01).A01.getText());
            AbstractC56952jT.A05(accessibilityNodeInfoCompat, C05F.A01);
            return;
        }
        AbstractC167007dF.A1K(view, accessibilityNodeInfoCompat);
        super.A0Y(view, accessibilityNodeInfoCompat);
        AbstractC56952jT.A05(accessibilityNodeInfoCompat, (Integer) this.A01);
        String str = this.A02;
        if (str != null && str.length() != 0) {
            accessibilityNodeInfoCompat.addAction(new C012804r(16, str));
            return;
        }
        accessibilityNodeInfoCompat.setClickable(false);
        accessibilityNodeInfoCompat.mInfo.setLongClickable(false);
        accessibilityNodeInfoCompat.removeAction(C012804r.A08);
        accessibilityNodeInfoCompat.removeAction(C012804r.A0L);
    }
}
