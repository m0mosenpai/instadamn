package X;

/* loaded from: classes5.dex */
public final class BI7 extends BH1 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI7) {
                BI7 bi7 = (BI7) obj;
                if (!C14360o3.A0K(this.A04, bi7.A04) || !C14360o3.A0K(this.A03, bi7.A03) || this.A02 != bi7.A02 || this.A00 != bi7.A00 || this.A01 != bi7.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public BI7(String str, String str2, int i, int i2, Integer num) {
        super("content_type_newsfeed_truncation_control", "content_type_newsfeed_truncation_control");
        this.A04 = str;
        this.A03 = str2;
        this.A02 = num;
        this.A00 = i;
        this.A01 = i2;
    }

    public final int hashCode() {
        String str;
        int A0K = AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A04));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 2:
                str = "TODAY";
                break;
            case 3:
                str = "YESTERDAY";
                break;
            case 4:
                str = "SEVEN_DAYS";
                break;
            case 5:
                str = "THIRTY_DAYS";
                break;
            case 6:
                str = "OLDER";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return ((AbstractC25231BEo.A0H(str, intValue, A0K) + this.A00) * 31) + this.A01;
    }
}
