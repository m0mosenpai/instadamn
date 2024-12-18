package X;

/* renamed from: X.63F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63F extends C63G {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public C63F(String str, Integer num, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63F) {
                C63F c63f = (C63F) obj;
                if (!C14360o3.A0K(this.A01, c63f.A01) || !C14360o3.A0K(this.A02, c63f.A02) || this.A00 != c63f.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "NORMAL";
        } else {
            str = "SECURE";
        }
        return hashCode + str.hashCode() + intValue;
    }

    public final String toString() {
        String str;
        String str2 = this.A01;
        String str3 = this.A02;
        Integer num = this.A00;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = "NORMAL";
            } else {
                str = "SECURE";
            }
        } else {
            str = "null";
        }
        return AnonymousClass001.A14("BloksPrepackagedData(checksum=", str2, ", publicCdnUrl=", str3, ", contentSecurityType=", str, ')');
    }
}
