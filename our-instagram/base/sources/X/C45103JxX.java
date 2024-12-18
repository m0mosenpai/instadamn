package X;

/* renamed from: X.JxX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45103JxX extends C0T6 {
    public final float A00;
    public final float A01;
    public final int A02 = 1;
    public final Object A03;

    public C45103JxX(Boolean bool, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A03 = bool;
    }

    public final boolean equals(Object obj) {
        if (this.A02 != 0) {
            if (this != obj) {
                if (obj instanceof C45103JxX) {
                    C45103JxX c45103JxX = (C45103JxX) obj;
                    if (c45103JxX.A02 != 1 || this.A03 != c45103JxX.A03 || Float.compare(this.A00, c45103JxX.A00) != 0 || Float.compare(this.A01, c45103JxX.A01) != 0) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C45103JxX)) {
                return false;
            }
            C45103JxX c45103JxX2 = (C45103JxX) obj;
            if (c45103JxX2.A02 != 0 || Float.compare(this.A00, c45103JxX2.A00) != 0 || Float.compare(this.A01, c45103JxX2.A01) != 0 || !C14360o3.A0K(this.A03, c45103JxX2.A03)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A00;
        int A0M;
        if (this.A02 != 0) {
            A00 = AbstractC166997dE.A00(AbstractC166987dD.A0G(this.A03), this.A00);
            A0M = Float.floatToIntBits(this.A01);
        } else {
            A00 = AbstractC166997dE.A00(Float.floatToIntBits(this.A00) * 31, this.A01);
            A0M = AbstractC167017dG.A0M(this.A03);
        }
        return A00 + A0M;
    }

    public final String toString() {
        if (1 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProfileTapInfo(profileType=");
        A1C.append(this.A03);
        A1C.append(", xDown=");
        A1C.append(this.A00);
        A1C.append(", yDown=");
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }

    public C45103JxX(C65 c65, float f, float f2) {
        this.A03 = c65;
        this.A00 = f;
        this.A01 = f2;
    }
}
