package X;

/* renamed from: X.3r9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85183r9 extends C0T6 implements InterfaceC85193rA {
    public final EnumC85043qs A00;
    public final C38321qM A01;
    public final boolean A02;

    public C85183r9(EnumC85043qs enumC85043qs, C38321qM c38321qM) {
        C14360o3.A0B(enumC85043qs, 2);
        this.A01 = c38321qM;
        this.A00 = enumC85043qs;
        this.A02 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C85183r9) {
                C85183r9 c85183r9 = (C85183r9) obj;
                if (!C14360o3.A0K(this.A01, c85183r9.A01) || this.A00 != c85183r9.A00 || this.A02 != c85183r9.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31 * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return hashCode + i;
    }
}
