package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes11.dex */
public final class Ut9 extends UBP implements C03H, InterfaceC71846X7e {
    public final C03I A00;
    public final WXb A01;
    public final C131565ws A02;

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A00.A04(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A00.A03(f, f2);
    }

    public final WXb getController() {
        return this.A01;
    }

    public final C03I getNestedScrollingChildHelper$fbandroid_libraries_bloks_components_bk_components_zoomable_bk_components_zoomable() {
        return this.A00;
    }

    public final C131565ws getRenderTreeHostView() {
        return this.A02;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A01.A0P;
    }

    public Ut9(Context context) {
        super(context);
        C131555wr c131555wr = new C131555wr(context);
        this.A02 = c131555wr;
        this.A01 = new WXb(context, c131555wr);
        this.A00 = new C03I(this);
        addView(c131555wr, new FrameLayout.LayoutParams(-1, -1));
        c131555wr.setClipChildren(false);
        c131555wr.setClipToPadding(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-693561667);
        super.onAttachedToWindow();
        this.A00.A02(true);
        C0f9.A0D(-1256077085, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(117138133);
        this.A00.A02(false);
        this.A01.A06();
        super.onDetachedFromWindow();
        C0f9.A0D(1902566735, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(404208463);
        C14360o3.A0B(motionEvent, 0);
        WXb wXb = this.A01;
        ViewParent parent = getParent();
        if (!wXb.A0Q || motionEvent.getPointerCount() == 2 || wXb.A0L != C05F.A00) {
            Ut9 ut9 = wXb.A0G;
            if (ut9 != null) {
                ut9.A00.A05(0, 0);
                if (wXb.A0Q) {
                    wXb.A0U.onTouchEvent(motionEvent);
                    int actionMasked = motionEvent.getActionMasked();
                    if ((actionMasked == 1 || actionMasked == 3) && wXb.A0L == C05F.A0C) {
                        C09530e4 A01 = WXb.A01(wXb, 1.0f);
                        WXb.A03(wXb, 1.0d, wXb.A0B + ((Number) A01.A00).floatValue(), wXb.A0C + ((Number) A01.A01).floatValue(), false);
                        Ut9 ut92 = wXb.A0G;
                        if (ut92 != null) {
                            ut92.A00.A01(0);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 0) {
                        if (wXb.A0L == C05F.A01) {
                            C55982hj c55982hj = wXb.A0J;
                            c55982hj.A06(c55982hj.A09.A00);
                            C55982hj c55982hj2 = wXb.A0H;
                            c55982hj2.A06(c55982hj2.A09.A00);
                            C55982hj c55982hj3 = wXb.A0I;
                            c55982hj3.A06(c55982hj3.A09.A00);
                            c55982hj.A01();
                            c55982hj3.A01();
                            c55982hj2.A01();
                            WXb.A02(wXb);
                        }
                        if (wXb.A0L == C05F.A0u) {
                            wXb.A08(C05F.A00);
                        }
                        wXb.A0W.forceFinished(true);
                    }
                    wXb.A0U.onTouchEvent(motionEvent);
                    if (wXb.A0L != C05F.A0N && motionEvent.getPointerCount() == 1) {
                        ((GestureDetector) wXb.A0Y.getValue()).onTouchEvent(motionEvent);
                    }
                    int actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 == 1 || actionMasked2 == 3) {
                        Integer num = wXb.A0L;
                        if (num != C05F.A0u && num != C05F.A01) {
                            float floatValue = ((Number) C17s.A09(Float.valueOf(wXb.A02), new JTC(1.0f, wXb.A07))).floatValue();
                            C09530e4 A012 = WXb.A01(wXb, floatValue);
                            WXb.A03(wXb, floatValue, ((Number) A012.A00).floatValue(), ((Number) A012.A01).floatValue(), false);
                        }
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                        wXb.A0P = false;
                        Ut9 ut93 = wXb.A0G;
                        if (ut93 != null) {
                            ut93.A00.A01(0);
                            wXb.A00 = 0.0f;
                            wXb.A01 = 0.0f;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C0f9.A0C(1674992832, A05);
        return true;
    }
}
