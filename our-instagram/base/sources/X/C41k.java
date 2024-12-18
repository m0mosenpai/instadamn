package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.41k, reason: invalid class name */
/* loaded from: classes2.dex */
public class C41k extends C02V {
    public ReboundViewPager A00;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[LOOP:0: B:12:0x0036->B:14:0x003c, LOOP_END] */
    @Override // X.C02V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0V(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            r0 = 4096(0x1000, float:5.74E-42)
            r2 = 1
            if (r7 == r0) goto L12
            r0 = 8192(0x2000, float:1.148E-41)
            if (r7 == r0) goto L1f
            boolean r0 = super.A0V(r6, r7, r8)
            return r0
        L12:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.A00
            boolean r0 = r1.canScrollHorizontally(r2)
            if (r0 == 0) goto L46
            int r0 = r1.A07
            int r3 = r0 + 1
            goto L2b
        L1f:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.A00
            r0 = -1
            boolean r0 = r1.canScrollHorizontally(r0)
            if (r0 == 0) goto L46
            int r3 = r1.A07
            int r3 = r3 - r2
        L2b:
            r1.A0K(r3)
            int r2 = r1.A07
            java.util.Set r0 = r1.A0x
            java.util.Iterator r1 = r0.iterator()
        L36:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r1.next()
            X.2tS r0 = (X.InterfaceC62892tS) r0
            r0.DrZ(r2, r3)
            goto L36
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41k.A0V(android.view.View, int, android.os.Bundle):boolean");
    }

    @Override // X.C02V
    public final boolean A0W(View view, AccessibilityEvent accessibilityEvent) {
        View view2;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(accessibilityEvent, 1);
        if (accessibilityEvent.getEventType() != 4096 && (view2 = this.A00.A0F) != null) {
            return view2.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        return this.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // X.C02V
    public final boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(accessibilityEvent, 2);
        if (accessibilityEvent.getEventType() == 32768) {
            viewGroup.postDelayed(new RunnableC24305AqA(viewGroup), 1000L);
        }
        return super.A0X(viewGroup, view, accessibilityEvent);
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(accessibilityNodeInfoCompat, 1);
        super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(4096);
        accessibilityNodeInfoCompat.addAction(8192);
    }

    public C41k(ReboundViewPager reboundViewPager) {
        this.A00 = reboundViewPager;
        if (reboundViewPager.getImportantForAccessibility() == 0) {
            this.A00.setImportantForAccessibility(1);
        }
    }
}
