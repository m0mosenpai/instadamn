package com.instagram.creation.capture.quickcapture.cameratoolmenu;

import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC13600mm;
import X.AbstractC13880nE;
import X.AbstractC14710oj;
import X.AbstractC55922hc;
import X.C0fO;
import X.C11T;
import X.C14360o3;
import X.C55982hj;
import X.C668630d;
import X.C8GO;
import X.C8GW;
import X.C9E0;
import X.EnumC171117k2;
import X.InterfaceC09390do;
import X.InterfaceC55932he;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CameraToolMenuItem extends View {
    public float A00;
    public float A01;
    public float A02;
    public Bitmap A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public EnumC171117k2 A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public double A0C;
    public float A0D;
    public int A0E;
    public boolean A0F;
    public boolean A0G;
    public final float A0H;
    public final float A0I;
    public final float A0J;
    public final float A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final RectF A0P;
    public final C55982hj A0Q;
    public final Runnable A0R;
    public final int A0S;
    public final Paint A0T;
    public final Paint A0U;
    public final Path A0V;
    public final RectF A0W;
    public final InterfaceC55932he A0X;
    public final InterfaceC09390do A0Y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraToolMenuItem(Context context) {
        this(context, null, 0, null);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b4, code lost:
    
        if (r28.A0A != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0pO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.0pO, java.lang.Object] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem.onDraw(android.graphics.Canvas):void");
    }

    public final void setCameraToolResources(C8GW c8gw) {
        Drawable mutate;
        C14360o3.A0B(c8gw, 0);
        Context context = getContext();
        Drawable drawable = context.getDrawable(c8gw.A01);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            this.A04 = mutate;
            if (c8gw.A03) {
                mutate.setTint(context.getColor(R.color.audio_bar_action_color_enabled));
            }
            int i = c8gw.A02;
            if (i != 0) {
                String string = context.getResources().getString(i);
                this.A08 = string;
                this.A01 = this.A0M.measureText(String.valueOf(string));
            }
            int i2 = c8gw.A00;
            if (i2 != 0) {
                setContentDescription(context.getResources().getString(i2));
            }
        }
    }

    public final void setCircularBackground(int i) {
        this.A0G = true;
        this.A06 = null;
        this.A0F = true;
        this.A0T.setColor(i);
        invalidate();
    }

    public final void setDrawableWithLabel(String str) {
        C14360o3.A0B(str, 0);
        Resources resources = getResources();
        float dimension = resources.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        int i = (int) dimension;
        Bitmap createBitmap = Bitmap.createBitmap(i * 2, i, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Context context = getContext();
        paint.setColor(context.getColor(R.color.fds_transparent));
        canvas.drawRect(0.0f, 0.0f, dimension * 2.0f, dimension, paint);
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.audio_bar_action_color_enabled));
        paint2.setTextSize(dimension);
        paint2.setTextScaleX(1.0f);
        canvas.drawText(str, 0.1f * dimension, dimension * 0.8f, paint2);
        this.A05 = new BitmapDrawable(resources, createBitmap);
        this.A06 = null;
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        A04(z, false);
    }

    private final void A00(Canvas canvas, float f, float f2, int i) {
        Path path = this.A0V;
        path.reset();
        Paint paint = this.A0T;
        paint.setAlpha(i);
        RectF rectF = this.A0W;
        float f3 = this.A0K;
        float f4 = this.A0I;
        rectF.set(f, f3, f2, f4 + f3);
        path.setFillType(Path.FillType.INVERSE_WINDING);
        float f5 = f4 / 2.0f;
        path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        canvas.drawRoundRect(rectF, f5, f5, paint);
        canvas.drawPath(path, paint);
    }

    private final void A01(Canvas canvas, Drawable drawable) {
        int i;
        int i2;
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable != null) {
            float f = this.A0I;
            float intrinsicWidth2 = (f - drawable.getIntrinsicWidth()) / 2.0f;
            float intrinsicHeight2 = (f - drawable.getIntrinsicHeight()) / 2.0f;
            if (A03()) {
                intrinsicWidth2 += getWidth() - f;
                if (this.A09) {
                    intrinsicWidth2 -= (this.A0J - f) / 2.0f;
                }
            }
            float f2 = 0.0f;
            if (0.0f < intrinsicWidth2) {
                f2 = intrinsicWidth2;
            }
            if (this.A0G) {
                float f3 = 0.0f;
                if (0.0f < intrinsicHeight2) {
                    f3 = intrinsicHeight2;
                }
                int i3 = (int) f2;
                int i4 = this.A0E;
                i = i3 + i4;
                int i5 = (int) f3;
                i2 = i4 + i5;
                intrinsicWidth = (((int) Math.min(drawable.getIntrinsicWidth(), f)) + i3) - this.A0E;
                intrinsicHeight = (((int) Math.min(drawable.getIntrinsicHeight(), f)) + i5) - this.A0E;
            } else {
                i = (int) f2;
                int i6 = (int) this.A0K;
                int i7 = (int) intrinsicHeight2;
                i2 = i6 + i7;
                intrinsicWidth = drawable.getIntrinsicWidth() + i;
                intrinsicHeight = drawable.getIntrinsicHeight() + i6 + i7;
            }
            drawable.setBounds(i, i2, intrinsicWidth, intrinsicHeight);
            canvas.save();
            float f4 = f / 2.0f;
            if (A03()) {
                f4 = getWidth() - f4;
            }
            canvas.rotate(this.A0D, f4, (f + this.A0K) / 2.0f);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private final boolean A03() {
        if (this.A0C <= 0.5d) {
            return false;
        }
        return true;
    }

    private final float getBackgroundSpringValue() {
        float f = (float) this.A0Q.A09.A00;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    private final int getFlexModeBackgroundColor() {
        return ((Number) this.A0Y.getValue()).intValue();
    }

    private final float getIconRadius() {
        return this.A0I / 2.0f;
    }

    private final float getMaxSize() {
        float f = this.A0I;
        if (this.A08 != null) {
            return f + getLabelPaddingLeft() + this.A01 + getLabelPaddingRight();
        }
        return f;
    }

    public final Drawable getDrawable() {
        Drawable drawable = this.A05;
        if (drawable == null) {
            return this.A04;
        }
        return drawable;
    }

    public final CharSequence getLabelText() {
        return this.A08;
    }

    public final EnumC171117k2 getMerchandiseBadge() {
        return this.A07;
    }

    public final void setIconPaddingForUtilityToolBarItem(int i) {
        this.A0E = i;
        invalidate();
    }

    public final void setIconRotation(float f) {
        this.A0D = f;
        invalidate();
    }

    public final void setIsFlexModeBackgroundEnabled(boolean z) {
        int i;
        this.A0F = z;
        Paint paint = this.A0T;
        if (z) {
            i = getFlexModeBackgroundColor();
        } else {
            i = this.A0S;
        }
        paint.setColor(i);
        invalidate();
    }

    public final void setLabelDisplayPercentage(float f) {
        this.A00 = f;
        A02(this);
    }

    public final void setMerchandiseBadge(EnumC171117k2 enumC171117k2) {
        this.A07 = enumC171117k2;
        invalidate();
    }

    public final void setPlacement(double d) {
        this.A0C = d;
        invalidate();
    }

    public static final void A02(CameraToolMenuItem cameraToolMenuItem) {
        int backgroundWidth = (int) cameraToolMenuItem.getBackgroundWidth();
        if (cameraToolMenuItem.A09 && cameraToolMenuItem.getSelectedIconPercentage() > 0.0f) {
            double d = backgroundWidth;
            double ceil = Math.ceil(cameraToolMenuItem.A0J);
            if (d < ceil) {
                d = ceil;
            }
            backgroundWidth = (int) d;
        }
        if (cameraToolMenuItem.A02 > 0.0f || cameraToolMenuItem.A00 > 0.0f) {
            backgroundWidth = (int) cameraToolMenuItem.getMaxSize();
        }
        if (cameraToolMenuItem.getWidth() != backgroundWidth) {
            AbstractC13880nE.A0g(cameraToolMenuItem, backgroundWidth);
        }
        cameraToolMenuItem.invalidate();
    }

    private final float getBackgroundWidth() {
        float backgroundSpringValue = getBackgroundSpringValue();
        float f = this.A0I;
        float f2 = 1.0f - 0.0f;
        float maxSize = getMaxSize() - f;
        float f3 = 0.0f;
        if (f2 != 0.0f) {
            f3 = (backgroundSpringValue - 0.0f) / f2;
        }
        return (f3 * maxSize) + f;
    }

    private final float getLabelPaddingLeft() {
        boolean A03 = A03();
        Resources resources = getResources();
        int i = R.dimen.abc_edit_text_inset_top_material;
        if (A03) {
            i = R.dimen.abc_select_dialog_padding_start_material;
        }
        return resources.getDimension(i);
    }

    private final float getLabelPaddingRight() {
        boolean A03 = A03();
        Resources resources = getResources();
        int i = R.dimen.abc_select_dialog_padding_start_material;
        if (A03) {
            i = R.dimen.abc_edit_text_inset_top_material;
        }
        return resources.getDimension(i);
    }

    private final float getSelectedIconPercentage() {
        return AbstractC13600mm.A02(getBackgroundSpringValue(), 0.3f, 0.0f, 0.0f, 1.0f);
    }

    public final void A04(boolean z, boolean z2) {
        C55982hj c55982hj;
        if (z != isSelected()) {
            super.setSelected(z);
            double d = 0.0d;
            if (z) {
                if (z2) {
                    C11T.A01(this.A0R);
                    boolean z3 = this.A0A;
                    c55982hj = this.A0Q;
                    if (z3) {
                        d = 1.0d;
                    } else {
                        c55982hj.A08(0.3d, true);
                    }
                }
                invalidate();
            }
            c55982hj = this.A0Q;
            c55982hj.A06(d);
            invalidate();
        }
    }

    public final void setBubbleBoiEnabled(boolean z) {
        this.A09 = z;
    }

    public final void setExpandingBackgroundEnabled(boolean z) {
        this.A0A = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraToolMenuItem(Context context, AttributeSet attributeSet, int i, Float f) {
        super(context, attributeSet, i);
        float dimension;
        C14360o3.A0B(context, 1);
        int color = context.getColor(R.color.black);
        this.A0S = color;
        this.A0Y = AbstractC09440dt.A01(new C9E0(context, 45));
        Paint paint = new Paint(1);
        this.A0T = paint;
        Paint paint2 = new Paint(1);
        this.A0U = paint2;
        Paint paint3 = new Paint(1);
        this.A0L = paint3;
        Paint paint4 = new Paint(1);
        this.A0M = paint4;
        Paint paint5 = new Paint(1);
        this.A0O = paint5;
        this.A0N = new Paint(1);
        this.A0V = new Path();
        this.A0W = new RectF();
        this.A0P = new RectF();
        if (f != null) {
            dimension = f.floatValue();
        } else {
            dimension = getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        }
        this.A0I = dimension;
        Resources resources = getResources();
        this.A0H = resources.getDimension(R.dimen.abc_button_padding_horizontal_material);
        float f2 = dimension / 2.0f;
        this.A0J = f2 + ((float) Math.sqrt(Math.pow(f2, 2.0d) / 2.0d)) + resources.getDimension(R.dimen.abc_button_padding_horizontal_material);
        this.A0K = resources.getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        this.A0A = true;
        C668630d c668630d = new C668630d() { // from class: X.8GU
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                if (c55982hj.A09.A00 == 1.0d) {
                    Runnable runnable = CameraToolMenuItem.this.A0R;
                    C11T.A01(runnable);
                    C11T.A04(runnable, 750L);
                }
                CameraToolMenuItem.A02(CameraToolMenuItem.this);
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                CameraToolMenuItem.A02(CameraToolMenuItem.this);
            }
        };
        this.A0X = c668630d;
        setWillNotDraw(false);
        paint.setColor(color);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        Context context2 = getContext();
        paint2.setColor(context2.getColor(R.color.design_dark_default_color_on_background));
        paint3.setColor(context2.getColor(R.color.black));
        paint4.setColor(context2.getColor(R.color.design_dark_default_color_on_background));
        paint4.setTextSize(resources.getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        Typeface create = Typeface.create("sans-serif-medium", 0);
        if (AbstractC14710oj.A08()) {
            if (Systrace.A0E(1L)) {
                C0fO.A01(AbstractC111324zv.A00(316), -2144172598);
            }
            paint4.setTypeface(AbstractC14710oj.A01(context));
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1045868704);
            }
        } else if (create != null) {
            paint4.setTypeface(create);
        }
        paint5.setColor(context2.getColor(R.color.design_dark_default_color_on_background));
        paint5.setTextSize(resources.getDimension(R.dimen.abc_edit_text_inset_bottom_material));
        Typeface create2 = Typeface.create("sans-serif-medium", 1);
        if (AbstractC14710oj.A08()) {
            if (Systrace.A0E(1L)) {
                C0fO.A01(AbstractC111324zv.A00(316), -2144172598);
            }
            paint5.setTypeface(AbstractC14710oj.A00(context));
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1045868704);
            }
        } else if (create2 != null) {
            paint5.setTypeface(create2);
        }
        paint5.setLetterSpacing(resources.getDimension(R.dimen.merchandising_badge_letter_spacing));
        this.A0Q = C8GO.A00(c668630d, 4.0d, 25.0d);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0D);
            C14360o3.A07(obtainStyledAttributes);
            setCameraToolResources(new C8GW(obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(0, 0), false));
            obtainStyledAttributes.recycle();
        }
        this.A0R = new Runnable() { // from class: X.8GV
            @Override // java.lang.Runnable
            public final void run() {
                CameraToolMenuItem.this.A0Q.A06(0.0d);
            }
        };
    }

    public /* synthetic */ CameraToolMenuItem(Context context, AttributeSet attributeSet, int i, Float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraToolMenuItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraToolMenuItem(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
        C14360o3.A0B(context, 1);
    }
}
