package X;

/* renamed from: X.9H8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9H8 extends C0T6 {
    public final int A00 = 0;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C9H8(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C14360o3.A0B(str, 1);
        AbstractC167017dG.A1S(str3, str4);
        C14360o3.A0B(str5, 6);
        this.A02 = str;
        this.A01 = i;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9H8) {
                    C9H8 c9h8 = (C9H8) obj;
                    if (c9h8.A00 != 1 || !C14360o3.A0K(this.A02, c9h8.A02) || this.A01 != c9h8.A01 || !C14360o3.A0K(this.A03, c9h8.A03) || !C14360o3.A0K(this.A04, c9h8.A04) || !C14360o3.A0K(this.A05, c9h8.A05) || !C14360o3.A0K(this.A06, c9h8.A06)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C9H8)) {
                return false;
            }
            C9H8 c9h82 = (C9H8) obj;
            if (c9h82.A00 != 0 || !C14360o3.A0K(this.A05, c9h82.A05) || !C14360o3.A0K(this.A02, c9h82.A02) || !C14360o3.A0K(this.A04, c9h82.A04) || !C14360o3.A0K(this.A06, c9h82.A06) || !C14360o3.A0K(this.A03, c9h82.A03) || this.A01 != c9h82.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        if (this.A00 != 0) {
            int hashCode3 = ((this.A02.hashCode() * 31) + this.A01) * 31;
            String str = this.A03;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            hashCode = (((((hashCode3 + hashCode2) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31;
            i = this.A06.hashCode();
        } else {
            hashCode = ((((((((this.A05.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A03.hashCode()) * 31;
            i = this.A01;
        }
        return hashCode + i;
    }

    public C9H8(String str, String str2, String str3, String str4, String str5, int i) {
        this.A05 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A03 = str5;
        this.A01 = i;
    }
}
