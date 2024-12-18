package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.Jl9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44442Jl9 extends C02V {
    public final int A00;
    public final String A01;

    public C44442Jl9(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.A00) {
            case 0:
                break;
            case 1:
            case 2:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                break;
            default:
                super.A0Y(view, accessibilityNodeInfoCompat);
                return;
        }
        super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(new C012804r(16, this.A01));
    }
}
