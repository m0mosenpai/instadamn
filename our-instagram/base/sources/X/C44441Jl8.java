package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;

/* renamed from: X.Jl8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44441Jl8 extends C02V {
    public final int A00;
    public final Object A01;

    public C44441Jl8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence A0q;
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N((Fragment) this.A01), 2131967957);
                break;
            case 1:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                A0q = ((C9C9) this.A01).A00;
                break;
            case 2:
                super.A0Y(view, accessibilityNodeInfoCompat);
                A0q = view.getResources().getText(2131973280);
                break;
            case 3:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                C012804r c012804r = C012804r.A04;
                A0q = ((View) this.A01).getContext().getString(2131959224);
                break;
            default:
                super.A0Y(view, accessibilityNodeInfoCompat);
                return;
        }
        accessibilityNodeInfoCompat.addAction(new C012804r(16, A0q));
    }
}
