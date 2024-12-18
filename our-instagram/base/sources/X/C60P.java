package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.60P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60P extends C02V {
    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(accessibilityNodeInfoCompat, 1);
        super.A0Y(view, accessibilityNodeInfoCompat);
        view.setClickable(false);
        view.setLongClickable(false);
    }
}
