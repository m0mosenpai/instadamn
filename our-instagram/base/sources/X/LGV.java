package X;

/* loaded from: classes8.dex */
public final class LGV {
    public final EnumC46211Kcn A00;
    public final Boolean A01;
    public final Number A02;
    public final Number A03;

    public LGV(EnumC46211Kcn enumC46211Kcn, Boolean bool, Number number, Number number2) {
        this.A02 = number;
        this.A00 = enumC46211Kcn;
        this.A03 = number2;
        this.A01 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LGV) {
                LGV lgv = (LGV) obj;
                if (!C14360o3.A0K(this.A02, lgv.A02) || this.A00 != lgv.A00 || !C14360o3.A0K(this.A03, lgv.A03) || !C14360o3.A0K(this.A01, lgv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int ordinal;
        int A06 = AbstractC25235BEs.A06(this.A02) + 31;
        EnumC46211Kcn enumC46211Kcn = this.A00;
        if (enumC46211Kcn == null) {
            ordinal = -1;
        } else {
            ordinal = enumC46211Kcn.ordinal();
        }
        return (((((A06 * 31) + ordinal) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A01);
    }

    public LGV(C47473Ky2 c47473Ky2) {
        this.A02 = null;
        this.A00 = c47473Ky2.A00;
        this.A03 = null;
        this.A01 = c47473Ky2.A01;
    }
}
