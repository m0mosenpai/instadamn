package X;

import java.util.List;

/* renamed from: X.REu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60635REu extends S2C {
    public final long A00;
    public final long A01;
    public final S2A A02;
    public final EnumC61095Rf9 A03;
    public final Integer A04;
    public final String A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof S2C)) {
                return false;
            }
            C60635REu c60635REu = (C60635REu) ((S2C) obj);
            if (this.A00 == c60635REu.A00 && this.A01 == c60635REu.A01) {
                S2A s2a = this.A02;
                S2A s2a2 = c60635REu.A02;
                if (s2a == null) {
                    if (s2a2 != null) {
                        return false;
                    }
                } else if (!s2a.equals(s2a2)) {
                    return false;
                }
                Integer num = this.A04;
                Integer num2 = c60635REu.A04;
                if (num == null) {
                    if (num2 != null) {
                        return false;
                    }
                } else if (!num.equals(num2)) {
                    return false;
                }
                String str = this.A05;
                String str2 = c60635REu.A05;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                List list = this.A06;
                List list2 = c60635REu.A06;
                if (list == null) {
                    if (list2 != null) {
                        return false;
                    }
                } else if (!list.equals(list2)) {
                    return false;
                }
                EnumC61095Rf9 enumC61095Rf9 = this.A03;
                EnumC61095Rf9 enumC61095Rf92 = c60635REu.A03;
                if (enumC61095Rf9 != null) {
                    return enumC61095Rf9.equals(enumC61095Rf92);
                }
                if (enumC61095Rf92 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.A01;
        int A0M = (((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ AbstractC167017dG.A0M(this.A02)) * 1000003) ^ AbstractC167017dG.A0M(this.A04)) * 1000003) ^ AbstractC167017dG.A0O(this.A05)) * 1000003;
        List list = this.A06;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((A0M ^ hashCode) * 1000003) ^ AbstractC166997dE.A0I(this.A03);
    }

    public C60635REu(S2A s2a, EnumC61095Rf9 enumC61095Rf9, Integer num, String str, List list, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = s2a;
        this.A04 = num;
        this.A05 = str;
        this.A06 = list;
        this.A03 = enumC61095Rf9;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LogRequest{requestTimeMs=");
        A1C.append(this.A00);
        A1C.append(", requestUptimeMs=");
        A1C.append(this.A01);
        A1C.append(", clientInfo=");
        A1C.append(this.A02);
        A1C.append(", logSource=");
        A1C.append(this.A04);
        A1C.append(", logSourceName=");
        A1C.append(this.A05);
        A1C.append(", logEvents=");
        A1C.append(this.A06);
        A1C.append(", qosTier=");
        return JQ0.A0l(this.A03, A1C);
    }
}
