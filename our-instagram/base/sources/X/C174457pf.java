package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.7pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174457pf extends C02V {
    public final Map A00 = new WeakHashMap();
    public final C174447pe A01;

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        View A0D;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(accessibilityNodeInfoCompat, 1);
        ReboundViewPager reboundViewPager = ((C41k) this.A01).A00;
        C905241n c905241n = (C905241n) reboundViewPager.A0w.get(view);
        if (c905241n != null && (i = c905241n.A00) > 0 && (A0D = reboundViewPager.A0D(i - 1)) != null) {
            accessibilityNodeInfoCompat.mInfo.setTraversalAfter(A0D);
        }
        C02V c02v = (C02V) this.A00.get(view);
        if (c02v != null) {
            c02v.A0Y(view, accessibilityNodeInfoCompat);
        } else {
            super.A0Y(view, accessibilityNodeInfoCompat);
        }
    }

    public C174457pf(C174447pe c174447pe) {
        this.A01 = c174447pe;
    }
}
