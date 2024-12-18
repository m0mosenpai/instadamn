package X;

/* loaded from: classes10.dex */
public final class SOu {
    public final C69763Vv0 A00;
    public final C62736SOc A01;
    public final C69764Vv1 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SOu) {
                SOu sOu = (SOu) obj;
                if (!C14360o3.A0K(this.A01, sOu.A01) || !C14360o3.A0K(this.A00, sOu.A00) || !C14360o3.A0K(this.A02, sOu.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public SOu(C69763Vv0 c69763Vv0, C62736SOc c62736SOc, C69764Vv1 c69764Vv1) {
        this.A01 = c62736SOc;
        this.A00 = c69763Vv0;
        this.A02 = c69764Vv1;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FBPayContactInfoComponent(fullNameComponent=");
        A1C.append(this.A01);
        A1C.append(", emailListComponent=");
        A1C.append(this.A00);
        A1C.append(", phoneNumberListComponent=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
