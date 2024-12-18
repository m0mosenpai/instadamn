package X;

import java.util.concurrent.ExecutionException;

/* renamed from: X.Aad, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23466Aad implements BDG {
    public final /* synthetic */ C210019Qo A00;
    public final /* synthetic */ C22912A8i A01;
    public final /* synthetic */ boolean[] A02;

    public C23466Aad(C210019Qo c210019Qo, C22912A8i c22912A8i, boolean[] zArr) {
        this.A00 = c210019Qo;
        this.A02 = zArr;
        this.A01 = c22912A8i;
    }

    @Override // X.BDG
    public final void Dyo(Exception exc) {
        AbstractC184688Hj abstractC184688Hj;
        if ((exc instanceof ExecutionException) && (exc.getCause() instanceof Exception)) {
            exc = (Exception) exc.getCause();
        }
        if (this.A02[0]) {
            C210019Qo c210019Qo = this.A00;
            if (c210019Qo.A02 != C05F.A0C) {
                C22912A8i c22912A8i = this.A01;
                if (c210019Qo.A02 != C05F.A01 || (abstractC184688Hj = c22912A8i.A00) == null) {
                    abstractC184688Hj = c22912A8i.A02;
                }
                abstractC184688Hj.A01(exc);
            }
        }
        abstractC184688Hj = this.A01.A01;
        abstractC184688Hj.A01(exc);
    }

    @Override // X.BDG
    public final void Dyp(Y1s y1s) {
        this.A02[0] = true;
        this.A01.A01.A02(y1s);
    }

    @Override // X.BDG
    public final void Dyq(Y1s y1s) {
        AbstractC184688Hj abstractC184688Hj;
        C22912A8i c22912A8i = this.A01;
        if (this.A00.A02 != C05F.A01 || (abstractC184688Hj = c22912A8i.A00) == null) {
            abstractC184688Hj = c22912A8i.A02;
        }
        abstractC184688Hj.A02(y1s);
    }
}
