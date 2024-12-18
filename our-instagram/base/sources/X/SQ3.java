package X;

import android.graphics.Matrix;
import android.graphics.PointF;

/* loaded from: classes10.dex */
public final class SQ3 {
    public AbstractC63308ShE A00;
    public AbstractC63308ShE A01;
    public AbstractC63308ShE A02;
    public AbstractC63308ShE A03;
    public AbstractC63308ShE A04;
    public AbstractC63308ShE A05;
    public AbstractC63308ShE A06;
    public QAZ A07;
    public QAZ A08;
    public final float[] A09;
    public final Matrix A0A = AbstractC166987dD.A0Q();
    public final Matrix A0B;
    public final Matrix A0C;
    public final Matrix A0D;
    public final boolean A0E;

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        if (r1 != 0.0f) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix A00() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQ3.A00():android.graphics.Matrix");
    }

    public final Matrix A01(float f) {
        PointF A03;
        SKz sKz;
        float f2;
        AbstractC63308ShE abstractC63308ShE = this.A03;
        PointF pointF = null;
        if (abstractC63308ShE == null) {
            A03 = null;
        } else {
            A03 = AbstractC63308ShE.A03(abstractC63308ShE);
        }
        AbstractC63308ShE abstractC63308ShE2 = this.A05;
        if (abstractC63308ShE2 == null) {
            sKz = null;
        } else {
            sKz = (SKz) abstractC63308ShE2.A06();
        }
        Matrix matrix = this.A0A;
        matrix.reset();
        if (A03 != null) {
            matrix.preTranslate(A03.x * f, A03.y * f);
        }
        if (sKz != null) {
            double d = f;
            matrix.preScale((float) Math.pow(sKz.A00, d), (float) Math.pow(sKz.A01, d));
        }
        AbstractC63308ShE abstractC63308ShE3 = this.A04;
        if (abstractC63308ShE3 != null) {
            float A01 = AbstractC63308ShE.A01(abstractC63308ShE3);
            AbstractC63308ShE abstractC63308ShE4 = this.A00;
            if (abstractC63308ShE4 != null) {
                pointF = AbstractC63308ShE.A03(abstractC63308ShE4);
            }
            float f3 = A01 * f;
            float f4 = 0.0f;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return matrix;
    }

    public final void A02(InterfaceC65309Thl interfaceC65309Thl) {
        AbstractC63308ShE abstractC63308ShE = this.A02;
        if (abstractC63308ShE != null) {
            abstractC63308ShE.A09(interfaceC65309Thl);
        }
        AbstractC63308ShE abstractC63308ShE2 = this.A06;
        if (abstractC63308ShE2 != null) {
            abstractC63308ShE2.A09(interfaceC65309Thl);
        }
        AbstractC63308ShE abstractC63308ShE3 = this.A01;
        if (abstractC63308ShE3 != null) {
            abstractC63308ShE3.A09(interfaceC65309Thl);
        }
        AbstractC63308ShE abstractC63308ShE4 = this.A00;
        if (abstractC63308ShE4 != null) {
            abstractC63308ShE4.A09(interfaceC65309Thl);
        }
        AbstractC63308ShE abstractC63308ShE5 = this.A03;
        if (abstractC63308ShE5 != null) {
            abstractC63308ShE5.A09(interfaceC65309Thl);
        }
        AbstractC63308ShE abstractC63308ShE6 = this.A05;
        if (abstractC63308ShE6 != null) {
            abstractC63308ShE6.A09(interfaceC65309Thl);
        }
        AbstractC63308ShE abstractC63308ShE7 = this.A04;
        if (abstractC63308ShE7 != null) {
            abstractC63308ShE7.A09(interfaceC65309Thl);
        }
        QAZ qaz = this.A07;
        if (qaz != null) {
            qaz.A09(interfaceC65309Thl);
        }
        QAZ qaz2 = this.A08;
        if (qaz2 != null) {
            qaz2.A09(interfaceC65309Thl);
        }
    }

    public final void A03(AbstractC63678Srl abstractC63678Srl) {
        abstractC63678Srl.A0C(this.A02);
        abstractC63678Srl.A0C(this.A06);
        abstractC63678Srl.A0C(this.A01);
        abstractC63678Srl.A0C(this.A00);
        abstractC63678Srl.A0C(this.A03);
        abstractC63678Srl.A0C(this.A05);
        abstractC63678Srl.A0C(this.A04);
        abstractC63678Srl.A0C(this.A07);
        abstractC63678Srl.A0C(this.A08);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.ShE, X.QAZ] */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.ShE] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.ShE, X.QAZ] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.ShE] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.ShE] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.ShE] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.ShE] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.ShE] */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.ShE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(X.C62961SZe r5, java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQ3.A04(X.SZe, java.lang.Object):boolean");
    }

    public SQ3(Ss5 ss5) {
        AbstractC63308ShE ALc;
        AbstractC63308ShE ALc2;
        QAb qAb;
        QAZ A00;
        QAZ A002;
        QAZ A003;
        C63682Srp c63682Srp = ss5.A07;
        if (c63682Srp == null) {
            ALc = null;
        } else {
            ALc = c63682Srp.ALc();
        }
        this.A00 = ALc;
        InterfaceC65535Tm7 interfaceC65535Tm7 = ss5.A09;
        if (interfaceC65535Tm7 == null) {
            ALc2 = null;
        } else {
            ALc2 = interfaceC65535Tm7.ALc();
        }
        this.A03 = ALc2;
        C58803QAk c58803QAk = ss5.A08;
        if (c58803QAk == null) {
            qAb = null;
        } else {
            qAb = new QAb(c58803QAk.A00);
        }
        this.A05 = qAb;
        C58799QAg c58799QAg = ss5.A02;
        if (c58799QAg == null) {
            A00 = null;
        } else {
            A00 = AbstractC63684Srr.A00(c58799QAg);
        }
        this.A04 = A00;
        C58799QAg c58799QAg2 = ss5.A03;
        if (c58799QAg2 == null) {
            A002 = null;
        } else {
            A002 = AbstractC63684Srr.A00(c58799QAg2);
        }
        this.A07 = A002;
        this.A0E = ss5.A00;
        if (A002 != null) {
            this.A0B = AbstractC166987dD.A0Q();
            this.A0C = AbstractC166987dD.A0Q();
            this.A0D = AbstractC166987dD.A0Q();
            this.A09 = new float[9];
        }
        C58799QAg c58799QAg3 = ss5.A04;
        if (c58799QAg3 == null) {
            A003 = null;
        } else {
            A003 = AbstractC63684Srr.A00(c58799QAg3);
        }
        this.A08 = A003;
        C58801QAi c58801QAi = ss5.A06;
        if (c58801QAi != null) {
            this.A02 = new AbstractC63308ShE(c58801QAi.A00);
        }
        C58799QAg c58799QAg4 = ss5.A05;
        if (c58799QAg4 != null) {
            this.A06 = AbstractC63684Srr.A00(c58799QAg4);
        } else {
            this.A06 = null;
        }
        C58799QAg c58799QAg5 = ss5.A01;
        if (c58799QAg5 != null) {
            this.A01 = AbstractC63684Srr.A00(c58799QAg5);
        } else {
            this.A01 = null;
        }
    }
}
