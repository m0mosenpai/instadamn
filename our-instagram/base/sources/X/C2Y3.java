package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* renamed from: X.2Y3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Y3 extends C2Y4 {
    public static final Rect A03 = new Rect(0, 0, 1, 1);
    public C50952Vr A00;
    public final C02V A01;
    public final View A02;

    public static C3h4 A00(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).getAccessibleMountItem();
        }
        ViewParent parent = view.getParent();
        if (parent == null) {
            return null;
        }
        return ((C2WS) parent).A0I(((ViewGroup) parent).indexOfChild(view));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.VeA, java.lang.Object] */
    private void A04(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C2V9 c2v9;
        C50952Vr c50952Vr = this.A00;
        if (c50952Vr != null && (c2v9 = c50952Vr.A0R) != 0) {
            C14360o3.A0B(view, 1);
            C14360o3.A0B(accessibilityNodeInfoCompat, 2);
            C2XV.A00();
            ?? obj = new Object();
            obj.A00 = view;
            obj.A01 = accessibilityNodeInfoCompat;
            c2v9.A00(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.O6o] */
    @Override // X.C02V
    public final void A0R(View view, int i) {
        C2V9 c2v9;
        C50952Vr c50952Vr = this.A00;
        if (c50952Vr != null && (c2v9 = c50952Vr.A0V) != 0) {
            C02V c02v = this.A01;
            C14360o3.A0B(view, 1);
            C2XV.A00();
            ?? obj = new Object();
            obj.A00 = view;
            obj.A01 = c02v;
            c2v9.A00(obj);
            return;
        }
        super.A0R(view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Vh6, java.lang.Object] */
    @Override // X.C02V
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        C2V9 c2v9;
        C50952Vr c50952Vr = this.A00;
        if (c50952Vr != null && (c2v9 = c50952Vr.A0N) != 0) {
            C02V c02v = this.A01;
            C14360o3.A0B(view, 1);
            C14360o3.A0B(accessibilityEvent, 2);
            C2XV.A00();
            ?? obj = new Object();
            obj.A00 = view;
            obj.A01 = accessibilityEvent;
            obj.A02 = c02v;
            c2v9.A00(obj);
            return;
        }
        super.A0S(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Vh7, java.lang.Object] */
    @Override // X.C02V
    public final void A0T(View view, AccessibilityEvent accessibilityEvent) {
        C2V9 c2v9;
        C50952Vr c50952Vr = this.A00;
        if (c50952Vr != null && (c2v9 = c50952Vr.A0Q) != 0) {
            C02V c02v = this.A01;
            C14360o3.A0B(view, 1);
            C14360o3.A0B(accessibilityEvent, 2);
            C2XV.A00();
            ?? obj = new Object();
            obj.A00 = view;
            obj.A01 = accessibilityEvent;
            obj.A02 = c02v;
            c2v9.A00(obj);
            return;
        }
        super.A0T(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Vh8] */
    @Override // X.C02V
    public final void A0U(View view, AccessibilityEvent accessibilityEvent) {
        C2V9 c2v9;
        C50952Vr c50952Vr = this.A00;
        if (c50952Vr != null && (c2v9 = c50952Vr.A0W) != 0) {
            C02V c02v = this.A01;
            C14360o3.A0B(view, 1);
            C14360o3.A0B(accessibilityEvent, 2);
            C2XV.A00();
            ?? obj = new Object();
            obj.A00 = view;
            obj.A01 = accessibilityEvent;
            obj.A02 = c02v;
            c2v9.A00(obj);
            return;
        }
        super.A0U(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.A7w, java.lang.Object] */
    @Override // X.C02V
    public final boolean A0V(View view, int i, Bundle bundle) {
        C2V9 c2v9;
        C50952Vr c50952Vr = this.A00;
        if (c50952Vr != null && (c2v9 = c50952Vr.A0U) != 0) {
            C02V c02v = this.A01;
            C14360o3.A0B(view, 1);
            C2XV.A00();
            ?? obj = new Object();
            obj.A01 = view;
            obj.A00 = bundle;
            obj.A02 = c02v;
            Object A00 = c2v9.A00(obj);
            if ((A00 instanceof Boolean) && ((Boolean) A00).booleanValue()) {
                return true;
            }
            return false;
        }
        return super.A0V(view, i, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.Vh5, java.lang.Object] */
    @Override // X.C02V
    public final boolean A0W(View view, AccessibilityEvent accessibilityEvent) {
        C2V9 c2v9;
        C50952Vr c50952Vr = this.A00;
        if (c50952Vr != null && (c2v9 = c50952Vr.A0J) != 0) {
            C02V c02v = this.A01;
            C14360o3.A0B(view, 1);
            C14360o3.A0B(accessibilityEvent, 2);
            C2XV.A00();
            ?? obj = new Object();
            obj.A00 = view;
            obj.A01 = accessibilityEvent;
            obj.A02 = c02v;
            Object A00 = c2v9.A00(obj);
            if ((A00 instanceof Boolean) && ((Boolean) A00).booleanValue()) {
                return true;
            }
            return false;
        }
        return ((C02V) this).A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.VjN] */
    @Override // X.C02V
    public final boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C2V9 c2v9;
        C50952Vr c50952Vr = this.A00;
        if (c50952Vr != null && (c2v9 = c50952Vr.A0S) != 0) {
            C02V c02v = this.A01;
            C14360o3.A0B(viewGroup, 1);
            C14360o3.A0B(view, 2);
            C14360o3.A0B(accessibilityEvent, 3);
            C2XV.A00();
            ?? obj = new Object();
            obj.A01 = viewGroup;
            obj.A00 = view;
            obj.A02 = accessibilityEvent;
            obj.A03 = c02v;
            Object A00 = c2v9.A00(obj);
            if ((A00 instanceof Boolean) && ((Boolean) A00).booleanValue()) {
                return true;
            }
            return false;
        }
        return super.A0X(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.CRC, java.lang.Object] */
    @Override // X.C2Y4, X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        CharSequence charSequence;
        String str;
        C2V9 c2v9;
        C3h4 A00 = A00(this.A02);
        C50952Vr c50952Vr = this.A00;
        if (c50952Vr != null && (c2v9 = c50952Vr.A0O) != 0) {
            C02V c02v = this.A01;
            C14360o3.A0B(view, 1);
            C14360o3.A0B(accessibilityNodeInfoCompat, 2);
            C2XV.A00();
            ?? obj = new Object();
            obj.A00 = view;
            obj.A02 = accessibilityNodeInfoCompat;
            obj.A01 = c02v;
            c2v9.A00(obj);
            A04(view, accessibilityNodeInfoCompat);
        } else if (A00 != null) {
            super.A0Y(view, accessibilityNodeInfoCompat);
            AbstractC50812Vc abstractC50812Vc = AbstractC79093gG.A00(A00.A01).A03;
            C2WC c2wc = A00.A01.A06;
            C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
            C2XE c2xe = ((C2WB) c2wc).A04;
            try {
                A04(view, accessibilityNodeInfoCompat);
                if (abstractC50812Vc instanceof AbstractC50792Va) {
                    ((AbstractC50792Va) abstractC50812Vc).A0j(view, accessibilityNodeInfoCompat, c2xe, C2WE.A07.A01(A00.A01.A07));
                }
            } catch (Exception e) {
                if (c2xe != null) {
                    C51372Xk.A03(c2xe, e);
                }
            }
        } else {
            super.A0Y(view, accessibilityNodeInfoCompat);
        }
        C50952Vr c50952Vr2 = this.A00;
        if (c50952Vr2 != null && (str = c50952Vr2.A0c) != null) {
            accessibilityNodeInfoCompat.setClassName(str);
        }
        C50952Vr c50952Vr3 = this.A00;
        if (c50952Vr3 != null && (charSequence = c50952Vr3.A0Z) != null) {
            accessibilityNodeInfoCompat.setRoleDescription(charSequence);
            if (this.A00.A0c == null) {
                accessibilityNodeInfoCompat.setClassName("android.view.View");
            }
        }
        C50952Vr c50952Vr4 = this.A00;
        if (c50952Vr4 != null && (i = c50952Vr4.A09) != 0) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            accessibilityNodeInfoCompat.mInfo.setHeading(z);
        }
    }

    @Override // X.C2Y4, X.C02V
    public final AnonymousClass051 A0Z(View view) {
        C3h4 A00 = A00(this.A02);
        if (A00 != null && AbstractC79093gG.A00(A00.A01) != null) {
            AbstractC50812Vc abstractC50812Vc = AbstractC79093gG.A00(A00.A01).A03;
            if ((abstractC50812Vc instanceof AbstractC50792Va) && ((AbstractC50792Va) abstractC50812Vc).A14()) {
                return super.A0Z(view);
            }
            return null;
        }
        return null;
    }

    @Override // X.C2Y4
    public final int A0a(float f, float f2) {
        C3h4 A00 = A00(this.A02);
        if (A00 != null) {
            AbstractC50812Vc abstractC50812Vc = AbstractC79093gG.A00(A00.A01).A03;
            if (abstractC50812Vc instanceof AbstractC50792Va) {
                AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
                C2WC c2wc = A00.A01.A06;
                C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                C2XE c2xe = ((C2WB) c2wc).A04;
                try {
                    Object obj = A00.A01.A07;
                    C78993g5 c78993g5 = C2WE.A07;
                    if (abstractC50792Va.A0Y(c2xe, c78993g5.A01(obj)) != 0) {
                        Rect bounds = ((Drawable) A00.A04).getBounds();
                        int A0Z = abstractC50792Va.A0Z(c2xe, c78993g5.A01(A00.A01.A07), ((int) f) - bounds.left, ((int) f2) - bounds.top);
                        if (A0Z >= 0) {
                            return A0Z;
                        }
                    }
                } catch (Exception e) {
                    if (c2xe != null) {
                        C51372Xk.A03(c2xe, e);
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // X.C2Y4
    public final void A0e(int i, boolean z) {
        C2V9 c2v9;
        View view = this.A02;
        AnonymousClass051 A0Z = A0Z(view);
        if (A0Z != null) {
            A0Z.A00(1);
            C3h4 A00 = A00(view);
            if (A00 != null) {
                AbstractC50812Vc abstractC50812Vc = AbstractC79093gG.A00(A00.A01).A03;
                if (!(abstractC50812Vc instanceof AbstractC50792Va)) {
                    C50952Vr c50952Vr = this.A00;
                    if (c50952Vr != null && (c2v9 = c50952Vr.A0T) != null) {
                        C02V c02v = this.A01;
                        C14360o3.A0B(view, 1);
                        C14360o3.A0B(c02v, 5);
                        C2XV.A00();
                        c2v9.A00(new Object());
                        return;
                    }
                    return;
                }
                AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
                C2WC c2wc = A00.A01.A06;
                C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                C2XE c2xe = ((C2WB) c2wc).A04;
                if (c2xe == null) {
                    return;
                }
                try {
                    Object obj = A00.A01.A07;
                    C78993g5 c78993g5 = C2WE.A07;
                    if (i >= abstractC50792Va.A0Y(c2xe, c78993g5.A01(obj)) || !abstractC50792Va.A15()) {
                        return;
                    }
                    c78993g5.A01(A00.A01.A07);
                } catch (Exception e) {
                    C51372Xk.A03(c2xe, e);
                }
            }
        }
    }

    @Override // X.C2Y4
    public final void A0f(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentDescription("");
    }

    @Override // X.C2Y4
    public final void A0h(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        C3h4 A00 = A00(this.A02);
        if (A00 == null) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.mInfo.setBoundsInParent(A03);
            return;
        }
        Rect bounds = ((Drawable) A00.A04).getBounds();
        AbstractC50812Vc abstractC50812Vc = AbstractC79093gG.A00(A00.A01).A03;
        if (!(abstractC50812Vc instanceof AbstractC50792Va)) {
            return;
        }
        AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
        C2WC c2wc = A00.A01.A06;
        C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
        C2XE c2xe = ((C2WB) c2wc).A04;
        accessibilityNodeInfoCompat.setClassName(abstractC50792Va.getClass().getName());
        try {
            Object obj = A00.A01.A07;
            C78993g5 c78993g5 = C2WE.A07;
            if (i >= abstractC50792Va.A0Y(c2xe, c78993g5.A01(obj))) {
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.mInfo.setBoundsInParent(A03);
            } else {
                abstractC50792Va.A0l(accessibilityNodeInfoCompat, c2xe, c78993g5.A01(A00.A01.A07), i, bounds.left, bounds.top);
            }
        } catch (Exception e) {
            if (c2xe == null) {
                return;
            }
            C51372Xk.A03(c2xe, e);
        }
    }

    @Override // X.C2Y4
    public final void A0i(List list) {
        C3h4 A00 = A00(this.A02);
        if (A00 != null) {
            AbstractC50812Vc abstractC50812Vc = AbstractC79093gG.A00(A00.A01).A03;
            if (abstractC50812Vc instanceof AbstractC50792Va) {
                AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
                C2WC c2wc = A00.A01.A06;
                C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                C2XE c2xe = ((C2WB) c2wc).A04;
                try {
                    int A0Y = abstractC50792Va.A0Y(c2xe, C2WE.A07.A01(A00.A01.A07));
                    for (int i = 0; i < A0Y; i++) {
                        list.add(Integer.valueOf(i));
                    }
                } catch (Exception e) {
                    if (c2xe != null) {
                        C51372Xk.A03(c2xe, e);
                    }
                }
            }
        }
    }

    @Override // X.C2Y4
    public final boolean A0m(int i, int i2, Bundle bundle) {
        AccessibilityNodeInfoCompat A00;
        C3h4 A002;
        C2V9 c2v9;
        View view = this.A02;
        AnonymousClass051 A0Z = A0Z(view);
        boolean z = false;
        if (A0Z == null || (A00 = A0Z.A00(1)) == null || (A002 = A00(view)) == null) {
            return false;
        }
        AbstractC50812Vc abstractC50812Vc = AbstractC79093gG.A00(A002.A01).A03;
        if (!(abstractC50812Vc instanceof AbstractC50792Va)) {
            C50952Vr c50952Vr = this.A00;
            if (c50952Vr != null && (c2v9 = c50952Vr.A0P) != null) {
                C14360o3.A0B(view, 1);
                C2XV.A00();
                Object A003 = c2v9.A00(new Object());
                if ((A003 instanceof Boolean) && ((Boolean) A003).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
        C2WC c2wc = A002.A01.A06;
        C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
        C2XE c2xe = ((C2WB) c2wc).A04;
        if (c2xe == null) {
            return false;
        }
        try {
            Object obj = A002.A01.A07;
            C78993g5 c78993g5 = C2WE.A07;
            if (i >= abstractC50792Va.A0Y(c2xe, c78993g5.A01(obj)) || !abstractC50792Va.A16()) {
                return false;
            }
            z = abstractC50792Va.A18(bundle, view, A00, c2xe, c78993g5.A01(A002.A01.A07), i, i2);
            return z;
        } catch (Exception e) {
            C51372Xk.A03(c2xe, e);
            return z;
        }
    }

    public C2Y3(View view, C50952Vr c50952Vr, int i, boolean z) {
        super(view);
        this.A02 = view;
        this.A00 = c50952Vr;
        this.A01 = new C02V() { // from class: X.4iz
            @Override // X.C02V
            public final void A0R(View view2, int i2) {
                super.A0R(view2, i2);
            }

            @Override // X.C02V
            public final void A0S(View view2, AccessibilityEvent accessibilityEvent) {
                super.A0S(view2, accessibilityEvent);
            }

            @Override // X.C02V
            public final void A0T(View view2, AccessibilityEvent accessibilityEvent) {
                super.A0T(view2, accessibilityEvent);
            }

            @Override // X.C02V
            public final void A0U(View view2, AccessibilityEvent accessibilityEvent) {
                super.A0U(view2, accessibilityEvent);
            }

            @Override // X.C02V
            public final boolean A0V(View view2, int i2, Bundle bundle) {
                boolean A0V;
                A0V = super.A0V(view2, i2, bundle);
                return A0V;
            }

            @Override // X.C02V
            public final boolean A0W(View view2, AccessibilityEvent accessibilityEvent) {
                C2Y3 c2y3 = C2Y3.this;
                Rect rect = C2Y3.A03;
                return ((C02V) c2y3).A01.dispatchPopulateAccessibilityEvent(view2, accessibilityEvent);
            }

            @Override // X.C02V
            public final boolean A0X(ViewGroup viewGroup, View view2, AccessibilityEvent accessibilityEvent) {
                boolean A0X;
                A0X = super.A0X(viewGroup, view2, accessibilityEvent);
                return A0X;
            }

            @Override // X.C02V
            public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super/*X.2Y4*/.A0Y(view2, accessibilityNodeInfoCompat);
            }
        };
        view.setFocusable(z);
        view.setImportantForAccessibility(i);
    }
}
