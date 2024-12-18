package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.3FL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FL extends C02V {
    public Map A00 = new WeakHashMap();
    public final C3FK A01;

    @Override // X.C02V
    public final void A0R(View view, int i) {
        C02V c02v = (C02V) this.A00.get(view);
        if (c02v != null) {
            c02v.A0R(view, i);
        } else {
            super.A0R(view, i);
        }
    }

    @Override // X.C02V
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        C02V c02v = (C02V) this.A00.get(view);
        if (c02v != null) {
            c02v.A0S(view, accessibilityEvent);
        } else {
            super.A0S(view, accessibilityEvent);
        }
    }

    @Override // X.C02V
    public final void A0T(View view, AccessibilityEvent accessibilityEvent) {
        C02V c02v = (C02V) this.A00.get(view);
        if (c02v != null) {
            c02v.A0T(view, accessibilityEvent);
        } else {
            super.A0T(view, accessibilityEvent);
        }
    }

    @Override // X.C02V
    public final void A0U(View view, AccessibilityEvent accessibilityEvent) {
        C02V c02v = (C02V) this.A00.get(view);
        if (c02v != null) {
            c02v.A0U(view, accessibilityEvent);
        } else {
            super.A0U(view, accessibilityEvent);
        }
    }

    @Override // X.C02V
    public final boolean A0V(View view, int i, Bundle bundle) {
        boolean A0V;
        RecyclerView recyclerView = this.A01.A00;
        if (!recyclerView.A1C() && recyclerView.A0D != null) {
            C02V c02v = (C02V) this.A00.get(view);
            if (c02v != null) {
                A0V = c02v.A0V(view, i, bundle);
            } else {
                A0V = super.A0V(view, i, bundle);
            }
            if (A0V) {
                return true;
            }
            return false;
        }
        return super.A0V(view, i, bundle);
    }

    @Override // X.C02V
    public final boolean A0W(View view, AccessibilityEvent accessibilityEvent) {
        C02V c02v = (C02V) this.A00.get(view);
        if (c02v != null) {
            return c02v.A0W(view, accessibilityEvent);
        }
        return super.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // X.C02V
    public final boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C02V c02v = (C02V) this.A00.get(viewGroup);
        if (c02v != null) {
            return c02v.A0X(viewGroup, view, accessibilityEvent);
        }
        return super.A0X(viewGroup, view, accessibilityEvent);
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AbstractC70663Fe abstractC70663Fe;
        RecyclerView recyclerView = this.A01.A00;
        if (!recyclerView.A1C() && (abstractC70663Fe = recyclerView.A0D) != null) {
            abstractC70663Fe.A0s(view, accessibilityNodeInfoCompat);
            C02V c02v = (C02V) this.A00.get(view);
            if (c02v != null) {
                c02v.A0Y(view, accessibilityNodeInfoCompat);
                return;
            }
        }
        super.A0Y(view, accessibilityNodeInfoCompat);
    }

    @Override // X.C02V
    public final AnonymousClass051 A0Z(View view) {
        C02V c02v = (C02V) this.A00.get(view);
        if (c02v != null) {
            return c02v.A0Z(view);
        }
        return super.A0Z(view);
    }

    public C3FL(C3FK c3fk) {
        this.A01 = c3fk;
    }
}
