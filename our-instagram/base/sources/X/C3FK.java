package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3FK, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3FK extends C02V {
    public final RecyclerView A00;
    public final C3FL A01;

    public C02V A0a() {
        return this.A01;
    }

    public C3FK(RecyclerView recyclerView) {
        C3FL c3fl;
        this.A00 = recyclerView;
        C02V A0a = A0a();
        if (A0a != null && (A0a instanceof C3FL)) {
            c3fl = (C3FL) A0a;
        } else {
            c3fl = new C3FL(this);
        }
        this.A01 = c3fl;
    }

    @Override // X.C02V
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        AbstractC70663Fe abstractC70663Fe;
        super.A0S(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.A00.A1C() && (abstractC70663Fe = ((RecyclerView) view).A0D) != null) {
            abstractC70663Fe.A1C(accessibilityEvent);
        }
    }

    @Override // X.C02V
    public final boolean A0V(View view, int i, Bundle bundle) {
        AbstractC70663Fe abstractC70663Fe;
        if (super.A0V(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A1C() && (abstractC70663Fe = recyclerView.A0D) != null) {
            RecyclerView recyclerView2 = abstractC70663Fe.A07;
            return abstractC70663Fe.A17(bundle, recyclerView2.A0y, recyclerView2.mState, i);
        }
        return false;
    }

    @Override // X.C02V
    public void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AbstractC70663Fe abstractC70663Fe;
        super.A0Y(view, accessibilityNodeInfoCompat);
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A1C() && (abstractC70663Fe = recyclerView.A0D) != null) {
            RecyclerView recyclerView2 = abstractC70663Fe.A07;
            abstractC70663Fe.A1H(accessibilityNodeInfoCompat, recyclerView2.A0y, recyclerView2.mState);
        }
    }
}
