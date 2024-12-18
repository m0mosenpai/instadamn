package com.instagram.ui.widget.refresh;

import X.AbstractC13560mi;
import X.AbstractC53242c7;
import X.C03H;
import X.C0f9;
import X.C3HG;
import X.C55942hf;
import X.C55982hj;
import X.C71094Wnq;
import X.EnumC1564970w;
import X.InterfaceC55932he;
import X.InterfaceC61462r9;
import X.RunnableC43092J3h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* loaded from: classes2.dex */
public class RefreshableListView extends ListView implements InterfaceC55932he, C3HG, C03H {
    public int A00;
    public AbsListView.OnScrollListener A01;
    public AbsListView.OnScrollListener A02;
    public C71094Wnq A03;
    public InterfaceC61462r9 A04;
    public EnumC1564970w A05;
    public Runnable A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public int A0A;
    public int A0B;
    public Paint A0C;
    public Paint A0D;
    public Drawable A0E;
    public LayerDrawable A0F;
    public View.OnClickListener A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AlphaAnimation A0L;
    public final AbsListView.OnScrollListener A0M;
    public final AlphaAnimation A0N;
    public final Transformation A0O;
    public final C55982hj A0P;

    @Override // X.C3HG
    public final void APU() {
        this.A08 = false;
        C71094Wnq c71094Wnq = this.A03;
        if (c71094Wnq != null) {
            c71094Wnq.APU();
        }
    }

