package X;

/* renamed from: X.Sad, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63013Sad {
    public final C63199Sf2 A00;
    public final C63199Sf2 A01;
    public final C63199Sf2 A02;
    public final C63199Sf2 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63013Sad) {
                C63013Sad c63013Sad = (C63013Sad) obj;
                if (!C14360o3.A0K(this.A02, c63013Sad.A02) || !C14360o3.A0K(this.A03, c63013Sad.A03) || !C14360o3.A0K(this.A00, c63013Sad.A00) || !C14360o3.A0K(this.A01, c63013Sad.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        C63199Sf2 c63199Sf2 = this.A02;
        if (c63199Sf2.A00 <= 0.0f && c63199Sf2.A01 <= 0.0f) {
            C63199Sf2 c63199Sf22 = this.A03;
            if (c63199Sf22.A00 <= 0.0f && c63199Sf22.A01 <= 0.0f) {
                C63199Sf2 c63199Sf23 = this.A00;
                if (c63199Sf23.A00 <= 0.0f && c63199Sf23.A01 <= 0.0f && this.A01.A00 <= 0.0f) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02))));
    }

    public C63013Sad(C63199Sf2 c63199Sf2, C63199Sf2 c63199Sf22, C63199Sf2 c63199Sf23, C63199Sf2 c63199Sf24) {
        this.A02 = c63199Sf2;
        this.A03 = c63199Sf22;
        this.A00 = c63199Sf23;
        this.A01 = c63199Sf24;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ComputedBorderRadius(topLeft=");
        A1C.append(this.A02);
        A1C.append(", topRight=");
        A1C.append(this.A03);
        A1C.append(", bottomLeft=");
        A1C.append(this.A00);
        A1C.append(", bottomRight=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    public C63013Sad() {
        this(new C63199Sf2(0.0f, 0.0f), new C63199Sf2(0.0f, 0.0f), new C63199Sf2(0.0f, 0.0f), new C63199Sf2(0.0f, 0.0f));
    }
}
