package X;

/* loaded from: classes8.dex */
public final class LGQ {
    public final EnumC46211Kcn A00;
    public final Boolean A01;

    public LGQ(EnumC46211Kcn enumC46211Kcn, Boolean bool) {
        this.A00 = enumC46211Kcn;
        this.A01 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LGQ) {
                LGQ lgq = (LGQ) obj;
                if (this.A00 != lgq.A00 || !C14360o3.A0K(this.A01, lgq.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int ordinal;
        EnumC46211Kcn enumC46211Kcn = this.A00;
        if (enumC46211Kcn == null) {
            ordinal = -1;
        } else {
            ordinal = enumC46211Kcn.ordinal();
        }
        return ((ordinal + 31) * 31) + AbstractC25235BEs.A06(this.A01);
    }

    public LGQ(C47474Ky3 c47474Ky3) {
        this.A00 = c47474Ky3.A00;
        this.A01 = c47474Ky3.A01;
    }
}
