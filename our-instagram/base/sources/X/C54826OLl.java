package X;

/* renamed from: X.OLl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54826OLl {
    public final OM0 A00;
    public final boolean A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54826OLl) {
                C54826OLl c54826OLl = (C54826OLl) obj;
                if (this.A01 != c54826OLl.A01 || !C14360o3.A0K(this.A02, c54826OLl.A02) || !C14360o3.A0K(this.A00, c54826OLl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC25225BEi.A08(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C54826OLl(String str, OM0 om0, boolean z) {
        this.A01 = z;
        this.A02 = str;
        this.A00 = om0;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ZeroHeadersConfigFetchResponse(isSuccess=");
        A1C.append(this.A01);
        A1C.append(", errorMessage=");
        A1C.append(this.A02);
        A1C.append(", data=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
