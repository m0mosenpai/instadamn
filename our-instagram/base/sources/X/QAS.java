package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes10.dex */
public final class QAS extends AbstractC63675Sri {
    public QAV A00;
    public final C003501a A01;
    public final C003501a A02;
    public final AbstractC63308ShE A03;
    public final AbstractC63308ShE A04;
    public final AbstractC63308ShE A05;
    public final int A06;
    public final RectF A07;
    public final Integer A08;
    public final String A09;
    public final boolean A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QAS(X.Q2O r13, X.C63691Sry r14, X.AbstractC63678Srl r15) {
        /*
            r12 = this;
            java.lang.Integer r0 = r14.A07
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L9b
            r0 = 1
            if (r1 == r0) goto L97
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        Le:
            java.lang.Integer r0 = r14.A09
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L94
            r0 = 0
            if (r1 == r0) goto L91
            r0 = 1
            if (r1 == r0) goto L8e
            r4 = 0
        L1e:
            float r11 = r14.A00
            X.QAi r8 = r14.A04
            X.QAg r6 = r14.A02
            java.util.List r10 = r14.A0B
            X.QAg r7 = r14.A01
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.01a r0 = new X.01a
            r0.<init>()
            r12.A01 = r0
            X.01a r0 = new X.01a
            r0.<init>()
            r12.A02 = r0
            android.graphics.RectF r0 = X.AbstractC166987dD.A0X()
            r12.A07 = r0
            java.lang.String r0 = r14.A0A
            r12.A09 = r0
            java.lang.Integer r0 = r14.A08
            r12.A08 = r0
            boolean r0 = r14.A0C
            r12.A0A = r0
            X.SQ2 r0 = r13.A0F
            float r1 = r0.A00()
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            r12.A06 = r0
            X.QAh r0 = r14.A03
            java.util.List r1 = r0.A00
            X.QAa r0 = new X.QAa
            r0.<init>(r1)
            r12.A03 = r0
            r0.A09(r12)
            r15.A0C(r0)
            X.QAj r0 = r14.A06
            java.util.List r1 = r0.A00
            X.QAd r0 = new X.QAd
            r0.<init>(r1)
            r12.A05 = r0
            r0.A09(r12)
            r15.A0C(r0)
            X.QAj r0 = r14.A05
            java.util.List r1 = r0.A00
            X.QAd r0 = new X.QAd
            r0.<init>(r1)
            r12.A04 = r0
            r0.A09(r12)
            r15.A0C(r0)
            return
        L8e:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L1e
        L91:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L1e
        L94:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L1e
        L97:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto Le
        L9b:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QAS.<init>(X.Q2O, X.Sry, X.Srl):void");
    }

    private int A00() {
        float f = this.A05.A02;
        float f2 = this.A06;
        int A0A = AbstractC166987dD.A0A(f, f2);
        int A0A2 = AbstractC166987dD.A0A(this.A04.A02, f2);
        int A0A3 = AbstractC166987dD.A0A(this.A03.A02, f2);
        int i = 17;
        if (A0A != 0) {
            i = 527 * A0A;
        }
        if (A0A2 != 0) {
            i = i * 31 * A0A2;
        }
        if (A0A3 != 0) {
            return i * 31 * A0A3;
        }
        return i;
    }

    private int[] A01(int[] iArr) {
        QAV qav = this.A00;
        if (qav != null) {
            Integer[] numArr = (Integer[]) qav.A06();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i < length2) {
                    iArr[i] = MSW.A07(numArr, i);
                    i++;
                }
            } else {
                while (i < length) {
                    iArr[i] = MSW.A07(numArr, i);
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // X.AbstractC63675Sri, X.InterfaceC65628Tpp
    public final void AQR(Canvas canvas, Matrix matrix, int i) {
        C003501a c003501a;
        long j;
        Shader shader;
        if (!this.A0A) {
            Aho(matrix, this.A07, false);
            Integer num = this.A08;
            Integer num2 = C05F.A00;
            int A00 = A00();
            if (num == num2) {
                c003501a = this.A01;
                j = A00;
                shader = (Shader) c003501a.A05(j);
                if (shader == null) {
                    PointF A03 = AbstractC63308ShE.A03(this.A05);
                    PointF A032 = AbstractC63308ShE.A03(this.A04);
                    SOT sot = (SOT) this.A03.A06();
                    shader = new LinearGradient(A03.x, A03.y, A032.x, A032.y, A01(sot.A01), sot.A00, Shader.TileMode.CLAMP);
                    c003501a.A09(j, shader);
                }
                shader.setLocalMatrix(matrix);
                super.A04.setShader(shader);
                super.AQR(canvas, matrix, i);
            }
            c003501a = this.A02;
            j = A00;
            shader = (Shader) c003501a.A05(j);
            if (shader == null) {
                PointF A033 = AbstractC63308ShE.A03(this.A05);
                PointF A034 = AbstractC63308ShE.A03(this.A04);
                SOT sot2 = (SOT) this.A03.A06();
                int[] A01 = A01(sot2.A01);
                float[] fArr = sot2.A00;
                shader = new RadialGradient(A033.x, A033.y, (float) Math.hypot(A034.x - r10, A034.y - r11), A01, fArr, Shader.TileMode.CLAMP);
                c003501a.A09(j, shader);
            }
            shader.setLocalMatrix(matrix);
            super.A04.setShader(shader);
            super.AQR(canvas, matrix, i);
        }
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A09;
    }

    @Override // X.AbstractC63675Sri, X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        super.AAj(c62961SZe, obj);
        if (obj == InterfaceC65609To0.A0f) {
            QAV qav = this.A00;
            if (qav != null) {
                this.A0G.A0M.remove(qav);
            }
            if (c62961SZe == null) {
                this.A00 = null;
                return;
            }
            QAV A00 = QAV.A00(c62961SZe);
            this.A00 = A00;
            A00.A09(this);
            this.A0G.A0C(this.A00);
        }
    }
}
