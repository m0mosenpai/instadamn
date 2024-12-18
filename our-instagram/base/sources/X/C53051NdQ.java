package X;

/* renamed from: X.NdQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53051NdQ extends AbstractC53585Nmr {
    public final InterfaceC88553xD A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53051NdQ) {
                C53051NdQ c53051NdQ = (C53051NdQ) obj;
                if (!C14360o3.A0K(this.A01, c53051NdQ.A01) || !C14360o3.A0K(this.A00, c53051NdQ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C53051NdQ(InterfaceC88553xD interfaceC88553xD, String str) {
        AbstractC167017dG.A1P(str, interfaceC88553xD);
        this.A01 = str;
        this.A00 = interfaceC88553xD;
    }
}
