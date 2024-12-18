package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9C8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9C8 extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    public C9C8(String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, int i, boolean z) {
        this.A00 = 0;
        z = (i & 2) != 0 ? false : z;
        interfaceC16660sJ2 = (i & 4) != 0 ? null : interfaceC16660sJ2;
        interfaceC16660sJ3 = (i & 8) != 0 ? null : interfaceC16660sJ3;
        interfaceC16660sJ4 = (i & 16) != 0 ? null : interfaceC16660sJ4;
        str = (i & 32) != 0 ? null : str;
        InterfaceC16820sZ interfaceC16820sZ2 = (i & 64) == 0 ? interfaceC16820sZ : null;
        this.A00 = 0;
        C14360o3.A0B(interfaceC16660sJ, 1);
        this.A01 = interfaceC16660sJ;
        this.A07 = z;
        this.A04 = interfaceC16660sJ2;
        this.A02 = interfaceC16660sJ3;
        this.A05 = interfaceC16660sJ4;
        this.A06 = str;
        this.A03 = interfaceC16820sZ2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9C8) {
                    C9C8 c9c8 = (C9C8) obj;
                    if (c9c8.A00 == 1 && C14360o3.A0K(this.A01, c9c8.A01) && C14360o3.A0K(this.A02, c9c8.A02) && C14360o3.A0K(this.A03, c9c8.A03) && C14360o3.A0K(this.A04, c9c8.A04) && this.A07 == c9c8.A07 && C14360o3.A0K(this.A06, c9c8.A06)) {
                        obj2 = this.A05;
                        obj3 = c9c8.A05;
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
            if (!(obj instanceof C9C8)) {
                return false;
            }
            C9C8 c9c82 = (C9C8) obj;
            if (c9c82.A00 != 0 || !C14360o3.A0K(this.A01, c9c82.A01) || this.A07 != c9c82.A07 || !C14360o3.A0K(this.A04, c9c82.A04) || !C14360o3.A0K(this.A02, c9c82.A02) || !C14360o3.A0K(this.A05, c9c82.A05) || !C14360o3.A0K(this.A06, c9c82.A06)) {
                return false;
            }
            obj2 = this.A03;
            obj3 = c9c82.A03;
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
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            int i2 = 0;
            if (obj == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = obj.hashCode();
            }
            int i3 = hashCode5 * 31;
            Object obj2 = this.A02;
            if (obj2 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = obj2.hashCode();
            }
            int i4 = (i3 + hashCode6) * 31;
            Object obj3 = this.A03;
            if (obj3 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = obj3.hashCode();
            }
            int i5 = (i4 + hashCode7) * 31;
            Object obj4 = this.A04;
            if (obj4 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = obj4.hashCode();
            }
            int i6 = (i5 + hashCode8) * 31;
            int i7 = 1237;
            if (this.A07) {
                i7 = 1231;
            }
            int i8 = (i6 + i7) * 31;
            String str = this.A06;
            if (str != null) {
                i2 = str.hashCode();
            }
            return ((i8 + i2) * 31) + this.A05.hashCode();
        }
        int hashCode9 = obj.hashCode() * 31;
        int i9 = 1237;
        if (this.A07) {
            i9 = 1231;
        }
        int i10 = (hashCode9 + i9) * 31;
        Object obj5 = this.A04;
        int i11 = 0;
        if (obj5 == null) {
            hashCode = 0;
        } else {
            hashCode = obj5.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        Object obj6 = this.A02;
        if (obj6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj6.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Object obj7 = this.A05;
        if (obj7 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj7.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Object obj8 = this.A03;
        if (obj8 != null) {
            i11 = obj8.hashCode();
        }
        return i15 + i11;
    }

    public C9C8(C31200Dnj c31200Dnj, XFR xfr, User user, Boolean bool, String str, List list, boolean z) {
        this.A00 = 1;
        C14360o3.A0B(user, 7);
        this.A01 = xfr;
        this.A02 = c31200Dnj;
        this.A03 = list;
        this.A04 = bool;
        this.A07 = z;
        this.A06 = str;
        this.A05 = user;
    }
}
