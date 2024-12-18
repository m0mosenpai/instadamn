package X;

/* renamed from: X.9CO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CO extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C9CO(VFY vfy, Integer num, String str, String str2, String str3, String str4) {
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = vfy;
        this.A06 = str4;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9CO) {
                    C9CO c9co = (C9CO) obj;
                    if (c9co.A00 == 1 && C14360o3.A0K(this.A04, c9co.A04) && C14360o3.A0K(this.A02, c9co.A02) && C14360o3.A0K(this.A05, c9co.A05) && C14360o3.A0K(this.A06, c9co.A06) && C14360o3.A0K(this.A01, c9co.A01)) {
                        obj2 = this.A03;
                        obj3 = c9co.A03;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C9CO)) {
                return false;
            }
            C9CO c9co2 = (C9CO) obj;
            if (c9co2.A00 != 0 || !C14360o3.A0K(this.A05, c9co2.A05) || !C14360o3.A0K(this.A03, c9co2.A03) || !C14360o3.A0K(this.A04, c9co2.A04) || this.A02 != c9co2.A02 || !C14360o3.A0K(this.A06, c9co2.A06)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = c9co2.A01;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int i2;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.A00 != 0) {
            String str = this.A04;
            i = 0;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i3 = hashCode2 * 31;
            Object obj = this.A02;
            if (obj == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = obj.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str2 = this.A05;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            String str3 = this.A06;
            if (str3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str3.hashCode();
            }
            int i6 = (i5 + hashCode5) * 31;
            Object obj2 = this.A01;
            if (obj2 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = obj2.hashCode();
            }
            i2 = (i6 + hashCode6) * 31;
            String str4 = this.A03;
            if (str4 != null) {
                i = str4.hashCode();
            }
        } else {
            int hashCode7 = ((((((this.A05.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31;
            String str5 = this.A06;
            i = 0;
            if (str5 == null) {
                hashCode = 0;
            } else {
                hashCode = str5.hashCode();
            }
            i2 = (hashCode7 + hashCode) * 31;
            Object obj3 = this.A01;
            if (obj3 != null) {
                i = obj3.hashCode();
            }
        }
        return i2 + i;
    }

    public C9CO(Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A02 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = num2;
        this.A03 = str4;
    }
}
