package X;

/* loaded from: classes5.dex */
public final class CVY {
    public final C87 A00;
    public final CVZ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVY) {
                CVY cvy = (CVY) obj;
                if (this.A00 != cvy.A00 || !C14360o3.A0K(this.A01, cvy.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public CVY(C87 c87, CVZ cvz) {
        this.A00 = c87;
        this.A01 = cvz;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NuxSectionData(iconName=");
        A1C.append(this.A00);
        A1C.append(", body=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
