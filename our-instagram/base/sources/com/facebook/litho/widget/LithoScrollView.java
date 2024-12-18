package com.facebook.litho.widget;

import X.AnonymousClass001;
import X.AnonymousClass412;
import X.C03O;
import X.C0f9;
import X.C2V3;
import X.C2X1;
import X.C50662Um;
import X.C65853TvE;
import X.C69324VlW;
import X.EnumC50702Ur;
import X.InterfaceC25221Lc;
import X.WOM;
import X.X7V;
import X.X9B;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.LithoView;
import java.util.List;

/* loaded from: classes11.dex */
public class LithoScrollView extends NestedScrollView implements C2X1 {
    public ViewTreeObserver.OnPreDrawListener A00;
    public X9B A01;
    public C65853TvE A02;
    public C69324VlW A03;
    public String A04;
    public String A05;
    public final BaseMountingView A06;

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, true);
    }

    public LithoScrollView(Context context, AttributeSet attributeSet, int i) {
        this(context, new LithoView(context), attributeSet, i);
    }

    @Override // X.C2X1
    public final void Ctl(List list) {
        list.add(this.A06);
    }

    public BaseMountingView getRenderTreeView() {
        return this.A06;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        X9B x9b = this.A01;
        if (x9b != null) {
            z = x9b.DMb(motionEvent, this);
            if (z) {
                return z;
            }
        } else {
            z = false;
        }
        if (super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return z;
    }

    public void setScrollPosition(final C65853TvE c65853TvE) {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        if (c65853TvE != null) {
            if (C2V3.useOneShotPreDrawListener) {
                onPreDrawListener = C03O.A00(this, new Runnable() { // from class: X.Wta
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.setScrollY(c65853TvE.A00);
                    }
                });
            } else {
                onPreDrawListener = new WOM(1, this, c65853TvE);
                getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
            }
        } else {
            setScrollY(0);
            getViewTreeObserver().removeOnPreDrawListener(this.A00);
            onPreDrawListener = null;
        }
        this.A00 = onPreDrawListener;
    }

    public void setScrollStateListener(X7V x7v) {
        if (x7v != null) {
            C69324VlW c69324VlW = this.A03;
            if (c69324VlW == null) {
                c69324VlW = new C69324VlW(this);
                this.A03 = c69324VlW;
            }
            c69324VlW.A00 = x7v;
            return;
        }
        C69324VlW c69324VlW2 = this.A03;
        if (c69324VlW2 == null) {
            return;
        }
        c69324VlW2.A00 = null;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void A0B(int i) {
        super.A0B(i);
        C69324VlW c69324VlW = this.A03;
        if (c69324VlW != null) {
            c69324VlW.A01 = true;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(239423856);
        try {
            super.draw(canvas);
            C69324VlW c69324VlW = this.A03;
            if (c69324VlW != null && c69324VlW.A01 && !c69324VlW.A04) {
                if (!c69324VlW.A02) {
                    c69324VlW.A04 = true;
                    c69324VlW.A01 = false;
                }
                c69324VlW.A02 = false;
            }
            C0f9.A0A(2132074964, A03);
        } catch (Throwable th) {
            InterfaceC25221Lc A00 = C50662Um.A00();
            EnumC50702Ur enumC50702Ur = EnumC50702Ur.A03;
            String str = this.A05;
            if (str == null) {
                str = "null";
            }
            A00.EHF(enumC50702Ur, "LITHO:NPE:LITHO_SCROLL_VIEW_DRAW", AnonymousClass001.A0R("Root component: ", str), th, null, 0);
            AnonymousClass412 anonymousClass412 = new AnonymousClass412(null, this.A05, this.A04, th);
            C0f9.A0A(-616900510, A03);
            throw anonymousClass412;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A06.Ctb();
        C65853TvE c65853TvE = this.A02;
        if (c65853TvE != null) {
            c65853TvE.A00 = getScrollY();
        }
        C69324VlW c69324VlW = this.A03;
        if (c69324VlW != null) {
            if (!c69324VlW.A03 && !c69324VlW.A04) {
                c69324VlW.A03 = true;
            }
            c69324VlW.A02 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r7.getAction() != 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r4.A04 != false) goto L19;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1924110773(0x72af99b5, float:6.956249E30)
            int r3 = X.C0f9.A05(r0)
            boolean r5 = super.onTouchEvent(r7)
            X.VlW r4 = r6.A03
            if (r4 == 0) goto L38
            int r0 = r7.getAction()
            r2 = 1
            if (r0 == 0) goto L3f
            int r1 = r7.getAction()
            r0 = 2
            if (r1 == r0) goto L3f
            int r0 = r7.getAction()
            if (r0 == r2) goto L2a
            int r1 = r7.getAction()
            r0 = 3
            if (r1 != r0) goto L38
        L2a:
            boolean r0 = r4.A01
            if (r0 != 0) goto L38
            boolean r0 = r4.A03
            if (r0 == 0) goto L38
            boolean r0 = r4.A04
            if (r0 != 0) goto L38
        L36:
            r4.A04 = r2
        L38:
            r0 = -1495992153(0xffffffffa6d4f8a7, float:-1.4777852E-15)
            X.C0f9.A0C(r0, r3)
            return r5
        L3f:
            boolean r0 = r4.A04
            if (r0 == 0) goto L49
            r2 = 0
            r4.A03 = r2
            r4.A01 = r2
            goto L36
        L49:
            r0 = 0
            r4.A01 = r0
            r4.A02 = r2
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.LithoScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnInterceptTouchListener(X9B x9b) {
        this.A01 = x9b;
    }

    public LithoScrollView(Context context, BaseMountingView baseMountingView, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = baseMountingView;
        addView(baseMountingView);
    }

    public LithoScrollView(Context context, BaseMountingView baseMountingView) {
        this(context, baseMountingView, null, 0);
    }

    public LithoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LithoScrollView(Context context) {
        this(context, new LithoView(context));
    }
}
