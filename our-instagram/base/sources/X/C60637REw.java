package X;

/* renamed from: X.REw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60637REw extends S2D {
    public final EnumC61147Rg8 A00;
    public final EnumC61087Rf1 A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof S2D)) {
                return false;
            }
            EnumC61087Rf1 enumC61087Rf1 = this.A01;
            C60637REw c60637REw = (C60637REw) ((S2D) obj);
            EnumC61087Rf1 enumC61087Rf12 = c60637REw.A01;
            if (enumC61087Rf1 == null) {
                if (enumC61087Rf12 != null) {
                    return false;
                }
            } else if (!enumC61087Rf1.equals(enumC61087Rf12)) {
                return false;
            }
            EnumC61147Rg8 enumC61147Rg8 = this.A00;
            EnumC61147Rg8 enumC61147Rg82 = c60637REw.A00;
            if (enumC61147Rg8 != null) {
                return enumC61147Rg8.equals(enumC61147Rg82);
            }
            if (enumC61147Rg82 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167017dG.A0M(this.A01) ^ 1000003) * 1000003) ^ AbstractC166997dE.A0I(this.A00);
    }

    public C60637REw(EnumC61147Rg8 enumC61147Rg8, EnumC61087Rf1 enumC61087Rf1) {
        this.A01 = enumC61087Rf1;
        this.A00 = enumC61147Rg8;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NetworkConnectionInfo{networkType=");
        A1C.append(this.A01);
        A1C.append(", mobileSubtype=");
        return JQ0.A0l(this.A00, A1C);
    }
}
