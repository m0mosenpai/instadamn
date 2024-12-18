package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class RDC extends SXY implements Serializable {
    public final SXY A00;
    public final SXY A01;

    public RDC(SXY sxy, SXY sxy2) {
        this.A00 = sxy;
        this.A01 = sxy2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[ChainedTransformer(");
        AbstractC58322PtE.A1R(A1C, this.A00);
        A1C.append(this.A01);
        return AbstractC166997dE.A0x(")]", A1C);
    }
}
