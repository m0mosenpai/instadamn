package X;

/* renamed from: X.9CP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CP extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final int A07;

    public C9CP(String str) {
        this.A07 = 1;
        this.A04 = str;
        this.A05 = "web_url";
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A07 != 0) {
            if (this != obj) {
                if (obj instanceof C9CP) {
                    C9CP c9cp = (C9CP) obj;
                    if (c9cp.A07 == 1) {
                        obj2 = this.A04;
                        obj3 = c9cp.A04;
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
            if (!(obj instanceof C9CP)) {
                return false;
            }
            C9CP c9cp2 = (C9CP) obj;
            if (c9cp2.A07 != 0 || !C14360o3.A0K(this.A04, c9cp2.A04) || !C14360o3.A0K(this.A05, c9cp2.A05) || !C14360o3.A0K(this.A06, c9cp2.A06) || !C14360o3.A0K(this.A02, c9cp2.A02) || !C14360o3.A0K(this.A03, c9cp2.A03) || !C14360o3.A0K(this.A00, c9cp2.A00)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = c9cp2.A01;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = this.A07;
        String str = this.A04;
        if (i != 0) {
            return str.hashCode();
        }
        int hashCode5 = ((str.hashCode() * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A06;
        int i2 = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int i3 = (hashCode5 + hashCode) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str3.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str4 = this.A03;
        if (str4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str4.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        Object obj = this.A00;
        if (obj == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        Object obj2 = this.A01;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i6 + i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CP(String str, String str2, String str3) {
        this(str);
        this.A07 = 1;
        this.A05 = str2;
        this.A02 = str3;
        this.A01 = new C51755Mte(new C31200Dnj(null, 17), 10);
        this.A03 = null;
        this.A06 = null;
        this.A00 = null;
    }

    public C9CP(C9CJ c9cj, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.A07 = 0;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A00 = num;
        this.A01 = c9cj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CP(Integer num, String str, String str2, String str3, String str4, String str5) {
        this(null, num, str, str2, str3, str4, str5);
        this.A07 = 0;
    }
}
