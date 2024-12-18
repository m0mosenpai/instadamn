package X;

import android.graphics.RectF;

/* renamed from: X.5NO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NO implements Comparable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A0C - ((C5NO) obj).A0C;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C5NO) && this.A0C == ((C5NO) obj).A0C) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A0C;
    }

    public C5NO(RectF rectF, float f, int i, int i2, int i3) {
        this(rectF.centerX(), rectF.centerY(), rectF.width(), rectF.height(), f, i, i2, i3);
    }

    public C5NO(float f, float f2, float f3, float f4, float f5, int i, int i2, int i3) {
        this.A0B = i;
        float round = Math.round(f);
        this.A00 = round;
        float round2 = Math.round(f2);
        this.A01 = round2;
        float round3 = Math.round(f3);
        this.A0A = round3;
        float round4 = Math.round(f4);
        this.A02 = round4;
        float f6 = i2;
        this.A03 = round / f6;
        float f7 = i3;
        this.A05 = round2 / f7;
        this.A04 = f / f6;
        this.A06 = f2 / f7;
        this.A08 = round3 / f6;
        this.A07 = round4 / f7;
        this.A0C = 0;
        this.A09 = f5;
    }

    public C5NO() {
    }
}
