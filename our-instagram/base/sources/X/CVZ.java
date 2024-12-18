package X;

/* loaded from: classes5.dex */
public final class CVZ {
    public final String A00;
    public final C09530e4 A01;

    public CVZ(String str, C09530e4 c09530e4) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = c09530e4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVZ) {
                CVZ cvz = (CVZ) obj;
                if (!C14360o3.A0K(this.A00, cvz.A00) || !C14360o3.A0K(this.A01, cvz.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0M(this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NuxStringData(text=");
        A1C.append(this.A00);
        A1C.append(", embeddedLink=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
