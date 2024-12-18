package X;

/* renamed from: X.Nnl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53640Nnl {
    public double A00;
    public int A01;
    public long A02;
    public long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53640Nnl) {
                C53640Nnl c53640Nnl = (C53640Nnl) obj;
                if (this.A03 != c53640Nnl.A03 || this.A02 != c53640Nnl.A02 || Double.compare(this.A00, c53640Nnl.A00) != 0 || this.A01 != c53640Nnl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A03;
        int A07 = (AbstractC167007dF.A07(this.A02, ((int) (j ^ (j >>> 32))) * 31) + AbstractC28006CWd.A00(this.A00)) * 31;
        int A00 = AbstractC53644Nnp.A00();
        return ((((A07 + A00) * 31) + A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("METAVideoMLConfig(transcodeVideoLowerEdgeSize=");
        A1C.append(this.A03);
        A1C.append(", transcodeVideoFPS=");
        A1C.append(this.A02);
        A1C.append(", creationFlowTimeoutSec=");
        A1C.append(this.A00);
        A1C.append(", enableEditStatus=");
        A1C.append(false);
        A1C.append(", enableUploadingMask=");
        A1C.append(false);
        A1C.append(", maxEditRequestRetries=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
