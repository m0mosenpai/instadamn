package X;

/* renamed from: X.9QC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9QC extends C0T6 {
    public final int A00 = 1;
    public final long A01;
    public final String A02;
    public final String A03;

    public C9QC(int i, String str, String str2, long j) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C9QC) {
                C9QC c9qc = (C9QC) obj;
                if (c9qc.A00 != 0 || this.A01 != c9qc.A01 || !C14360o3.A0K(this.A02, c9qc.A02) || !C14360o3.A0K(this.A03, c9qc.A03)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return super.hashCode();
        }
        long j = this.A01;
        return AbstractC166997dE.A0K(this.A02, ((int) (j ^ (j >>> 32))) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Marker(pointName=");
        A1C.append(this.A03);
        A1C.append(", data=");
        A1C.append(this.A02);
        A1C.append(", time=");
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }

    public C9QC(String str, String str2, long j) {
        AbstractC167017dG.A1R(str, str2);
        this.A01 = j;
        this.A02 = str;
        this.A03 = str2;
    }
}
