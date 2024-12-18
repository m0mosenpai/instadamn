package com.google.android.material.chip;

import X.AbstractC010103p;
import X.AbstractC31173DnH;
import X.C02G;
import X.C0f9;
import X.C2Y4;
import X.C65O;
import X.C65P;
import X.C65Q;
import X.C66373UEh;
import X.C67771Uxm;
import X.C6H7;
import X.C70154WDd;
import X.C71x;
import X.C72C;
import X.UBJ;
import X.VK5;
import X.WDK;
import X.X81;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class Chip extends UBJ implements C65P, X81 {
    public int A00;
    public InsetDrawable A01;
    public View.OnClickListener A02;
    public CompoundButton.OnCheckedChangeListener A03;
    public C67771Uxm A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public RippleDrawable A0A;
    public boolean A0B;
    public final C66373UEh A0C;
    public final Rect A0D;
    public final RectF A0E;
    public final VK5 A0F;
    public static final Rect A0G = new Rect();
    public static final int[] A0I = {R.attr.state_selected};
    public static final int[] A0H = {R.attr.state_checkable};

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    private void A02() {
        C66373UEh c66373UEh;
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A0T != null && c67771Uxm.A0d && this.A02 != null) {
            c66373UEh = this.A0C;
        } else {
            c66373UEh = null;
        }
        AbstractC010103p.A0B(this, c66373UEh);
    }

    private void A03() {
        ColorStateList colorStateList = this.A04.A0O;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        Drawable drawable = this.A01;
        if (drawable == null) {
            drawable = this.A04;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, drawable, null);
        this.A0A = rippleDrawable;
        setBackground(rippleDrawable);
        A04();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.A0E;
        rectF.setEmpty();
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A0T != null && this.A02 != null) {
            Rect bounds = c67771Uxm.getBounds();
            rectF.setEmpty();
            if (C67771Uxm.A05(c67771Uxm)) {
                float f = c67771Uxm.A01 + c67771Uxm.A06 + c67771Uxm.A07 + c67771Uxm.A08 + c67771Uxm.A0B;
                if (c67771Uxm.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    private C70154WDd getTextAppearance() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0v.A00;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r1.right == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r1 > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(int r7) {
        /*
            r6 = this;
            r6.A00 = r7
            boolean r0 = r6.A08
            r3 = 0
            if (r0 == 0) goto L68
            X.Uxm r2 = r6.A04
            float r0 = r2.A03
            int r0 = (int) r0
            int r0 = r7 - r0
            int r1 = java.lang.Math.max(r3, r0)
            int r0 = r2.getIntrinsicWidth()
            int r0 = r7 - r0
            int r0 = java.lang.Math.max(r3, r0)
            if (r0 > 0) goto L63
            if (r1 <= 0) goto L68
            r2 = 0
        L21:
            int r3 = r1 / 2
        L23:
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            if (r0 == 0) goto L45
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            r0.getPadding(r1)
            int r0 = r1.top
            if (r0 != r3) goto L45
            int r0 = r1.bottom
            if (r0 != r3) goto L45
            int r0 = r1.left
            if (r0 != r2) goto L45
            int r0 = r1.right
            if (r0 != r2) goto L45
        L41:
            r6.A03()
            return
        L45:
            int r0 = r6.getMinHeight()
            if (r0 == r7) goto L4e
            r6.setMinHeight(r7)
        L4e:
            int r0 = r6.getMinWidth()
            if (r0 == r7) goto L57
            r6.setMinWidth(r7)
        L57:
            X.Uxm r1 = r6.A04
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            r4 = r2
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A01 = r0
            goto L41
        L63:
            int r2 = r0 / 2
            if (r1 <= 0) goto L23
            goto L21
        L68:
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            if (r0 == 0) goto L41
            r0 = 0
            r6.A01 = r0
            r6.setMinWidth(r3)
            float r0 = r6.getChipMinHeight()
            int r0 = (int) r0
            r6.setMinHeight(r0)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.A06(int):void");
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Field declaredField;
        C66373UEh c66373UEh;
        if (motionEvent.getAction() == 10) {
            try {
                declaredField = C2Y4.class.getDeclaredField("mHoveredVirtualViewId");
                declaredField.setAccessible(true);
                c66373UEh = this.A0C;
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            }
            if (((Number) declaredField.get(c66373UEh)).intValue() != Integer.MIN_VALUE) {
                Method declaredMethod = C2Y4.class.getDeclaredMethod("updateHoveredVirtualView", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(c66373UEh, Integer.MIN_VALUE);
                return true;
            }
        }
        if (!this.A0C.A0o(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C66373UEh c66373UEh = this.A0C;
        if (c66373UEh.A0n(keyEvent) && ((C2Y4) c66373UEh).A01 != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.A01;
        if (insetDrawable == null) {
            return this.A04;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0R;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0I;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0J;
        }
        return null;
    }

    public float getChipCornerRadius() {
        float f;
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm == null) {
            return 0.0f;
        }
        if (c67771Uxm.A0f) {
            f = c67771Uxm.A07();
        } else {
            f = c67771Uxm.A00;
        }
        return Math.max(0.0f, f);
    }

    public Drawable getChipDrawable() {
        return this.A04;
    }

    public float getChipEndPadding() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A01;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && (drawable = c67771Uxm.A0S) != null) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A02;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0K;
        }
        return null;
    }

    public float getChipMinHeight() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A03;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A04;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A05;
        }
        return 0.0f;
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && (drawable = c67771Uxm.A0T) != null) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0Y;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A06;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A07;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A08;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0V;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        C66373UEh c66373UEh = this.A0C;
        if (((C2Y4) c66373UEh).A01 != 1 && ((C2Y4) c66373UEh).A00 != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public WDK getHideMotionSpec() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0W;
        }
        return null;
    }

    public float getIconEndPadding() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A09;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0A;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0O;
        }
        return null;
    }

    @Override // X.C65P
    public C65Q getShapeAppearanceModel() {
        return ((C65O) this.A04).A00.A0K;
    }

    public WDK getShowMotionSpec() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0X;
        }
        return null;
    }

    public float getTextEndPadding() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0B;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            return c67771Uxm.A0C;
        }
        return 0.0f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0I);
        }
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A0b) {
            View.mergeDrawableStates(onCreateDrawableState, A0H);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 == null) {
            drawable2 = this.A04;
        }
        if (drawable != drawable2 && drawable != this.A0A) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // X.UBJ, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 == null) {
            drawable2 = this.A04;
        }
        if (drawable != drawable2 && drawable != this.A0A) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // X.UBJ, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0b(z);
        }
    }

    public void setCheckableResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0b(c67771Uxm.A0p.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm == null) {
            this.A0B = z;
            return;
        }
        if (!c67771Uxm.A0b) {
            return;
        }
        boolean isChecked = isChecked();
        super.setChecked(z);
        if (isChecked == z || (onCheckedChangeListener = this.A03) == null) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(this, z);
    }

    public void setCheckedIcon(Drawable drawable) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0Y(drawable);
        }
    }

    public void setCheckedIconResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0Y(C71x.A00(c67771Uxm.A0p, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0U(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0U(C02G.A02(c67771Uxm.A0p, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0c(c67771Uxm.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A0J != colorStateList) {
            c67771Uxm.A0J = colorStateList;
            c67771Uxm.onStateChange(c67771Uxm.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A02;
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A0J != (A02 = C02G.A02(c67771Uxm.A0p, i))) {
            c67771Uxm.A0J = A02;
            c67771Uxm.onStateChange(c67771Uxm.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0M(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0M(AbstractC31173DnH.A00(c67771Uxm.A0p, i));
        }
    }

    public void setChipDrawable(C67771Uxm c67771Uxm) {
        C67771Uxm c67771Uxm2 = this.A04;
        if (c67771Uxm2 != c67771Uxm) {
            if (c67771Uxm2 != null) {
                c67771Uxm2.A0a = new WeakReference(null);
            }
            this.A04 = c67771Uxm;
            c67771Uxm.A0g = false;
            c67771Uxm.A0a = new WeakReference(this);
            A06(this.A00);
        }
    }

    public void setChipEndPadding(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A01 != f) {
            c67771Uxm.A01 = f;
            c67771Uxm.invalidateSelf();
            c67771Uxm.A0L();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            float A00 = AbstractC31173DnH.A00(c67771Uxm.A0p, i);
            if (c67771Uxm.A01 != A00) {
                c67771Uxm.A01 = A00;
                c67771Uxm.invalidateSelf();
                c67771Uxm.A0L();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0Z(drawable);
        }
    }

    public void setChipIconResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0Z(C71x.A00(c67771Uxm.A0p, i));
        }
    }

    public void setChipIconSize(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0N(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0N(AbstractC31173DnH.A00(c67771Uxm.A0p, i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0V(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0V(C02G.A02(c67771Uxm.A0p, i));
        }
    }

    public void setChipIconVisible(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0d(c67771Uxm.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A03 != f) {
            c67771Uxm.A03 = f;
            c67771Uxm.invalidateSelf();
            c67771Uxm.A0L();
        }
    }

    public void setChipMinHeightResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            float A00 = AbstractC31173DnH.A00(c67771Uxm.A0p, i);
            if (c67771Uxm.A03 != A00) {
                c67771Uxm.A03 = A00;
                c67771Uxm.invalidateSelf();
                c67771Uxm.A0L();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A04 != f) {
            c67771Uxm.A04 = f;
            c67771Uxm.invalidateSelf();
            c67771Uxm.A0L();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            float A00 = AbstractC31173DnH.A00(c67771Uxm.A0p, i);
            if (c67771Uxm.A04 != A00) {
                c67771Uxm.A04 = A00;
                c67771Uxm.invalidateSelf();
                c67771Uxm.A0L();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0W(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0W(C02G.A02(c67771Uxm.A0p, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0O(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0O(AbstractC31173DnH.A00(c67771Uxm.A0p, i));
        }
    }

    public void setCloseIcon(Drawable drawable) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0a(drawable);
        }
        A02();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A0Y != charSequence) {
            C6H7 A02 = C6H7.A02();
            c67771Uxm.A0Y = A02.A03(A02.A00, charSequence);
            c67771Uxm.invalidateSelf();
        }
    }

    public void setCloseIconEndPadding(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0P(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0P(AbstractC31173DnH.A00(c67771Uxm.A0p, i));
        }
    }

    public void setCloseIconResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0a(C71x.A00(c67771Uxm.A0p, i));
        }
        A02();
    }

    public void setCloseIconSize(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0Q(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0Q(AbstractC31173DnH.A00(c67771Uxm.A0p, i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0R(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0R(AbstractC31173DnH.A00(c67771Uxm.A0p, i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0X(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0X(C02G.A02(c67771Uxm.A0p, i));
        }
    }

    @Override // X.UBJ, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // X.UBJ, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A04 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C67771Uxm c67771Uxm = this.A04;
                if (c67771Uxm != null) {
                    c67771Uxm.A0V = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.A08 = z;
        A06(this.A00);
    }

    public void setHideMotionSpec(WDK wdk) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0W = wdk;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0W = WDK.A00(c67771Uxm.A0p, i);
        }
    }

    public void setIconEndPadding(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0S(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0S(AbstractC31173DnH.A00(c67771Uxm.A0p, i));
        }
    }

    public void setIconStartPadding(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0T(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0T(AbstractC31173DnH.A00(c67771Uxm.A0p, i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.A04 != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
        A02();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A0O != colorStateList) {
            c67771Uxm.A0O = colorStateList;
            c67771Uxm.onStateChange(c67771Uxm.getState());
        }
        A03();
    }

    public void setRippleColorResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            ColorStateList A02 = C02G.A02(c67771Uxm.A0p, i);
            if (c67771Uxm.A0O != A02) {
                c67771Uxm.A0O = A02;
                c67771Uxm.onStateChange(c67771Uxm.getState());
            }
            A03();
        }
    }

    @Override // X.C65P
    public void setShapeAppearanceModel(C65Q c65q) {
        this.A04.setShapeAppearanceModel(c65q);
    }

    public void setShowMotionSpec(WDK wdk) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0X = wdk;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0X = WDK.A00(c67771Uxm.A0p, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = c67771Uxm.A0g;
            CharSequence charSequence2 = charSequence;
            if (z) {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            C67771Uxm c67771Uxm2 = this.A04;
            if (c67771Uxm2 != null && !TextUtils.equals(c67771Uxm2.A0Z, charSequence)) {
                c67771Uxm2.A0Z = charSequence;
                c67771Uxm2.A0v.A02 = true;
                c67771Uxm2.invalidateSelf();
                c67771Uxm2.A0L();
            }
        }
    }

    public void setTextEndPadding(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A0B != f) {
            c67771Uxm.A0B = f;
            c67771Uxm.invalidateSelf();
            c67771Uxm.A0L();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            float A00 = AbstractC31173DnH.A00(c67771Uxm.A0p, i);
            if (c67771Uxm.A0B != A00) {
                c67771Uxm.A0B = A00;
                c67771Uxm.invalidateSelf();
                c67771Uxm.A0L();
            }
        }
    }

    public void setTextStartPadding(float f) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && c67771Uxm.A0C != f) {
            c67771Uxm.A0C = f;
            c67771Uxm.invalidateSelf();
            c67771Uxm.A0L();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            float A00 = AbstractC31173DnH.A00(c67771Uxm.A0p, i);
            if (c67771Uxm.A0C != A00) {
                c67771Uxm.A0C = A00;
                c67771Uxm.invalidateSelf();
                c67771Uxm.A0L();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A04() {
        C67771Uxm c67771Uxm;
        if (!TextUtils.isEmpty(getText()) && (c67771Uxm = this.A04) != null) {
            int A0K = (int) (c67771Uxm.A01 + c67771Uxm.A0B + c67771Uxm.A0K());
            int A0J = (int) (c67771Uxm.A04 + c67771Uxm.A0C + c67771Uxm.A0J());
            if (this.A01 != null) {
                Rect rect = new Rect();
                this.A01.getPadding(rect);
                A0J += rect.left;
                A0K += rect.right;
            }
            setPaddingRelative(A0J, getPaddingTop(), A0K, getPaddingBottom());
        }
    }

    private void A05() {
        TextPaint paint = getPaint();
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            paint.drawableState = c67771Uxm.getState();
        }
        C70154WDd textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A03(getContext(), paint, this.A0F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.A0D;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // X.UBJ, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null && (drawable = c67771Uxm.A0T) != null && drawable.isStateful()) {
            C67771Uxm c67771Uxm2 = this.A04;
            ?? isEnabled = isEnabled();
            int i = isEnabled;
            if (this.A05) {
                i = isEnabled + 1;
            }
            int i2 = i;
            if (this.A06) {
                i2 = i + 1;
            }
            int i3 = i2;
            if (this.A07) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (isChecked()) {
                i4 = i3 + 1;
            }
            int[] iArr = new int[i4];
            int i5 = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i5 = 1;
            }
            if (this.A05) {
                iArr[i5] = 16842908;
                i5++;
            }
            if (this.A06) {
                iArr[i5] = 16843623;
                i5++;
            }
            if (this.A07) {
                iArr[i5] = 16842919;
                i5++;
            }
            if (isChecked()) {
                iArr[i5] = 16842913;
            }
            if (!Arrays.equals(c67771Uxm2.A0h, iArr)) {
                c67771Uxm2.A0h = iArr;
                if (C67771Uxm.A05(c67771Uxm2) && C67771Uxm.A06(c67771Uxm2, c67771Uxm2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(571470192);
        super.onAttachedToWindow();
        C72C.A02(this, this.A04);
        C0f9.A0D(-1067645884, A06);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = C0f9.A06(205850806);
        super.onFocusChanged(z, i, rect);
        this.A0C.A0j(z, i, rect);
        C0f9.A0D(1467851652, A06);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (r1 == false) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r7 = this;
            super.onInitializeAccessibilityNodeInfo(r8)
            X.Uxm r0 = r7.A04
            if (r0 == 0) goto Lb
            boolean r0 = r0.A0b
            if (r0 != 0) goto L57
        Lb:
            boolean r0 = r7.isClickable()
            if (r0 != 0) goto L57
            java.lang.String r0 = "android.view.View"
        L13:
            r8.setClassName(r0)
            X.Uxm r0 = r7.A04
            if (r0 == 0) goto L1f
            boolean r1 = r0.A0b
            r0 = 1
            if (r1 != 0) goto L20
        L1f:
            r0 = 0
        L20:
            r8.setCheckable(r0)
            boolean r0 = r7.isClickable()
            r8.setClickable(r0)
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L80
            android.view.ViewParent r2 = r7.getParent()
            X.UAk r2 = (X.AbstractC66345UAk) r2
            boolean r0 = r2.A03
            if (r0 == 0) goto L65
            r1 = 0
            r3 = 0
        L3e:
            int r0 = r2.getChildCount()
            if (r1 >= r0) goto L65
            android.view.View r0 = r2.getChildAt(r1)
            boolean r0 = r0 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L54
            android.view.View r0 = r2.getChildAt(r1)
            if (r0 == r7) goto L66
            int r3 = r3 + 1
        L54:
            int r1 = r1 + 1
            goto L3e
        L57:
            X.Uxm r0 = r7.A04
            if (r0 == 0) goto L62
            boolean r0 = r0.A0b
            if (r0 == 0) goto L62
            java.lang.String r0 = "android.widget.CompoundButton"
            goto L13
        L62:
            java.lang.String r0 = "android.widget.Button"
            goto L13
        L65:
            r3 = -1
        L66:
            r0 = 2131440328(0x7f0b32c8, float:1.8502636E38)
            java.lang.Object r1 = r7.getTag(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L81
            r1 = -1
        L72:
            boolean r6 = r7.isChecked()
            r2 = 1
            r5 = 0
            r4 = r2
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
            r8.setCollectionItemInfo(r0)
        L80:
            return
        L81:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.A09 != i) {
            this.A09 = i;
            A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r0 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r5 != 3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (super.onTouchEvent(r7) == false) goto L12;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1491463464(0x58e5ed28, float:2.0224539E15)
            int r4 = X.C0f9.A05(r0)
            int r5 = r7.getActionMasked()
            android.graphics.RectF r2 = r6.getCloseIconTouchBounds()
            float r1 = r7.getX()
            float r0 = r7.getY()
            boolean r3 = r2.contains(r1, r0)
            r2 = 0
            r1 = 1
            if (r5 == 0) goto L5b
            if (r5 == r1) goto L3f
            r0 = 2
            if (r5 == r0) goto L35
            r0 = 3
            if (r5 == r0) goto L59
        L27:
            boolean r0 = super.onTouchEvent(r7)
            if (r0 == 0) goto L2e
        L2d:
            r2 = 1
        L2e:
            r0 = -1313376603(0xffffffffb1b776a5, float:-5.3394893E-9)
            X.C0f9.A0C(r0, r4)
            return r2
        L35:
            boolean r0 = r6.A07
            if (r0 == 0) goto L27
            if (r3 != 0) goto L2d
            r6.setCloseIconPressed(r2)
            goto L2d
        L3f:
            boolean r0 = r6.A07
            if (r0 == 0) goto L59
            r6.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r6.A02
            if (r0 == 0) goto L4d
            r0.onClick(r6)
        L4d:
            X.UEh r0 = r6.A0C
            r0.A0d(r1, r1)
            r0 = 1
        L53:
            r6.setCloseIconPressed(r2)
            if (r0 != 0) goto L2d
            goto L27
        L59:
            r0 = 0
            goto L53
        L5b:
            if (r3 == 0) goto L27
            r6.setCloseIconPressed(r1)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        AbstractC31173DnH.A19(getResources(), this, i);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0A(f);
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0H = i;
        }
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A03 = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            Context context = c67771Uxm.A0p;
            c67771Uxm.A0v.A01(context, new C70154WDd(context, i));
        }
        A05();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.R.attr.chipStyle);
    }

    public void setCheckedIconVisible(boolean z) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0c(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0d(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0e(z);
        }
        A02();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            Context context2 = c67771Uxm.A0p;
            c67771Uxm.A0v.A01(context2, new C70154WDd(context2, i));
        }
        A05();
    }

    public Chip(Context context) {
        this(context, null);
    }

    public void setTextAppearance(C70154WDd c70154WDd) {
        C67771Uxm c67771Uxm = this.A04;
        if (c67771Uxm != null) {
            c67771Uxm.A0v.A01(c67771Uxm.A0p, c70154WDd);
        }
        A05();
    }
}
