package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Srl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63678Srl implements InterfaceC65309Thl, InterfaceC65467Tkj, InterfaceC65628Tpp {
    public float A00;
    public BlurMaskFilter A01;
    public QAZ A02;
    public SFN A03;
    public AbstractC63678Srl A04;
    public AbstractC63678Srl A05;
    public boolean A06;
    public Paint A07;
    public List A08;
    public boolean A09;
    public final Matrix A0A;
    public final Paint A0C;
    public final Paint A0D;
    public final RectF A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final Q2O A0J;
    public final SQ3 A0K;
    public final SOF A0L;
    public final List A0M;
    public final Paint A0P;
    public final Paint A0Q;
    public final RectF A0R;
    public final Path A0E = AbstractC166987dD.A0T();
    public final Matrix A0O = AbstractC166987dD.A0Q();
    public final Matrix A0N = AbstractC166987dD.A0Q();
    public final Paint A0B = new Paint(1);

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
    }

    private void A05() {
        if (this.A08 == null) {
            AbstractC63678Srl abstractC63678Srl = this.A05;
            if (abstractC63678Srl == null) {
                this.A08 = Collections.emptyList();
                return;
            }
            this.A08 = AbstractC166987dD.A1E();
            do {
                this.A08.add(abstractC63678Srl);
                abstractC63678Srl = abstractC63678Srl.A05;
            } while (abstractC63678Srl != null);
        }
    }

    private void A06(Canvas canvas) {
        RectF rectF = this.A0H;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.A0P);
    }

    public final SAK A08() {
        if (this instanceof QAo) {
            QAo qAo = (QAo) this;
            SAK sak = qAo.A0L.A0E;
            if (sak == null) {
                return qAo.A01.A08();
            }
            return sak;
        }
        return this.A0L.A0E;
    }

    public final SI6 A09() {
        if (this instanceof QAo) {
            QAo qAo = (QAo) this;
            SI6 si6 = qAo.A0L.A0F;
            if (si6 == null) {
                return qAo.A01.A09();
            }
            return si6;
        }
        return this.A0L.A0F;
    }

    public void A0A(float f) {
        SQ3 sq3 = this.A0K;
        AbstractC63308ShE abstractC63308ShE = sq3.A02;
        if (abstractC63308ShE != null) {
            abstractC63308ShE.A08(f);
        }
        AbstractC63308ShE abstractC63308ShE2 = sq3.A06;
        if (abstractC63308ShE2 != null) {
            abstractC63308ShE2.A08(f);
        }
        AbstractC63308ShE abstractC63308ShE3 = sq3.A01;
        if (abstractC63308ShE3 != null) {
            abstractC63308ShE3.A08(f);
        }
        AbstractC63308ShE abstractC63308ShE4 = sq3.A00;
        if (abstractC63308ShE4 != null) {
            abstractC63308ShE4.A08(f);
        }
        AbstractC63308ShE abstractC63308ShE5 = sq3.A03;
        if (abstractC63308ShE5 != null) {
            abstractC63308ShE5.A08(f);
        }
        AbstractC63308ShE abstractC63308ShE6 = sq3.A05;
        if (abstractC63308ShE6 != null) {
            abstractC63308ShE6.A08(f);
        }
        AbstractC63308ShE abstractC63308ShE7 = sq3.A04;
        if (abstractC63308ShE7 != null) {
            abstractC63308ShE7.A08(f);
        }
        QAZ qaz = sq3.A07;
        if (qaz != null) {
            qaz.A08(f);
        }
        QAZ qaz2 = sq3.A08;
        if (qaz2 != null) {
            qaz2.A08(f);
        }
        SFN sfn = this.A03;
        if (sfn != null) {
            int i = 0;
            while (true) {
                List list = sfn.A00;
                if (i >= list.size()) {
                    break;
                }
                ((AbstractC63308ShE) list.get(i)).A08(f);
                i++;
            }
        }
        QAZ qaz3 = this.A02;
        if (qaz3 != null) {
            qaz3.A08(f);
        }
        AbstractC63678Srl abstractC63678Srl = this.A04;
        if (abstractC63678Srl != null) {
            abstractC63678Srl.A0A(f);
        }
        List list2 = this.A0M;
        list2.size();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ((AbstractC63308ShE) list2.get(i2)).A08(f);
        }
        list2.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0202, code lost:
    
        if (r5 != null) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0B(android.graphics.Canvas r14, android.graphics.Matrix r15, int r16) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63678Srl.A0B(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void A0C(AbstractC63308ShE abstractC63308ShE) {
        if (abstractC63308ShE != null) {
            this.A0M.add(abstractC63308ShE);
        }
    }

    public final void A0D(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        if (this instanceof QAo) {
            ((QAo) this).A00.EKH(c63221SfR, c63221SfR2, list, i);
            return;
        }
        if (!(this instanceof C58808QAr)) {
            return;
        }
        C58808QAr c58808QAr = (C58808QAr) this;
        int i2 = 0;
        while (true) {
            List list2 = c58808QAr.A05;
            if (i2 >= list2.size()) {
                return;
            }
            ((AbstractC63678Srl) list2.get(i2)).EKH(c63221SfR, c63221SfR2, list, i);
            i2++;
        }
    }

    public void A0E(boolean z) {
        if (z && this.A07 == null) {
            this.A07 = new Paint();
        }
        this.A09 = z;
    }

    public void AAj(C62961SZe c62961SZe, Object obj) {
        this.A0K.A04(c62961SZe, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65628Tpp
    public final void AQR(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Path A04;
        Paint paint2;
        Paint paint3;
        Path A042;
        Paint paint4;
        SFN sfn;
        Number number;
        if (this.A06) {
            SOF sof = this.A0L;
            if (!sof.A0O) {
                A05();
                Matrix matrix2 = this.A0O;
                matrix2.reset();
                matrix2.set(matrix);
                int size = this.A08.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((AbstractC63678Srl) this.A08.get(size)).A0K.A00());
                    }
                }
                int i2 = 100;
                SQ3 sq3 = this.A0K;
                AbstractC63308ShE abstractC63308ShE = sq3.A02;
                if (abstractC63308ShE != null && (number = (Number) abstractC63308ShE.A06()) != null) {
                    i2 = number.intValue();
                }
                int i3 = (int) ((((i / 255.0f) * i2) / 100.0f) * 255.0f);
                if (this.A04 != null || ((sfn = this.A03) != null && !sfn.A00.isEmpty())) {
                    RectF rectF = this.A0H;
                    Aho(matrix2, rectF, false);
                    if (this.A04 != null && sof.A0I != C05F.A0C) {
                        RectF rectF2 = this.A0G;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        this.A04.Aho(matrix, rectF2, true);
                        if (!rectF.intersect(rectF2)) {
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                    matrix2.preConcat(sq3.A00());
                    RectF rectF3 = this.A0F;
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                    SFN sfn2 = this.A03;
                    if (sfn2 != null) {
                        List list = sfn2.A00;
                        if (!list.isEmpty()) {
                            List list2 = sfn2.A01;
                            int size2 = list2.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    SHB shb = (SHB) list2.get(i4);
                                    Path path = (Path) ((AbstractC63308ShE) list.get(i4)).A06();
                                    if (path != null) {
                                        Path path2 = this.A0E;
                                        path2.set(path);
                                        path2.transform(matrix2);
                                        int intValue = shb.A02.intValue();
                                        if (intValue == 3 || intValue == 1 || ((intValue == 2 || intValue == 0) && shb.A03)) {
                                            break;
                                        }
                                        RectF rectF4 = this.A0I;
                                        path2.computeBounds(rectF4, false);
                                        if (i4 == 0) {
                                            rectF3.set(rectF4);
                                        } else {
                                            rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                        }
                                    }
                                    i4++;
                                } else if (!rectF.intersect(rectF3)) {
                                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                            }
                        }
                    }
                    RectF rectF5 = this.A0R;
                    rectF5.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
                    Matrix matrix3 = this.A0N;
                    canvas.getMatrix(matrix3);
                    if (!matrix3.isIdentity()) {
                        matrix3.invert(matrix3);
                        matrix3.mapRect(rectF5);
                    }
                    if (!rectF.intersect(rectF5)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                        Paint paint5 = this.A0B;
                        paint5.setAlpha(255);
                        canvas.saveLayer(rectF, paint5);
                        A06(canvas);
                        A0B(canvas, matrix2, i3);
                        if (sfn2 != null) {
                            List list3 = sfn2.A00;
                            if (!list3.isEmpty()) {
                                Paint paint6 = this.A0C;
                                canvas.saveLayer(rectF, paint6);
                                int i5 = 0;
                                while (true) {
                                    List list4 = sfn2.A01;
                                    if (i5 >= list4.size()) {
                                        break;
                                    }
                                    SHB shb2 = (SHB) list4.get(i5);
                                    AbstractC63308ShE abstractC63308ShE2 = (AbstractC63308ShE) list3.get(i5);
                                    AbstractC63308ShE abstractC63308ShE3 = (AbstractC63308ShE) sfn2.A02.get(i5);
                                    int intValue2 = shb2.A02.intValue();
                                    if (intValue2 != 3) {
                                        if (intValue2 != 1) {
                                            if (intValue2 != 2) {
                                                if (intValue2 == 0) {
                                                    if (shb2.A03) {
                                                        canvas.saveLayer(rectF, paint5);
                                                        canvas.drawRect(rectF, paint5);
                                                        A042 = A04(matrix2, abstractC63308ShE2, this);
                                                        A07(paint5, abstractC63308ShE3);
                                                        paint4 = this.A0D;
                                                    } else {
                                                        A04 = A04(matrix2, abstractC63308ShE2, this);
                                                        paint2 = paint5;
                                                        A07(paint5, abstractC63308ShE3);
                                                        canvas.drawPath(A04, paint2);
                                                    }
                                                }
                                            } else if (shb2.A03) {
                                                canvas.saveLayer(rectF, paint6);
                                                canvas.drawRect(rectF, paint5);
                                                paint3 = this.A0D;
                                                A07(paint3, abstractC63308ShE3);
                                                canvas.drawPath(A04(matrix2, abstractC63308ShE2, this), paint3);
                                                canvas.restore();
                                            } else {
                                                canvas.saveLayer(rectF, paint6);
                                                A042 = A04(matrix2, abstractC63308ShE2, this);
                                                paint4 = paint5;
                                                A07(paint5, abstractC63308ShE3);
                                            }
                                            canvas.drawPath(A042, paint4);
                                            canvas.restore();
                                        } else {
                                            if (i5 == 0) {
                                                paint5.setColor(-16777216);
                                                paint5.setAlpha(255);
                                                canvas.drawRect(rectF, paint5);
                                            }
                                            if (shb2.A03) {
                                                paint3 = this.A0D;
                                                canvas.saveLayer(rectF, paint3);
                                                canvas.drawRect(rectF, paint5);
                                                A07(paint3, abstractC63308ShE3);
                                                canvas.drawPath(A04(matrix2, abstractC63308ShE2, this), paint3);
                                                canvas.restore();
                                            } else {
                                                A04 = A04(matrix2, abstractC63308ShE2, this);
                                                paint2 = this.A0D;
                                                canvas.drawPath(A04, paint2);
                                            }
                                        }
                                    } else if (!list3.isEmpty()) {
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < list4.size()) {
                                                if (((SHB) list4.get(i6)).A02 == C05F.A0N) {
                                                    i6++;
                                                }
                                            } else {
                                                paint5.setAlpha(255);
                                                canvas.drawRect(rectF, paint5);
                                                break;
                                            }
                                        }
                                    }
                                    i5++;
                                }
                                canvas.restore();
                            }
                        }
                        if (this.A04 != null) {
                            canvas.saveLayer(rectF, this.A0Q);
                            A06(canvas);
                            this.A04.AQR(canvas, matrix, i3);
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                    if (this.A09 && (paint = this.A07) != null) {
                        AbstractC43592JPx.A1E(paint);
                        this.A07.setColor(-251901);
                        this.A07.setStrokeWidth(4.0f);
                        canvas.drawRect(rectF, this.A07);
                        AbstractC166987dD.A1R(this.A07);
                        this.A07.setColor(1357638635);
                        canvas.drawRect(rectF, this.A07);
                    }
                } else {
                    matrix2.preConcat(sq3.A00());
                    A0B(canvas, matrix2, i3);
                }
                SH8 sh8 = this.A0J.A0F.A0D;
                String str = sof.A0J;
                if (sh8.A00) {
                    Map map = sh8.A01;
                    SD5 sd5 = (SD5) map.get(str);
                    SD5 sd52 = sd5;
                    if (sd5 == null) {
                        Object obj = new Object();
                        map.put(str, obj);
                        sd52 = obj;
                    }
                    float f = sd52.A00 + 0.0f;
                    sd52.A00 = f;
                    int i7 = sd52.A01 + 1;
                    sd52.A01 = i7;
                    if (i7 == Integer.MAX_VALUE) {
                        sd52.A00 = f / 2.0f;
                        sd52.A01 = 1073741823;
                    }
                    if (str.equals("__container")) {
                        Iterator it = sh8.A02.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AbstractC166987dD.A15(AbstractC111324zv.A00(5015));
                        }
                    }
                }
            }
        }
    }

    public void Aho(Matrix matrix, RectF rectF, boolean z) {
        this.A0H.set(0.0f, 0.0f, 0.0f, 0.0f);
        A05();
        Matrix matrix2 = this.A0A;
        matrix2.set(matrix);
        if (z) {
            List list = this.A08;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((AbstractC63678Srl) this.A08.get(size)).A0K.A00());
                    }
                }
            } else {
                AbstractC63678Srl abstractC63678Srl = this.A05;
                if (abstractC63678Srl != null) {
                    matrix2.preConcat(abstractC63678Srl.A0K.A00());
                }
            }
        }
        matrix2.preConcat(this.A0K.A00());
    }

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A0J.invalidateSelf();
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        AbstractC63678Srl abstractC63678Srl = this.A04;
        if (abstractC63678Srl != null) {
            String str = abstractC63678Srl.A0L.A0J;
            C63221SfR c63221SfR3 = new C63221SfR(c63221SfR2);
            c63221SfR3.A01.add(str);
            if (c63221SfR.A01(this.A04.A0L.A0J, i)) {
                AbstractC63678Srl abstractC63678Srl2 = this.A04;
                C63221SfR c63221SfR4 = new C63221SfR(c63221SfR3);
                c63221SfR4.A00 = abstractC63678Srl2;
                list.add(c63221SfR4);
            }
            if (c63221SfR.A03(this.A0L.A0J, i)) {
                this.A04.A0D(c63221SfR, c63221SfR3, list, c63221SfR.A00(this.A04.A0L.A0J, i) + i);
            }
        }
        String str2 = this.A0L.A0J;
        if (c63221SfR.A02(str2, i)) {
            if (!"__container".equals(str2)) {
                C63221SfR c63221SfR5 = new C63221SfR(c63221SfR2);
                c63221SfR5.A01.add(str2);
                c63221SfR2 = c63221SfR5;
                if (c63221SfR.A01(str2, i)) {
                    C63221SfR c63221SfR6 = new C63221SfR(c63221SfR5);
                    c63221SfR6.A00 = this;
                    list.add(c63221SfR6);
                }
            }
            if (c63221SfR.A03(str2, i)) {
                A0D(c63221SfR, c63221SfR2, list, i + c63221SfR.A00(str2, i));
            }
        }
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A0L.A0J;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.ShE, X.QAZ] */
    public AbstractC63678Srl(Q2O q2o, SOF sof) {
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_IN;
        Paint paint = new Paint(1);
        AbstractC166997dE.A1D(paint, mode2);
        this.A0C = paint;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_OUT;
        Paint paint2 = new Paint(1);
        AbstractC166997dE.A1D(paint2, mode3);
        this.A0D = paint2;
        Paint paint3 = new Paint(1);
        this.A0Q = paint3;
        PorterDuff.Mode mode4 = PorterDuff.Mode.CLEAR;
        Paint paint4 = new Paint();
        AbstractC166997dE.A1D(paint4, mode4);
        this.A0P = paint4;
        this.A0H = AbstractC166987dD.A0X();
        this.A0R = AbstractC166987dD.A0X();
        this.A0F = AbstractC166987dD.A0X();
        this.A0G = AbstractC166987dD.A0X();
        this.A0I = AbstractC166987dD.A0X();
        this.A0A = AbstractC166987dD.A0Q();
        this.A0M = AbstractC166987dD.A1E();
        this.A06 = true;
        this.A00 = 0.0f;
        this.A0J = q2o;
        this.A0L = sof;
        if (sof.A0I == C05F.A0C) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        AbstractC166997dE.A1D(paint3, mode);
        SQ3 sq3 = new SQ3(sof.A0D);
        this.A0K = sq3;
        sq3.A02(this);
        List list = sof.A0M;
        if (list != null && !list.isEmpty()) {
            SFN sfn = new SFN(list);
            this.A03 = sfn;
            Iterator it = sfn.A00.iterator();
            while (it.hasNext()) {
                ((AbstractC63308ShE) it.next()).A09(this);
            }
            for (AbstractC63308ShE abstractC63308ShE : this.A03.A02) {
                A0C(abstractC63308ShE);
                abstractC63308ShE.A09(this);
            }
        }
        List list2 = this.A0L.A0L;
        if (!list2.isEmpty()) {
            ?? abstractC63308ShE2 = new AbstractC63308ShE(list2);
            this.A02 = abstractC63308ShE2;
            abstractC63308ShE2.A04 = true;
            abstractC63308ShE2.A09(new InterfaceC65309Thl() { // from class: X.Srg
                @Override // X.InterfaceC65309Thl
                public final void Dya() {
                    AbstractC63678Srl abstractC63678Srl = AbstractC63678Srl.this;
                    boolean A1N = AbstractC167007dF.A1N((abstractC63678Srl.A02.A0B() > 1.0f ? 1 : (abstractC63678Srl.A02.A0B() == 1.0f ? 0 : -1)));
                    if (A1N != abstractC63678Srl.A06) {
                        abstractC63678Srl.A06 = A1N;
                        abstractC63678Srl.A0J.invalidateSelf();
                    }
                }
            });
            boolean z = AbstractC63308ShE.A01(this.A02) == 1.0f;
            if (z != this.A06) {
                this.A06 = z;
                this.A0J.invalidateSelf();
            }
            A0C(this.A02);
            return;
        }
        if (true == this.A06) {
            return;
        }
        this.A06 = true;
        this.A0J.invalidateSelf();
    }

    public static Path A04(Matrix matrix, AbstractC63308ShE abstractC63308ShE, AbstractC63678Srl abstractC63678Srl) {
        Path path = (Path) abstractC63308ShE.A06();
        Path path2 = abstractC63678Srl.A0E;
        path2.set(path);
        path2.transform(matrix);
        return path2;
    }

    public static void A07(Paint paint, AbstractC63308ShE abstractC63308ShE) {
        paint.setAlpha((int) (((Number) abstractC63308ShE.A06()).intValue() * 2.55f));
    }
}
