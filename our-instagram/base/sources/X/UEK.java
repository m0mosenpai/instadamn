package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes11.dex */
public final class UEK extends C02V {
    public final /* synthetic */ Boolean A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AbstractC167007dF.A1K(view, accessibilityNodeInfoCompat);
        super.A0Y(view, accessibilityNodeInfoCompat);
        AbstractC56952jT.A05(accessibilityNodeInfoCompat, this.A01);
        accessibilityNodeInfoCompat.setClickable(false);
        accessibilityNodeInfoCompat.mInfo.setLongClickable(false);
        accessibilityNodeInfoCompat.removeAction(C012804r.A08);
        accessibilityNodeInfoCompat.removeAction(C012804r.A0L);
        String str = this.A02;
        if (str != null) {
            accessibilityNodeInfoCompat.mInfo.setHintText(str);
        }
        String str2 = this.A03;
        if (str2 != null) {
            accessibilityNodeInfoCompat.mInfo.setText(str2);
        }
        Boolean bool = this.A00;
        if (bool != null) {
            accessibilityNodeInfoCompat.mInfo.setHeading(bool.booleanValue());
        }
    }

    public UEK(Boolean bool, Integer num, String str, String str2) {
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = bool;
    }
}
