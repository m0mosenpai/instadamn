package X;

/* renamed from: X.OWu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55020OWu {
    public final C5Hc A00;
    public final C5Hc A01;
    public final boolean A02;

    public C55020OWu(C5Hc c5Hc, C5Hc c5Hc2, boolean z) {
        C14360o3.A0B(c5Hc2, 3);
        this.A02 = z;
        this.A00 = c5Hc;
        this.A01 = c5Hc2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C55020OWu) {
                C55020OWu c55020OWu = (C55020OWu) obj;
                if (this.A02 != c55020OWu.A02 || !C14360o3.A0K(this.A00, c55020OWu.A00) || !C14360o3.A0K(this.A01, c55020OWu.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC25225BEi.A08(this.A02)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MEmuUpdateProfileResponse(createdMEmuProfile=");
        A1C.append(this.A02);
        A1C.append(", extendedCaptureImages=");
        A1C.append(this.A00);
        A1C.append(", verificationResults=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C55020OWu() {
        /*
            r2 = this;
            r1 = 0
            X.5HZ r0 = X.C5HZ.A01
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55020OWu.<init>():void");
    }
}
