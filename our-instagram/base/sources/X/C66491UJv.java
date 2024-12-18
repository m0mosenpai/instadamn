package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UJv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66491UJv extends C3FK {
    public final /* synthetic */ C131785xE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66491UJv(RecyclerView recyclerView, C131785xE c131785xE) {
        super(recyclerView);
        this.A00 = c131785xE;
    }

    @Override // X.C3FK, X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C131785xE c131785xE = this.A00;
        int[] iArr = C131785xE.A07;
        C02V c02v = c131785xE.A00;
        if (c02v != null) {
            c02v.A0Y(view, accessibilityNodeInfoCompat);
        }
        accessibilityNodeInfoCompat.removeAction(C012804r.A0e);
        accessibilityNodeInfoCompat.removeAction(C012804r.A0Y);
        accessibilityNodeInfoCompat.removeAction(C012804r.A0b);
        accessibilityNodeInfoCompat.removeAction(C012804r.A0c);
        accessibilityNodeInfoCompat.removeAction(C012804r.A0Z);
        accessibilityNodeInfoCompat.removeAction(C012804r.A0X);
        accessibilityNodeInfoCompat.mInfo.setScrollable(false);
    }
}
