package com.google.android.material.button;

import X.AbstractC126235nK;
import X.AbstractC1567371w;
import X.C02G;
import X.C0f9;
import X.C65884Tvo;
import X.C65K;
import X.C65M;
import X.C65N;
import X.C65P;
import X.C65Q;
import X.C71x;
import X.C72C;
import X.C72G;
import X.InterfaceC71865X7y;
import X.InterfaceC71866X7z;
import X.UBF;
import X.WFU;
import X.WcP;
import X.WcQ;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public class MaterialButton extends UBF implements Checkable, C65P {
    public static final int[] A0D = {R.attr.state_checkable};
    public static final int[] A0E = {R.attr.state_checked};
    public int A00;
    public Drawable A01;
    public InterfaceC71866X7z A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public boolean A09;
    public boolean A0A;
    public final WFU A0B;
    public final LinkedHashSet A0C;

    /* loaded from: classes11.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C65884Tvo(7);
        public boolean A00;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    private void A00(int i, int i2) {
        if (this.A01 != null && getLayout() != null) {
            int i3 = this.A00;
            boolean z = true;
            if (i3 != 1 && i3 != 2) {
                z = false;
            }
            if (!z && i3 != 3 && i3 != 4) {
                if (i3 == 16 || i3 == 32) {
                    this.A03 = 0;
                    if (i3 == 16) {
                        this.A06 = 0;
                    } else {
                        int i4 = this.A05;
                        if (i4 == 0) {
                            i4 = this.A01.getIntrinsicHeight();
                        }
                        int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.A04) - getPaddingBottom()) / 2;
                        if (this.A06 == textHeight) {
                            return;
                        } else {
                            this.A06 = textHeight;
                        }
                    }
                } else {
                    return;
                }
            } else {
                this.A06 = 0;
                boolean z2 = true;
                if (i3 != 1 && i3 != 3) {
                    int i5 = this.A05;
                    if (i5 == 0) {
                        i5 = this.A01.getIntrinsicWidth();
                    }
                    int textWidth = (((((i - getTextWidth()) - getPaddingEnd()) - i5) - this.A04) - getPaddingStart()) / 2;
                    boolean z3 = true;
                    if (getLayoutDirection() != 1) {
                        z3 = false;
                    }
                    if (this.A00 != 4) {
                        z2 = false;
                    }
                    if (z3 != z2) {
                        textWidth = -textWidth;
                    }
                    if (this.A03 == textWidth) {
                        return;
                    } else {
                        this.A03 = textWidth;
                    }
                } else {
                    this.A03 = 0;
                }
            }
            A01(false);
        }
    }

    private void A01(boolean z) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A01 = mutate;
            mutate.setTintList(this.A07);
            PorterDuff.Mode mode = this.A08;
            if (mode != null) {
                this.A01.setTintMode(mode);
            }
            int i = this.A05;
            if (i == 0) {
                i = this.A01.getIntrinsicWidth();
            }
            int i2 = this.A05;
            if (i2 == 0) {
                i2 = this.A01.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A01;
            int i3 = this.A03;
            int i4 = this.A06;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            int i5 = this.A00;
            if ((i5 != 1 && i5 != 2) || drawable3 == this.A01) {
                if (i5 != 3 && i5 != 4) {
                    if ((i5 != 16 && i5 != 32) || drawable4 == this.A01) {
                        return;
                    }
                } else if (drawable5 == this.A01) {
                    return;
                }
            }
        }
        int i6 = this.A00;
        boolean z2 = true;
        if (i6 != 1 && i6 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.A01, null, null, null);
            return;
        }
        if (i6 != 3 && i6 != 4) {
            if (i6 != 16 && i6 != 32) {
                return;
            }
            setCompoundDrawablesRelative(null, this.A01, null, null);
            return;
        }
        setCompoundDrawablesRelative(null, null, this.A01, null);
    }

    private boolean A02() {
        WFU wfu = this.A0B;
        if (wfu != null && !wfu.A0E) {
            return true;
        }
        return false;
    }

    private String getA11yClassName() {
        Class cls;
        WFU wfu = this.A0B;
        if (wfu != null && wfu.A0F) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public Drawable getIcon() {
        return this.A01;
    }

    public int getIconGravity() {
        return this.A00;
    }

    public int getIconPadding() {
        return this.A04;
    }

    public int getIconSize() {
        return this.A05;
    }

    public ColorStateList getIconTint() {
        return this.A07;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public int getInsetBottom() {
        return this.A0B.A02;
    }

    public int getInsetTop() {
        return this.A0B.A05;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A0A;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        WFU wfu = this.A0B;
        if (wfu != null && wfu.A0F) {
            View.mergeDrawableStates(onCreateDrawableState, A0D);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0E);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        setChecked(savedState.A00);
    }

    @Override // X.UBF, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C71x.A00(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        WFU wfu = this.A0B;
        if (wfu != null && wfu.A0F && isEnabled() && this.A0A != z) {
            this.A0A = z;
            refreshDrawableState();
            if (!this.A09) {
                this.A09 = true;
                Iterator it = this.A0C.iterator();
                while (it.hasNext()) {
                    InterfaceC71865X7y interfaceC71865X7y = (InterfaceC71865X7y) it.next();
                    boolean z2 = this.A0A;
                    MaterialButtonToggleGroup materialButtonToggleGroup = ((WcP) interfaceC71865X7y).A00;
                    if (!materialButtonToggleGroup.A02) {
                        if (materialButtonToggleGroup.A01) {
                            if (z2) {
                                i = getId();
                            } else {
                                i = -1;
                            }
                            materialButtonToggleGroup.A00 = i;
                        }
                        if (MaterialButtonToggleGroup.A02(materialButtonToggleGroup, getId(), z2)) {
                            getId();
                            MaterialButtonToggleGroup.A01(materialButtonToggleGroup);
                        }
                        materialButtonToggleGroup.invalidate();
                    }
                }
                this.A09 = false;
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A01 != drawable) {
            this.A01 = drawable;
            A01(true);
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C71x.A00(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.A05 != i) {
                this.A05 = i;
                A01(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            A01(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.A08 != mode) {
            this.A08 = mode;
            A01(false);
        }
    }

    public void setInsetBottom(int i) {
        WFU wfu = this.A0B;
        WFU.A03(wfu, wfu.A05, i);
    }

    public void setInsetTop(int i) {
        WFU wfu = this.A0B;
        WFU.A03(wfu, i, wfu.A02);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC71866X7z interfaceC71866X7z = this.A02;
        if (interfaceC71866X7z != null) {
            ((WcQ) interfaceC71866X7z).A00.invalidate();
        }
        super.setPressed(z);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.A0A);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C65K.A00(context, attributeSet, i, com.facebook.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.A0C = new LinkedHashSet();
        this.A0A = false;
        this.A09 = false;
        Context context2 = getContext();
        TypedArray A00 = C65M.A00(context2, attributeSet, C65N.A0J, new int[0], i, com.facebook.R.style.Widget_MaterialComponents_Button);
        this.A04 = A00.getDimensionPixelSize(12, 0);
        int i2 = A00.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.A08 = AbstractC126235nK.A01(mode, i2);
        this.A07 = AbstractC1567371w.A01(context2, A00, 14);
        this.A01 = AbstractC1567371w.A03(context2, A00, 10);
        this.A00 = A00.getInteger(11, 1);
        this.A05 = A00.getDimensionPixelSize(13, 0);
        WFU wfu = new WFU(this, new C65Q(C65Q.A01(context2, attributeSet, i, com.facebook.R.style.Widget_MaterialComponents_Button)));
        this.A0B = wfu;
        wfu.A03 = A00.getDimensionPixelOffset(1, 0);
        wfu.A04 = A00.getDimensionPixelOffset(2, 0);
        wfu.A05 = A00.getDimensionPixelOffset(3, 0);
        wfu.A02 = A00.getDimensionPixelOffset(4, 0);
        if (A00.hasValue(8)) {
            int dimensionPixelSize = A00.getDimensionPixelSize(8, -1);
            wfu.A00 = dimensionPixelSize;
            C72G c72g = new C72G(wfu.A0D);
            c72g.A00(dimensionPixelSize);
            wfu.A05(new C65Q(c72g));
            wfu.A0G = true;
        }
        wfu.A06 = A00.getDimensionPixelSize(20, 0);
        wfu.A0A = AbstractC126235nK.A01(mode, A00.getInt(7, -1));
        MaterialButton materialButton = wfu.A0I;
        Context context3 = materialButton.getContext();
        wfu.A07 = AbstractC1567371w.A01(context3, A00, 6);
        wfu.A09 = AbstractC1567371w.A01(context3, A00, 19);
        wfu.A08 = AbstractC1567371w.A01(context3, A00, 16);
        wfu.A0F = A00.getBoolean(5, false);
        wfu.A01 = A00.getDimensionPixelSize(9, 0);
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        if (A00.hasValue(0)) {
            wfu.A0E = true;
            materialButton.setSupportBackgroundTintList(wfu.A07);
            materialButton.setSupportBackgroundTintMode(wfu.A0A);
        } else {
            WFU.A01(wfu);
        }
        materialButton.setPaddingRelative(paddingStart + wfu.A03, paddingTop + wfu.A05, paddingEnd + wfu.A04, paddingBottom + wfu.A02);
        A00.recycle();
        setCompoundDrawablePadding(this.A04);
        A01(this.A01 != null);
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (A02()) {
            return this.A0B.A00;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (A02()) {
            return this.A0B.A08;
        }
        return null;
    }

    @Override // X.C65P
    public C65Q getShapeAppearanceModel() {
        if (A02()) {
            return this.A0B.A0D;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (A02()) {
            return this.A0B.A09;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (A02()) {
            return this.A0B.A06;
        }
        return 0;
    }

    @Override // X.UBF
    public ColorStateList getSupportBackgroundTintList() {
        if (A02()) {
            return this.A0B.A07;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // X.UBF
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (A02()) {
            return this.A0B.A0A;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(704643737);
        super.onAttachedToWindow();
        if (A02()) {
            C72C.A02(this, WFU.A00(this.A0B, false));
        }
        C0f9.A0D(247432062, A06);
    }

    @Override // X.UBF, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 == false) goto L6;
     */
    @Override // X.UBF, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = r2.getA11yClassName()
            r3.setClassName(r0)
            X.WFU r0 = r2.A0B
            if (r0 == 0) goto L13
            boolean r1 = r0.A0F
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            r3.setCheckable(r0)
            boolean r0 = r2.isChecked()
            r3.setChecked(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, com.google.android.material.button.MaterialButton$SavedState] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.A00 = this.A0A;
        return absSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1760404247);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        C0f9.A0D(-964784038, A06);
    }

    @Override // X.UBF, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (A02()) {
            WFU wfu = this.A0B;
            if (WFU.A00(wfu, false) != null) {
                WFU.A00(wfu, false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // X.UBF, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (A02()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                WFU wfu = this.A0B;
                wfu.A0E = true;
                MaterialButton materialButton = wfu.A0I;
                materialButton.setSupportBackgroundTintList(wfu.A07);
                materialButton.setSupportBackgroundTintMode(wfu.A0A);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (A02()) {
            this.A0B.A0F = z;
        }
    }

    public void setCornerRadius(int i) {
        if (A02()) {
            WFU wfu = this.A0B;
            if (!wfu.A0G || wfu.A00 != i) {
                wfu.A00 = i;
                wfu.A0G = true;
                C72G c72g = new C72G(wfu.A0D);
                c72g.A00(i);
                wfu.A05(new C65Q(c72g));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (A02()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (A02()) {
            WFU.A00(this.A0B, false).A0A(f);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C02G.A02(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC71866X7z interfaceC71866X7z) {
        this.A02 = interfaceC71866X7z;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (A02()) {
            WFU wfu = this.A0B;
            if (wfu.A08 != colorStateList) {
                wfu.A08 = colorStateList;
                MaterialButton materialButton = wfu.A0I;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (A02()) {
            setRippleColor(C02G.A02(getContext(), i));
        }
    }

    @Override // X.C65P
    public void setShapeAppearanceModel(C65Q c65q) {
        if (A02()) {
            this.A0B.A05(c65q);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (A02()) {
            WFU wfu = this.A0B;
            wfu.A0H = z;
            WFU.A02(wfu);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (A02()) {
            WFU wfu = this.A0B;
            if (wfu.A09 != colorStateList) {
                wfu.A09 = colorStateList;
                WFU.A02(wfu);
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (A02()) {
            setStrokeColor(C02G.A02(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (A02()) {
            WFU wfu = this.A0B;
            if (wfu.A06 != i) {
                wfu.A06 = i;
                WFU.A02(wfu);
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (A02()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // X.UBF
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (A02()) {
            WFU wfu = this.A0B;
            if (wfu.A07 != colorStateList) {
                wfu.A07 = colorStateList;
                if (WFU.A00(wfu, false) != null) {
                    WFU.A00(wfu, false).setTintList(wfu.A07);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // X.UBF
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (A02()) {
            WFU wfu = this.A0B;
            if (wfu.A0A != mode) {
                wfu.A0A = mode;
                if (WFU.A00(wfu, false) != null && wfu.A0A != null) {
                    WFU.A00(wfu, false).setTintMode(wfu.A0A);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
