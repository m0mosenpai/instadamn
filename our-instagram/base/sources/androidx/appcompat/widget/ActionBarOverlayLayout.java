package androidx.appcompat.widget;

import X.AbstractC011204a;
import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.C011504d;
import X.C02I;
import X.C03K;
import X.C04Z;
import X.C0f9;
import X.C69708Vu3;
import X.C71x;
import X.InterfaceC12520kw;
import X.InterfaceC17990uc;
import X.InterfaceC71831X6n;
import X.InterfaceC71933XBi;
import X.InterfaceC71936XBl;
import X.RunnableC71206Wpx;
import X.RunnableC71207Wpy;
import X.U5Q;
import X.UAJ;
import X.UAf;
import X.UD8;
import X.WPV;
import X.WPa;
import X.WQH;
import X.XDY;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.facebook.R;

/* loaded from: classes11.dex */
public class ActionBarOverlayLayout extends ViewGroup implements XDY, InterfaceC17990uc, InterfaceC12520kw {
    public static final Rect A0W;
    public static final C011504d A0X;
    public static final int[] A0Y = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public ViewPropertyAnimator A00;
    public OverScroller A01;
    public ActionBarContainer A02;
    public InterfaceC71936XBl A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Drawable A0B;
    public InterfaceC71831X6n A0C;
    public ContentFrameLayout A0D;
    public C011504d A0E;
    public C011504d A0F;
    public C011504d A0G;
    public C011504d A0H;
    public boolean A0I;
    public final AnimatorListenerAdapter A0J;
    public final Rect A0K;
    public final UAJ A0L;
    public final Runnable A0M;
    public final Runnable A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Rect A0Q;
    public final Rect A0R;
    public final Rect A0S;
    public final Rect A0T;
    public final Rect A0U;
    public final C03K A0V;

