package X;

/* renamed from: X.0v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18210v6 {
    public static final C18210v6 A02 = new C18210v6(null, null);
    public final Integer A00;
    public final InterfaceC16500rv A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18210v6) {
                C18210v6 c18210v6 = (C18210v6) obj;
                if (this.A00 != c18210v6.A00 || !C14360o3.A0K(this.A01, c18210v6.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        Integer num = this.A00;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "IN";
                    break;
                case 2:
                    str = "OUT";
                    break;
                default:
                    str = "INVARIANT";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        int i2 = hashCode * 31;
        InterfaceC16500rv interfaceC16500rv = this.A01;
        if (interfaceC16500rv != null) {
            i = interfaceC16500rv.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        int intValue;
        StringBuilder sb;
        String str;
        Integer num = this.A00;
        if (num != null && (intValue = num.intValue()) != -1) {
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        sb = new StringBuilder();
                        str = "out ";
                    } else {
                        throw new B4Z();
                    }
                } else {
                    sb = new StringBuilder();
                    str = "in ";
                }
                sb.append(str);
                sb.append(this.A01);
                return sb.toString();
            }
            return String.valueOf(this.A01);
        }
        return "*";
    }

    public C18210v6(Integer num, InterfaceC16500rv interfaceC16500rv) {
        String str;
        String A0g;
        this.A00 = num;
        this.A01 = interfaceC16500rv;
        if ((num == null) == (interfaceC16500rv == null)) {
            return;
        }
        if (num == null) {
            A0g = "Star projection must have no type specified.";
        } else {
            switch (num.intValue()) {
                case 1:
                    str = "IN";
                    break;
                case 2:
                    str = "OUT";
                    break;
                default:
                    str = "INVARIANT";
                    break;
            }
            A0g = AnonymousClass001.A0g("The projection variance ", str, " requires type to be specified.");
        }
        throw new IllegalArgumentException(A0g);
    }
}
