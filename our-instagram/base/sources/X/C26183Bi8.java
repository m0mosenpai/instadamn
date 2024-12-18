package X;

/* renamed from: X.Bi8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26183Bi8 extends C0T6 implements InterfaceC30938Dis {
    public final Integer A00;
    public final String A01;
    public final InterfaceC16820sZ A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26183Bi8) {
                C26183Bi8 c26183Bi8 = (C26183Bi8) obj;
                if (!C14360o3.A0K(this.A01, c26183Bi8.A01) || !C14360o3.A0K(this.A02, c26183Bi8.A02) || this.A00 != c26183Bi8.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A01));
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "PRIMARY";
                break;
            case 2:
                str = "SECONDARY";
                break;
            default:
                str = "LINK";
                break;
        }
        return A0J + AbstractC25226BEj.A02(str, intValue);
    }

    public C26183Bi8(String str, Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167017dG.A1P(str, interfaceC16820sZ);
        this.A01 = str;
        this.A02 = interfaceC16820sZ;
        this.A00 = num;
    }

    @Override // X.InterfaceC30938Dis
    public final InterfaceC16820sZ BYj() {
        return this.A02;
    }
}