    static {
        C04Z c04z = new C04Z();
        C02I c02i = new C02I(0, 1, 0, 1);
        AbstractC011204a abstractC011204a = c04z.A00;
        abstractC011204a.A06(c02i);
        A0X = abstractC011204a.A00();
        A0W = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // X.InterfaceC12520kw
    public final void DVG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        DVF(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void A01() {
        removeCallbacks(this.A0N);
        removeCallbacks(this.A0M);
        ViewPropertyAnimator viewPropertyAnimator = this.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void A02() {
        InterfaceC71936XBl wrapper;
        if (this.A0D == null) {
            this.A0D = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.A02 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC71936XBl) {
                wrapper = (InterfaceC71936XBl) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw AbstractC31175DnJ.A0V("Can't make a decor toolbar out of ", AbstractC31173DnH.A0q(findViewById));
            }
            this.A03 = wrapper;
        }
    }

    @Override // X.InterfaceC17990uc
    public final void DVF(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // X.InterfaceC17990uc
    public final void DVH(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // X.InterfaceC17990uc
    public final boolean Do4(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC17990uc
    public final void Dow(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A02;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A0V;
        return c03k.A01 | c03k.A00;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        Runnable runnable;
        if (this.A0I && z) {
            this.A01.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.A01.getFinalY() > this.A02.getHeight()) {
                A01();
                runnable = this.A0M;
            } else {
                A01();
                runnable = this.A0N;
            }
            runnable.run();
            this.A04 = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.A08 + i2;
        this.A08 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        UD8 ud8;
        C69708Vu3 c69708Vu3;
        this.A0V.A01 = i;
        this.A08 = getActionBarHideOffset();
        A01();
        InterfaceC71831X6n interfaceC71831X6n = this.A0C;
        if (interfaceC71831X6n != null && (c69708Vu3 = (ud8 = (UD8) interfaceC71831X6n).A07) != null) {
            c69708Vu3.A00();
            ud8.A07 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.A02.getVisibility() == 0) {
            return this.A0I;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        Runnable runnable;
        if (this.A0I && !this.A04) {
            if (this.A08 <= this.A02.getHeight()) {
                A01();
                runnable = this.A0N;
            } else {
                A01();
                runnable = this.A0M;
            }
            postDelayed(runnable, 600L);
        }
    }

    public void setActionBarVisibilityCallback(InterfaceC71831X6n interfaceC71831X6n) {
        this.A0C = interfaceC71831X6n;
        if (getWindowToken() != null) {
            ((UD8) this.A0C).A00 = this.A0A;
            int i = this.A09;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                requestApplyInsets();
            }
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A0I) {
            this.A0I = z;
            if (!z) {
                A01();
                setActionBarHideOffset(0);
            }
        }
    }

    private void A00(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0Y);
        boolean z = false;
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.A0B = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.A01 = new OverScroller(context);
    }

    @Override // X.XDY
    public final boolean CZw() {
        WPV wpv;
        A02();
        ActionMenuView actionMenuView = ((WPa) this.A03).A09.A0E;
        if (actionMenuView != null && (wpv = actionMenuView.A04) != null && wpv.A03()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof UAf;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int A03 = C0f9.A03(1732354958);
        super.draw(canvas);
        if (this.A0B != null) {
            if (this.A02.getVisibility() == 0) {
                i = (int) (this.A02.getBottom() + this.A02.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.A0B.setBounds(0, i, getWidth(), this.A0B.getIntrinsicHeight() + i);
            this.A0B.draw(canvas);
        }
        C0f9.A0A(-664379951, A03);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public CharSequence getTitle() {
        A02();
        return ((WPa) this.A03).A09.A0J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r6 != false) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r9) {
        /*
            r8 = this;
            r8.A02()
            X.04d r7 = X.C011504d.A01(r8, r9)
            X.04b r5 = r7.A00
            X.02I r0 = r5.A03()
            int r4 = r0.A01
            int r2 = r7.A03()
            X.02I r0 = r5.A03()
            int r1 = r0.A02
            int r0 = r7.A02()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r4, r2, r1, r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A02
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r2.leftMargin
            int r0 = r3.left
            if (r1 == r0) goto L99
            r2.leftMargin = r0
            r6 = 1
        L33:
            int r1 = r2.topMargin
            int r0 = r3.top
            if (r1 == r0) goto L3c
            r2.topMargin = r0
            r6 = 1
        L3c:
            int r1 = r2.rightMargin
            int r0 = r3.right
            if (r1 == r0) goto L45
            r2.rightMargin = r0
            r6 = 1
        L45:
            android.graphics.Rect r4 = r8.A0O
            android.view.WindowInsets r0 = r7.A04()
            if (r0 == 0) goto L95
            android.view.WindowInsets r0 = r8.computeSystemWindowInsets(r0, r4)
            X.C011504d.A01(r8, r0)
        L54:
            int r3 = r4.left
            int r2 = r4.top
            int r1 = r4.right
            int r0 = r4.bottom
            X.04d r1 = r5.A0B(r3, r2, r1, r0)
            r8.A0E = r1
            X.04d r0 = r8.A0G
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6f
            X.04d r0 = r8.A0E
            r8.A0G = r0
            r6 = 1
        L6f:
            android.graphics.Rect r1 = r8.A0S
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L92
            r1.set(r4)
        L7a:
            r8.requestLayout()
        L7d:
            X.04d r0 = r5.A08()
            X.04b r0 = r0.A00
            X.04d r0 = r0.A0A()
            X.04b r0 = r0.A00
            X.04d r0 = r0.A09()
            android.view.WindowInsets r0 = r0.A04()
            return r0
        L92:
            if (r6 == 0) goto L7d
            goto L7a
        L95:
            r4.setEmpty()
            goto L54
        L99:
            r6 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A00(getContext());
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(2033358046);
        super.onDetachedFromWindow();
        A01();
        C0f9.A0D(-140243450, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = marginLayoutParams.leftMargin + paddingLeft;
                int i7 = marginLayoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        A02();
        int i2 = this.A09 ^ i;
        this.A09 = i;
        boolean z2 = false;
        boolean A1N = AbstractC167007dF.A1N(i & 4);
        if ((i & 256) != 0) {
            z2 = true;
        }
        InterfaceC71831X6n interfaceC71831X6n = this.A0C;
        if (interfaceC71831X6n != null) {
            UD8 ud8 = (UD8) interfaceC71831X6n;
            ud8.A0D = !z2;
            if (!A1N && z2) {
                if (!ud8.A0F) {
                    z = true;
                    ud8.A0F = true;
                    UD8.A01(ud8, z);
                }
            } else if (ud8.A0F) {
                ud8.A0F = false;
                z = true;
                UD8.A01(ud8, z);
            }
        }
        if ((i2 & 256) != 0 && this.A0C != null) {
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(133357578);
        super.onWindowVisibilityChanged(i);
        this.A0A = i;
        InterfaceC71831X6n interfaceC71831X6n = this.A0C;
        if (interfaceC71831X6n != null) {
            ((UD8) interfaceC71831X6n).A00 = i;
        }
        C0f9.A0D(2116487754, A06);
    }

    public void setActionBarHideOffset(int i) {
        A01();
        this.A02.setTranslationY(-Math.max(0, Math.min(i, this.A02.getHeight())));
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.A05 = z;
    }

    public void setIcon(int i) {
        Drawable drawable;
        A02();
        WPa wPa = (WPa) this.A03;
        if (i != 0) {
            drawable = C71x.A00(wPa.A09.getContext(), i);
        } else {
            drawable = null;
        }
        wPa.A03 = drawable;
        WPa.A00(wPa);
    }

    public void setLogo(int i) {
        Drawable drawable;
        A02();
        WPa wPa = (WPa) this.A03;
        if (i != 0) {
            drawable = C71x.A00(wPa.A09.getContext(), i);
        } else {
            drawable = null;
        }
        wPa.A04 = drawable;
        WPa.A00(wPa);
    }

    @Override // X.XDY
    public void setMenu(Menu menu, InterfaceC71933XBi interfaceC71933XBi) {
        A02();
        WPa wPa = (WPa) this.A03;
        WPV wpv = wPa.A08;
        if (wpv == null) {
            wpv = new WPV(wPa.A09.getContext());
            wPa.A08 = wpv;
        }
        wpv.A07 = interfaceC71933XBi;
        wPa.A09.setMenu((WQH) menu, wpv);
    }

    public void setOverlayMode(boolean z) {
        this.A06 = z;
    }

    @Override // X.XDY
    public void setWindowCallback(Window.Callback callback) {
        A02();
        ((WPa) this.A03).A07 = callback;
    }

    @Override // X.XDY
    public void setWindowTitle(CharSequence charSequence) {
        A02();
        this.A03.setWindowTitle(charSequence);
    }

    @Override // X.InterfaceC17990uc
    public final void DVE(View view, int[] iArr, int i, int i2, int i3) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.03K] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.UAJ, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = 0;
        this.A0O = new Rect();
        this.A0S = new Rect();
        this.A0Q = new Rect();
        this.A0K = new Rect();
        this.A0P = new Rect();
        this.A0T = new Rect();
        this.A0R = new Rect();
        this.A0U = new Rect();
        C011504d c011504d = C011504d.A01;
        this.A0E = c011504d;
        this.A0G = c011504d;
        this.A0F = c011504d;
        this.A0H = c011504d;
        this.A0J = new U5Q(this, 0);
        this.A0N = new RunnableC71206Wpx(this);
        this.A0M = new RunnableC71207Wpy(this);
        A00(context);
        this.A0V = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.A0L = view;
        addView(view);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A02();
        WPa wPa = (WPa) this.A03;
        wPa.A03 = drawable;
        WPa.A00(wPa);
    }
}
