package com.instagram.ui.widget.triangleshape;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC43592JPx;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C0f9;
import X.C18C;
import X.JZ7;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes8.dex */
public class TriangleShape extends View {
    public View A00;
    public int A01;
    public Paint A02;
    public Paint A03;
    public Path A04;
    public Path A05;
    public JZ7 A06;
    public int[] A07;

    public void setDirection(JZ7 jz7) {
        this.A06 = jz7;
    }

    public void setNotchCenterXOn(View view) {
        this.A00 = view;
    }

    public TriangleShape(Context context) {
        super(context);
        this.A00 = this;
        this.A06 = JZ7.NORTH;
        A00(null);
    }

    private void A00(AttributeSet attributeSet) {
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2O);
        int color = obtainStyledAttributes.getColor(1, -1);
        boolean z = false;
        this.A01 = obtainStyledAttributes.getColor(2, 0);
        int i = 0;
        if (!TextUtils.isEmpty(AbstractC56922jQ.A00(context, obtainStyledAttributes, 0))) {
            int i2 = obtainStyledAttributes.getInt(0, JZ7.NORTH.A00);
            JZ7[] values = JZ7.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (values[i].A00 == i2) {
                    z = true;
                    break;
                }
                i++;
            }
            C18C.A0C("Received unknown direction id %d", i2, z);
            JZ7 jz7 = (JZ7) JZ7.A01.get(i2);
            jz7.getClass();
            this.A06 = jz7;
        }
        obtainStyledAttributes.recycle();
        this.A07 = new int[2];
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A02 = A0S;
        A0S.setColor(color);
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A03 = A0S2;
        A0S2.setColor(this.A01);
        AbstractC43592JPx.A1E(this.A03);
        this.A03.setStrokeWidth(1.0f);
        Path A0T = AbstractC166987dD.A0T();
        this.A04 = A0T;
        Path.FillType fillType = Path.FillType.EVEN_ODD;
        A0T.setFillType(fillType);
        Path A0T2 = AbstractC166987dD.A0T();
        this.A05 = A0T2;
        A0T2.setFillType(fillType);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(-1455847097);
        int height = getHeight();
        this.A00.getLocationInWindow(this.A07);
        int A07 = this.A07[0] + ((int) ((AbstractC166987dD.A07(this.A00) * this.A00.getScaleX()) / 2.0f));
        getLocationInWindow(this.A07);
        int i = A07 - this.A07[0];
        this.A04.reset();
        this.A05.reset();
        JZ7 jz7 = this.A06;
        JZ7 jz72 = JZ7.SOUTH;
        Path path = this.A04;
        float f = i - height;
        if (jz7 == jz72) {
            path.moveTo(f, 0.0f);
            float f2 = i + height;
            this.A04.lineTo(f2, 0.0f);
            float f3 = i;
            float f4 = height;
            this.A04.lineTo(f3, f4);
            if (this.A01 != 0) {
                this.A05.moveTo(0.0f, 0.0f);
                this.A05.lineTo(f, 0.0f);
                this.A05.lineTo(f3, f4);
                this.A05.lineTo(f2, 0.0f);
                this.A05.lineTo(AbstractC13880nE.A0A(getContext()), 0.0f);
            }
        } else {
            float f5 = height;
            path.moveTo(f, f5);
            float f6 = height + i;
            this.A04.lineTo(f6, f5);
            float f7 = i;
            this.A04.lineTo(f7, 0.0f);
            if (this.A01 != 0) {
                this.A05.moveTo(0.0f, f5);
                this.A05.lineTo(f, f5);
                this.A05.lineTo(f7, 0.0f);
                this.A05.lineTo(f6, f5);
                this.A05.lineTo(AbstractC13880nE.A0A(getContext()), f5);
            }
        }
        this.A04.close();
        canvas.drawPath(this.A04, this.A02);
        canvas.drawPath(this.A05, this.A03);
        C0f9.A0A(-238294174, A03);
    }

    public TriangleShape(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = this;
        this.A06 = JZ7.NORTH;
        A00(attributeSet);
    }

    public TriangleShape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = this;
        this.A06 = JZ7.NORTH;
        A00(attributeSet);
    }
}
