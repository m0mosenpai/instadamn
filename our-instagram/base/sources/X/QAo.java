package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class QAo extends AbstractC63678Srl {
    public final C63672Srf A00;
    public final C58808QAr A01;

    public QAo(SQ2 sq2, Q2O q2o, C58808QAr c58808QAr, SOF sof) {
        super(q2o, sof);
        this.A01 = c58808QAr;
        C63672Srf c63672Srf = new C63672Srf(sq2, q2o, new Ss0("__container", sof.A0N, false), this);
        this.A00 = c63672Srf;
        c63672Srf.ES5(Collections.emptyList(), Collections.emptyList());
    }

    @Override // X.AbstractC63678Srl, X.InterfaceC65628Tpp
    public final void Aho(Matrix matrix, RectF rectF, boolean z) {
        super.Aho(matrix, rectF, z);
        this.A00.Aho(this.A0A, rectF, z);
    }
}
