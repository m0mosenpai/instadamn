package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.9CH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CH extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06;

    public C9CH(String str, String str2, List list, List list2) {
        ImageUrl imageUrl;
        this.A06 = 2;
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A04 = str2;
        this.A01 = list;
        this.A00 = list2;
        C148286ly c148286ly = (C148286ly) AbstractC001800i.A0J(list2);
        if (c148286ly != null) {
            imageUrl = c148286ly.A0H;
        } else {
            imageUrl = null;
        }
        this.A03 = imageUrl;
        this.A02 = AbstractC001800i.A0J(list2);
    }

    public final void A00(Integer num) {
        String str;
        C14360o3.A0B(num, 0);
        if (num.intValue() != 0) {
            str = "off";
        } else {
            str = "on";
        }
        this.A05 = str;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A06) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C9CH)) {
                        return false;
                    }
                    C9CH c9ch = (C9CH) obj;
                    if (c9ch.A06 != 0 || !C14360o3.A0K(this.A03, c9ch.A03) || !C14360o3.A0K(this.A01, c9ch.A01) || !C14360o3.A0K(this.A00, c9ch.A00) || !C14360o3.A0K(this.A02, c9ch.A02) || !C14360o3.A0K(this.A04, c9ch.A04)) {
                        return false;
                    }
                    obj2 = this.A05;
                    obj3 = c9ch.A05;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C9CH)) {
                        return false;
                    }
                    C9CH c9ch2 = (C9CH) obj;
                    if (c9ch2.A06 != 1 || this.A02 != c9ch2.A02 || this.A00 != c9ch2.A00 || this.A01 != c9ch2.A01) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    if (obj instanceof C9CH) {
                        C9CH c9ch3 = (C9CH) obj;
                        if (c9ch3.A06 == 2 && C14360o3.A0K(this.A05, c9ch3.A05) && C14360o3.A0K(this.A04, c9ch3.A04) && C14360o3.A0K(this.A01, c9ch3.A01)) {
                            obj2 = this.A00;
                            obj3 = c9ch3.A00;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int i2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        switch (this.A06) {
            case 0:
                Object obj = this.A03;
                i = 0;
                if (obj == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = obj.hashCode();
                }
                int i3 = hashCode3 * 31;
                Object obj2 = this.A01;
                if (obj2 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = obj2.hashCode();
                }
                int i4 = (i3 + hashCode4) * 31;
                Object obj3 = this.A00;
                if (obj3 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = obj3.hashCode();
                }
                int i5 = (i4 + hashCode5) * 31;
                Object obj4 = this.A02;
                if (obj4 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = obj4.hashCode();
                }
                int i6 = (i5 + hashCode6) * 31;
                String str = this.A04;
                if (str == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = str.hashCode();
                }
                i2 = (i6 + hashCode7) * 31;
                String str2 = this.A05;
                if (str2 != null) {
                    i = str2.hashCode();
                    break;
                }
                break;
            case 1:
                Object obj5 = this.A02;
                i = 0;
                if (obj5 == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj5.hashCode();
                }
                int i7 = hashCode * 31;
                Object obj6 = this.A00;
                if (obj6 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = obj6.hashCode();
                }
                i2 = (i7 + hashCode2) * 31;
                Object obj7 = this.A01;
                if (obj7 != null) {
                    i = obj7.hashCode();
                    break;
                }
                break;
            default:
                return (((((this.A05.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        String str;
        if (this.A06 != 0) {
            return super.toString();
        }
        if (!C14360o3.A0K(this.A03, true)) {
            str = "";
        } else {
            str = AnonymousClass001.A0R("", "VPN;");
        }
        if (C14360o3.A0K(this.A01, true)) {
            str = AnonymousClass001.A0R(str, "Enterprise;");
        }
        if (C14360o3.A0K(this.A00, true)) {
            str = AnonymousClass001.A0R(str, "DUN;");
        }
        if (C14360o3.A0K(this.A02, true)) {
            str = AnonymousClass001.A0R(str, "Metered;");
        }
        String str2 = this.A04;
        if (str2 != null && !str2.equals("")) {
            str = AnonymousClass001.A0h(str, "dhcpServerAddr=", str2, ';');
        }
        String str3 = this.A05;
        if (str3 == null || str3.equals("")) {
            return str;
        }
        return AnonymousClass001.A0h(str, "LocalAddrs=", str3, ';');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CH(C4IA c4ia, C4IB c4ib, int i) {
        this((i & 1) != 0 ? null : c4ia, (i & 2) != 0 ? null : c4ib);
        this.A06 = 1;
    }

    public C9CH() {
        this.A06 = 0;
        this.A06 = 0;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
        this.A04 = null;
        this.A05 = null;
    }

    public C9CH(C4IA c4ia, C4IB c4ib) {
        this.A06 = 1;
        this.A02 = c4ia;
        this.A00 = c4ib;
        this.A01 = null;
    }
}
