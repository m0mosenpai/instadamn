package X;

/* loaded from: classes7.dex */
public final class H87 extends C0T6 implements InterfaceC43392JFh {
    public final EnumC77173d3 A00;
    public final Integer A01;
    public final String A02;

    public H87(EnumC77173d3 enumC77173d3, Integer num, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = enumC77173d3;
        this.A02 = str;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H87) {
                H87 h87 = (H87) obj;
                if (this.A00 != h87.A00 || !C14360o3.A0K(this.A02, h87.A02) || this.A01 != h87.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A00));
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "USER";
        } else {
            str = "API_FAILURE";
        }
        return A0K + AbstractC25226BEj.A02(str, intValue);
    }
}
