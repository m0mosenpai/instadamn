package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.util.concurrent.Semaphore;

/* loaded from: classes11.dex */
public final class WIK implements SurfaceTexture.OnFrameAvailableListener {
    public final int A00;
    public final Object A01;

    public WIK(C69716VuB c69716VuB, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = c69716VuB;
        } else {
            this.A01 = c69716VuB;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C69796Vvg c69796Vvg;
        C176507t8 c176507t8;
        switch (this.A00) {
            case 0:
                W4Z w4z = (W4Z) this.A01;
                if (w4z.A03.A03() || !w4z.A04.A03(null)) {
                    return;
                }
                W4Z.A00(w4z, w4z.A01);
                W4Z.A00(w4z, w4z.A00);
                return;
            case 1:
                C69716VuB c69716VuB = (C69716VuB) this.A01;
                W68 w68 = c69716VuB.A03;
                if (w68.A03()) {
                    return;
                }
                C70127W5n c70127W5n = c69716VuB.A05;
                if (!c70127W5n.A03(null)) {
                    return;
                }
                C70127W5n c70127W5n2 = c69716VuB.A04;
                if (!c70127W5n2.A03(null) || (c69796Vvg = c69716VuB.A00) == null || (c176507t8 = c69796Vvg.A00) == null) {
                    return;
                }
                synchronized (c176507t8) {
                    if (c176507t8.A04()) {
                        try {
                            c69796Vvg.A02();
                            WFK wfk = c69716VuB.A06;
                            int i = c70127W5n.A00;
                            float[] fArr = c70127W5n.A01;
                            int i2 = c70127W5n.A07;
                            int i3 = c70127W5n.A06;
                            int i4 = c70127W5n2.A00;
                            float[] fArr2 = c70127W5n2.A01;
                            int i5 = c70127W5n2.A07;
                            int i6 = c70127W5n2.A06;
                            boolean z = c69716VuB.A07;
                            int i7 = c70127W5n2.A05;
                            int i8 = c70127W5n2.A04;
                            int A01 = c69796Vvg.A01();
                            int A00 = c69796Vvg.A00();
                            if (wfk.A00 != null) {
                                GLES20.glViewport(0, 0, A01, A00);
                                synchronized (wfk) {
                                    if (A01 != 0 && A00 != 0 && i5 != 0 && i6 != 0) {
                                        if (wfk.A0A || wfk.A09 != A01 || wfk.A08 != A00 || wfk.A07 != i5 || wfk.A06 != i6) {
                                            float f = A00 / A01;
                                            wfk.A09 = A01;
                                            wfk.A08 = A00;
                                            wfk.A07 = i5;
                                            wfk.A06 = i6;
                                            wfk.A0A = false;
                                            float[] fArr3 = wfk.A01;
                                            Matrix.setIdentityM(fArr3, 0);
                                            Matrix.translateM(fArr3, 0, 0.5f, 0.5f, 0.0f);
                                            Matrix.scaleM(fArr3, 0, ((i6 / i5) * f) / (wfk.A05 * f), 1.0f / wfk.A05, 1.0f);
                                            Matrix.rotateM(fArr3, 0, wfk.A04, 0.0f, 0.0f, 1.0f);
                                            Matrix.scaleM(fArr3, 0, 1.0f / f, 1.0f, 1.0f);
                                            Matrix.translateM(fArr3, 0, wfk.A02 - 0.5f, wfk.A03 - 0.5f, 0.0f);
                                        }
                                    }
                                }
                                C69326VlY c69326VlY = wfk.A00;
                                float[] fArr4 = WFK.A0D;
                                float[] fArr5 = wfk.A01;
                                int i9 = (int) (i7 * wfk.A05);
                                int i10 = (int) (i8 * wfk.A05);
                                WFK.A02("draw start");
                                GLES20.glUseProgram(c69326VlY.A00);
                                WFK.A02("glUseProgram");
                                C69626VsT c69626VsT = c69326VlY.A05;
                                c69626VsT.A00(fArr, fArr4, i2, i3, 0.0f, i, true);
                                C69626VsT c69626VsT2 = c69326VlY.A04;
                                float f2 = i9;
                                c69626VsT2.A00(fArr2, fArr5, f2, i10, f2 * 0.04f, i4, z);
                                int i11 = c69326VlY.A01;
                                GLES20.glEnableVertexAttribArray(i11);
                                WFK.A02("glEnableVertexAttribArray");
                                GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) WFK.A0B);
                                WFK.A02("glVertexAttribPointer");
                                int i12 = c69326VlY.A02;
                                GLES20.glEnableVertexAttribArray(i12);
                                WFK.A02("glEnableVertexAttribArray");
                                GLES20.glVertexAttribPointer(i12, 2, 5126, false, 8, (Buffer) WFK.A0C);
                                WFK.A02("glVertexAttribPointer");
                                GLES20.glUniform2f(c69326VlY.A03, A01, A00);
                                WFK.A02("glUniform2f");
                                try {
                                    GLES20.glDrawArrays(5, 0, 4);
                                    WFK.A02("glDrawArrays");
                                } catch (RuntimeException unused) {
                                }
                                GLES20.glDisableVertexAttribArray(i11);
                                GLES20.glDisableVertexAttribArray(i12);
                                GLES20.glActiveTexture(c69626VsT.A00 + 33984);
                                GLES20.glBindTexture(36197, 0);
                                GLES20.glActiveTexture(c69626VsT2.A00 + 33984);
                                GLES20.glBindTexture(36197, 0);
                                GLES20.glUseProgram(0);
                            }
                            c69796Vvg.A05(c70127W5n.A08);
                            c69796Vvg.A04();
                        } catch (RuntimeException unused2) {
                        } catch (Throwable th) {
                            w68.A01();
                            throw th;
                        }
                        w68.A01();
                    }
                }
                return;
            case 2:
                ((C69716VuB) this.A01).A07 = true;
                return;
            case 3:
                ((W3I) this.A01).A06.obtainMessage(2).sendToTarget();
                return;
            default:
                Semaphore semaphore = ((C69470Vnt) this.A01).A0B;
                if (semaphore.availablePermits() == 0) {
                    semaphore.release();
                    return;
                }
                return;
        }
    }

    public WIK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
