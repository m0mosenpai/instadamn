package X;

import android.content.res.Resources;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.2m4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58452m4 {
    public static final void A00(View view, final int i, final int i2, final boolean z) {
        C14360o3.A0B(view, 0);
        AbstractC56952jT.A04(view, C05F.A01);
        final Resources resources = view.getResources();
        AbstractC010103p.A0B(view, new C02V() { // from class: X.2m6
            @Override // X.C02V
            public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                C14360o3.A0B(view2, 0);
                C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                super.A0Y(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setSelected(z);
                accessibilityNodeInfoCompat.setRoleDescription(view2.getContext().getString(2131975126));
                accessibilityNodeInfoCompat.mInfo.setTooltipText(resources.getString(2131963200, Integer.valueOf(i), Integer.valueOf(i2)));
            }
        });
    }
}
