package androidx.appcompat.widget;

import X.AbstractC010103p;
import X.AbstractC167007dF;
import X.AbstractC53402cO;
import X.AbstractC55852hR;
import X.AbstractC58319PtB;
import X.AbstractC65702TsY;
import X.C0f9;
import X.C3WJ;
import X.C3WR;
import X.C3WU;
import X.C53122bu;
import X.C58341Ptc;
import X.C66041Tyd;
import X.C66381UEp;
import X.C71x;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

/* loaded from: classes11.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property A0i = new C66041Tyd(0);
    public static final int[] A0j = {R.attr.state_checked};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public ObjectAnimator A08;
    public ColorStateList A09;
    public Drawable A0A;
    public Drawable A0B;
    public TransformationMethod A0C;
    public VelocityTracker A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public float A0G;
    public float A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public ColorStateList A0O;
    public ColorStateList A0P;
    public PorterDuff.Mode A0Q;
    public PorterDuff.Mode A0R;
    public Layout A0S;
    public Layout A0T;
    public C3WJ A0U;
    public C66381UEp A0V;
    public CharSequence A0W;
    public CharSequence A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final Rect A0f;
    public final TextPaint A0g;
    public final C3WU A0h;

    /* JADX WARN: Type inference failed for: r1v10, types: [X.WKh, java.lang.Object] */
    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        TransformationMethod transformationMethod;
        Typeface create;
        int i2;
        this.A0O = null;
        this.A0Q = null;
        this.A0Z = false;
        this.A0a = false;
        this.A0P = null;
        this.A0R = null;
        this.A0b = false;
        this.A0c = false;
        this.A0D = VelocityTracker.obtain();
        this.A0Y = true;
        this.A0f = new Rect();
        Context context2 = getContext();
        C3WR.A03(this, context2);
        TextPaint textPaint = new TextPaint(1);
        this.A0g = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC53402cO.A0M;
        C53122bu A00 = C53122bu.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A00.A02;
        AbstractC010103p.A06(context, typedArray, attributeSet, this, iArr, i, 0);
        Drawable A02 = A00.A02(2);
        this.A0A = A02;
        if (A02 != null) {
            A02.setCallback(this);
        }
        Drawable A022 = A00.A02(11);
        this.A0B = A022;
        if (A022 != null) {
            A022.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.A0d = typedArray.getBoolean(3, true);
        this.A0N = typedArray.getDimensionPixelSize(8, 0);
        this.A0J = typedArray.getDimensionPixelSize(5, 0);
        this.A0K = typedArray.getDimensionPixelSize(6, 0);
        this.A0e = typedArray.getBoolean(4, false);
        ColorStateList A01 = A00.A01(9);
        if (A01 != null) {
            this.A0O = A01;
            this.A0Z = true;
        }
        PorterDuff.Mode A002 = AbstractC55852hR.A00(null, typedArray.getInt(10, -1));
        if (this.A0Q != A002) {
            this.A0Q = A002;
            this.A0a = true;
        }
        if (this.A0Z || this.A0a) {
            A01();
        }
        ColorStateList A012 = A00.A01(12);
        if (A012 != null) {
            this.A0P = A012;
            this.A0b = true;
        }
        PorterDuff.Mode A003 = AbstractC55852hR.A00(null, typedArray.getInt(13, -1));
        if (this.A0R != A003) {
            this.A0R = A003;
            this.A0c = true;
        }
        if (this.A0b || this.A0c) {
            A02();
        }
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            C53122bu c53122bu = new C53122bu(context, context.obtainStyledAttributes(resourceId, AbstractC53402cO.A0N));
            ColorStateList A013 = c53122bu.A01(3);
            this.A09 = A013 == null ? getTextColors() : A013;
            TypedArray typedArray2 = c53122bu.A02;
            int dimensionPixelSize = typedArray2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                TextPaint textPaint2 = this.A0g;
                if (f != textPaint2.getTextSize()) {
                    textPaint2.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = typedArray2.getInt(1, -1);
            int i4 = typedArray2.getInt(2, -1);
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i4 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i4);
                } else {
                    create = Typeface.create(typeface, i4);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i2 = create.getStyle();
                } else {
                    i2 = 0;
                }
                int i5 = (i2 ^ (-1)) & i4;
                TextPaint textPaint3 = this.A0g;
                textPaint3.setFakeBoldText((i5 & 1) != 0);
                textPaint3.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                TextPaint textPaint4 = this.A0g;
                textPaint4.setFakeBoldText(false);
                textPaint4.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArray2.getBoolean(14, false)) {
                ?? obj = new Object();
                obj.A00 = AbstractC58319PtB.A08(context2).locale;
                transformationMethod = obj;
            } else {
                transformationMethod = null;
            }
            this.A0C = transformationMethod;
            setTextOnInternal(this.A0F);
            setTextOffInternal(this.A0E);
            typedArray2.recycle();
        }
        C3WU c3wu = new C3WU(this);
        this.A0h = c3wu;
        c3wu.A08(attributeSet, i);
        typedArray.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A07 = viewConfiguration.getScaledTouchSlop();
        this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().A00(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private StaticLayout A00(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.A0g;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void A01() {
        Drawable drawable = this.A0A;
        if (drawable != null) {
            if (this.A0Z || this.A0a) {
                Drawable mutate = drawable.mutate();
                this.A0A = mutate;
                if (this.A0Z) {
                    mutate.setTintList(this.A0O);
                }
                if (this.A0a) {
                    this.A0A.setTintMode(this.A0Q);
                }
                if (this.A0A.isStateful()) {
                    this.A0A.setState(getDrawableState());
                }
            }
        }
    }

    private void A02() {
        Drawable drawable = this.A0B;
        if (drawable != null) {
            if (this.A0b || this.A0c) {
                Drawable mutate = drawable.mutate();
                this.A0B = mutate;
                if (this.A0b) {
                    mutate.setTintList(this.A0P);
                }
                if (this.A0c) {
                    this.A0B.setTintMode(this.A0R);
                }
                if (this.A0B.isStateful()) {
                    this.A0B.setState(getDrawableState());
                }
            }
        }
    }

    private void A03() {
        if (this.A0V == null && this.A0U.A00.A00.A03() && C58341Ptc.A09 != null) {
            C58341Ptc A00 = C58341Ptc.A00();
            int A01 = A00.A01();
            if (A01 == 3 || A01 == 0) {
                C66381UEp c66381UEp = new C66381UEp(this);
                this.A0V = c66381UEp;
                A00.A04(c66381UEp);
            }
        }
    }

    private C3WJ getEmojiTextViewHelper() {
        C3WJ c3wj = this.A0U;
        if (c3wj == null) {
            C3WJ c3wj2 = new C3WJ(this);
            this.A0U = c3wj2;
            return c3wj2;
        }
        return c3wj;
    }

    private boolean getTargetCheckedState() {
        return AbstractC167007dF.A1O((this.A00 > 0.5f ? 1 : (this.A00 == 0.5f ? 0 : -1)));
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.A0B;
        if (drawable != null) {
            Rect rect2 = this.A0f;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.A0A;
            if (drawable2 != null) {
                rect = AbstractC55852hR.A01(drawable2);
            } else {
                rect = AbstractC55852hR.A00;
            }
            return ((((this.A0M - this.A05) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.A0E = charSequence;
        C3WJ emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod A00 = emojiTextViewHelper.A00.A00.A00(this.A0C);
        if (A00 != null) {
            charSequence = A00.getTransformation(charSequence, this);
        }
        this.A0W = charSequence;
        this.A0S = null;
        if (this.A0d) {
            A03();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.A0F = charSequence;
        C3WJ emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod A00 = emojiTextViewHelper.A00.A00.A00(this.A0C);
        if (A00 != null) {
            charSequence = A00.getTransformation(charSequence, this);
        }
        this.A0X = charSequence;
        this.A0T = null;
        if (this.A0d) {
            A03();
        }
    }

    public final void A04() {
        setTextOnInternal(this.A0F);
        setTextOffInternal(this.A0E);
        requestLayout();
    }

    public boolean getShowText() {
        return this.A0d;
    }

    public boolean getSplitTrack() {
        return this.A0e;
    }

    public int getSwitchMinWidth() {
        return this.A0J;
    }

    public int getSwitchPadding() {
        return this.A0K;
    }

    public CharSequence getTextOff() {
        return this.A0E;
    }

    public CharSequence getTextOn() {
        return this.A0F;
    }

    public Drawable getThumbDrawable() {
        return this.A0A;
    }

    public final float getThumbPosition() {
        return this.A00;
    }

    public int getThumbTextPadding() {
        return this.A0N;
    }

    public ColorStateList getThumbTintList() {
        return this.A0O;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.A0Q;
    }

    public Drawable getTrackDrawable() {
        return this.A0B;
    }

    public ColorStateList getTrackTintList() {
        return this.A0P;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.A0R;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0j);
        }
        return onCreateDrawableState;
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.A0Y = z;
        invalidate();
    }

    public void setShowText(boolean z) {
        if (this.A0d != z) {
            this.A0d = z;
            requestLayout();
            if (z) {
                A03();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.A0e = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.A0J = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.A0K = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.A0g;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0A;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A0A = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.A00 = f;
        invalidate();
    }

    public void setThumbTextPadding(int i) {
        this.A0N = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A0O = colorStateList;
        this.A0Z = true;
        A01();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.A0Q = mode;
        this.A0a = true;
        A01();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A0B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A0P = colorStateList;
        this.A0b = true;
        A02();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.A0R = mode;
        this.A0c = true;
        A02();
    }

    private int getThumbOffset() {
        float f;
        if (getLayoutDirection() == 1) {
            f = 1.0f - this.A00;
        } else {
            f = this.A00;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int A03 = C0f9.A03(-1118505062);
        Rect rect2 = this.A0f;
        int i = this.A03;
        int i2 = this.A04;
        int i3 = this.A0L;
        int i4 = this.A02;
        int thumbOffset = getThumbOffset() + i;
        Drawable drawable = this.A0A;
        if (drawable != null) {
            rect = AbstractC55852hR.A01(drawable);
        } else {
            rect = AbstractC55852hR.A00;
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i5 = rect2.left;
            thumbOffset += i5;
            int i6 = rect.left;
            if (i6 > i5) {
                i += i6 - i5;
            }
            int i7 = rect.top;
            int i8 = rect2.top;
            int i9 = i2;
            if (i7 > i8) {
                i9 = (i7 - i8) + i2;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 > i11) {
                i3 -= i10 - i11;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            int i14 = i4;
            if (i12 > i13) {
                i14 = i4 - (i12 - i13);
            }
            this.A0B.setBounds(i, i9, i3, i14);
        }
        Drawable drawable3 = this.A0A;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.A05 + rect2.right;
            this.A0A.setBounds(i15, i2, i16, i4);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i2, i16, i4);
            }
        }
        super.draw(canvas);
        C0f9.A0A(-2103423384, A03);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0A;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (z) {
            int i = compoundPaddingLeft + this.A0M;
            if (!TextUtils.isEmpty(getText())) {
                return i + this.A0K;
            }
            return i;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        int compoundPaddingRight = super.getCompoundPaddingRight();
        if (!z) {
            int i = compoundPaddingRight + this.A0M;
            if (!TextUtils.isEmpty(getText())) {
                return i + this.A0K;
            }
            return i;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.A08;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.A08.end();
            this.A08 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.A0f;
        Drawable drawable = this.A0B;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.A04;
        int i2 = this.A02;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A0A;
        if (drawable != null) {
            if (this.A0e && drawable2 != null) {
                Rect A01 = AbstractC55852hR.A01(drawable2);
                drawable2.copyBounds(rect);
                rect.left += A01.left;
                rect.right -= A01.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.A0T;
        } else {
            layout = this.A0S;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A09;
            if (colorStateList != null) {
                this.A0g.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A0g.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.A0F;
            } else {
                charSequence = this.A0E;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A08;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.A0A != null) {
            Rect rect = this.A0f;
            Drawable drawable = this.A0B;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect A01 = AbstractC55852hR.A01(this.A0A);
            i5 = Math.max(0, A01.left - rect.left);
            i10 = Math.max(0, A01.right - rect.right);
        } else {
            i5 = 0;
        }
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            A08 = ((this.A0M + i6) - i5) - i10;
        } else {
            A08 = AbstractC65702TsY.A08(this) - i10;
            i6 = (A08 - this.A0M) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i8 = getPaddingTop();
                i7 = this.A0I;
            } else {
                i9 = AbstractC65702TsY.A07(this);
                i8 = i9 - this.A0I;
                this.A03 = i6;
                this.A04 = i8;
                this.A02 = i9;
                this.A0L = A08;
            }
        } else {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i7 = this.A0I;
            i8 = paddingTop - (i7 / 2);
        }
        i9 = i7 + i8;
        this.A03 = i6;
        this.A04 = i8;
        this.A02 = i9;
        this.A0L = A08;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int A06 = C0f9.A06(1754638480);
        if (this.A0d) {
            if (this.A0T == null) {
                this.A0T = A00(this.A0X);
            }
            if (this.A0S == null) {
                this.A0S = A00(this.A0W);
            }
        }
        Rect rect = this.A0f;
        Drawable drawable = this.A0A;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.A0A.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.A0A.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.A0d) {
            i5 = Math.max(this.A0T.getWidth(), this.A0S.getWidth()) + (this.A0N * 2);
        } else {
            i5 = 0;
        }
        this.A05 = Math.max(i5, i3);
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.A0B.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.A0A;
        if (drawable3 != null) {
            Rect A01 = AbstractC55852hR.A01(drawable3);
            i8 = Math.max(i8, A01.left);
            i9 = Math.max(i9, A01.right);
        }
        if (this.A0Y) {
            i6 = Math.max(this.A0J, (this.A05 * 2) + i8 + i9);
        } else {
            i6 = this.A0J;
        }
        int max = Math.max(i7, i4);
        this.A0M = i6;
        this.A0I = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
        C0f9.A0D(1799498547, A06);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.A0F;
        } else {
            charSequence = this.A0E;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
    
        if (isEnabled() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A01(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CharSequence charSequence;
        Resources resources;
        int i;
        super.setChecked(z);
        boolean isChecked = isChecked();
        int i2 = Build.VERSION.SDK_INT;
        if (isChecked) {
            if (i2 >= 30) {
                charSequence = this.A0F;
                if (charSequence == null) {
                    resources = getResources();
                    i = 2131951970;
                    charSequence = resources.getString(i);
                }
                AbstractC010103p.A0G(this, charSequence);
            }
        } else if (i2 >= 30) {
            charSequence = this.A0E;
            if (charSequence == null) {
                resources = getResources();
                i = 2131951969;
                charSequence = resources.getString(i);
            }
            AbstractC010103p.A0G(this, charSequence);
        }
        if (getWindowToken() != null && isLaidOut()) {
            float f = 0.0f;
            if (isChecked) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) A0i, f);
            this.A08 = ofFloat;
            ofFloat.setDuration(250L);
            this.A08.setAutoCancel(true);
            this.A08.start();
            return;
        }
        ObjectAnimator objectAnimator = this.A08;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        float f2 = 0.0f;
        if (isChecked) {
            f2 = 1.0f;
        }
        setThumbPosition(f2);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A02(z);
        setTextOnInternal(this.A0F);
        setTextOffInternal(this.A0E);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A00.A00.A04(inputFilterArr));
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0E;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(2131951969);
            }
            AbstractC010103p.A0G(this, charSequence2);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0F;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(2131951970);
            }
            AbstractC010103p.A0G(this, charSequence2);
        }
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C71x.A00(getContext(), i));
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C71x.A00(getContext(), i));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A0A && drawable != this.A0B) {
            return false;
        }
        return true;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
