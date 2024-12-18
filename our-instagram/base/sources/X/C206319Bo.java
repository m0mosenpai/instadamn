package X;

import android.content.Context;

/* renamed from: X.9Bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206319Bo extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public C206319Bo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A05 = bool3;
        this.A07 = bool4;
        this.A06 = bool5;
        this.A08 = bool6;
        this.A04 = bool7;
        this.A02 = bool8;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A03 != 0) {
            if (this != obj) {
                if (obj instanceof C206319Bo) {
                    C206319Bo c206319Bo = (C206319Bo) obj;
                    if (c206319Bo.A03 == 1 && C14360o3.A0K(this.A00, c206319Bo.A00) && C14360o3.A0K(this.A01, c206319Bo.A01) && C14360o3.A0K(this.A05, c206319Bo.A05) && C14360o3.A0K(this.A07, c206319Bo.A07) && C14360o3.A0K(this.A06, c206319Bo.A06) && C14360o3.A0K(this.A08, c206319Bo.A08) && C14360o3.A0K(this.A04, c206319Bo.A04)) {
                        obj2 = this.A02;
                        obj3 = c206319Bo.A02;
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
            if (!(obj instanceof C206319Bo)) {
                return false;
            }
            C206319Bo c206319Bo2 = (C206319Bo) obj;
            if (c206319Bo2.A03 != 0 || !C14360o3.A0K(this.A05, c206319Bo2.A05) || !C14360o3.A0K(this.A07, c206319Bo2.A07) || !C14360o3.A0K(this.A04, c206319Bo2.A04)) {
                return false;
            }
            obj2 = this.A06;
            obj3 = c206319Bo2.A06;
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
        int hashCode2;
        int i2;
        Object obj;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        if (this.A03 != 0) {
            Object obj2 = this.A00;
            i = 0;
            if (obj2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = obj2.hashCode();
            }
            int i3 = hashCode3 * 31;
            Object obj3 = this.A01;
            if (obj3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = obj3.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            Object obj4 = this.A05;
            if (obj4 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = obj4.hashCode();
            }
            int i5 = (i4 + hashCode5) * 31;
            Object obj5 = this.A07;
            if (obj5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = obj5.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            Object obj6 = this.A06;
            if (obj6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = obj6.hashCode();
            }
            int i7 = (i6 + hashCode7) * 31;
            Object obj7 = this.A08;
            if (obj7 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = obj7.hashCode();
            }
            int i8 = (i7 + hashCode8) * 31;
            Object obj8 = this.A04;
            if (obj8 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = obj8.hashCode();
            }
            i2 = (i8 + hashCode9) * 31;
            obj = this.A02;
        } else {
            int hashCode10 = this.A05.hashCode() * 31;
            Object obj9 = this.A07;
            i = 0;
            if (obj9 == null) {
                hashCode = 0;
            } else {
                hashCode = obj9.hashCode();
            }
            int i9 = (hashCode10 + hashCode) * 31;
            Object obj10 = this.A04;
            if (obj10 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj10.hashCode();
            }
            i2 = (i9 + hashCode2) * 31;
            obj = this.A06;
        }
        if (obj != null) {
            i = obj.hashCode();
        }
        return i2 + i;
    }

    public C206319Bo(Context context, InterfaceC02550Ad interfaceC02550Ad, InterfaceC40711ue interfaceC40711ue, C40681ub c40681ub) {
        this.A05 = context;
        this.A07 = interfaceC02550Ad;
        this.A04 = c40681ub;
        this.A06 = interfaceC40711ue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C206319Bo(java.lang.Boolean r11, java.lang.Boolean r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.Boolean r17, int r18) {
        /*
            r10 = this;
            r8 = r17
            r7 = r16
            r6 = r15
            r5 = r14
            r4 = r13
            r3 = r12
            r2 = r11
            r9 = 0
            r0 = 1
            r1 = r10
            r10.A03 = r0
            r0 = r18 & 1
            if (r0 == 0) goto L13
            r2 = r9
        L13:
            r0 = r18 & 2
            if (r0 == 0) goto L18
            r3 = r9
        L18:
            r0 = r18 & 4
            if (r0 == 0) goto L1d
            r4 = r9
        L1d:
            r0 = r18 & 8
            if (r0 == 0) goto L22
            r5 = r9
        L22:
            r0 = r18 & 16
            if (r0 == 0) goto L27
            r6 = r9
        L27:
            r0 = r18 & 32
            if (r0 == 0) goto L2c
            r7 = r9
        L2c:
            r0 = r18 & 64
            if (r0 == 0) goto L31
            r8 = r9
        L31:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206319Bo.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }
}
