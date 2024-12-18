package com.instagram.creation.photo.edit.tint;

import X.AbstractC111324zv;
import X.AbstractC13560mi;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC53242c7;
import X.AbstractC55164OdS;
import X.C14360o3;
import X.C51978MyM;
import X.C55942hf;
import X.C55952hg;
import X.C55982hj;
import X.C56234Oxh;
import X.EnumC53258Ngw;
import X.InterfaceC57941Pml;
import X.JQ0;
import X.MSW;
import X.P0B;
import X.PMO;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IgTintColorPicker extends FrameLayout implements View.OnTouchListener {
    public int A00;
    public int A01;
    public TextView A02;
    public int A03;
    public Paint A04;
    public InterfaceC57941Pml A05;
    public boolean A06;
    public boolean A07;
    public final C55982hj A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final LayerDrawable A0E;
    public final C55952hg A0F;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgTintColorPicker(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A04.setColor(-65536);
        int width = getWidth();
        int i = this.A0A;
        this.A01 = width / ((i * 2) + 1);
        for (int i2 = 0; i2 < i; i2++) {
            EnumC53258Ngw A0Z = MSW.A0Z(i2);
            C14360o3.A07(A0Z);
            this.A04.setColor(AbstractC55164OdS.A00(getContext(), A0Z, this.A06));
            if (this.A00 == i2) {
                LayerDrawable layerDrawable = this.A0E;
                int i3 = this.A0B;
                int i4 = this.A01;
                int i5 = i4 + (i4 / 2) + (i4 * i2 * 2);
                int A03 = MSW.A03(this);
                int i6 = i3 / 2;
                layerDrawable.setBounds(i5 - i6, A03 - i6, i5 + i6, A03 + i6);
                layerDrawable.draw(canvas);
            } else {
                int i7 = this.A01;
                float f = i7 + (i7 / 2) + (i7 * i2 * 2);
                canvas.drawCircle(f, MSW.A03(this), this.A01 / 2, this.A04);
                if (i2 == 0) {
                    this.A04.setColor(this.A09);
                    float f2 = this.A01 / 3.0f;
                    canvas.drawLine(f + (this.A01 / 3.0f), MSW.A03(this) - f2, f - f2, MSW.A03(this) + (this.A01 / 3.0f), this.A04);
                }
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC57941Pml interfaceC57941Pml;
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = this.A01;
        int width = getWidth() - this.A01;
        int height = view.getHeight();
        float f = i / 2;
        if (x > f && x < r5 + width && y > height / 4) {
            int i2 = (int) ((x - f) / ((width * 1.0f) / this.A0A));
            if (motionEvent.getActionMasked() == A1R) {
                if (i2 == this.A03 && i2 != 0 && (interfaceC57941Pml = this.A05) != null) {
                    C56234Oxh c56234Oxh = ((P0B) interfaceC57941Pml).A00;
                    C55982hj c55982hj = c56234Oxh.A0D;
                    if (c55982hj != null) {
                        c55982hj.A04();
                        IgEditSeekBar igEditSeekBar = c56234Oxh.A0H;
                        if (igEditSeekBar != null) {
                            igEditSeekBar.bringToFront();
                            View view2 = c56234Oxh.A0A;
                            if (view2 != null) {
                                view2.setVisibility(0);
                                View view3 = c56234Oxh.A0A;
                                if (view3 != null) {
                                    view3.bringToFront();
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                this.A03 = i2;
            }
            if (motionEvent.getActionMasked() == 0 && this.A07 && i2 != this.A00) {
                TextView textView = this.A02;
                if (textView != null) {
                    textView.setVisibility(0);
                    TextView textView2 = this.A02;
                    if (textView2 != null) {
                        textView2.setPadding(0, MSW.A03(this) + (this.A01 / 2), 0, 0);
                        postDelayed(new PMO(this), 2500L);
                        this.A07 = false;
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            setCurrentColor(i2);
        }
        return A1R;
    }

    public final void setNux(TextView textView) {
        C14360o3.A0B(textView, 0);
        this.A02 = textView;
    }

    public final void setTintColorPaint(Paint paint) {
        C14360o3.A0B(paint, 0);
        this.A04 = paint;
    }

    private final int getCurrentTintAsValue() {
        return this.A00;
    }

    private final int getLeftBound() {
        return this.A01;
    }

    public final boolean getAdjustingShadows() {
        return this.A06;
    }

    public final Paint getTintColorPaint() {
        return this.A04;
    }

    public final void setAdjustingShadows(boolean z) {
        if (this.A06 != z) {
            EnumC53258Ngw A0Z = MSW.A0Z(this.A00);
            C14360o3.A07(A0Z);
            int A00 = AbstractC55164OdS.A00(getContext(), A0Z, z);
            AbstractC166997dE.A1F(this.A0D, A00);
            AbstractC166997dE.A1F(this.A0C, A00);
            this.A06 = z;
            invalidate();
        }
    }

    public final void setCurrentColor(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            EnumC53258Ngw A0Z = MSW.A0Z(i);
            C14360o3.A07(A0Z);
            int A00 = AbstractC55164OdS.A00(getContext(), A0Z, this.A06);
            AbstractC166997dE.A1F(this.A0D, A00);
            AbstractC166997dE.A1F(this.A0C, A00);
            InterfaceC57941Pml interfaceC57941Pml = this.A05;
            if (interfaceC57941Pml != null) {
                interfaceC57941Pml.DtO(i);
            }
            invalidate();
        }
    }

    public final void setOnTintColorChangeListener(InterfaceC57941Pml interfaceC57941Pml) {
        this.A05 = interfaceC57941Pml;
        if (interfaceC57941Pml != null) {
            interfaceC57941Pml.DtO(this.A00);
        }
    }

    private final int getCenterY() {
        return MSW.A03(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgTintColorPicker(Context context, AttributeSet attributeSet) {
        super(AbstractC53242c7.A0I(context, R.attr.tintPickerStyle), attributeSet);
        C14360o3.A0B(context, 1);
        Resources resources = context.getResources();
        Paint A0R = AbstractC166987dD.A0R();
        this.A04 = A0R;
        A0R.setColor(resources.getColor(R.color.grey_5));
        this.A04.setFlags(1);
        this.A04.setStrokeWidth(AbstractC166987dD.A04(resources, R.dimen.afi_indicator_arrow_margin_top));
        float[] fArr = AbstractC55164OdS.A00;
        this.A0A = EnumC53258Ngw.values().length;
        Context context2 = getContext();
        this.A09 = AbstractC53242c7.A0F(context2, R.attr.tintPickerLineColor);
        Drawable drawable = context2.getDrawable(AbstractC53242c7.A0H(context2, R.attr.tintPickerKnob));
        C14360o3.A0C(drawable, AbstractC111324zv.A00(28));
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        this.A0E = layerDrawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.seek_bar_knob_outer_circle);
        this.A0D = findDrawableByLayerId;
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.seek_bar_knob_inner_circle);
        this.A0C = findDrawableByLayerId2;
        this.A0B = resources.getDimensionPixelSize(AbstractC53242c7.A0H(context2, R.attr.tintPickerSelectedSize));
        int A00 = AbstractC55164OdS.A00(context2, EnumC53258Ngw.A06, this.A06);
        AbstractC166997dE.A1F(findDrawableByLayerId, A00);
        AbstractC166997dE.A1F(findDrawableByLayerId2, A00);
        C55952hg A002 = AbstractC13560mi.A00();
        this.A0F = A002;
        C55942hf A04 = C55942hf.A04(4.0d, 4.0d);
        C55982hj A02 = A002.A02();
        this.A08 = A02;
        A02.A09(A04);
        A02.A0A(new C51978MyM(this, 2));
        this.A07 = true;
        this.A06 = true;
        setOnTouchListener(this);
        setWillNotDraw(false);
    }

    public /* synthetic */ IgTintColorPicker(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
