package X;

/* renamed from: X.L9i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47800L9i {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47800L9i) {
                C47800L9i c47800L9i = (C47800L9i) obj;
                if (this.A02 != c47800L9i.A02 || this.A00 != c47800L9i.A00 || !C14360o3.A0K(this.A01, c47800L9i.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, (AbstractC25225BEi.A08(this.A02) + this.A00) * 31);
    }

    public C47800L9i(String str, int i, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ZeroHeadersSideEffectsResponse(isSuccess=");
        A1C.append(this.A02);
        A1C.append(", statusCode=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(132));
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }
}
