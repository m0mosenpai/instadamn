package X;

import java.util.List;

/* renamed from: X.9C1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9C1 extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    public C9C1(C38321qM c38321qM, String str, boolean z) {
        this.A01 = c38321qM;
        this.A02 = str;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (obj instanceof C9C1) {
                        C9C1 c9c1 = (C9C1) obj;
                        if (c9c1.A00 != 0 || this.A03 != c9c1.A03 || !C14360o3.A0K(this.A02, c9c1.A02) || !C14360o3.A0K(this.A01, c9c1.A01)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            case 1:
                if (this != obj) {
                    if (obj instanceof C9C1) {
                        C9C1 c9c12 = (C9C1) obj;
                        if (c9c12.A00 != 1 || !C14360o3.A0K(this.A01, c9c12.A01) || !C14360o3.A0K(this.A02, c9c12.A02) || this.A03 != c9c12.A03) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        switch (this.A00) {
            case 0:
                int i2 = 1237;
                if (this.A03) {
                    i2 = 1231;
                }
                int i3 = i2 * 31;
                String str = this.A02;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                i = (i3 + hashCode) * 31;
                hashCode2 = this.A01.hashCode();
                break;
            case 1:
                int hashCode4 = this.A01.hashCode() * 31;
                String str2 = this.A02;
                if (str2 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str2.hashCode();
                }
                i = (hashCode4 + hashCode3) * 31;
                hashCode2 = 1237;
                if (this.A03) {
                    hashCode2 = 1231;
                    break;
                }
                break;
            default:
                return super.hashCode();
        }
        return i + hashCode2;
    }

    public C9C1(Long l, String str, boolean z) {
        this.A03 = z;
        this.A02 = str;
        this.A01 = l;
    }

    public C9C1(String str, List list, boolean z) {
        this.A03 = z;
        this.A02 = str;
        this.A01 = list;
    }
}
