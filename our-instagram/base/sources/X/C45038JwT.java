package X;

/* renamed from: X.JwT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45038JwT extends C0T6 {
    public final double A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45038JwT) {
                C45038JwT c45038JwT = (C45038JwT) obj;
                if (this.A02 != c45038JwT.A02 || !C14360o3.A0K(this.A03, c45038JwT.A03) || !C14360o3.A0K(this.A04, c45038JwT.A04) || this.A01 != c45038JwT.A01 || Double.compare(this.A00, c45038JwT.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "PAGE_INFORMATION";
                break;
            case 2:
                str = "PREVIOUS_REPLIES";
                break;
            case 3:
                str = "SAVED_REPLY";
                break;
            case 4:
                str = "SMART_COMPOSE";
                break;
            case 5:
                str = "SMART_REPLY";
                break;
            default:
                str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                break;
        }
        return ((((AbstractC166997dE.A0K(this.A03, AbstractC25228BEl.A0F(str, intValue)) + AbstractC167017dG.A0O(this.A04)) * 31) + this.A01) * 31) + AbstractC28006CWd.A00(this.A00);
    }

    public C45038JwT(Integer num, String str, String str2, double d, int i) {
        AbstractC167017dG.A1P(num, str);
        this.A02 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = i;
        this.A00 = d;
    }
}
