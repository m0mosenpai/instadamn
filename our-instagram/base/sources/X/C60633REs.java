package X;

/* renamed from: X.REs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60633REs extends S2A {
    public final S28 A00;
    public final EnumC61086Rf0 A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof S2A)) {
                return false;
            }
            EnumC61086Rf0 enumC61086Rf0 = this.A01;
            C60633REs c60633REs = (C60633REs) ((S2A) obj);
            EnumC61086Rf0 enumC61086Rf02 = c60633REs.A01;
            if (enumC61086Rf0 == null) {
                if (enumC61086Rf02 != null) {
                    return false;
                }
            } else if (!enumC61086Rf0.equals(enumC61086Rf02)) {
                return false;
            }
            S28 s28 = this.A00;
            S28 s282 = c60633REs.A00;
            if (s28 != null) {
                return s28.equals(s282);
            }
            if (s282 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167017dG.A0M(this.A01) ^ 1000003) * 1000003) ^ AbstractC166997dE.A0I(this.A00);
    }

    public C60633REs(S28 s28, EnumC61086Rf0 enumC61086Rf0) {
        this.A01 = enumC61086Rf0;
        this.A00 = s28;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClientInfo{clientType=");
        A1C.append(this.A01);
        A1C.append(", androidClientInfo=");
        return JQ0.A0l(this.A00, A1C);
    }
}
