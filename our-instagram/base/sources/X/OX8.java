package X;

/* loaded from: classes9.dex */
public final class OX8 {
    public static final OX8 A03;
    public final O1E A00;
    public final O1E A01;
    public final O1E A02;

    public final OX8 A00(O1E o1e, EnumC53109NeM enumC53109NeM) {
        C14360o3.A0B(enumC53109NeM, 0);
        C14360o3.A0B(o1e, 1);
        int ordinal = enumC53109NeM.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1) {
                if (ordinal == 0) {
                    return new OX8(o1e, this.A01, this.A00);
                }
                throw B4Z.A00();
            }
            return new OX8(this.A02, o1e, this.A00);
        }
        return new OX8(this.A02, this.A01, o1e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OX8) {
                OX8 ox8 = (OX8) obj;
                if (!C14360o3.A0K(this.A02, ox8.A02) || !C14360o3.A0K(this.A01, ox8.A01) || !C14360o3.A0K(this.A00, ox8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        C51057MhB c51057MhB = C51057MhB.A01;
        A03 = new OX8(c51057MhB, c51057MhB, c51057MhB);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)));
    }

    public OX8(O1E o1e, O1E o1e2, O1E o1e3) {
        this.A02 = o1e;
        this.A01 = o1e2;
        this.A00 = o1e3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoadStates(refresh=");
        A1C.append(this.A02);
        A1C.append(", prepend=");
        A1C.append(this.A01);
        A1C.append(", append=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
