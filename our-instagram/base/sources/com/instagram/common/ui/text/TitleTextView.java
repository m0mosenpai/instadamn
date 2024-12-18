package com.instagram.common.ui.text;

import X.AbstractC14710oj;
import X.AbstractC15960qq;
import X.AbstractC215613i;
import X.AbstractC55922hc;
import X.AbstractC692839o;
import X.AbstractC74463Wd;
import X.C0f9;
import X.C11X;
import X.C13680mu;
import X.C2UX;
import X.C3WF;
import X.C3We;
import X.EnumC15950qp;
import X.InterfaceC56852jJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Locale;

@Deprecated
/* loaded from: classes2.dex */
public class TitleTextView extends C3WF implements InterfaceC56852jJ {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Context A04;
    public boolean A05;
    public boolean A06;
    public final Paint A07;

    public TitleTextView(Context context) {
        super(context, null);
        this.A06 = true;
        this.A07 = getPaint();
        this.A01 = 0.0f;
        this.A03 = 0;
        this.A00 = 0.0f;
        this.A02 = 0;
        this.A05 = true;
        A00(context, null, 0);
    }

    private void setTextColorOnDraw(int i) {
        this.A05 = false;
        setTextColor(i);
        this.A05 = true;
    }

    private void A00(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        Typeface A02;
        this.A04 = context;
        boolean z2 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2J, i, 0);
        boolean z3 = true;
        if (obtainStyledAttributes.hasValue(6)) {
            z = !obtainStyledAttributes.getBoolean(6, true);
        } else {
            z = true;
        }
        if (obtainStyledAttributes.hasValue(4)) {
            z3 = obtainStyledAttributes.getBoolean(4, true);
        }
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setHint(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setImeActionLabel(context.getText(resourceId3), getImeActionId());
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId4 != 0) {
            setText(context.getText(resourceId4));
        }
        if (C2UX.A01) {
            if (obtainStyledAttributes.hasValue(7)) {
                z2 = obtainStyledAttributes.getBoolean(7, false);
            }
            this.A06 = z2;
        }
        obtainStyledAttributes.recycle();
        if (AbstractC14710oj.A08()) {
            if (z) {
                A02 = AbstractC14710oj.A01(context);
            } else {
                A02 = AbstractC14710oj.A02(context);
            }
            setTypeface(A02);
        } else {
            setIsBold(z);
        }
        setIsCapitalized(z3);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            float f = this.A00;
            if (f > 0.0f) {
                this.A07.setShadowLayer(f, 0.0f, 0.0f, this.A02);
                super.onDraw(canvas);
            }
            if (this.A01 > 0.0f) {
                int currentTextColor = getCurrentTextColor();
                Paint paint = this.A07;
                paint.setStyle(Paint.Style.STROKE);
                setTextColorOnDraw(this.A03);
                paint.setStrokeWidth(this.A01);
                paint.setStrokeJoin(Paint.Join.ROUND);
                super.onDraw(canvas);
                paint.setStyle(Paint.Style.FILL);
                setTextColorOnDraw(currentTextColor);
            }
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            if (!C13680mu.A06(this, getText())) {
                throw e;
            }
        }
    }

    public void setIsCapitalized(boolean z) {
        C3We c3We;
        if (z) {
            Locale locale = getResources().getConfiguration().locale;
            C3We c3We2 = C3We.A01;
            if (c3We2 == null || !c3We2.A00.equals(locale)) {
                C3We.A01 = new C3We(locale);
            }
            c3We = C3We.A01;
        } else {
            c3We = null;
        }
        setTransformationMethod(c3We);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.A06) {
            charSequence = AbstractC692839o.A00(this, charSequence);
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public final void invalidate() {
        int A03 = C0f9.A03(1648149097);
        if (this.A05) {
            super.invalidate();
            this.A05 = true;
        }
        C0f9.A0A(707252735, A03);
    }

    public void setIsBold(boolean z) {
        Typeface typeface;
        if (AbstractC14710oj.A08()) {
            Context context = this.A04;
            if (z) {
                typeface = AbstractC14710oj.A01(context);
            } else {
                typeface = AbstractC14710oj.A02(context);
            }
        } else if (!AbstractC74463Wd.A00.contains(((AbstractC215613i) C11X.A00().A01()).A00.getConfiguration().locale.getLanguage())) {
            if (z) {
                typeface = AbstractC15960qq.A00(this.A04).A02(EnumC15950qp.A13);
            } else {
                typeface = null;
            }
        } else {
            getPaint().setFakeBoldText(z);
            return;
        }
        setTypeface(typeface);
    }

    public void setShadowColor(int i) {
        this.A02 = i;
    }

    public void setShadowRadius(float f) {
        this.A00 = f;
    }

    public void setStrokeColor(int i) {
        this.A03 = i;
    }

    public void setStrokeWidth(float f) {
        this.A01 = f;
    }

    @Override // X.InterfaceC56852jJ
    public void setTransformText(boolean z) {
        this.A06 = z;
    }

    public TitleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = true;
        this.A07 = getPaint();
        this.A01 = 0.0f;
        this.A03 = 0;
        this.A00 = 0.0f;
        this.A02 = 0;
        this.A05 = true;
        A00(context, attributeSet, i);
    }

    public TitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = true;
        this.A07 = getPaint();
        this.A01 = 0.0f;
        this.A03 = 0;
        this.A00 = 0.0f;
        this.A02 = 0;
        this.A05 = true;
        A00(context, attributeSet, 0);
    }
}