    @Override // X.C3HG
    public final void AWT() {
        setIsLoading(true);
        if (this.A06 == null) {
            RunnableC43092J3h runnableC43092J3h = new RunnableC43092J3h(this);
            this.A06 = runnableC43092J3h;
            post(runnableC43092J3h);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A08 && this.A03 == null && Cbj()) {
            canvas.save();
            canvas.translate(0.0f, this.A00 + getScrollY());
            Paint paint = this.A0D;
            if (paint != null) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), -getScrollY(), paint);
            }
            if (this.A07 && (-getScrollY()) > this.A0B) {
                canvas.drawLine(0.0f, -getScrollY(), getWidth(), -getScrollY(), this.A0C);
            }
            canvas.translate((getWidth() - this.A0A) / 2, 0.0f);
            canvas.clipRect(0, 0, getWidth(), -getScrollY());
            AlphaAnimation alphaAnimation = this.A0N;
            long drawingTime = getDrawingTime();
            Transformation transformation = this.A0O;
            if (alphaAnimation.getTransformation(drawingTime, transformation)) {
                float abs = 1.2f - Math.abs(transformation.getAlpha());
                float f = this.A0A / 2;
                canvas.scale(abs, abs, f, f);
            }
            if (this.A05 == EnumC1564970w.PULLING_TO_REFRESH) {
                this.A0F.draw(canvas);
            } else if (this.A0J && this.A0L.getTransformation(getDrawingTime(), transformation)) {
                int i = this.A0A;
                float min = Math.min(1.0f, ((-getScrollY()) * 1.0f) / i);
                float f2 = i / 2;
                canvas.scale(min, min, f2, f2);
                this.A0E.setLevel((int) (transformation.getAlpha() * 10000.0f));
                this.A0E.draw(canvas);
                postInvalidateOnAnimation();
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        scrollTo(0, Math.min(0, A00(-i4)));
        A03();
        return super.dispatchNestedScroll(i, i2 + i4, i3, 0, iArr);
    }

    @Override // X.C3HG
    public void setUpPTRSpinner(C71094Wnq c71094Wnq) {
        this.A08 = true;
        this.A03 = c71094Wnq;
    }

    @Override // X.C3HG
    public void setupAndEnableRefresh(View.OnClickListener onClickListener) {
        this.A08 = true;
        this.A0G = onClickListener;
    }

    private void A02() {
        if (this.A05 != EnumC1564970w.PULLING_TO_REFRESH && this.A0I && getVisibility() == 0 && Cbj()) {
            AlphaAnimation alphaAnimation = this.A0L;
            alphaAnimation.setDuration(700L);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatCount(-1);
            alphaAnimation.setStartTime(-1L);
            alphaAnimation.start();
        }
    }

    public static void A04(RefreshableListView refreshableListView) {
        double d;
        C55982hj c55982hj = refreshableListView.A0P;
        c55982hj.A09(C55942hf.A04(70.0d, 11.0d));
        c55982hj.A02 = 1.0d;
        c55982hj.A00 = 0.5d;
        c55982hj.A0A(refreshableListView);
        c55982hj.A08(refreshableListView.getScrollY(), true);
        if (refreshableListView.A05 == EnumC1564970w.REFRESHING) {
            d = -refreshableListView.A0A;
        } else {
            d = 0.0d;
        }
        c55982hj.A06(d);
    }

    private void setState(EnumC1564970w enumC1564970w) {
        if (!this.A0J && enumC1564970w == EnumC1564970w.REFRESHING) {
            enumC1564970w = EnumC1564970w.COLLAPSING;
        }
        this.A05 = enumC1564970w;
        int ordinal = enumC1564970w.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    A04(this);
                    return;
                }
                return;
            }
            A02();
            return;
        }
        this.A0L.cancel();
    }

    @Override // X.C3HG
    public final void ARj() {
        if (this.A0G != null) {
            this.A08 = true;
        }
        C71094Wnq c71094Wnq = this.A03;
        if (c71094Wnq != null) {
            c71094Wnq.ARj();
        }
    }

    @Override // X.C3HG
    public final boolean Cbj() {
        C71094Wnq c71094Wnq = this.A03;
        if (c71094Wnq != null) {
            return c71094Wnq.A00.A0G;
        }
        if (getScrollY() >= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        if (this.A03 == null) {
            A03();
            scrollTo(0, (int) c55982hj.A09.A00);
            if (!Cbj() && this.A05 == EnumC1564970w.COLLAPSING) {
                setState(EnumC1564970w.PULLING_TO_REFRESH);
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A03 == null) {
            if (motionEvent.getAction() == 0 && Cbj()) {
                this.A0K = true;
            }
            if (this.A05 == EnumC1564970w.REFRESHING && Cbj()) {
                if (this.A09 == -1.0f) {
                    this.A09 = motionEvent.getRawY();
                }
                onTouchEvent(motionEvent);
                return false;
            }
            this.A09 = motionEvent.getRawY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (this.A05 != EnumC1564970w.COLLAPSING && !z2) {
            super.onOverScrolled(i, i2, z, z2);
        }
    }

    @Override // X.C3HG
    public void setIsLoading(boolean z) {
        EnumC1564970w enumC1564970w;
        if (z) {
            setState(EnumC1564970w.REFRESHING);
            invalidate();
            return;
        }
        Runnable runnable = this.A06;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.A06 = null;
        }
        if (!Cbj()) {
            enumC1564970w = EnumC1564970w.PULLING_TO_REFRESH;
        } else {
            enumC1564970w = EnumC1564970w.COLLAPSING;
        }
        setState(enumC1564970w);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        AbsListView.OnScrollListener onScrollListener2 = this.A0M;
        super.setOnScrollListener(onScrollListener2);
        if (onScrollListener != onScrollListener2) {
            this.A02 = onScrollListener;
        }
    }

    public void setPullToRefreshBackgroundColor(int i) {
        Paint paint = new Paint();
        this.A0D = paint;
        paint.setColor(i);
    }

    public RefreshableListView(Context context) {
        super(context);
        this.A0P = AbstractC13560mi.A00().A02();
        this.A0L = new AlphaAnimation(0.0f, 1.0f);
        this.A0N = new AlphaAnimation(-0.2f, 0.2f);
        this.A0O = new Transformation();
        this.A05 = EnumC1564970w.PULLING_TO_REFRESH;
        this.A09 = -1.0f;
        this.A0J = true;
        this.A07 = true;
        this.A0M = new AbsListView.OnScrollListener() { // from class: X.70x
            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                int A03 = C0f9.A03(1550168824);
                RefreshableListView refreshableListView = RefreshableListView.this;
                AbsListView.OnScrollListener onScrollListener = refreshableListView.A02;
                if (onScrollListener != null) {
                    onScrollListener.onScroll(absListView, i, i2, i3);
                }
                AbsListView.OnScrollListener onScrollListener2 = refreshableListView.A01;
                if (onScrollListener2 != null) {
                    onScrollListener2.onScroll(absListView, i, i2, i3);
                }
                C0f9.A0A(-1189708650, A03);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i) {
                int A03 = C0f9.A03(1045445497);
                RefreshableListView refreshableListView = RefreshableListView.this;
                AbsListView.OnScrollListener onScrollListener = refreshableListView.A02;
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(absListView, i);
                }
                AbsListView.OnScrollListener onScrollListener2 = refreshableListView.A01;
                if (onScrollListener2 != null) {
                    onScrollListener2.onScrollStateChanged(absListView, i);
                }
                C0f9.A0A(-1141588085, A03);
            }
        };
        A01();
    }

    private int A00(float f) {
        float f2 = -getScrollY();
        if (f2 < this.A0A * 1.4f) {
            return (int) (-(f2 + f));
        }
        return (int) (-Math.sqrt(Math.max(0.0f, (f * r3 * 1.4f) + (getScrollY() * getScrollY()))));
    }

    private void A01() {
        this.A0A = getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
        Context context = getContext();
        LayerDrawable layerDrawable = (LayerDrawable) context.getDrawable(R.drawable.refreshable_progress_drawable);
        this.A0F = layerDrawable;
        int i = this.A0A;
        layerDrawable.setBounds(0, 0, i, i);
        Drawable drawable = context.getDrawable(R.drawable.refreshable_spinner_drawable);
        this.A0E = drawable;
        int i2 = this.A0A;
        drawable.setBounds(0, 0, i2, i2);
        Paint paint = new Paint();
        this.A0C = paint;
        paint.setColor(AbstractC53242c7.A0F(context, R.attr.dividerColor));
        this.A0C.setStrokeWidth(0.0f);
        this.A0B = ViewConfiguration.get(context).getScaledOverflingDistance();
        setOnScrollListener(this.A0M);
    }

    private void A03() {
        this.A0F.setLevel((int) (Math.max(0.0f, getScrollAsFactorOfProgressDrawableSize()) * 10000.0f));
        if ((this.A04 == null || this.A0H) && this.A05 == EnumC1564970w.PULLING_TO_REFRESH && this.A0F.getLevel() >= 10000) {
            AlphaAnimation alphaAnimation = this.A0N;
            alphaAnimation.setDuration(300L);
            alphaAnimation.setStartTime(-1L);
            alphaAnimation.start();
            setState(EnumC1564970w.REFRESHING);
            View.OnClickListener onClickListener = this.A0G;
            if (onClickListener != null) {
                onClickListener.onClick(this);
                return;
            }
            return;
        }
        if (this.A05 != EnumC1564970w.REFRESHING) {
            return;
        }
        AlphaAnimation alphaAnimation2 = this.A0L;
        if (alphaAnimation2.hasStarted() && !alphaAnimation2.hasEnded()) {
            return;
        }
        A02();
    }

    private float getScrollAsFactorOfProgressDrawableSize() {
        float f = -getScrollY();
        float f2 = this.A0A;
        return (f - (0.4f * f2)) / f2;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(72929578);
        super.onAttachedToWindow();
        this.A0I = true;
        A02();
        C0f9.A0D(-1009905561, A06);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1521583130);
        super.onDetachedFromWindow();
        this.A0I = false;
        this.A0L.cancel();
        C55982hj c55982hj = this.A0P;
        c55982hj.A0B(this);
        c55982hj.A08(c55982hj.A01, true);
        C0f9.A0D(977747204, A06);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (Cbj() && (getFirstVisiblePosition() != 0 || getChildCount() == 0 || getChildAt(0).getTop() < getPaddingTop())) {
            setScrollY(0);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r8.getAction() == 1) goto L11;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 69097984(0x41e5a00, float:1.8614137E-36)
            int r2 = X.C0f9.A05(r0)
            X.Wnq r0 = r7.A03
            if (r0 == 0) goto L16
            boolean r1 = super.onTouchEvent(r8)
            r0 = -544755739(0xffffffffdf87afe5, float:-1.955457E19)
        L12:
            X.C0f9.A0C(r0, r2)
            return r1
        L16:
            int r0 = r8.getAction()
            r6 = 3
            r1 = 1
            r4 = 0
            if (r0 == r6) goto L26
            int r3 = r8.getAction()
            r0 = 0
            if (r3 != r1) goto L27
        L26:
            r0 = 1
        L27:
            r7.A0H = r0
            boolean r0 = r7.A08
            if (r0 == 0) goto La8
            float r3 = r8.getRawY()
            X.70w r5 = r7.A05
            X.70w r0 = X.EnumC1564970w.COLLAPSING
            if (r5 == r0) goto L73
            int r5 = r8.getActionMasked()
            r0 = 2
            if (r5 != r0) goto L97
            int r0 = r7.getFirstVisiblePosition()
            if (r0 != 0) goto L64
            int r0 = r7.getChildCount()
            if (r0 == 0) goto L64
            android.view.View r0 = r7.getChildAt(r4)
            int r5 = r0.getTop()
            int r0 = r7.getPaddingTop()
            if (r5 < r0) goto L64
            float r0 = r7.A09
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L64
            boolean r0 = r7.hasNestedScrollingParent()
            if (r0 == 0) goto L83
        L64:
            boolean r0 = r7.Cbj()
            if (r0 != 0) goto L83
            boolean r0 = r7.A0K
            if (r0 == 0) goto L73
            r7.A0K = r4
            r8.setAction(r4)
        L73:
            r0 = 0
        L74:
            r7.A09 = r3
            if (r0 != 0) goto L7f
            boolean r0 = super.onTouchEvent(r8)
            if (r0 != 0) goto L7f
            r1 = 0
        L7f:
            r0 = -211447861(0xfffffffff3658fcb, float:-1.8187751E31)
            goto L12
        L83:
            float r0 = r7.A09
            float r0 = r3 - r0
            int r0 = r7.A00(r0)
            int r0 = java.lang.Math.min(r4, r0)
            r7.scrollTo(r4, r0)
            r7.A03()
            r0 = 1
            goto L74
        L97:
            if (r5 == r1) goto L9b
            if (r5 != r6) goto L73
        L9b:
            boolean r0 = r7.Cbj()
            if (r0 == 0) goto L73
            A04(r7)
            r8.setAction(r6)
            goto L73
        La8:
            boolean r1 = super.onTouchEvent(r8)
            r0 = 52075533(0x31a9c0d, float:4.543567E-37)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.refresh.RefreshableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        AlphaAnimation alphaAnimation = this.A0L;
        if (alphaAnimation != null) {
            if (i == 0) {
                A02();
            } else {
                alphaAnimation.cancel();
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        int A06 = C0f9.A06(550934797);
        int scrollY = getScrollY();
        super.onWindowFocusChanged(z);
        setScrollY(scrollY);
        C0f9.A0D(1731029879, A06);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.A03 == null) {
            InterfaceC61462r9 interfaceC61462r9 = this.A04;
            if (interfaceC61462r9 != null) {
                interfaceC61462r9.E6p(getScrollAsFactorOfProgressDrawableSize(), getScrollAsFactorOfProgressDrawableSize());
            }
            this.A0M.onScroll(this, getFirstVisiblePosition(), getChildCount(), getCount());
        }
    }

    public void setDrawBorder(boolean z) {
        this.A07 = z;
    }

    public void setDrawableTopOffset(int i) {
        this.A00 = i;
    }

    public void setGlobalOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A01 = onScrollListener;
    }

    public void setPullDownProgressDelegate(InterfaceC61462r9 interfaceC61462r9) {
        this.A04 = interfaceC61462r9;
    }

    public RefreshableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0P = AbstractC13560mi.A00().A02();
        this.A0L = new AlphaAnimation(0.0f, 1.0f);
        this.A0N = new AlphaAnimation(-0.2f, 0.2f);
        this.A0O = new Transformation();
        this.A05 = EnumC1564970w.PULLING_TO_REFRESH;
        this.A09 = -1.0f;
        this.A0J = true;
        this.A07 = true;
        this.A0M = new AbsListView.OnScrollListener() { // from class: X.70x
            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i2, int i22, int i3) {
                int A03 = C0f9.A03(1550168824);
                RefreshableListView refreshableListView = RefreshableListView.this;
                AbsListView.OnScrollListener onScrollListener = refreshableListView.A02;
                if (onScrollListener != null) {
                    onScrollListener.onScroll(absListView, i2, i22, i3);
                }
                AbsListView.OnScrollListener onScrollListener2 = refreshableListView.A01;
                if (onScrollListener2 != null) {
                    onScrollListener2.onScroll(absListView, i2, i22, i3);
                }
                C0f9.A0A(-1189708650, A03);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i2) {
                int A03 = C0f9.A03(1045445497);
                RefreshableListView refreshableListView = RefreshableListView.this;
                AbsListView.OnScrollListener onScrollListener = refreshableListView.A02;
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(absListView, i2);
                }
                AbsListView.OnScrollListener onScrollListener2 = refreshableListView.A01;
                if (onScrollListener2 != null) {
                    onScrollListener2.onScrollStateChanged(absListView, i2);
                }
                C0f9.A0A(-1141588085, A03);
            }
        };
        A01();
    }

    public RefreshableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0P = AbstractC13560mi.A00().A02();
        this.A0L = new AlphaAnimation(0.0f, 1.0f);
        this.A0N = new AlphaAnimation(-0.2f, 0.2f);
        this.A0O = new Transformation();
        this.A05 = EnumC1564970w.PULLING_TO_REFRESH;
        this.A09 = -1.0f;
        this.A0J = true;
        this.A07 = true;
        this.A0M = new AbsListView.OnScrollListener() { // from class: X.70x
            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i2, int i22, int i3) {
                int A03 = C0f9.A03(1550168824);
                RefreshableListView refreshableListView = RefreshableListView.this;
                AbsListView.OnScrollListener onScrollListener = refreshableListView.A02;
                if (onScrollListener != null) {
                    onScrollListener.onScroll(absListView, i2, i22, i3);
                }
                AbsListView.OnScrollListener onScrollListener2 = refreshableListView.A01;
                if (onScrollListener2 != null) {
                    onScrollListener2.onScroll(absListView, i2, i22, i3);
                }
                C0f9.A0A(-1189708650, A03);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i2) {
                int A03 = C0f9.A03(1045445497);
                RefreshableListView refreshableListView = RefreshableListView.this;
                AbsListView.OnScrollListener onScrollListener = refreshableListView.A02;
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(absListView, i2);
                }
                AbsListView.OnScrollListener onScrollListener2 = refreshableListView.A01;
                if (onScrollListener2 != null) {
                    onScrollListener2.onScrollStateChanged(absListView, i2);
                }
                C0f9.A0A(-1141588085, A03);
            }
        };
        A01();
    }
}
