package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;

/* renamed from: X.UBy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66357UBy extends FrameLayout implements X97, X7O, X7P {
    public float A00;
    public float A01;
    public int A02;
    public RunnableC71382Wsr A03;
    public XDS A04;
    public AccessibilityManager A05;
    public C69731VuQ A06;

    public float A02(int i) {
        return i / this.A02;
    }

    public abstract int getCurrentPositionAsValue();

    public abstract int getLengthPx();

    public void setCurrentPositionWithBounds(float f) {
        this.A00 = Math.min(1.0f, Math.max(0.0f, f));
        XDS xds = this.A04;
        if (xds != null) {
            xds.Dbr(getCurrentPositionAsValue());
        }
        if (this.A05 == null) {
            this.A05 = (AccessibilityManager) getContext().getSystemService("accessibility");
        }
        if (AbstractC56862jK.A01(getContext(), true)) {
            RunnableC71382Wsr runnableC71382Wsr = this.A03;
            if (runnableC71382Wsr == null) {
                this.A03 = new RunnableC71382Wsr(this);
            } else {
                removeCallbacks(runnableC71382Wsr);
            }
            postDelayed(this.A03, 200L);
        }
        invalidate();
    }

    private int getMax() {
        return Math.round((1.0f - this.A01) * this.A02);
    }

    private int getMin() {
        return Math.round((-this.A01) * this.A02);
    }

    public boolean A03() {
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A06.A02(motionEvent);
    }

    public void setOnSliderChangeListener(XDS xds) {
        this.A04 = xds;
        if (xds != null) {
            xds.Dbr(getCurrentPositionAsValue());
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.VuQ, java.lang.Object] */
    public AbstractC66357UBy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.A02 = 100;
        Handler A0J = AbstractC167007dF.A0J();
        ?? obj = new Object();
        obj.A00 = 0.5f;
        obj.A0H = C05F.A01;
        obj.A01 = -1.0f;
        obj.A02 = -1.0f;
        obj.A03 = 0.0f;
        obj.A04 = 0.0f;
        obj.A0E = null;
        obj.A0F = C05F.A00;
        obj.A0A = null;
        obj.A05 = 0;
        obj.A0B = null;
        obj.A0C = null;
        obj.A0D = null;
        obj.A09 = new GestureDetector(context, new WKr(obj), A0J);
        obj.A08 = context;
        this.A06 = obj;
        Integer[] numArr = {C05F.A0C, C05F.A0N};
        int i2 = 0;
        obj.A05 = 0;
        int i3 = 0;
        do {
            Integer num = numArr[i3];
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        i = 8;
                        break;
                    default:
                        i = 1;
                        break;
                }
                i2 |= i;
                obj.A05 = i2;
            }
            i3++;
        } while (i3 < 2);
        obj.A0C = this;
        obj.A0B = this;
        obj.A0D = this;
        setWillNotDraw(false);
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(X.AbstractC66357UBy r2, float r3, float r4) {
        /*
            boolean r0 = r2.Cee(r3, r4)
            if (r0 != 0) goto L8
            r1 = 0
        L7:
            return r1
        L8:
            boolean r0 = r2.A03()
            if (r0 == 0) goto Lf
            r3 = r4
        Lf:
            int r0 = r2.getLengthPx()
            int r0 = r0 / 3
            float r0 = (float) r0
            r1 = 1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2b
            int r0 = r2.getCurrentPositionAsValue()
            int r0 = r0 - r1
        L20:
            r2.setCurrentValue(r0)
        L23:
            X.XDS r0 = r2.A04
            if (r0 == 0) goto L7
            r0.DC5()
            return r1
        L2b:
            int r0 = r2.getLengthPx()
            int r0 = r0 * 2
            int r0 = r0 / 3
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L23
            int r0 = r2.getCurrentPositionAsValue()
            int r0 = r0 + 1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66357UBy.A01(X.UBy, float, float):boolean");
    }

    @Override // X.X97
    public boolean Cee(float f, float f2) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = C0f9.A06(-49443392);
        super.onDetachedFromWindow();
        RunnableC71382Wsr runnableC71382Wsr = this.A03;
        if (runnableC71382Wsr != null) {
            removeCallbacks(runnableC71382Wsr);
        }
        C0f9.A0D(40449381, A06);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(getMax());
        accessibilityEvent.setCurrentItemIndex(getCurrentPositionAsValue());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.addAction(4096);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r4 != 81) goto L14;
     */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L1b
            r0 = 21
            r2 = 1
            if (r4 == r0) goto L20
            r0 = 22
            if (r4 == r0) goto L2a
            r0 = 69
            if (r4 == r0) goto L20
            r0 = 70
            if (r4 == r0) goto L2a
            r0 = 81
            if (r4 == r0) goto L2a
        L1b:
            boolean r2 = super.onKeyDown(r4, r5)
            return r2
        L20:
            int r1 = r3.getCurrentPositionAsValue()
            int r0 = r3.A02
            int r0 = r0 / 20
            int r1 = r1 - r0
            goto L33
        L2a:
            int r1 = r3.getCurrentPositionAsValue()
            int r0 = r3.A02
            int r0 = r0 / 20
            int r1 = r1 + r0
        L33:
            r3.setCurrentValue(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66357UBy.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setContentDescription(getContext().getString(2131969756, Integer.valueOf(getCurrentPositionAsValue()), Integer.valueOf(getMin()), Integer.valueOf(getMax())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r1 != 3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        if (r10 <= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r7.A0F.intValue() != 3) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66357UBy.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int currentPositionAsValue;
        if (!super.performAccessibilityAction(i, bundle)) {
            if (isEnabled()) {
                if (i != 4096) {
                    if (i == 8192) {
                        currentPositionAsValue = getCurrentPositionAsValue() - (this.A02 / 20);
                    }
                } else {
                    currentPositionAsValue = getCurrentPositionAsValue() + (this.A02 / 20);
                }
                setCurrentValue(currentPositionAsValue);
            }
            return false;
        }
        return true;
    }

    public void setCurrentValue(int i) {
        setCurrentPositionWithBounds(A02(i));
    }

    public void setRootPosition(float f) {
        this.A01 = f;
    }

    public void setValueRangeSize(int i) {
        this.A02 = i;
    }
}
