package X;

/* loaded from: classes9.dex */
public final class OLS {
    public final Object A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLS) {
                OLS ols = (OLS) obj;
                if (this.A01 != ols.A01 || !C14360o3.A0K(this.A00, ols.A00) || !"".equals("")) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        Integer num = this.A01;
        if (num.intValue() != 0) {
            str = "AUTODUBBING";
        } else {
            str = "STICKER_ANYTHING";
        }
        return AbstractC166997dE.A0J(this.A00, AbstractC25230BEn.A0C(num, str) * 31);
    }

    public OLS(Integer num, Object obj) {
        this.A01 = num;
        this.A00 = obj;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EditRequestData(type=");
        if (this.A01.intValue() != 0) {
            str = "AUTODUBBING";
        } else {
            str = "STICKER_ANYTHING";
        }
        A1C.append(str);
        A1C.append(", data=");
        A1C.append(this.A00);
        A1C.append(", uploadId=");
        return AbstractC25236BEt.A0Y("", A1C);
    }
}
