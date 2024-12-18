package X;

/* renamed from: X.OLo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54829OLo {
    public final EnumC53315Nhr A00;
    public final EnumC53320Nhw A01;
    public final Boolean A02;
    public final Double A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54829OLo) {
                C54829OLo c54829OLo = (C54829OLo) obj;
                if (!C14360o3.A0K(this.A02, c54829OLo.A02) || this.A00 != c54829OLo.A00 || !C14360o3.A0K(this.A03, c54829OLo.A03) || this.A01 != c54829OLo.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C54829OLo(EnumC53315Nhr enumC53315Nhr, EnumC53320Nhw enumC53320Nhw, Boolean bool, Double d) {
        this.A02 = bool;
        this.A00 = enumC53315Nhr;
        this.A03 = d;
        this.A01 = enumC53320Nhw;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MEmuExtendedCaptureVerificationResult(isSimilar=");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(281));
        A1C.append(this.A00);
        A1C.append(", similarityScore=");
        A1C.append(this.A03);
        A1C.append(", verificationStatus=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
