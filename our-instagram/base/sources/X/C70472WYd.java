package X;

import android.graphics.RectF;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* renamed from: X.WYd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70472WYd implements C81A {
    public C69197VjQ A00;
    public boolean A01 = false;
    public final C70474WYf A02;

    @Override // X.C81A
    public final void EPl(X9R x9r) {
    }

    @Override // X.C81A
    @Deprecated
    public final boolean Ejv() {
        return false;
    }

    @Override // X.C81A
    public final Integer BIA() {
        return C05F.A0N;
    }

    @Override // X.C81A
    public final boolean DCH(C201278vB c201278vB, long j) {
        android.net.Uri A03;
        if (!this.A01) {
            C69197VjQ c69197VjQ = this.A00;
            float[] fArr = new float[4];
            Matrix.multiplyMV(fArr, 0, c201278vB.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
            float f = fArr[1];
            float[] fArr2 = new float[4];
            Matrix.multiplyMV(fArr2, 0, c201278vB.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
            float f2 = fArr2[1];
            float f3 = 1.0f - f;
            float abs = Math.abs(1.0f - (-1.0f));
            float f4 = (f3 / abs) + (0.0f * f2);
            float f5 = (c69197VjQ.A00 * f2) + f4;
            float f6 = ((0.0f * abs) - 1.0f) + 0.0f;
            float f7 = ((1.0f - f4) * abs) - 1.0f;
            float f8 = (((0.0f + 1.0f) * abs) - 1.0f) + 0.0f;
            float f9 = ((1.0f - f5) * abs) - 1.0f;
            C70474WYf c70474WYf = this.A02;
            String str = c69197VjQ.A02;
            if (str == null) {
                A03 = null;
            } else {
                A03 = AbstractC08820cl.A03(str);
            }
            android.net.Uri uri = c70474WYf.A03;
            if (uri == null || !uri.equals(A03)) {
                C70474WYf.A00(c70474WYf, AbstractC25229BEm.A1Z(A03));
                c70474WYf.A08.A00 = A03;
                c70474WYf.A03 = A03;
            }
            float[] fArr3 = VYH.A00;
            fArr3[0] = f6;
            fArr3[1] = f9;
            fArr3[2] = f8;
            fArr3[3] = f9;
            fArr3[4] = f6;
            fArr3[5] = f7;
            fArr3[6] = f8;
            fArr3[7] = f7;
            c70474WYf.A08.A02 = fArr3;
            FloatBuffer floatBuffer = c70474WYf.A0G.A01;
            floatBuffer.put(fArr3);
            floatBuffer.position(0);
            this.A01 = true;
        }
        return this.A02.DCH(c201278vB, j);
    }

    @Override // X.C81A
    public final void Dr7(C179877yd c179877yd) {
        this.A02.Dr7(c179877yd);
    }

    @Override // X.C81A
    public final void Dr8(RectF rectF) {
        this.A02.Dr8(rectF);
    }

    @Override // X.C81A
    public final void DrA() {
        this.A02.DrA();
    }

    @Override // X.C81A
    public final boolean isEnabled() {
        return this.A02.isEnabled();
    }

    public C70472WYd(XC9 xc9, C69197VjQ c69197VjQ) {
        android.net.Uri uri;
        String str;
        if (c69197VjQ != null && (str = c69197VjQ.A02) != null) {
            uri = AbstractC08820cl.A03(str);
        } else {
            uri = null;
        }
        C70474WYf c70474WYf = new C70474WYf(uri, xc9);
        this.A02 = c70474WYf;
        if (c69197VjQ == null) {
            android.net.Uri uri2 = c70474WYf.A03;
            if (uri2 != null && uri2.equals(null)) {
                return;
            }
            C70474WYf.A00(c70474WYf, true);
            c70474WYf.A08.A00 = null;
            c70474WYf.A03 = null;
            return;
        }
        this.A00 = c69197VjQ;
    }

    @Override // X.C81A
    public final void Dr3(int i, int i2) {
    }
}
