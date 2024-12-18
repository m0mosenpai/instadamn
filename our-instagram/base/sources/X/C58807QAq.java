package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.QAq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58807QAq extends AbstractC63678Srl {
    public AbstractC63308ShE A00;
    public AbstractC63308ShE A01;
    public final Paint A02;
    public final Path A03;
    public final SOF A04;
    public final float[] A05;
    public final RectF A06;

    public C58807QAq(Q2O q2o, SOF sof) {
        super(q2o, sof);
        this.A06 = AbstractC166987dD.A0X();
        Paint paint = new Paint();
        this.A02 = paint;
        this.A05 = new float[8];
        this.A03 = AbstractC166987dD.A0T();
        this.A04 = sof;
        paint.setAlpha(0);
        AbstractC166987dD.A1R(paint);
        paint.setColor(sof.A04);
    }

    @Override // X.AbstractC63678Srl, X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        super.AAj(c62961SZe, obj);
        if (obj == InterfaceC65609To0.A01) {
            if (c62961SZe == null) {
                this.A01 = null;
                return;
            } else {
                this.A01 = new QAV(c62961SZe, null);
                return;
            }
        }
        if (obj != InterfaceC65609To0.A0a) {
            return;
        }
        if (c62961SZe == null) {
            this.A00 = null;
            this.A02.setColor(this.A04.A04);
        } else {
            this.A00 = QAV.A00(c62961SZe);
        }
    }

    @Override // X.AbstractC63678Srl, X.InterfaceC65628Tpp
    public final void Aho(Matrix matrix, RectF rectF, boolean z) {
        super.Aho(matrix, rectF, z);
        RectF rectF2 = this.A06;
        SOF sof = this.A04;
        rectF2.set(0.0f, 0.0f, sof.A06, sof.A05);
        this.A0A.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
