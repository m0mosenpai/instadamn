package com.google.android.material.appbar;

import X.AbstractC008903d;
import X.AbstractC153306uz;
import X.AbstractC167007dF;
import X.AbstractC63123SdR;
import X.C011504d;
import X.C0f9;
import X.C1343465d;
import X.C65757TtX;
import X.C65758TtY;
import X.C65799TuH;
import X.C65K;
import X.C65M;
import X.C65N;
import X.C67767Uxi;
import X.C72E;
import X.InterfaceC155836zD;
import X.UBM;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.R;

/* loaded from: classes11.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public ValueAnimator A04;
    public Drawable A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public C011504d A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public Drawable A0K;
    public InterfaceC155836zD A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Rect A0Q;
    public final C1343465d A0R;
    public final C65757TtX A0S;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.UBM, android.view.ViewGroup$LayoutParams, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.A01 = 0;
        layoutParams.A00 = 0.5f;
        return layoutParams;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C011504d c011504d = this.A09;
        if (c011504d != null) {
            int A03 = c011504d.A03();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < A03) {
                    childAt.offsetTopAndBottom(A03);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            C72E A00 = A00(getChildAt(i6));
            View view = A00.A03;
            A00.A01 = view.getTop();
            A00.A00 = view.getLeft();
        }
        A04(i, i2, i3, i4, false);
        A03();
        A05();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            A00(getChildAt(i7)).A00();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight2;
        int lineCount;
        A01();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C011504d c011504d = this.A09;
        if (c011504d != null) {
            i3 = c011504d.A03();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.A0O) && i3 > 0) {
            this.A0J = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        }
        if (this.A0N) {
            C65757TtX c65757TtX = this.A0S;
            if (c65757TtX.A0T > 1) {
                A03();
                A04(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                StaticLayout staticLayout = c65757TtX.A0c;
                if (staticLayout != null && (lineCount = staticLayout.getLineCount()) > 1) {
                    TextPaint textPaint = c65757TtX.A0u;
                    textPaint.setTextSize(c65757TtX.A0K);
                    textPaint.setTypeface(c65757TtX.A0b);
                    textPaint.setLetterSpacing(c65757TtX.A0F);
                    this.A0G = Math.round((-textPaint.ascent()) + textPaint.descent()) * (lineCount - 1);
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.A0G, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
                }
            }
        }
        ViewGroup viewGroup = this.A08;
        if (viewGroup != null) {
            View view = this.A07;
            if (view != null && view != this) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = view.getMeasuredHeight();
                    measuredHeight = measuredHeight2 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    setMinimumHeight(measuredHeight);
                }
                measuredHeight = view.getMeasuredHeight();
                setMinimumHeight(measuredHeight);
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = viewGroup.getMeasuredHeight();
                measuredHeight = measuredHeight2 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                setMinimumHeight(measuredHeight);
            }
            measuredHeight = viewGroup.getMeasuredHeight();
            setMinimumHeight(measuredHeight);
        }
    }

    private void A01() {
        if (this.A0P) {
            ViewGroup viewGroup = null;
            this.A08 = null;
            this.A07 = null;
            int i = this.A0I;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.A08 = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.A07 = view;
                }
            }
            if (this.A08 == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.A08 = viewGroup;
            }
            A02();
            this.A0P = false;
        }
    }

    private void A02() {
        View view;
        if (!this.A0A && (view = this.A06) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A06);
            }
        }
        if (this.A0A && this.A08 != null) {
            View view2 = this.A06;
            if (view2 == null) {
                view2 = new View(getContext());
                this.A06 = view2;
            }
            if (view2.getParent() == null) {
                this.A08.addView(this.A06, -1, -1);
            }
        }
    }

    private void A03() {
        CharSequence charSequence;
        if (this.A08 != null && this.A0A && TextUtils.isEmpty(this.A0S.A0f)) {
            ViewGroup viewGroup = this.A08;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).A0J;
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r14.A06.getVisibility() != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A04(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            boolean r0 = r14.A0A
            if (r0 == 0) goto L95
            android.view.View r0 = r14.A06
            if (r0 == 0) goto L95
            boolean r0 = r0.isAttachedToWindow()
            r13 = 0
            r2 = 1
            if (r0 == 0) goto L19
            android.view.View r0 = r14.A06
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L1a
        L19:
            r0 = 0
        L1a:
            r14.A0M = r0
            r3 = r19
            if (r0 != 0) goto L22
            if (r19 == 0) goto L95
        L22:
            int r0 = r14.getLayoutDirection()
            if (r0 != r2) goto L29
            r13 = 1
        L29:
            android.view.View r2 = r14.A07
            if (r2 != 0) goto L2f
            android.view.ViewGroup r2 = r14.A08
        L2f:
            X.72E r0 = A00(r2)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r12 = r14.getHeight()
            int r0 = r0.A01
            int r12 = r12 - r0
            int r0 = r2.getHeight()
            int r12 = r12 - r0
            int r0 = r1.bottomMargin
            int r12 = r12 - r0
            android.view.View r0 = r14.A06
            android.graphics.Rect r9 = r14.A0Q
            X.W8d.A01(r9, r0, r14)
            android.view.ViewGroup r2 = r14.A08
            boolean r0 = r2 instanceof androidx.appcompat.widget.Toolbar
            r10 = 0
            if (r0 == 0) goto L9c
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            int r10 = r2.A05
            int r11 = r2.A04
            int r1 = r2.A06
            int r8 = r2.A03
        L60:
            X.TtX r6 = r14.A0S
            int r7 = r9.left
            r0 = r10
            if (r13 == 0) goto L68
            r0 = r11
        L68:
            int r7 = r7 + r0
            int r2 = r9.top
            int r2 = r2 + r12
            int r2 = r2 + r1
            int r1 = r9.right
            if (r13 != 0) goto L72
            r10 = r11
        L72:
            int r1 = r1 - r10
            int r0 = r9.bottom
            int r0 = r0 + r12
            int r0 = r0 - r8
            r6.A0B(r7, r2, r1, r0)
            if (r13 == 0) goto L99
            int r2 = r14.A0D
        L7e:
            int r1 = r9.top
            int r0 = r14.A0F
            int r1 = r1 + r0
            int r5 = r17 - r15
            if (r13 == 0) goto L96
            int r0 = r14.A0E
        L89:
            int r5 = r5 - r0
            int r4 = r18 - r16
            int r0 = r14.A0C
            int r4 = r4 - r0
            r6.A0C(r2, r1, r5, r4)
            r6.A0G(r3)
        L95:
            return
        L96:
            int r0 = r14.A0D
            goto L89
        L99:
            int r2 = r14.A0E
            goto L7e
        L9c:
            boolean r0 = r2 instanceof android.widget.Toolbar
            if (r0 == 0) goto Lb3
            android.widget.Toolbar r2 = (android.widget.Toolbar) r2
            int r10 = r2.getTitleMarginStart()
            int r11 = r2.getTitleMarginEnd()
            int r1 = r2.getTitleMarginTop()
            int r8 = r2.getTitleMarginBottom()
            goto L60
        Lb3:
            r8 = 0
            r11 = 0
            r1 = 0
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A04(int, int, int, int, boolean):void");
    }

    public final void A05() {
        if (this.A0K != null || this.A05 != null) {
            setScrimsShown(AbstractC167007dF.A1Q(getHeight() + this.A00, getScrimVisibleHeightTrigger()));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        Drawable drawable = this.A0K;
        if (drawable != null && this.A01 > 0) {
            View view2 = this.A07;
            if (view2 == null || view2 == this) {
                view2 = this.A08;
            }
            if (view == view2) {
                int width = getWidth();
                int height = getHeight();
                if (this.A02 == 1 && view != null && this.A0A) {
                    height = view.getBottom();
                }
                drawable.setBounds(0, 0, width, height);
                this.A0K.mutate().setAlpha(this.A01);
                this.A0K.draw(canvas);
                z = true;
                if (super.drawChild(canvas, view, j) && !z) {
                    return false;
                }
            }
        }
        z = false;
        return super.drawChild(canvas, view, j) ? true : true;
    }

    public int getCollapsedTitleGravity() {
        return this.A0S.A0P;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A0S.A0a;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public Drawable getContentScrim() {
        return this.A0K;
    }

    public int getExpandedTitleGravity() {
        return this.A0S.A0R;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A0C;
    }

    public int getExpandedTitleMarginEnd() {
        return this.A0D;
    }

    public int getExpandedTitleMarginStart() {
        return this.A0E;
    }

    public int getExpandedTitleMarginTop() {
        return this.A0F;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A0S.A0b;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getHyphenationFrequency() {
        return this.A0S.A0S;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.A0S.A0c;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.A0S.A0c.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.A0S.A0c.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.A0S.A0T;
    }

    public int getScrimAlpha() {
        return this.A01;
    }

    public long getScrimAnimationDuration() {
        return this.A03;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.A0H;
        if (i2 >= 0) {
            return i2 + this.A0J + this.A0G;
        }
        C011504d c011504d = this.A09;
        if (c011504d != null) {
            i = c011504d.A03();
        } else {
            i = 0;
        }
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.A05;
    }

    public CharSequence getTitle() {
        if (this.A0A) {
            return this.A0S.A0f;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.A02;
    }

    public void setCollapsedTitleGravity(int i) {
        this.A0S.A09(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.A0S.A08(i);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C65757TtX c65757TtX = this.A0S;
        C67767Uxi c67767Uxi = c65757TtX.A0d;
        if (c67767Uxi != null) {
            c67767Uxi.A00 = true;
        }
        if (c65757TtX.A0a != typeface) {
            c65757TtX.A0a = typeface;
            c65757TtX.A0G(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0K;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0K = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.A08;
                if (this.A02 == 1 && viewGroup != null && this.A0A) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.A0K.setCallback(this);
                this.A0K.setAlpha(this.A01);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setExpandedTitleGravity(int i) {
        C65757TtX c65757TtX = this.A0S;
        if (c65757TtX.A0R != i) {
            c65757TtX.A0R = i;
            c65757TtX.A0G(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.A0C = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.A0D = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.A0E = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.A0F = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.A0S.A0A(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C65757TtX c65757TtX = this.A0S;
        if (c65757TtX.A0Z != colorStateList) {
            c65757TtX.A0Z = colorStateList;
            c65757TtX.A0G(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C65757TtX c65757TtX = this.A0S;
        C67767Uxi c67767Uxi = c65757TtX.A0e;
        if (c67767Uxi != null) {
            c67767Uxi.A00 = true;
        }
        if (c65757TtX.A0b != typeface) {
            c65757TtX.A0b = typeface;
            c65757TtX.A0G(false);
        }
    }

    public void setHyphenationFrequency(int i) {
        this.A0S.A0S = i;
    }

    public void setLineSpacingAdd(float f) {
        this.A0S.A0N = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.A0S.A0O = f;
    }

    public void setMaxLines(int i) {
        C65757TtX c65757TtX = this.A0S;
        if (i != c65757TtX.A0T) {
            c65757TtX.A0T = i;
            c65757TtX.A0G(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.A0S.A0k = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.A01) {
            if (this.A0K != null && (viewGroup = this.A08) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.A01 = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.A0H != i) {
            this.A0H = i;
            A05();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.A05;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A05 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A05.setState(getDrawableState());
                }
                this.A05.setLayoutDirection(getLayoutDirection());
                this.A05.setVisible(AbstractC167007dF.A1N(getVisibility()), false);
                this.A05.setCallback(this);
                this.A05.setAlpha(this.A01);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        C65757TtX c65757TtX = this.A0S;
        if (charSequence == null || !TextUtils.equals(c65757TtX.A0f, charSequence)) {
            c65757TtX.A0f = charSequence;
            c65757TtX.A0g = null;
            c65757TtX.A0G(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.A02 = i;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.A0S.A0i = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A02 == 1) {
                appBarLayout.A0B = false;
            }
        }
        if (z && this.A0K == null) {
            float dimension = getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
            C1343465d c1343465d = this.A0R;
            setContentScrimColor(c1343465d.A00(c1343465d.A01, dimension));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.A0A) {
            this.A0A = z;
            setContentDescription(getTitle());
            A02();
            requestLayout();
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C65K.A00(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        int i2;
        this.A0P = true;
        this.A0Q = new Rect();
        this.A0H = -1;
        this.A0J = 0;
        this.A0G = 0;
        Context context2 = getContext();
        C65757TtX c65757TtX = new C65757TtX(this);
        this.A0S = c65757TtX;
        c65757TtX.A0V = AbstractC153306uz.A00;
        c65757TtX.A0G(false);
        c65757TtX.A0k = false;
        this.A0R = new C1343465d(context2);
        TypedArray A00 = C65M.A00(context2, attributeSet, C65N.A0B, new int[0], i, R.style.Widget_Design_CollapsingToolbar);
        int i3 = A00.getInt(3, 8388691);
        if (c65757TtX.A0R != i3) {
            c65757TtX.A0R = i3;
            c65757TtX.A0G(false);
        }
        c65757TtX.A09(A00.getInt(0, 8388627));
        int dimensionPixelSize = A00.getDimensionPixelSize(4, 0);
        this.A0C = dimensionPixelSize;
        this.A0D = dimensionPixelSize;
        this.A0F = dimensionPixelSize;
        this.A0E = dimensionPixelSize;
        if (A00.hasValue(7)) {
            this.A0E = A00.getDimensionPixelSize(7, 0);
        }
        if (A00.hasValue(6)) {
            this.A0D = A00.getDimensionPixelSize(6, 0);
        }
        if (A00.hasValue(8)) {
            this.A0F = A00.getDimensionPixelSize(8, 0);
        }
        if (A00.hasValue(5)) {
            this.A0C = A00.getDimensionPixelSize(5, 0);
        }
        this.A0A = A00.getBoolean(18, true);
        setTitle(A00.getText(16));
        c65757TtX.A0A(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        c65757TtX.A08(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (A00.hasValue(9)) {
            c65757TtX.A0A(A00.getResourceId(9, 0));
        }
        if (A00.hasValue(1)) {
            c65757TtX.A08(A00.getResourceId(1, 0));
        }
        this.A0H = A00.getDimensionPixelSize(14, -1);
        if (A00.hasValue(12) && (i2 = A00.getInt(12, 1)) != c65757TtX.A0T) {
            c65757TtX.A0T = i2;
            c65757TtX.A0G(false);
        }
        this.A03 = A00.getInt(13, 600);
        setContentScrim(A00.getDrawable(2));
        setStatusBarScrim(A00.getDrawable(15));
        setTitleCollapseMode(A00.getInt(17, 0));
        this.A0I = A00.getResourceId(19, -1);
        this.A0O = A00.getBoolean(11, false);
        this.A0N = A00.getBoolean(10, false);
        A00.recycle();
        setWillNotDraw(false);
        AbstractC008903d.A00(this, new C65799TuH(this, 1));
    }

    public static C72E A00(View view) {
        C72E c72e = (C72E) view.getTag(R.id.view_offset_helper);
        if (c72e == null) {
            C72E c72e2 = new C72E(view);
            view.setTag(R.id.view_offset_helper, c72e2);
            return c72e2;
        }
        return c72e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof UBM;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C011504d c011504d;
        int A03;
        Drawable drawable;
        int A032 = C0f9.A03(-1218945545);
        super.draw(canvas);
        A01();
        if (this.A08 == null && (drawable = this.A0K) != null && this.A01 > 0) {
            drawable.mutate().setAlpha(this.A01);
            this.A0K.draw(canvas);
        }
        if (this.A0A && this.A0M) {
            if (this.A08 != null && this.A0K != null && this.A01 > 0 && this.A02 == 1) {
                C65757TtX c65757TtX = this.A0S;
                if (c65757TtX.A0E < c65757TtX.A0M) {
                    int save = canvas.save();
                    canvas.clipRect(this.A0K.getBounds(), Region.Op.DIFFERENCE);
                    c65757TtX.A0E(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.A0S.A0E(canvas);
        }
        if (this.A05 != null && this.A01 > 0 && (c011504d = this.A09) != null && (A03 = c011504d.A03()) > 0) {
            this.A05.setBounds(0, -this.A00, getWidth(), A03 - this.A00);
            this.A05.mutate().setAlpha(this.A01);
            this.A05.draw(canvas);
        }
        C0f9.A0A(2050445218, A032);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A05;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0K;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        C65757TtX c65757TtX = this.A0S;
        if (c65757TtX != null) {
            c65757TtX.A0l = drawableState;
            ColorStateList colorStateList2 = c65757TtX.A0X;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c65757TtX.A0Z) != null && colorStateList.isStateful())) {
                c65757TtX.A0G(false);
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.UBM, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.A01 = 0;
        layoutParams.A00 = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A0C);
        layoutParams.A01 = obtainStyledAttributes.getInt(0, 0);
        layoutParams.A00 = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1659027699);
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A02 == 1) {
                appBarLayout.A0B = false;
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            InterfaceC155836zD interfaceC155836zD = this.A0L;
            if (interfaceC155836zD == null) {
                interfaceC155836zD = new C65758TtY(this);
                this.A0L = interfaceC155836zD;
            }
            appBarLayout.A02(interfaceC155836zD);
            requestApplyInsets();
        }
        C0f9.A0D(-1811480091, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-530617280);
        ViewParent parent = getParent();
        InterfaceC155836zD interfaceC155836zD = this.A0L;
        if (interfaceC155836zD != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).A03(interfaceC155836zD);
        }
        super.onDetachedFromWindow();
        C0f9.A0D(599195892, A06);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(631055892);
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A0K;
        if (drawable != null) {
            ViewGroup viewGroup = this.A08;
            if (this.A02 == 1 && viewGroup != null && this.A0A) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
        C0f9.A0D(1110234369, A06);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.A0N = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.A0O = z;
    }

    public void setScrimAnimationDuration(long j) {
        this.A03 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (isInEditMode() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setScrimsShown(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.isLaidOut()
            if (r0 == 0) goto Ld
            boolean r0 = r4.isInEditMode()
            r1 = 1
            if (r0 == 0) goto Le
        Ld:
            r1 = 0
        Le:
            boolean r0 = r4.A0B
            if (r0 == r5) goto L4f
            r3 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L5f
            if (r5 != 0) goto L19
            r3 = 0
        L19:
            r4.A01()
            android.animation.ValueAnimator r0 = r4.A04
            if (r0 != 0) goto L53
            android.animation.ValueAnimator r2 = new android.animation.ValueAnimator
            r2.<init>()
            r4.A04 = r2
            long r0 = r4.A03
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r4.A04
            int r0 = r4.A01
            if (r3 <= r0) goto L50
            android.animation.TimeInterpolator r0 = X.AbstractC153306uz.A01
        L34:
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r4.A04
            r0 = 3
            X.C65759TtZ.A00(r1, r4, r0)
        L3d:
            android.animation.ValueAnimator r1 = r4.A04
            int r0 = r4.A01
            int[] r0 = new int[]{r0, r3}
            r1.setIntValues(r0)
            android.animation.ValueAnimator r0 = r4.A04
            r0.start()
        L4d:
            r4.A0B = r5
        L4f:
            return
        L50:
            android.animation.TimeInterpolator r0 = X.AbstractC153306uz.A04
            goto L34
        L53:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L3d
            android.animation.ValueAnimator r0 = r4.A04
            r0.cancel()
            goto L3d
        L5f:
            if (r5 != 0) goto L62
            r3 = 0
        L62:
            r4.setScrimAlpha(r3)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.setScrimsShown(boolean):void");
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1N = AbstractC167007dF.A1N(i);
        Drawable drawable = this.A05;
        if (drawable != null && drawable.isVisible() != A1N) {
            this.A05.setVisible(A1N, false);
        }
        Drawable drawable2 = this.A0K;
        if (drawable2 != null && drawable2.isVisible() != A1N) {
            this.A0K.setVisible(A1N, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A0K && drawable != this.A05) {
            return false;
        }
        return true;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.UBM, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.A01 = 0;
        layoutParams.A00 = 0.5f;
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.UBM, android.view.ViewGroup$LayoutParams, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.A01 = 0;
        layoutParams2.A00 = 0.5f;
        return layoutParams2;
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.A0S.A0D(colorStateList);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }
}
