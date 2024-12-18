package X;

/* loaded from: classes10.dex */
public final class SOK {
    public final R1O A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SOK) && C14360o3.A0K(this.A00, ((SOK) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00) * 31;
    }

    public SOK(R1O r1o) {
        this.A00 = r1o;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FBPayEmailResponse(emailResponse=");
        A1C.append(this.A00);
        A1C.append(", deletedEmail=");
        return AbstractC25236BEt.A0Y(null, A1C);
    }
}
