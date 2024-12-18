package X;

import android.graphics.Paint;

/* loaded from: classes10.dex */
public final class Q9l extends AbstractC58791Q9m {
    public SFF A09;
    public SFF A0A;
    public int[] A0B;
    public float A03 = 0.0f;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public float A06 = 0.0f;
    public float A04 = 1.0f;
    public float A05 = 0.0f;
    public Paint.Cap A07 = Paint.Cap.BUTT;
    public Paint.Join A08 = Paint.Join.MITER;
    public float A02 = 4.0f;

    public float getFillAlpha() {
        return this.A00;
    }

    public int getFillColor() {
        return this.A09.A00;
    }

    public float getStrokeAlpha() {
        return this.A01;
    }

    public int getStrokeColor() {
        return this.A0A.A00;
    }

    public float getStrokeWidth() {
        return this.A03;
    }

    public float getTrimPathEnd() {
        return this.A04;
    }

    public float getTrimPathOffset() {
        return this.A05;
    }

    public float getTrimPathStart() {
        return this.A06;
    }

    public void setFillColor(int i) {
        this.A09.A00 = i;
    }

    public void setStrokeColor(int i) {
        this.A0A.A00 = i;
    }

    public void setFillAlpha(float f) {
        this.A00 = f;
    }

    public void setStrokeAlpha(float f) {
        this.A01 = f;
    }

    public void setStrokeWidth(float f) {
        this.A03 = f;
    }

    public void setTrimPathEnd(float f) {
        this.A04 = f;
    }

    public void setTrimPathOffset(float f) {
        this.A05 = f;
    }

    public void setTrimPathStart(float f) {
        this.A06 = f;
    }
}
