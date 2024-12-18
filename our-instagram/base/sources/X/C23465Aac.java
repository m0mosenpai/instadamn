package X;

import java.util.concurrent.ExecutionException;

/* renamed from: X.Aac, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23465Aac implements BDG {
    public final /* synthetic */ C179737yN A00;
    public final /* synthetic */ C22912A8i A01;
    public final /* synthetic */ boolean[] A02;

    public C23465Aac(C179737yN c179737yN, C22912A8i c22912A8i, boolean[] zArr) {
        this.A00 = c179737yN;
        this.A02 = zArr;
        this.A01 = c22912A8i;
    }

    @Override // X.BDG
    public final void Dyo(Exception exc) {
        Exception exc2;
        AbstractC184688Hj abstractC184688Hj;
        C179737yN c179737yN = this.A00;
        c179737yN.A0B.append("oCF,");
        if ((exc instanceof ExecutionException) && (exc.getCause() instanceof Exception)) {
            exc2 = (Exception) exc.getCause();
        } else {
            exc2 = exc;
        }
        c179737yN.A0C.set(false);
        Integer num = C05F.A01;
        c179737yN.A04 = num;
        exc.getMessage();
        c179737yN.A09.ClA(new C212409b9(exc2), "recording_controller_error", "ArVideoCaptureCoordinator", "", "medium", "onVideoCaptureException", AbstractC166987dD.A0M(c179737yN));
        if (this.A02[0] && c179737yN.A0E != C05F.A0C) {
            C22912A8i c22912A8i = this.A01;
            if (c179737yN.A0E != num || (abstractC184688Hj = c22912A8i.A00) == null) {
                abstractC184688Hj = c22912A8i.A02;
            }
        } else {
            abstractC184688Hj = this.A01.A01;
        }
        abstractC184688Hj.A01(exc2);
    }

    @Override // X.BDG
    public final void Dyp(Y1s y1s) {
        C179737yN c179737yN = this.A00;
        c179737yN.A0B.append("oCS,");
        this.A02[0] = true;
        c179737yN.A04 = C05F.A0Y;
        this.A01.A01.A02(y1s);
    }

    @Override // X.BDG
    public final void Dyq(Y1s y1s) {
        AbstractC184688Hj abstractC184688Hj;
        C179737yN c179737yN = this.A00;
        c179737yN.A0B.append("oCE,");
        Integer num = C05F.A01;
        c179737yN.A04 = num;
        C22912A8i c22912A8i = this.A01;
        if (c179737yN.A0E != num || (abstractC184688Hj = c22912A8i.A00) == null) {
            abstractC184688Hj = c22912A8i.A02;
        }
        abstractC184688Hj.A02(y1s);
    }
}
