package X;

import android.view.View;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.5Mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115865Mc extends AbstractC87043uM {
    @Override // X.AbstractC87043uM
    public final int A01(float f, float f2) {
        TextView textView = (TextView) this.A02;
        return WEL.A00(textView.getLayout(), ((int) f) - textView.getPaddingLeft(), ((int) f2) - textView.getPaddingTop());
    }

    @Override // X.AbstractC87043uM
    public final void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        View view = this.A02;
        WEL.A01(((TextView) view).getLayout(), view, accessibilityNodeInfoCompat);
    }

    @Override // X.AbstractC87043uM
    public final void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        View view = this.A02;
        WEL.A02(((TextView) view).getLayout(), view, accessibilityNodeInfoCompat, i);
    }
}
