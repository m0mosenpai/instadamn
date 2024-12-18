package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* loaded from: classes10.dex */
public final class QAR extends AbstractC63675Sri {
    public AbstractC63308ShE A00;
    public final AbstractC63308ShE A01;
    public final AbstractC63678Srl A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QAR(X.Q2O r13, X.C63689Srw r14, X.AbstractC63678Srl r15) {
        /*
            r12 = this;
            java.lang.Integer r0 = r14.A05
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L56
            r0 = 1
            if (r1 == r0) goto L53
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        Le:
            java.lang.Integer r0 = r14.A06
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L50
            r0 = 0
            if (r1 == r0) goto L4d
            r0 = 1
            if (r1 == r0) goto L4a
            r4 = 0
        L1e:
            float r11 = r14.A00
            X.QAi r8 = r14.A04
            X.QAg r6 = r14.A03
            java.util.List r10 = r14.A08
            X.QAg r7 = r14.A02
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r15
            java.lang.String r0 = r14.A07
            r12.A03 = r0
            boolean r0 = r14.A09
            r12.A04 = r0
            X.QAf r0 = r14.A01
            java.util.List r1 = r0.A00
            X.QAX r0 = new X.QAX
            r0.<init>(r1)
            r12.A01 = r0
            r0.A09(r12)
            r15.A0C(r0)
            return
        L4a:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L1e
        L4d:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L1e
        L50:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L1e
        L53:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto Le
        L56:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QAR.<init>(X.Q2O, X.Srw, X.Srl):void");
    }

    @Override // X.AbstractC63675Sri, X.InterfaceC65628Tpp
    public final void AQR(Canvas canvas, Matrix matrix, int i) {
        if (!this.A04) {
            Paint paint = super.A04;
            QAX qax = (QAX) this.A01;
            paint.setColor(qax.A0B(qax.A06.AuW(), qax.A04()));
            AbstractC58323PtF.A15(paint, this.A00);
            super.AQR(canvas, matrix, i);
        }
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A03;
    }

    @Override // X.AbstractC63675Sri, X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        super.AAj(c62961SZe, obj);
        if (obj == InterfaceC65609To0.A0d) {
            this.A01.A0A(c62961SZe);
            return;
        }
        if (obj != InterfaceC65609To0.A01) {
            return;
        }
        AbstractC63308ShE abstractC63308ShE = this.A00;
        if (abstractC63308ShE != null) {
            this.A02.A0M.remove(abstractC63308ShE);
        }
        if (c62961SZe == null) {
            this.A00 = null;
            return;
        }
        QAV A00 = QAV.A00(c62961SZe);
        this.A00 = A00;
        A00.A09(this);
        this.A02.A0C(this.A01);
    }
}
