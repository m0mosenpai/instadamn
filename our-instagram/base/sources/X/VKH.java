package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class VKH {
    public final int A01(View view) {
        if (this instanceof C66377UEl) {
            return view.getWidth();
        }
        if (this instanceof C66378UEm) {
            return ((C66378UEm) this).A00.A03;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r1 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = r3.A01 - r6.getWidth();
        r2 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r1 = r3.A01;
        r2 = r6.getWidth() + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02(android.view.View r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C66376UEk
            if (r0 == 0) goto L9
            int r0 = r6.getLeft()
            return r0
        L9:
            boolean r0 = r5 instanceof X.C66377UEl
            if (r0 == 0) goto L4e
            r3 = r5
            X.UEl r3 = (X.C66377UEl) r3
            int r0 = r6.getLayoutDirection()
            r2 = 1
            boolean r1 = X.AbstractC167007dF.A1P(r0, r2)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r3.A02
            int r0 = r0.A02
            if (r0 != 0) goto L33
            if (r1 == 0) goto L37
        L21:
            int r1 = r3.A01
            int r0 = r6.getWidth()
            int r1 = r1 - r0
            int r2 = r3.A01
        L2a:
            int r0 = java.lang.Math.max(r1, r7)
        L2e:
            int r0 = java.lang.Math.min(r0, r2)
            return r0
        L33:
            if (r0 != r2) goto L3f
            if (r1 == 0) goto L21
        L37:
            int r1 = r3.A01
            int r2 = r6.getWidth()
            int r2 = r2 + r1
            goto L2a
        L3f:
            int r1 = r3.A01
            int r0 = r6.getWidth()
            int r1 = r1 - r0
            int r0 = r3.A01
            int r2 = r6.getWidth()
            int r2 = r2 + r0
            goto L2a
        L4e:
            r0 = r5
            X.UEm r0 = (X.C66378UEm) r0
            androidx.slidingpanelayout.widget.SlidingPaneLayout r4 = r0.A00
            android.view.View r0 = r4.A06
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r1 = r4.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L82
            int r2 = r4.getWidth()
            int r1 = r4.getPaddingRight()
            int r0 = r3.rightMargin
            int r1 = r1 + r0
            android.view.View r0 = r4.A06
            int r0 = r0.getWidth()
            int r1 = r1 + r0
            int r2 = r2 - r1
            int r0 = r4.A03
            int r1 = r2 - r0
            int r0 = java.lang.Math.min(r7, r2)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L82:
            int r1 = r4.getPaddingLeft()
            int r0 = r3.leftMargin
            int r1 = r1 + r0
            int r2 = r4.A03
            int r2 = r2 + r1
            int r0 = java.lang.Math.max(r7, r1)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VKH.A02(android.view.View, int):int");
    }

    public final void A03(int i) {
        if (this instanceof C66378UEm) {
            C66378UEm c66378UEm = (C66378UEm) this;
            if (C66378UEm.A00(c66378UEm)) {
                SlidingPaneLayout slidingPaneLayout = c66378UEm.A00;
                slidingPaneLayout.A0K.A0G(slidingPaneLayout.A06, i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        r4 = r3.A0R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r1 < java.lang.Math.abs(r0 - r4)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        if (r1 < java.lang.Math.abs(r6 - r2)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (r1 >= java.lang.Math.abs(r6 - r2)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r6 < java.lang.Math.abs(r6 - r3.A04)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fa, code lost:
    
        if (r9 >= 0.0f) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
    
        r4 = r5.A01;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0124, code lost:
    
        if (r9 <= 0.0f) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013e, code lost:
    
        if (java.lang.Math.abs(r8.getLeft() - r5.A01) >= java.lang.Math.round(r8.getWidth() * 0.5f)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0 > r4) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r5 = 6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.view.View r8, float r9, float r10) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VKH.A04(android.view.View, float, float):void");
    }

    public final void A05(View view, int i, int i2) {
        int paddingLeft;
        int i3;
        if (this instanceof C66376UEk) {
            ((C66376UEk) this).A00.A0U(i2);
            return;
        }
        if (this instanceof C66377UEl) {
            C66377UEl c66377UEl = (C66377UEl) this;
            float f = c66377UEl.A01;
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = c66377UEl.A02;
            float f2 = f + (width * swipeDismissBehavior.A01);
            float width2 = c66377UEl.A01 + (view.getWidth() * swipeDismissBehavior.A00);
            float f3 = i;
            if (f3 <= f2) {
                view.setAlpha(1.0f);
                return;
            } else if (f3 >= width2) {
                view.setAlpha(0.0f);
                return;
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (width2 - f2))), 1.0f));
                return;
            }
        }
        SlidingPaneLayout slidingPaneLayout = ((C66378UEm) this).A00;
        if (slidingPaneLayout.A06 == null) {
            slidingPaneLayout.A00 = 0.0f;
        } else {
            boolean A1a = AbstractC65703TsZ.A1a(slidingPaneLayout);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slidingPaneLayout.A06.getLayoutParams();
            int width3 = slidingPaneLayout.A06.getWidth();
            if (A1a) {
                i = (slidingPaneLayout.getWidth() - i) - width3;
                paddingLeft = slidingPaneLayout.getPaddingRight();
                i3 = marginLayoutParams.rightMargin;
            } else {
                paddingLeft = slidingPaneLayout.getPaddingLeft();
                i3 = marginLayoutParams.leftMargin;
            }
            float f4 = (i - (paddingLeft + i3)) / slidingPaneLayout.A03;
            slidingPaneLayout.A00 = f4;
            if (slidingPaneLayout.A02 != 0) {
                SlidingPaneLayout.A01(slidingPaneLayout, f4);
            }
            Iterator it = slidingPaneLayout.A0M.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onPanelSlide");
            }
        }
        slidingPaneLayout.invalidate();
    }
}
