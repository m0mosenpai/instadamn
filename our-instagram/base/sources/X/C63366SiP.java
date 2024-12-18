package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.SiP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C63366SiP {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public PointF A05;
    public PointF A06;
    public Float A07;
    public Object A08;
    public float A09;
    public final float A0A;
    public final Interpolator A0B;
    public final Interpolator A0C;
    public final Interpolator A0D;
    public final Object A0E;
    public final SQ2 A0F;

    public final float A01() {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            return 1.0f;
        }
        float f = this.A09;
        if (f == Float.MIN_VALUE) {
            Float f2 = this.A07;
            if (f2 == null) {
                this.A09 = 1.0f;
                return 1.0f;
            }
            float A02 = A02() + ((f2.floatValue() - this.A0A) / (sq2.A00 - sq2.A03));
            this.A09 = A02;
            return A02;
        }
        return f;
    }

    public final float A02() {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            return 0.0f;
        }
        float f = this.A01;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float f2 = this.A0A;
        float f3 = sq2.A03;
        float f4 = (f2 - f3) / (sq2.A00 - f3);
        this.A01 = f4;
        return f4;
    }

    public final boolean A03() {
        if (this.A0B == null && this.A0C == null && this.A0D == null) {
            return true;
        }
        return false;
    }

    public C63366SiP(Object obj, Object obj2) {
        float A00 = A00(this);
        this.A09 = A00;
        this.A05 = null;
        this.A06 = null;
        this.A0F = null;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = A00;
        this.A07 = Float.valueOf(Float.MAX_VALUE);
    }

    public static float A00(C63366SiP c63366SiP) {
        c63366SiP.A02 = -3987645.8f;
        c63366SiP.A00 = -3987645.8f;
        c63366SiP.A04 = 784923401;
        c63366SiP.A03 = 784923401;
        c63366SiP.A01 = Float.MIN_VALUE;
        return Float.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Keyframe{startValue=");
        A1C.append(this.A0E);
        A1C.append(", endValue=");
        A1C.append(this.A08);
        A1C.append(", startFrame=");
        A1C.append(this.A0A);
        A1C.append(", endFrame=");
        A1C.append(this.A07);
        A1C.append(", interpolator=");
        return AbstractC58320PtC.A11(this.A0B, A1C);
    }

    public C63366SiP(Object obj) {
        float A00 = A00(this);
        this.A09 = A00;
        this.A05 = null;
        this.A06 = null;
        this.A0F = null;
        this.A0E = obj;
        this.A08 = obj;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = A00;
        this.A07 = Float.valueOf(Float.MAX_VALUE);
    }

    public C63366SiP(Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, SQ2 sq2, Float f, Object obj, Object obj2, float f2) {
        this.A09 = A00(this);
        this.A05 = null;
        this.A06 = null;
        this.A0F = sq2;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = interpolator;
        this.A0C = interpolator2;
        this.A0D = interpolator3;
        this.A0A = f2;
        this.A07 = f;
    }

    public C63366SiP(Interpolator interpolator, SQ2 sq2, Float f, Object obj, Object obj2, float f2) {
        this.A09 = A00(this);
        this.A05 = null;
        this.A06 = null;
        this.A0F = sq2;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = interpolator;
        this.A0C = null;
        this.A0D = null;
        this.A0A = f2;
        this.A07 = f;
    }

    public C63366SiP(Interpolator interpolator, Interpolator interpolator2, SQ2 sq2, Object obj, Object obj2, float f) {
        this.A09 = A00(this);
        this.A05 = null;
        this.A06 = null;
        this.A0F = sq2;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = null;
        this.A0C = interpolator;
        this.A0D = interpolator2;
        this.A0A = f;
        this.A07 = null;
    }
}
