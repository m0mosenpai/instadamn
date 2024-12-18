package X;

/* renamed from: X.REq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60631REq extends S28 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof S28)) {
                return false;
            }
            Integer num = this.A00;
            C60631REq c60631REq = (C60631REq) ((S28) obj);
            Integer num2 = c60631REq.A00;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            String str = this.A09;
            String str2 = c60631REq.A09;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.A05;
            String str4 = c60631REq.A05;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.A03;
            String str6 = c60631REq.A03;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.A0B;
            String str8 = c60631REq.A0B;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.A0A;
            String str10 = c60631REq.A0A;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.A07;
            String str12 = c60631REq.A07;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.A04;
            String str14 = c60631REq.A04;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.A06;
            String str16 = c60631REq.A06;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            String str17 = this.A02;
            String str18 = c60631REq.A02;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            String str19 = this.A08;
            String str20 = c60631REq.A08;
            if (str19 == null) {
                if (str20 != null) {
                    return false;
                }
            } else if (!str19.equals(str20)) {
                return false;
            }
            String str21 = this.A01;
            String str22 = c60631REq.A01;
            if (str21 != null) {
                return str21.equals(str22);
            }
            if (str22 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((AbstractC167017dG.A0M(this.A00) ^ 1000003) * 1000003) ^ AbstractC167017dG.A0O(this.A09)) * 1000003) ^ AbstractC167017dG.A0O(this.A05)) * 1000003) ^ AbstractC167017dG.A0O(this.A03)) * 1000003) ^ AbstractC167017dG.A0O(this.A0B)) * 1000003) ^ AbstractC167017dG.A0O(this.A0A)) * 1000003) ^ AbstractC167017dG.A0O(this.A07)) * 1000003) ^ AbstractC167017dG.A0O(this.A04)) * 1000003) ^ AbstractC167017dG.A0O(this.A06)) * 1000003) ^ AbstractC167017dG.A0O(this.A02)) * 1000003) ^ AbstractC167017dG.A0O(this.A08)) * 1000003) ^ AbstractC25227BEk.A07(this.A01);
    }

    public C60631REq(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A00 = num;
        this.A09 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A07 = str6;
        this.A04 = str7;
        this.A06 = str8;
        this.A02 = str9;
        this.A08 = str10;
        this.A01 = str11;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AndroidClientInfo{sdkVersion=");
        A1C.append(this.A00);
        A1C.append(", model=");
        A1C.append(this.A09);
        A1C.append(", hardware=");
        A1C.append(this.A05);
        A1C.append(", device=");
        A1C.append(this.A03);
        A1C.append(", product=");
        A1C.append(this.A0B);
        A1C.append(", osBuild=");
        A1C.append(this.A0A);
        A1C.append(", manufacturer=");
        A1C.append(this.A07);
        A1C.append(", fingerprint=");
        A1C.append(this.A04);
        A1C.append(", locale=");
        A1C.append(this.A06);
        A1C.append(", country=");
        A1C.append(this.A02);
        A1C.append(", mccMnc=");
        A1C.append(this.A08);
        A1C.append(", applicationBuild=");
        return AbstractC50523MSb.A0W(this.A01, A1C);
    }
}
