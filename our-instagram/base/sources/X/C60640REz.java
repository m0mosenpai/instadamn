package X;

/* renamed from: X.REz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60640REz extends AbstractC61292RlC {
    public final long A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AbstractC61292RlC)) {
                return false;
            }
            C60640REz c60640REz = (C60640REz) ((AbstractC61292RlC) obj);
            if (!this.A01.equals(c60640REz.A01) || this.A00 != c60640REz.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        return ((AbstractC25230BEn.A0C(num, S2G.A00(num)) ^ 1000003) * 1000003) ^ AbstractC25228BEl.A03(this.A00);
    }

    public C60640REz(long j, Integer num) {
        this.A01 = num;
        this.A00 = j;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BackendResponse{status=");
        Integer num = this.A01;
        if (num != null) {
            str = S2G.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", nextRequestWaitMillis=");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
