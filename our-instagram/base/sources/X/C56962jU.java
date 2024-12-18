package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.2jU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56962jU extends C02V {
    public final /* synthetic */ Integer A00;
    public final /* synthetic */ boolean A01;

    public C56962jU(Integer num, boolean z) {
        this.A01 = z;
        this.A00 = num;
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0Y(view, accessibilityNodeInfoCompat);
        view.setLongClickable(this.A01);
        AbstractC56952jT.A05(accessibilityNodeInfoCompat, this.A00);
    }
}
