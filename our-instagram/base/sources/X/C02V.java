package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.02V, reason: invalid class name */
/* loaded from: classes.dex */
public class C02V {
    public static final View.AccessibilityDelegate A02 = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A00;
    public final View.AccessibilityDelegate A01;

    public void A0R(View view, int i) {
        this.A01.sendAccessibilityEvent(view, i);
    }

    public void A0S(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A0T(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void A0U(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean A0W(View view, AccessibilityEvent accessibilityEvent) {
        return this.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.A01.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.mInfo);
    }

    public AnonymousClass051 A0Z(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.A01.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AnonymousClass051(accessibilityNodeProvider);
        }
        return null;
    }

    public C02V(View.AccessibilityDelegate accessibilityDelegate) {
        this.A01 = accessibilityDelegate;
        this.A00 = new C02U(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0V(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r0 = 2131442506(0x7f0b3b4a, float:1.8507054E38)
            java.lang.Object r3 = r7.getTag(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto Lf
            java.util.List r3 = java.util.Collections.emptyList()
        Lf:
            r2 = 0
        L10:
            int r0 = r3.size()
            if (r2 >= r0) goto L5c
            java.lang.Object r1 = r3.get(r2)
            X.04r r1 = (X.C012804r) r1
            int r0 = r1.A00()
            if (r0 != r8) goto L2d
            X.054 r5 = r1.A01
            r2 = 0
            if (r5 == 0) goto L5c
            r4 = 0
            java.lang.Class r3 = r1.A02
            if (r3 == 0) goto L56
            goto L30
        L2d:
            int r2 = r2 + 1
            goto L10
        L30:
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L41
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.Exception -> L41
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L41
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L41
            X.053 r0 = (X.AnonymousClass053) r0     // Catch: java.lang.Exception -> L41
            r0.A00 = r9     // Catch: java.lang.Exception -> L43
            goto L55
        L41:
            r2 = move-exception
            goto L45
        L43:
            r2 = move-exception
            r4 = r0
        L45:
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
            java.lang.String r0 = "A11yActionCompat"
            android.util.Log.e(r0, r1, r2)
            goto L56
        L55:
            r4 = r0
        L56:
            boolean r1 = r5.E44(r7, r4)
            if (r1 != 0) goto Lbb
        L5c:
            android.view.View$AccessibilityDelegate r0 = r6.A01
            boolean r1 = r0.performAccessibilityAction(r7, r8, r9)
            if (r1 != 0) goto Lbb
            r0 = 2131427387(0x7f0b003b, float:1.8476389E38)
            if (r8 != r0) goto Lbb
            if (r9 == 0) goto Lbb
            r1 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r9.getInt(r0, r1)
            r0 = 2131442507(0x7f0b3b4b, float:1.8507056E38)
            java.lang.Object r0 = r7.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto Lbf
            java.lang.Object r4 = r0.get()
            android.text.style.ClickableSpan r4 = (android.text.style.ClickableSpan) r4
            r3 = 0
            if (r4 == 0) goto Lbf
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r1 = r0.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto Lbf
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r1.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r2 = r2.getSpans(r3, r1, r0)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
            r1 = 0
            if (r2 == 0) goto Lbf
        Lac:
            int r0 = r2.length
            if (r1 >= r0) goto Lbf
            r0 = r2[r1]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lbc
            r4.onClick(r7)
            r1 = 1
        Lbb:
            return r1
        Lbc:
            int r1 = r1 + 1
            goto Lac
        Lbf:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02V.A0V(android.view.View, int, android.os.Bundle):boolean");
    }

    public C02V() {
        this(A02);
    }
}
