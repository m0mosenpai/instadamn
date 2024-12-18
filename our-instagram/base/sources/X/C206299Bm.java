package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206299Bm extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public C206299Bm(EnumC71343Hv enumC71343Hv, C71313Hs c71313Hs, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Integer num, boolean z, boolean z2) {
        this.A03 = c38321qM;
        this.A06 = userSession;
        this.A02 = c71313Hs;
        this.A01 = interfaceC60442pS;
        this.A05 = enumC71343Hv;
        this.A04 = num;
        this.A08 = z;
        this.A07 = z2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206299Bm) {
                    C206299Bm c206299Bm = (C206299Bm) obj;
                    if (c206299Bm.A00 == 1 && C14360o3.A0K(this.A03, c206299Bm.A03) && C14360o3.A0K(this.A06, c206299Bm.A06) && C14360o3.A0K(this.A02, c206299Bm.A02) && C14360o3.A0K(this.A01, c206299Bm.A01) && this.A05 == c206299Bm.A05 && C14360o3.A0K(this.A04, c206299Bm.A04) && this.A08 == c206299Bm.A08) {
                        z = this.A07;
                        z2 = c206299Bm.A07;
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
            if (!(obj instanceof C206299Bm)) {
                return false;
            }
            C206299Bm c206299Bm2 = (C206299Bm) obj;
            if (c206299Bm2.A00 != 0 || !C14360o3.A0K(this.A04, c206299Bm2.A04) || !C14360o3.A0K(this.A03, c206299Bm2.A03) || !C14360o3.A0K(this.A05, c206299Bm2.A05) || !C14360o3.A0K(this.A06, c206299Bm2.A06) || !C14360o3.A0K(this.A02, c206299Bm2.A02) || !C14360o3.A0K(this.A01, c206299Bm2.A01) || this.A07 != c206299Bm2.A07) {
                return false;
            }
            z = this.A08;
            z2 = c206299Bm2.A08;
        } else {
            return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i;
        boolean z;
        int hashCode4;
        if (this.A00 != 0) {
            int hashCode5 = ((((((this.A03.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
            Object obj = this.A05;
            int i2 = 0;
            if (obj == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = obj.hashCode();
            }
            int i3 = (hashCode5 + hashCode4) * 31;
            Object obj2 = this.A04;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            int i4 = (i3 + i2) * 31;
            int i5 = 1237;
            if (this.A08) {
                i5 = 1231;
            }
            i = (i4 + i5) * 31;
            z = this.A07;
        } else {
            int hashCode6 = ((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31;
            Object obj3 = this.A05;
            int i6 = 0;
            if (obj3 == null) {
                hashCode = 0;
            } else {
                hashCode = obj3.hashCode();
            }
            int i7 = (hashCode6 + hashCode) * 31;
            Object obj4 = this.A06;
            if (obj4 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj4.hashCode();
            }
            int i8 = (i7 + hashCode2) * 31;
            Object obj5 = this.A02;
            if (obj5 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = obj5.hashCode();
            }
            int i9 = (i8 + hashCode3) * 31;
            Object obj6 = this.A01;
            if (obj6 != null) {
                i6 = obj6.hashCode();
            }
            int i10 = (i9 + i6) * 31;
            int i11 = 1237;
            if (this.A07) {
                i11 = 1231;
            }
            i = (i10 + i11) * 31;
            z = this.A08;
        }
        int i12 = 1237;
        if (z) {
            i12 = 1231;
        }
        return i + i12;
    }

    public C206299Bm(CharSequence charSequence, Integer num, Integer num2, Long l, List list, Map map, boolean z, boolean z2) {
        C14360o3.A0B(list, 1);
        C14360o3.A0B(map, 2);
        this.A04 = list;
        this.A03 = map;
        this.A05 = charSequence;
        this.A06 = num;
        this.A02 = num2;
        this.A01 = l;
        this.A07 = z;
        this.A08 = z2;
    }
}
