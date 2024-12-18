package X;

import java.util.Arrays;

/* renamed from: X.2nJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59182nJ {
    public static final C59182nJ A04 = new C59182nJ(null, 0.0f, true, false);
    public static final C59182nJ A05 = new C59182nJ(null, 0.0f, true, true);
    public final float A00;
    public final boolean A01;
    public final boolean A02;
    public final float[] A03;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls2, cls)) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.options.RoundingOptions");
        C59182nJ c59182nJ = (C59182nJ) obj;
        return this.A02 == c59182nJ.A02 && this.A00 == c59182nJ.A00 && Arrays.equals(this.A03, c59182nJ.A03) && this.A01 == c59182nJ.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RoundingOptions(isCircular=");
        sb.append(this.A02);
        sb.append(MSV.A00(130));
        sb.append(this.A00);
        sb.append(", cornerRadii=");
        sb.append(Arrays.toString(this.A03));
        sb.append(", isAntiAliased=");
        sb.append(this.A01);
        sb.append(", isForceRoundAtDecode=");
        sb.append(false);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int floatToIntBits = ((((i * 31) + Float.floatToIntBits(this.A00)) * 31) + Arrays.hashCode(this.A03)) * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return ((floatToIntBits + i2) * 31) + 1237;
    }

    public C59182nJ(float[] fArr, float f, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = f;
        this.A03 = fArr;
        this.A01 = z2;
    }
}
