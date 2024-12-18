package X;

/* renamed from: X.K2i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45280K2i extends C0T6 implements MNQ {
    public final Integer A00;
    public final String A01;

    public C45280K2i(String str, Integer num) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45280K2i) {
                C45280K2i c45280K2i = (C45280K2i) obj;
                if (!C14360o3.A0K(this.A01, c45280K2i.A01) || this.A00 != c45280K2i.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166987dD.A0J(this.A01);
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "LINK";
                break;
            case 2:
                str = "EMOJI";
                break;
            case 3:
                str = "POWERUP_GIFTWRAP";
                break;
            case 4:
                str = "MENTION";
                break;
            default:
                str = "TEXT";
                break;
        }
        return A0J + AbstractC25226BEj.A02(str, intValue);
    }
}
