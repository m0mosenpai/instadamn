package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes10.dex */
public final class QAp extends AbstractC63678Srl {
    public AbstractC63308ShE A00;
    public AbstractC63308ShE A01;
    public final Paint A02;
    public final Rect A03;
    public final Rect A04;
    public final C62597SIa A05;

    public QAp(Q2O q2o, SOF sof) {
        super(q2o, sof);
        C62597SIa c62597SIa;
        this.A02 = new Paint(3);
        this.A04 = AbstractC166987dD.A0U();
        this.A03 = AbstractC166987dD.A0U();
        String str = sof.A0K;
        SQ2 sq2 = q2o.A0F;
        if (sq2 == null) {
            c62597SIa = null;
        } else {
            c62597SIa = (C62597SIa) sq2.A02().get(str);
        }
        this.A05 = c62597SIa;
    }

    @Override // X.AbstractC63678Srl, X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        super.AAj(c62961SZe, obj);
        QAV qav = null;
        if (obj == InterfaceC65609To0.A01) {
            if (c62961SZe == null) {
                this.A00 = null;
                return;
            } else {
                this.A00 = new QAV(c62961SZe, null);
                return;
            }
        }
        if (obj != InterfaceC65609To0.A00) {
            return;
        }
        if (c62961SZe != null) {
            qav = QAV.A00(c62961SZe);
        }
        this.A01 = qav;
    }

    @Override // X.AbstractC63678Srl, X.InterfaceC65628Tpp
    public final void Aho(Matrix matrix, RectF rectF, boolean z) {
        super.Aho(matrix, rectF, z);
        if (this.A05 != null) {
            float A00 = AbstractC63359SiH.A00();
            rectF.set(0.0f, 0.0f, r1.A02 * A00, r1.A01 * A00);
            this.A0A.mapRect(rectF);
        }
    }
}
