package X;

/* loaded from: classes10.dex */
public final class SOL {
    public final R1S A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SOL) && C14360o3.A0K(this.A00, ((SOL) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00) * 31;
    }

    public SOL(R1S r1s) {
        this.A00 = r1s;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FBPayPhoneNumberResponse(phoneNumberResponse=");
        A1C.append(this.A00);
        A1C.append(", deletedPhoneNumber=");
        return AbstractC25236BEt.A0Y(null, A1C);
    }
}
