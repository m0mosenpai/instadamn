package X;

import libraries.zero.headers.ZeroHeadersEntry;

/* renamed from: X.OLc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54822OLc {
    public final C54510O6n A00;
    public final ZeroHeadersEntry A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54822OLc) {
                C54822OLc c54822OLc = (C54822OLc) obj;
                if (!C14360o3.A0K(this.A00, c54822OLc.A00) || !C14360o3.A0K(this.A01, c54822OLc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }

    public C54822OLc(C54510O6n c54510O6n, ZeroHeadersEntry zeroHeadersEntry) {
        this.A00 = c54510O6n;
        this.A01 = zeroHeadersEntry;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ZeroHeadwindResult(result=");
        A1C.append(this.A00);
        A1C.append(", entry=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
