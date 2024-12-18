package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.ui.widget.drawing.StrokeWidthTool;

/* renamed from: X.5vE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130675vE extends C02V {
    public Integer A00;
    public final StrokeWidthTool A01;

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(accessibilityNodeInfoCompat, 1);
        super.A0Y(view, accessibilityNodeInfoCompat);
        C012804r c012804r = C012804r.A04;
        accessibilityNodeInfoCompat.addAction(new C012804r(32, this.A01.getContext().getString(2131974778)));
    }

    public C130675vE(StrokeWidthTool strokeWidthTool) {
        this.A01 = strokeWidthTool;
        AbstractC010103p.A0B(strokeWidthTool, this);
    }
}
