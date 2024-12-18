package com.instagram.igds.components.switchbutton;

import X.AbstractC50690MZi;
import X.C0f9;
import X.C14360o3;
import X.C3DY;
import X.InterfaceC09390do;
import X.InterfaceC190658cN;
import X.InterfaceC85983sV;
import X.UAx;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public class IgdsSwitch extends CompoundButton implements InterfaceC85983sV {
    public static final int A0M;
    public static final InterfaceC09390do A0N;
    public static final boolean A0O;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public VelocityTracker A06;
    public InterfaceC190658cN A07;
    public Boolean A08;
    public boolean A09;
    public boolean A0A;
    public float A0B;
    public float A0C;
    public Drawable A0D;
    public final Drawable A0E;
    public final Rect A0F;
    public final Rect A0G;
    public final Rect A0H;
    public final Rect A0I;
    public final Drawable A0J;
    public final Drawable A0K;
    public final Drawable A0L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsSwitch(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        int i;
        int i2;
        int paddingTop;
        int i3;
        int paddingLeft;
        int paddingTop2;
        int i4;
        int i5;
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        float f = this.A00 / this.A02;
        if ((!isEnabled()) && !((Boolean) A0N.getValue()).booleanValue()) {
            f *= 0.3f;
        }
        Drawable drawable3 = this.A0J;
        int i6 = (int) (f * 255.0f);
        drawable3.setAlpha(i6);
        Drawable drawable4 = this.A0L;
        int i7 = (int) ((1.0f - f) * 255.0f);
        drawable4.setAlpha(i7);
        boolean z = A0O;
        if (z && !((Boolean) A0N.getValue()).booleanValue()) {
            drawable = this.A0K;
            drawable.setAlpha(255);
            drawable2 = this.A0E;
            drawable2.setAlpha(255);
        } else {
            drawable = this.A0K;
            drawable.setAlpha(i6);
            drawable2 = this.A0E;
            drawable2.setAlpha(i7);
        }
        boolean z2 = false;
        if (f == 1.0f) {
            z2 = true;
        }
        ColorFilter colorFilter = null;
        if (z2) {
            Context context = getContext();
            Drawable drawable5 = context.getDrawable(R.drawable.instagram_lock_pano_filled_24);
            if (drawable5 != null) {
                this.A0D = drawable5;
                boolean isEnabled = isEnabled();
                int i8 = R.color.igds_secondary_icon;
                if (isEnabled) {
                    i8 = R.color.prism_lock_icon;
                }
                drawable5.setColorFilter(C3DY.A00(context.getColor(i8)));
                if (isEnabled()) {
                    drawable.setColorFilter(null);
                    drawable3.setColorFilter(null);
                } else {
                    if (z) {
                        boolean booleanValue = ((Boolean) A0N.getValue()).booleanValue();
                        i4 = R.color.carouselIndicatorCustomInActiveColorVariant1;
                        if (booleanValue) {
                            i4 = R.color.prism_disabled_thumb_ax_fix;
                        }
                    } else {
                        i4 = R.color.disabled_thumb_on;
                    }
                    drawable.setColorFilter(C3DY.A00(context.getColor(i4)));
                    if (z) {
                        boolean booleanValue2 = ((Boolean) A0N.getValue()).booleanValue();
                        i5 = R.color.prism_disabled_background_on;
                        if (booleanValue2) {
                            i5 = R.color.checkbox_disabled_tint;
                        }
                    } else {
                        i5 = R.color.disabled_background_on;
                    }
                    drawable3.setColorFilter(C3DY.A00(context.getColor(i5)));
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (f == 0.0f) {
            Context context2 = getContext();
            Drawable drawable6 = context2.getDrawable(R.drawable.instagram_unlock_pano_filled_24);
            if (drawable6 != null) {
                this.A0D = drawable6;
                boolean isEnabled2 = isEnabled();
                int i9 = R.color.igds_secondary_icon;
                if (isEnabled2) {
                    i9 = R.color.prism_lock_icon;
                }
                drawable6.setColorFilter(C3DY.A00(context2.getColor(i9)));
                if (isEnabled()) {
                    drawable2.setColorFilter(null);
                    if (((Boolean) A0N.getValue()).booleanValue()) {
                        i2 = R.color.prism_enabled_background_off_ax_fix;
                    }
                    drawable4.setColorFilter(colorFilter);
                } else {
                    if (z) {
                        boolean booleanValue3 = ((Boolean) A0N.getValue()).booleanValue();
                        i = R.color.prism_disabled_thumb_off;
                        if (booleanValue3) {
                            i = R.color.prism_disabled_thumb_ax_fix;
                        }
                    } else {
                        i = R.color.disabled_thumb_off;
                    }
                    drawable2.setColorFilter(C3DY.A00(context2.getColor(i)));
                    if (z) {
                        boolean booleanValue4 = ((Boolean) A0N.getValue()).booleanValue();
                        i2 = R.color.prism_disabled_background_off;
                        if (booleanValue4) {
                            i2 = R.color.checkbox_disabled_tint;
                        }
                    } else {
                        i2 = R.color.callout_background;
                    }
                }
                colorFilter = C3DY.A00(context2.getColor(i2));
                drawable4.setColorFilter(colorFilter);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        int i10 = (int) this.A00;
        Rect rect = this.A0I;
        int paddingLeft2 = getPaddingLeft() + i10;
        if (z) {
            i3 = this.A03;
            int i11 = i3 / A0M;
            paddingLeft2 += i11;
            paddingTop = getPaddingTop() + i11;
            paddingLeft = i10 + i3 + getPaddingLeft() + i11;
            paddingTop2 = getPaddingTop() + drawable2.getIntrinsicHeight() + i11;
        } else {
            paddingTop = getPaddingTop();
            i3 = this.A03;
            paddingLeft = i10 + i3 + getPaddingLeft();
            paddingTop2 = getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        rect.set(paddingLeft2, paddingTop, paddingLeft, paddingTop2);
        drawable2.setBounds(rect);
        drawable.setBounds(rect);
        Rect rect2 = this.A0G;
        int i12 = i3 / 4;
        rect2.set(rect.left + i12, rect.top + i12, rect.right - i12, rect.bottom - i12);
        this.A0D.setBounds(rect2);
        drawable4.draw(canvas);
        drawable3.draw(canvas);
        drawable2.draw(canvas);
        drawable.draw(canvas);
        if (this.A0A && z) {
            this.A0D.draw(canvas);
        }
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final boolean performClick() {
        this.A09 = true;
        return super.performClick();
    }

    public final void setCheckedAnimated(boolean z) {
        this.A09 = true;
        setChecked(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (java.lang.Boolean.valueOf(r1) == null) goto L6;
     */
    static {
        /*
            X.0od r0 = X.C14650od.A03
            if (r0 == 0) goto L19
            com.instagram.common.session.UserSession r3 = X.C14650od.A00(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320296449614143(0x81091e0004213f, double:3.032439952606382E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L1a
        L19:
            r1 = 0
        L1a:
            com.instagram.igds.components.switchbutton.IgdsSwitch.A0O = r1
            X.5zX r0 = X.C133065zX.A00
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch.A0N = r0
            r0 = 5
            if (r1 == 0) goto L28
            r0 = 6
        L28:
            com.instagram.igds.components.switchbutton.IgdsSwitch.A0M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.switchbutton.IgdsSwitch.<clinit>():void");
    }

    private final boolean getTargetCheckedState() {
        if (this.A00 < this.A02 / 2) {
            return false;
        }
        return true;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        InterfaceC190658cN interfaceC190658cN = this.A07;
        if (interfaceC190658cN == null || interfaceC190658cN.onToggle(!isChecked())) {
            super.toggle();
        }
    }

    public final void A00() {
        super.toggle();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-386453948);
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.A06;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A06 = null;
        }
        C0f9.A0D(-1973474038, A06);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int intrinsicHeight;
        int paddingLeft;
        int paddingTop;
        int intrinsicHeight2;
        float f;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = A0O;
        Rect rect = this.A0F;
        int paddingLeft2 = getPaddingLeft();
        if (z2) {
            intrinsicHeight = getPaddingTop();
            int paddingLeft3 = getPaddingLeft();
            drawable = this.A0L;
            paddingLeft = paddingLeft3 + drawable.getIntrinsicWidth();
            paddingTop = getPaddingTop();
            intrinsicHeight2 = drawable.getIntrinsicHeight();
        } else {
            Drawable drawable2 = this.A0E;
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int i5 = A0M;
            paddingLeft2 += intrinsicWidth / i5;
            int paddingTop2 = getPaddingTop() + (drawable2.getIntrinsicHeight() / 2);
            drawable = this.A0L;
            intrinsicHeight = paddingTop2 - (drawable.getIntrinsicHeight() / 2);
            paddingLeft = getPaddingLeft() + (drawable2.getIntrinsicWidth() / i5) + drawable.getIntrinsicWidth();
            paddingTop = getPaddingTop() + (drawable2.getIntrinsicHeight() / 2);
            intrinsicHeight2 = drawable.getIntrinsicHeight() / 2;
        }
        rect.set(paddingLeft2, intrinsicHeight, paddingLeft, paddingTop + intrinsicHeight2);
        drawable.setBounds(rect);
        this.A0J.setBounds(rect);
        if (isChecked()) {
            f = this.A02;
        } else {
            f = 0.0f;
        }
        this.A00 = f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int A06 = C0f9.A06(475612910);
        int[] A00 = AbstractC50690MZi.A00(this.A0H, this.A0J, this.A0E);
        setMeasuredDimension(A00[0], A00[1]);
        C0f9.A0D(-1429226970, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r1 != 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        if (isEnabled() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0 != null) goto L6;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.switchbutton.IgdsSwitch.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        super.setChecked(z);
        Boolean bool = this.A08;
        if (bool != null && !bool.equals(Boolean.valueOf(z))) {
            clearAnimation();
        }
        this.A08 = Boolean.valueOf(z);
        if (z) {
            i = this.A02;
        } else {
            i = 0;
        }
        if (this.A09 && super.getWindowToken() != null) {
            clearAnimation();
            startAnimation(new UAx(this, this.A00, i));
        } else {
            this.A00 = i;
            invalidate();
        }
        this.A09 = false;
    }

    public final void setToggleListener(InterfaceC190658cN interfaceC190658cN) {
        this.A07 = interfaceC190658cN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int intrinsicWidth;
        int i2;
        Drawable drawable;
        C14360o3.A0B(context, 1);
        this.A0F = new Rect();
        this.A0I = new Rect();
        this.A0G = new Rect();
        this.A0H = new Rect(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        super.setClickable(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C14360o3.A07(viewConfiguration);
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
        if (A0O) {
            Drawable drawable2 = context.getDrawable(R.drawable.prism_switch_handle);
            if (drawable2 != null) {
                this.A0E = drawable2;
                Drawable drawable3 = context.getDrawable(R.drawable.prism_switch_handle);
                if (drawable3 != null) {
                    this.A0K = drawable3;
                    Drawable drawable4 = context.getDrawable(R.drawable.prism_switch_background);
                    if (drawable4 != null) {
                        this.A0L = drawable4;
                        Drawable drawable5 = context.getDrawable(R.drawable.prism_switch_background_active);
                        if (drawable5 != null) {
                            this.A0J = drawable5;
                            this.A03 = drawable3.getIntrinsicWidth();
                            intrinsicWidth = drawable4.getIntrinsicWidth();
                            i2 = this.A03 * 8;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            Drawable drawable6 = context.getDrawable(R.drawable.new_toggle_nub);
            if (drawable6 != null) {
                this.A0E = drawable6;
                Drawable drawable7 = context.getDrawable(R.drawable.new_toggle_nub_active);
                if (drawable7 != null) {
                    this.A0K = drawable7;
                    Drawable drawable8 = context.getDrawable(R.drawable.new_toggle);
                    if (drawable8 != null) {
                        this.A0L = drawable8;
                        Drawable drawable9 = context.getDrawable(R.drawable.new_toggle_active);
                        if (drawable9 != null) {
                            this.A0J = drawable9;
                            this.A03 = drawable7.getIntrinsicWidth();
                            intrinsicWidth = drawable8.getIntrinsicWidth();
                            i2 = this.A03 * 3;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A02 = intrinsicWidth - (i2 / A0M);
        if (this.A0A) {
            drawable = context.getDrawable(R.drawable.instagram_lock_pano_filled_24);
            if (drawable == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            drawable = context.getDrawable(R.drawable.instagram_unlock_pano_filled_24);
            if (drawable == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A0D = drawable;
        this.A03 = this.A0E.getIntrinsicWidth();
    }

    public /* synthetic */ IgdsSwitch(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
