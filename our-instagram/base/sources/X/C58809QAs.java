package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import java.util.Map;

/* renamed from: X.QAs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58809QAs extends AbstractC63678Srl {
    public AbstractC63308ShE A00;
    public AbstractC63308ShE A01;
    public AbstractC63308ShE A02;
    public AbstractC63308ShE A03;
    public AbstractC63308ShE A04;
    public AbstractC63308ShE A05;
    public AbstractC63308ShE A06;
    public AbstractC63308ShE A07;
    public AbstractC63308ShE A08;
    public AbstractC63308ShE A09;
    public final Matrix A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final C003501a A0E;
    public final SQ2 A0F;
    public final Q2O A0G;
    public final StringBuilder A0H;
    public final List A0I;
    public final Map A0J;
    public final QAW A0K;

    private List A00(SH9 sh9, String str, float f, float f2, float f3, boolean z) {
        float measureText;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i3 = 0;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                SMN smn = (SMN) AbstractC005201r.A00(this.A0F.A07, AbstractC25226BEj.A03(sh9.A03, AbstractC166997dE.A0K(sh9.A01, charAt * 31)));
                if (smn != null) {
                    measureText = ((float) smn.A00) * f2 * AbstractC63359SiH.A00();
                }
            } else {
                measureText = this.A0B.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                i3 = i4;
                f5 = f7;
                z2 = false;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                List list = this.A0I;
                for (int size = list.size(); size < i; size++) {
                    list.add(new SD3());
                }
                SD3 sd3 = (SD3) list.get(i - 1);
                if (i3 == i2) {
                    sd3.A01 = str.substring(i2, i4).trim();
                    sd3.A00 = (f4 - f7) - ((r2.length() - r0.length()) * f6);
                    i2 = i4;
                    i3 = i4;
                    f4 = f7;
                    f5 = f7;
                } else {
                    sd3.A01 = str.substring(i2, i3 - 1).trim();
                    sd3.A00 = ((f4 - f5) - ((r0.length() - r2.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            List list2 = this.A0I;
            for (int size2 = list2.size(); size2 < i; size2++) {
                list2.add(new SD3());
            }
            SD3 sd32 = (SD3) list2.get(i - 1);
            sd32.A01 = str.substring(i2);
            sd32.A00 = f4;
        }
        return this.A0I.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        if (r2 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A03(android.graphics.Canvas r8, X.SN0 r9, float r10, int r11) {
        /*
            r7 = this;
            android.graphics.PointF r2 = r9.A07
            android.graphics.PointF r3 = r9.A08
            float r6 = X.AbstractC63359SiH.A00()
            r4 = 0
            if (r2 != 0) goto L4f
            r1 = 0
        Lc:
            float r5 = (float) r11
            float r0 = r9.A01
            float r5 = r5 * r0
            float r5 = r5 * r6
            float r5 = r5 + r1
            X.Q2O r0 = r7.A0G
            boolean r0 = r0.A0P
            if (r0 == 0) goto L2a
            if (r3 == 0) goto L2a
            if (r2 == 0) goto L2c
            float r1 = r2.y
            float r0 = r3.y
            float r1 = r1 + r0
            float r0 = r9.A02
            float r1 = r1 + r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L4c
            r3 = 0
        L29:
            return r3
        L2a:
            if (r2 != 0) goto L4c
        L2c:
            r2 = 0
        L2d:
            if (r3 == 0) goto L31
            float r4 = r3.x
        L31:
            java.lang.Integer r0 = r9.A09
            int r1 = r0.intValue()
            r3 = 1
            r0 = 0
            if (r1 == r0) goto L46
            if (r1 == r3) goto L4a
            r0 = 2
            if (r1 != r0) goto L29
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r2 = r2 + r4
            float r10 = r10 / r0
        L45:
            float r2 = r2 - r10
        L46:
            r8.translate(r2, r5)
            return r3
        L4a:
            float r2 = r2 + r4
            goto L45
        L4c:
            float r2 = r2.x
            goto L2d
        L4f:
            float r1 = r9.A01
            float r1 = r1 * r6
            float r0 = r2.y
            float r1 = r1 + r0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58809QAs.A03(android.graphics.Canvas, X.SN0, float, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x038a, code lost:
    
        if (r3.containsKey(r1) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0392, code lost:
    
        if (r14 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0394, code lost:
    
        if (r14 == null) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Override // X.AbstractC63678Srl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58809QAs.A0B(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.ShE, X.QAW] */
    public C58809QAs(Q2O q2o, SOF sof) {
        super(q2o, sof);
        this.A0H = AbstractC58318PtA.A0q(2);
        this.A0D = AbstractC166987dD.A0X();
        this.A0A = AbstractC166987dD.A0Q();
        this.A0B = new Q2A(this);
        this.A0C = new Q2B(this);
        this.A0J = AbstractC166987dD.A1G();
        this.A0E = new C003501a();
        this.A0I = AbstractC166987dD.A1E();
        this.A0G = q2o;
        this.A0F = sof.A09;
        ?? abstractC63308ShE = new AbstractC63308ShE(sof.A0B.A00);
        this.A0K = abstractC63308ShE;
        abstractC63308ShE.A09(this);
        A0C(abstractC63308ShE);
        SHA sha = sof.A0C;
        if (sha != null) {
            QAf qAf = sha.A00;
            if (qAf != null) {
                AbstractC63308ShE abstractC63308ShE2 = new AbstractC63308ShE(qAf.A00);
                this.A00 = abstractC63308ShE2;
                abstractC63308ShE2.A09(this);
                A0C(this.A00);
            }
            QAf qAf2 = sha.A01;
            if (qAf2 != null) {
                AbstractC63308ShE abstractC63308ShE3 = new AbstractC63308ShE(qAf2.A00);
                this.A02 = abstractC63308ShE3;
                abstractC63308ShE3.A09(this);
                A0C(this.A02);
            }
            C58799QAg c58799QAg = sha.A02;
            if (c58799QAg != null) {
                QAZ A00 = AbstractC63684Srr.A00(c58799QAg);
                this.A04 = A00;
                A00.A09(this);
                A0C(this.A04);
            }
            C58799QAg c58799QAg2 = sha.A03;
            if (c58799QAg2 != null) {
                QAZ A002 = AbstractC63684Srr.A00(c58799QAg2);
                this.A07 = A002;
                A002.A09(this);
                A0C(this.A07);
            }
        }
    }

    public static void A01(Canvas canvas, Paint paint, Path path) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    public static void A02(Canvas canvas, Paint paint, String str) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SN0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.SIt, java.lang.Object] */
    @Override // X.AbstractC63678Srl, X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        AbstractC63308ShE abstractC63308ShE;
        super.AAj(c62961SZe, obj);
        if (obj == InterfaceC65609To0.A0a) {
            AbstractC63308ShE abstractC63308ShE2 = this.A01;
            if (abstractC63308ShE2 != null) {
                this.A0M.remove(abstractC63308ShE2);
            }
            if (c62961SZe == null) {
                this.A01 = null;
                return;
            }
            QAV qav = new QAV(c62961SZe, null);
            this.A01 = qav;
            qav.A09(this);
            abstractC63308ShE = this.A01;
        } else if (obj == InterfaceC65609To0.A0d) {
            AbstractC63308ShE abstractC63308ShE3 = this.A03;
            if (abstractC63308ShE3 != null) {
                this.A0M.remove(abstractC63308ShE3);
            }
            if (c62961SZe == null) {
                this.A03 = null;
                return;
            }
            QAV qav2 = new QAV(c62961SZe, null);
            this.A03 = qav2;
            qav2.A09(this);
            abstractC63308ShE = this.A03;
        } else if (obj == InterfaceC65609To0.A0P) {
            AbstractC63308ShE abstractC63308ShE4 = this.A05;
            if (abstractC63308ShE4 != null) {
                this.A0M.remove(abstractC63308ShE4);
            }
            if (c62961SZe == null) {
                this.A05 = null;
                return;
            }
            QAV qav3 = new QAV(c62961SZe, null);
            this.A05 = qav3;
            qav3.A09(this);
            abstractC63308ShE = this.A05;
        } else if (obj == InterfaceC65609To0.A0R) {
            AbstractC63308ShE abstractC63308ShE5 = this.A08;
            if (abstractC63308ShE5 != null) {
                this.A0M.remove(abstractC63308ShE5);
            }
            if (c62961SZe == null) {
                this.A08 = null;
                return;
            }
            QAV qav4 = new QAV(c62961SZe, null);
            this.A08 = qav4;
            qav4.A09(this);
            abstractC63308ShE = this.A08;
        } else if (obj == InterfaceC65609To0.A0Q) {
            AbstractC63308ShE abstractC63308ShE6 = this.A06;
            if (abstractC63308ShE6 != null) {
                this.A0M.remove(abstractC63308ShE6);
            }
            if (c62961SZe == null) {
                this.A06 = null;
                return;
            }
            QAV qav5 = new QAV(c62961SZe, null);
            this.A06 = qav5;
            qav5.A09(this);
            abstractC63308ShE = this.A06;
        } else if (obj == InterfaceC65609To0.A08) {
            AbstractC63308ShE abstractC63308ShE7 = this.A09;
            if (abstractC63308ShE7 != null) {
                this.A0M.remove(abstractC63308ShE7);
            }
            if (c62961SZe == null) {
                this.A09 = null;
                return;
            }
            QAV qav6 = new QAV(c62961SZe, null);
            this.A09 = qav6;
            qav6.A09(this);
            abstractC63308ShE = this.A09;
        } else {
            if (obj != "dynamic_text") {
                return;
            }
            QAW qaw = this.A0K;
            qaw.A0A(new C58813QAw(qaw, new Object(), new Object(), c62961SZe));
            return;
        }
        A0C(abstractC63308ShE);
    }

    @Override // X.AbstractC63678Srl, X.InterfaceC65628Tpp
    public final void Aho(Matrix matrix, RectF rectF, boolean z) {
        super.Aho(matrix, rectF, z);
        SQ2 sq2 = this.A0F;
        rectF.set(0.0f, 0.0f, sq2.A05.width(), sq2.A05.height());
    }
}
