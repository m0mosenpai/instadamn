package X;

import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import java.util.List;

/* renamed from: X.9Bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206309Bn extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C206309Bn(RIXUChainingSourceType rIXUChainingSourceType, RIXUCoverChainingType rIXUCoverChainingType, Boolean bool, Boolean bool2, Boolean bool3, Integer num, List list) {
        C14360o3.A0B(list, 6);
        this.A01 = rIXUCoverChainingType;
        this.A02 = rIXUChainingSourceType;
        this.A03 = bool;
        this.A04 = bool2;
        this.A05 = bool3;
        this.A06 = list;
        this.A07 = num;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206309Bn) {
                    C206309Bn c206309Bn = (C206309Bn) obj;
                    if (c206309Bn.A00 == 1 && C14360o3.A0K(this.A02, c206309Bn.A02) && C14360o3.A0K(this.A05, c206309Bn.A05) && C14360o3.A0K(this.A06, c206309Bn.A06) && C14360o3.A0K(this.A01, c206309Bn.A01) && C14360o3.A0K(this.A07, c206309Bn.A07) && C14360o3.A0K(this.A04, c206309Bn.A04)) {
                        obj2 = this.A03;
                        obj3 = c206309Bn.A03;
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
            if (!(obj instanceof C206309Bn)) {
                return false;
            }
            C206309Bn c206309Bn2 = (C206309Bn) obj;
            if (c206309Bn2.A00 != 0 || this.A01 != c206309Bn2.A01 || this.A02 != c206309Bn2.A02 || !C14360o3.A0K(this.A03, c206309Bn2.A03) || !C14360o3.A0K(this.A04, c206309Bn2.A04) || !C14360o3.A0K(this.A05, c206309Bn2.A05) || !C14360o3.A0K(this.A06, c206309Bn2.A06)) {
                return false;
            }
            obj2 = this.A07;
            obj3 = c206309Bn2.A07;
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
        if (this.A00 != 0) {
            return (((((((((((this.A02.hashCode() * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode();
        }
        Object obj = this.A01;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.A02;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj3 = this.A03;
        if (obj3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj4 = this.A04;
        if (obj4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Object obj5 = this.A05;
        if (obj5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = obj5.hashCode();
        }
        int hashCode6 = (((i5 + hashCode5) * 31) + this.A06.hashCode()) * 31;
        Object obj6 = this.A07;
        if (obj6 != null) {
            i = obj6.hashCode();
        }
        return hashCode6 + i;
    }

    public C206309Bn(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3) {
        this.A02 = interfaceC16820sZ;
        this.A05 = interfaceC16660sJ;
        this.A06 = interfaceC16820sZ2;
        this.A01 = interfaceC16620sF;
        this.A07 = interfaceC16620sF2;
        this.A04 = interfaceC16620sF3;
        this.A03 = interfaceC16820sZ3;
    }
}
