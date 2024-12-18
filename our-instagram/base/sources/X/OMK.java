package X;

/* loaded from: classes9.dex */
public final class OMK {
    public O1E A00;
    public O1E A01;
    public O1E A02;

    public final O1E A00(EnumC53109NeM enumC53109NeM) {
        int A05 = AbstractC25227BEk.A05(enumC53109NeM, 0);
        if (A05 != 0) {
            if (A05 != 2) {
                if (A05 == 1) {
                    return this.A01;
                }
                throw B4Z.A00();
            }
            return this.A00;
        }
        return this.A02;
    }

    public final void A02(O1E o1e, EnumC53109NeM enumC53109NeM) {
        C14360o3.A0B(enumC53109NeM, 0);
        int ordinal = enumC53109NeM.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal == 1) {
                    this.A01 = o1e;
                    return;
                }
                throw B4Z.A00();
            }
            this.A00 = o1e;
            return;
        }
        this.A02 = o1e;
    }

    public final void A03(OX8 ox8) {
        C14360o3.A0B(ox8, 0);
        this.A02 = ox8.A02;
        this.A00 = ox8.A00;
        this.A01 = ox8.A01;
    }

    public final OX8 A01() {
        return new OX8(this.A02, this.A01, this.A00);
    }

    public OMK() {
        C51057MhB c51057MhB = C51057MhB.A01;
        this.A02 = c51057MhB;
        this.A01 = c51057MhB;
        this.A00 = c51057MhB;
    }
}
