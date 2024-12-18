package X;

import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UEi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66374UEi extends C2Y4 {
    public static int A04;
    public boolean A00;
    public Spanned A01;
    public final View A02;
    public final List A03;

    public C66374UEi(View view) {
        super(view);
        this.A02 = view;
        this.A03 = new ArrayList();
        this.A00 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.C2Y4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0h(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r19, int r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66374UEi.A0h(androidx.core.view.accessibility.AccessibilityNodeInfoCompat, int):void");
    }

    public static final void A00(C66374UEi c66374UEi) {
        XEA xea = (XEA) c66374UEi.A02;
        if (xea.getText() != c66374UEi.A01 && (xea.getText() instanceof Spanned)) {
            List list = c66374UEi.A03;
            list.clear();
            CharSequence text = xea.getText();
            C14360o3.A0C(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            c66374UEi.A01 = spanned;
            if (spanned != null) {
                if (c66374UEi.A00) {
                    C69380VmQ c69380VmQ = new C69380VmQ();
                    c69380VmQ.A05 = spanned.toString();
                    c69380VmQ.A01 = 0;
                    c69380VmQ.A00 = spanned.length();
                    c69380VmQ.A06 = true;
                    list.add(c69380VmQ);
                }
                ClickableSpan[] A0p = c66374UEi.A0p(0, spanned.length());
                if (A0p != null) {
                    for (ClickableSpan clickableSpan : A0p) {
                        int spanStart = spanned.getSpanStart(clickableSpan);
                        int spanEnd = spanned.getSpanEnd(clickableSpan);
                        C69380VmQ c69380VmQ2 = new C69380VmQ();
                        c69380VmQ2.A05 = spanned.subSequence(spanStart, spanEnd).toString();
                        c69380VmQ2.A03 = C05F.A01;
                        c69380VmQ2.A01 = spanStart;
                        c69380VmQ2.A00 = spanEnd;
                        c69380VmQ2.A06 = false;
                        c69380VmQ2.A02 = clickableSpan;
                        list.add(c69380VmQ2);
                    }
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2Y4
    public final int A0a(float f, float f2) {
        int offsetForHorizontal;
        ClickableSpan[] A0p;
        List list = this.A03;
        if (!list.isEmpty()) {
            XEA xea = (XEA) this.A02;
            if (xea.getText() instanceof Spanned) {
                float totalPaddingLeft = (f - xea.getTotalPaddingLeft()) + r1.getScrollX();
                float totalPaddingTop = (f2 - xea.getTotalPaddingTop()) + r1.getScrollY();
                Layout layout = xea.getLayout();
                if (layout != null && (A0p = A0p((offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) totalPaddingTop), totalPaddingLeft)), offsetForHorizontal)) != null && A0p.length != 0) {
                    CharSequence text = xea.getText();
                    C14360o3.A0C(text, "null cannot be cast to non-null type android.text.Spanned");
                    Spanned spanned = (Spanned) text;
                    int spanStart = spanned.getSpanStart(A0p[0]);
                    int spanEnd = spanned.getSpanEnd(A0p[0]);
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C69380VmQ c69380VmQ = (C69380VmQ) list.get(i);
                        if (c69380VmQ != null && c69380VmQ.A01 == spanStart && c69380VmQ.A00 == spanEnd) {
                            return i;
                        }
                    }
                }
                return A04;
            }
            return -1;
        }
        return -1;
    }

    @Override // X.C2Y4
    public final void A0f(AccessibilityEvent accessibilityEvent, int i) {
        C69380VmQ c69380VmQ;
        String str;
        String str2;
        if (i >= 0) {
            List list = this.A03;
            if (i < list.size()) {
                c69380VmQ = (C69380VmQ) list.get(i);
                str = "";
                if (c69380VmQ != null && (str2 = c69380VmQ.A05) != null) {
                    str = str2;
                }
                accessibilityEvent.setContentDescription(str);
            }
        }
        c69380VmQ = null;
        str = "";
        if (c69380VmQ != null) {
            str = str2;
        }
        accessibilityEvent.setContentDescription(str);
    }

    @Override // X.C2Y4
    public final boolean A0m(int i, int i2, Bundle bundle) {
        C69380VmQ c69380VmQ;
        ClickableSpan clickableSpan;
        View view;
        ViewParent parent;
        if (i2 == 16 && i >= 0) {
            List list = this.A03;
            if (i < list.size() && (c69380VmQ = (C69380VmQ) list.get(i)) != null && (clickableSpan = c69380VmQ.A02) != null) {
                clickableSpan.onClick(this.A02);
                if (this.A04.isEnabled() && (parent = (view = super.A03).getParent()) != null) {
                    AccessibilityEvent A09 = C2Y4.A09(this, i, C3OO.FLAG_MOVED);
                    A09.setContentChangeTypes(0);
                    parent.requestSendAccessibilityEvent(view, A09);
                }
                A0d(i, 1);
                return true;
            }
            return false;
        }
        return false;
    }

    public final ClickableSpan[] A0p(int i, int i2) {
        XEA xea = (XEA) this.A02;
        if (!(xea.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = xea.getText();
        C14360o3.A0C(text, "null cannot be cast to non-null type android.text.Spanned");
        return (ClickableSpan[]) ((Spanned) text).getSpans(i, i2, ClickableSpan.class);
    }

    @Override // X.C2Y4
    public final void A0i(List list) {
        A00(this);
        int size = this.A03.size();
        for (int i = 0; i < size; i++) {
            MSX.A0u(i, list);
        }
    }
}
