package com.instagram.ui.widget.edittext;

import X.AbstractC13620mo;
import X.AbstractC166987dD;
import X.AbstractC25230BEn;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.C0f9;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* loaded from: classes8.dex */
public class ConfirmationCodeEditText extends EditText {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public BroadcastReceiver A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public int A0B;
    public Paint A0C;
    public Paint A0D;
    public Paint A0E;
    public Paint A0F;
    public final Runnable A0G;

    private void A00() {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A03)});
        setBackground(null);
        setCursorVisible(false);
        setInputType(2);
        if (AbstractC13620mo.A02(getContext())) {
            setLayoutDirection(1);
            setTextDirection(2);
        }
    }

    private void A02(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0K);
            this.A01 = obtainStyledAttributes.getDimension(2, getResources().getDimension(R.dimen.clips_template_landing_page_template_preview_clip_index_text_size));
            this.A03 = obtainStyledAttributes.getInt(1, 6);
            this.A09 = obtainStyledAttributes.getBoolean(3, false);
            this.A06 = obtainStyledAttributes.getBoolean(0, false);
            this.A02 = 0;
        }
        A00();
        A01();
    }

    public final void A04(int i, boolean z) {
        float f;
        this.A03 = i;
        this.A09 = z;
        int i2 = this.A04;
        if (z) {
            f = i2 / (i + 0.5f);
        } else {
            f = i2 / i;
        }
        this.A00 = f;
        A00();
        invalidate();
    }

    public final void A05(Integer num, Integer num2, boolean z, boolean z2) {
        float dimension;
        int i;
        if (num != null) {
            dimension = num.intValue();
        } else {
            dimension = getResources().getDimension(R.dimen.clips_template_landing_page_template_preview_clip_index_text_size);
        }
        this.A01 = dimension;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 6;
        }
        this.A03 = i;
        this.A09 = z;
        this.A06 = z2;
        this.A02 = 0;
        A00();
        A01();
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        if (this.A07) {
            return 0;
        }
        return super.getAutofillType();
    }

    public int getMaximumSize() {
        return this.A03;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        boolean A02 = AbstractC13620mo.A02(getContext());
        if (A02) {
            f = this.A04 - (this.A00 / 2.0f);
        } else {
            f = this.A00 / 2.0f;
        }
        float f2 = this.A0A - 8;
        float descent = (r1 / 2) - ((this.A0F.descent() + this.A0F.ascent()) / 2.0f);
        Editable text = getText();
        int length = text.length();
        boolean A1S = AbstractC25230BEn.A1S(this.A0B, length);
        if (!this.A08 && !A1S) {
            i = length - 1;
        } else {
            i = length;
        }
        this.A0B = length;
        int i2 = 0;
        if (this.A02 != 1) {
            while (true) {
                int i3 = this.A03;
                if (i2 >= i3) {
                    break;
                }
                if (this.A09 && i2 == i3 / 2) {
                    float f3 = this.A00 / 2.0f;
                    if (A02) {
                        f -= f3;
                    } else {
                        f += f3;
                    }
                }
                if (this.A06 && i2 < i) {
                    canvas.drawCircle(f, f2 - (this.A0A / 4), 8.0f, this.A0D);
                } else if (i2 < length) {
                    canvas.drawText(Character.toString(text.charAt(i2)), f, f2, this.A0F);
                    if (this.A06) {
                        postDelayed(this.A0G, 750L);
                    }
                } else {
                    float f4 = this.A00 / 4.0f;
                    canvas.drawLine(f - f4, f2, f + f4, f2, this.A0E);
                }
                float f5 = this.A00;
                if (A02) {
                    f -= f5;
                } else {
                    f += f5;
                }
                i2++;
            }
        } else {
            while (true) {
                int i4 = this.A03;
                if (i2 >= i4) {
                    break;
                }
                if (this.A09 && i2 == i4 / 2) {
                    float f6 = this.A00 / 2.0f;
                    if (A02) {
                        f -= f6;
                    } else {
                        f += f6;
                    }
                }
                if (this.A06 && i2 < i) {
                    canvas.drawCircle(f, (f2 - (this.A0A / 2)) + 8.0f, 8.0f, this.A0D);
                } else if (i2 < length) {
                    canvas.drawText(Character.toString(text.charAt(i2)), f, descent, this.A0F);
                    if (this.A06) {
                        postDelayed(this.A0G, 750L);
                    }
                }
                float f7 = this.A00 / 2.5f;
                canvas.drawRoundRect(new RectF(f - f7, (f2 - this.A0A) + 16.0f, f7 + f, f2), 12.0f, 12.0f, this.A0C);
                float f8 = this.A00;
                if (A02) {
                    f -= f8;
                } else {
                    f += f8;
                }
                i2++;
            }
        }
        this.A08 = false;
    }

    public void setDisableAutofill(boolean z) {
        this.A07 = z;
    }

    public void setFrameStyle(int i) {
        this.A02 = i;
    }

    public ConfirmationCodeEditText(Context context) {
        super(context);
        this.A0G = new Runnable() { // from class: X.M2R
            @Override // java.lang.Runnable
            public final void run() {
                ConfirmationCodeEditText confirmationCodeEditText = ConfirmationCodeEditText.this;
                confirmationCodeEditText.A08 = true;
                confirmationCodeEditText.postInvalidate();
            }
        };
        this.A05 = null;
        this.A07 = false;
        A00();
        A01();
    }

    private void A01() {
        Paint A0R = AbstractC166987dD.A0R();
        this.A0F = A0R;
        A0R.setTextSize(this.A01);
        this.A0F.setAntiAlias(true);
        this.A0F.setTextAlign(Paint.Align.CENTER);
        Paint paint = this.A0F;
        Context context = getContext();
        AbstractC166987dD.A1N(context, paint, AbstractC53242c7.A07(context));
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A0E = A0R2;
        Paint.Style style = Paint.Style.STROKE;
        A0R2.setStyle(style);
        this.A0E.setStrokeWidth(8.0f);
        AbstractC166987dD.A1N(context, this.A0E, AbstractC53242c7.A07(context));
        Paint A0R3 = AbstractC166987dD.A0R();
        this.A0C = A0R3;
        A0R3.setStyle(style);
        this.A0C.setStrokeWidth(8.0f);
        AbstractC166987dD.A1N(context, this.A0C, AbstractC53242c7.A09(context));
        Paint A0R4 = AbstractC166987dD.A0R();
        this.A0D = A0R4;
        AbstractC166987dD.A1R(A0R4);
        AbstractC166987dD.A1N(context, this.A0D, AbstractC53242c7.A07(context));
    }

    public static int[] A03(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int i3 = (int) (Resources.getSystem().getDisplayMetrics().density * 252.0f);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(i3, size);
            } else {
                size = i3;
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int i4 = (int) (Resources.getSystem().getDisplayMetrics().density * 40.0f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i4, size2);
            } else {
                size2 = i4;
            }
        }
        return new int[]{size, size2};
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(75124302);
        super.onDetachedFromWindow();
        this.A08 = true;
        removeCallbacks(this.A0G);
        C0f9.A0D(-1045458131, A06);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int A06 = C0f9.A06(1159419816);
        int[] A03 = A03(i, i2);
        setMeasuredDimension(A03[0], A03[1]);
        C0f9.A0D(-1191683879, A06);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        int A06 = C0f9.A06(874948578);
        super.onSizeChanged(i, i2, i3, i4);
        this.A04 = i;
        this.A0A = i2;
        if (this.A09) {
            f = i / (this.A03 + 0.5f);
        } else {
            f = i / this.A03;
        }
        this.A00 = f;
        C0f9.A0D(-285740953, A06);
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0G = new Runnable() { // from class: X.M2R
            @Override // java.lang.Runnable
            public final void run() {
                ConfirmationCodeEditText confirmationCodeEditText = ConfirmationCodeEditText.this;
                confirmationCodeEditText.A08 = true;
                confirmationCodeEditText.postInvalidate();
            }
        };
        this.A05 = null;
        this.A07 = false;
        A02(attributeSet);
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0G = new Runnable() { // from class: X.M2R
            @Override // java.lang.Runnable
            public final void run() {
                ConfirmationCodeEditText confirmationCodeEditText = ConfirmationCodeEditText.this;
                confirmationCodeEditText.A08 = true;
                confirmationCodeEditText.postInvalidate();
            }
        };
        this.A05 = null;
        this.A07 = false;
        A02(attributeSet);
    }
}
