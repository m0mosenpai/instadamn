package com.google.android.material.card;

import X.AbstractC1343565e;
import X.AbstractC1567371w;
import X.AbstractC65702TsY;
import X.C02G;
import X.C0f9;
import X.C65K;
import X.C65M;
import X.C65N;
import X.C65O;
import X.C65P;
import X.C65Q;
import X.C71x;
import X.C72C;
import X.C72G;
import X.WGB;
import X.X80;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;

/* loaded from: classes11.dex */
public class MaterialCardView extends CardView implements Checkable, C65P {
    public static final int[] A05 = {R.attr.state_checkable};
    public static final int[] A06 = {R.attr.state_checked};
    public static final int[] A07 = {com.facebook.R.attr.state_dragged};
    public boolean A00;
    public X80 A01;
    public boolean A02;
    public boolean A03;
    public final WGB A04;

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.A04.A00 = getResources().getDimensionPixelSize(i);
        }
    }

    private void A01() {
        WGB wgb = this.A04;
        Drawable drawable = wgb.A08;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            wgb.A08.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            wgb.A08.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        AbstractC65702TsY.A0x(rectF, this.A04.A0G);
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.A04.A0G.A00.A0B;
    }

    public ColorStateList getCardForegroundColor() {
        return this.A04.A0H.A00.A0B;
    }

    public Drawable getCheckedIcon() {
        return this.A04.A06;
    }

    public int getCheckedIconMargin() {
        return this.A04.A00;
    }

    public int getCheckedIconSize() {
        return this.A04.A01;
    }

    public ColorStateList getCheckedIconTint() {
        return this.A04.A03;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.A04.A0E.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.A04.A0E.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.A04.A0E.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.A04.A0E.top;
    }

    public float getProgress() {
        return this.A04.A0G.A00.A01;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.A04.A0G.A07();
    }

    public ColorStateList getRippleColor() {
        return this.A04.A04;
    }

    @Override // X.C65P
    public C65Q getShapeAppearanceModel() {
        return this.A04.A0B;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.A04.A05;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.A04.A05;
    }

    public int getStrokeWidth() {
        return this.A04.A02;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        WGB wgb = this.A04;
        if (wgb != null && wgb.A0C) {
            View.mergeDrawableStates(onCreateDrawableState, A05);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A06);
        }
        if (this.A00) {
            View.mergeDrawableStates(onCreateDrawableState, A07);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.A03) {
            WGB wgb = this.A04;
            if (!wgb.A0D) {
                wgb.A0D = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        WGB wgb = this.A04;
        wgb.A0G.A0F(ColorStateList.valueOf(i));
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C65O c65o = this.A04.A0H;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c65o.A0F(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.A04.A0C = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.A02 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.A04.A07(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.A04.A00 = i;
    }

    public void setCheckedIconResource(int i) {
        this.A04.A07(C71x.A00(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.A04.A01 = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.A04.A01 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        WGB wgb = this.A04;
        wgb.A03 = colorStateList;
        Drawable drawable = wgb.A06;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public void setDragged(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            refreshDrawableState();
            A01();
            invalidate();
        }
    }

    public void setProgress(float f) {
        WGB wgb = this.A04;
        wgb.A0G.A0B(f);
        wgb.A0H.A0B(f);
        C65O c65o = wgb.A0A;
        if (c65o != null) {
            c65o.A0B(f);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        WGB wgb = this.A04;
        wgb.A04 = colorStateList;
        Drawable drawable = wgb.A08;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        WGB wgb = this.A04;
        ColorStateList A02 = C02G.A02(getContext(), i);
        wgb.A04 = A02;
        Drawable drawable = wgb.A08;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(A02);
        }
    }

    public void setStrokeColor(int i) {
        WGB wgb = this.A04;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (wgb.A05 != valueOf) {
            wgb.A05 = valueOf;
            wgb.A0H.A0H(valueOf, wgb.A02);
        }
    }

    public void setStrokeWidth(int i) {
        WGB wgb = this.A04;
        if (i != wgb.A02) {
            wgb.A02 = i;
            wgb.A0H.A0H(wgb.A05, i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        WGB wgb = this.A04;
        if (wgb != null && wgb.A0C && isEnabled()) {
            this.A02 = !this.A02;
            refreshDrawableState();
            A01();
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(C65K.A00(context, attributeSet, i, com.facebook.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.A02 = false;
        this.A00 = false;
        this.A03 = true;
        TypedArray A00 = C65M.A00(getContext(), attributeSet, C65N.A0N, new int[0], i, com.facebook.R.style.Widget_MaterialComponents_CardView);
        WGB wgb = new WGB(attributeSet, this, i);
        this.A04 = wgb;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C65O c65o = wgb.A0G;
        c65o.A0F(cardBackgroundColor);
        Rect rect = super.A02;
        wgb.A0E.set(rect.left, rect.top, rect.right, rect.bottom);
        wgb.A05();
        MaterialCardView materialCardView = wgb.A0F;
        Context context2 = materialCardView.getContext();
        ColorStateList A01 = AbstractC1567371w.A01(context2, A00, 10);
        wgb.A05 = A01;
        if (A01 == null) {
            wgb.A05 = ColorStateList.valueOf(-1);
        }
        wgb.A02 = A00.getDimensionPixelSize(11, 0);
        boolean z = A00.getBoolean(0, false);
        wgb.A0C = z;
        materialCardView.setLongClickable(z);
        wgb.A03 = AbstractC1567371w.A01(context2, A00, 5);
        wgb.A07(AbstractC1567371w.A03(context2, A00, 2));
        wgb.A01 = A00.getDimensionPixelSize(4, 0);
        wgb.A00 = A00.getDimensionPixelSize(3, 0);
        ColorStateList A012 = AbstractC1567371w.A01(context2, A00, 6);
        wgb.A04 = A012;
        if (A012 == null) {
            wgb.A04 = ColorStateList.valueOf(AbstractC1343565e.A01(materialCardView, com.facebook.R.attr.colorControlHighlight));
        }
        ColorStateList A013 = AbstractC1567371w.A01(context2, A00, 1);
        C65O c65o2 = wgb.A0H;
        c65o2.A0F(A013 == null ? ColorStateList.valueOf(0) : A013);
        Drawable drawable = wgb.A08;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(wgb.A04);
        }
        c65o.A0A(materialCardView.getCardElevation());
        c65o2.A0H(wgb.A05, wgb.A02);
        super.setBackgroundDrawable(WGB.A03(c65o, wgb));
        Drawable A02 = materialCardView.isClickable() ? WGB.A02(wgb) : c65o2;
        wgb.A07 = A02;
        materialCardView.setForeground(WGB.A03(A02, wgb));
        A00.recycle();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A062 = C0f9.A06(1238775993);
        super.onAttachedToWindow();
        C72C.A02(this, this.A04.A0G);
        C0f9.A0D(1740829464, A062);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1 == false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = "androidx.cardview.widget.CardView"
            r3.setClassName(r0)
            X.WGB r0 = r2.A04
            if (r0 == 0) goto L11
            boolean r1 = r0.A0C
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            r3.setCheckable(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            boolean r0 = r2.isChecked()
            r3.setChecked(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        WGB wgb = this.A04;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (wgb.A09 != null) {
            int i3 = wgb.A00;
            int i4 = wgb.A01;
            int i5 = (measuredWidth - i3) - i4;
            int i6 = (measuredHeight - i3) - i4;
            MaterialCardView materialCardView = wgb.A0F;
            if (((CardView) materialCardView).A00) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                if (WGB.A04(wgb)) {
                    f = WGB.A00(wgb);
                } else {
                    f = 0.0f;
                }
                i6 -= (int) Math.ceil((maxCardElevation + f) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (WGB.A04(wgb)) {
                    f2 = WGB.A00(wgb);
                } else {
                    f2 = 0.0f;
                }
                i5 -= (int) Math.ceil((maxCardElevation2 + f2) * 2.0f);
            }
            int i7 = wgb.A00;
            int i8 = i7;
            if (materialCardView.getLayoutDirection() == 1) {
                i8 = i5;
                i5 = i7;
            }
            wgb.A09.setLayerInset(2, i5, wgb.A00, i8, i6);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        WGB wgb = this.A04;
        wgb.A0G.A0A(wgb.A0F.getCardElevation());
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        WGB wgb = this.A04;
        if (wgb != null) {
            Drawable drawable2 = wgb.A07;
            MaterialCardView materialCardView = wgb.A0F;
            if (materialCardView.isClickable()) {
                drawable = WGB.A02(wgb);
            } else {
                drawable = wgb.A0H;
            }
            wgb.A07 = drawable;
            if (drawable2 != drawable) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((DrawableWrapper) materialCardView.getForeground()).setDrawable(drawable);
                } else {
                    materialCardView.setForeground(WGB.A03(drawable, wgb));
                }
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.A04.A06();
    }

    public void setOnCheckedChangeListener(X80 x80) {
        this.A01 = x80;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        WGB wgb = this.A04;
        wgb.A06();
        wgb.A05();
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        WGB wgb = this.A04;
        C72G c72g = new C72G(wgb.A0B);
        c72g.A00(f);
        wgb.A08(new C65Q(c72g));
        wgb.A07.invalidateSelf();
        if (WGB.A04(wgb) || (((CardView) wgb.A0F).A01 && !wgb.A0G.A0I())) {
            wgb.A05();
        }
        if (WGB.A04(wgb)) {
            wgb.A06();
        }
    }

    @Override // X.C65P
    public void setShapeAppearanceModel(C65Q c65q) {
        setClipToOutline(c65q.A03(getBoundsAsRectF()));
        this.A04.A08(c65q);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        WGB wgb = this.A04;
        wgb.A06();
        wgb.A05();
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.R.attr.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.A04.A0G.A0F(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        WGB wgb = this.A04;
        if (wgb.A05 != colorStateList) {
            wgb.A05 = colorStateList;
            wgb.A0H.A0H(colorStateList, wgb.A02);
        }
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
