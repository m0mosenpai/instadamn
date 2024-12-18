package X;

/* renamed from: X.GzF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38674GzF extends C0T6 {
    public long A00;
    public String A01;
    public final int A02;

    public C38674GzF(long j, String str) {
        this.A02 = 0;
        this.A00 = j;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this.A02 != 0) {
            if (this != obj) {
                if (obj instanceof C38674GzF) {
                    C38674GzF c38674GzF = (C38674GzF) obj;
                    if (c38674GzF.A02 != 1 || !C14360o3.A0K(this.A01, c38674GzF.A01) || this.A00 != c38674GzF.A00) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C38674GzF)) {
                return false;
            }
            C38674GzF c38674GzF2 = (C38674GzF) obj;
            if (c38674GzF2.A02 != 0 || this.A00 != c38674GzF2.A00 || !C14360o3.A0K(this.A01, c38674GzF2.A01)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A03;
        int hashCode;
        if (this.A02 != 0) {
            A03 = AbstractC166987dD.A0J(this.A01);
            long j = this.A00;
            hashCode = (int) (j ^ (j >>> 32));
        } else {
            A03 = AbstractC25235BEs.A03(this.A00);
            hashCode = this.A01.hashCode();
        }
        return A03 + hashCode;
    }

    public final String toString() {
        if (this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Event(timestamp=");
        A1C.append(this.A00);
        A1C.append(", type=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }

    public C38674GzF() {
        this.A02 = 1;
        this.A02 = 1;
        this.A02 = 1;
        this.A01 = "";
        this.A00 = 0L;
    }
}
