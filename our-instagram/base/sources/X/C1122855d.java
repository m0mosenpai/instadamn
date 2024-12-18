package X;

import android.opengl.Matrix;
import com.facebook.common.math.matrix.Matrix4;

/* renamed from: X.55d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1122855d {
    public static final float[] A0B = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public float A01;
    public float A04;
    public float A05;
    public int A06;
    public boolean A07;
    public final boolean A09;
    public final boolean A0A;
    public final Matrix4 A08 = new Matrix4();
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public float A00 = 1.0f;

    public static final void A00(C1122855d c1122855d) {
        Matrix4 matrix4 = c1122855d.A08;
        Matrix.setIdentityM(matrix4.A01, 0);
        float f = 0.5f;
        if (c1122855d.A0A) {
            f = 0.0f;
        }
        matrix4.A03(f, f, 0.0f);
        float f2 = 1.0f;
        if (c1122855d.A07) {
            f2 = -1.0f;
        }
        int i = c1122855d.A06 % 180;
        float f3 = c1122855d.A00;
        if (i == 0) {
            matrix4.A02(f2, f3 * 1.0f);
        } else {
            matrix4.A02(f3, f2 * 1.0f);
        }
        matrix4.A01(c1122855d.A01);
        matrix4.A02(1.0f / c1122855d.A02, 1.0f / (c1122855d.A00 * c1122855d.A03));
        matrix4.A03((-c1122855d.A04) * c1122855d.A02, c1122855d.A05 * c1122855d.A03, 0.0f);
        if (c1122855d.A09) {
            matrix4.A05(A0B);
        }
        float f4 = -f;
        matrix4.A03(f4, f4, 0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n  # translationX=");
        sb.append(this.A04);
        sb.append("\n  # translationY=");
        sb.append(this.A05);
        sb.append("\n  # scaleX=");
        sb.append(this.A02);
        sb.append("\n  # scaleY=");
        sb.append(this.A03);
        sb.append("\n  # rotateZ=");
        sb.append(this.A01);
        sb.append("\n  # mediaAspectRatio=");
        sb.append(this.A00);
        sb.append("\n  # orientation=");
        sb.append(this.A06);
        sb.append("\n  # isMirrored=");
        sb.append(this.A07);
        sb.append("\n  ");
        return AbstractC16490ru.A0q(sb.toString(), "#");
    }

    public C1122855d(boolean z, boolean z2) {
        this.A0A = z;
        this.A09 = z2;
        A00(this);
    }
}
