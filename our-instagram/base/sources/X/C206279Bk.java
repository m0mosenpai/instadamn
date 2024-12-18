package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.9Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206279Bk extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C206279Bk(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.A00 = 0;
        C14360o3.A0B(num4, 4);
        C14360o3.A0B(num5, 5);
        this.A04 = num;
        this.A03 = num2;
        this.A05 = num3;
        this.A01 = num4;
        this.A02 = num5;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C206279Bk)) {
                        return false;
                    }
                    C206279Bk c206279Bk = (C206279Bk) obj;
                    if (c206279Bk.A00 != 0 || this.A04 != c206279Bk.A04 || this.A03 != c206279Bk.A03 || this.A05 != c206279Bk.A05 || this.A01 != c206279Bk.A01 || this.A02 != c206279Bk.A02) {
                        return false;
                    }
                    return true;
                }
                return true;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C206279Bk)) {
                        return false;
                    }
                    C206279Bk c206279Bk2 = (C206279Bk) obj;
                    if (c206279Bk2.A00 != 1 || !C14360o3.A0K(this.A05, c206279Bk2.A05) || !C14360o3.A0K(this.A04, c206279Bk2.A04) || !C14360o3.A0K(this.A02, c206279Bk2.A02) || !C14360o3.A0K(this.A01, c206279Bk2.A01)) {
                        return false;
                    }
                    obj2 = this.A03;
                    obj3 = c206279Bk2.A03;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    if (!(obj instanceof C206279Bk)) {
                        return false;
                    }
                    C206279Bk c206279Bk3 = (C206279Bk) obj;
                    if (c206279Bk3.A00 != 2 || !C14360o3.A0K(this.A04, c206279Bk3.A04) || !C14360o3.A0K(this.A01, c206279Bk3.A01) || !C14360o3.A0K(this.A05, c206279Bk3.A05) || !C14360o3.A0K(this.A03, c206279Bk3.A03)) {
                        return false;
                    }
                    obj2 = this.A02;
                    obj3 = c206279Bk3.A02;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    if (obj instanceof C206279Bk) {
                        C206279Bk c206279Bk4 = (C206279Bk) obj;
                        if (c206279Bk4.A00 == 3 && C14360o3.A0K(this.A01, c206279Bk4.A01) && C14360o3.A0K(this.A02, c206279Bk4.A02) && C14360o3.A0K(this.A03, c206279Bk4.A03) && C14360o3.A0K(this.A04, c206279Bk4.A04)) {
                            obj2 = this.A05;
                            obj3 = c206279Bk4.A05;
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
        String str;
        String str2;
        String A00;
        String str3;
        int hashCode;
        String str4;
        int hashCode2;
        Object obj;
        switch (this.A00) {
            case 0:
                int intValue = ((Number) this.A04).intValue();
                if (1 != intValue) {
                    str = "CENTER_CROP";
                } else {
                    str = "CENTER";
                }
                int hashCode3 = (str.hashCode() + intValue) * 31;
                int intValue2 = ((Number) this.A03).intValue();
                if (1 != intValue2) {
                    str2 = "GREY";
                } else {
                    str2 = "MEDIA_AWARE_GRADIENT";
                }
                int hashCode4 = (hashCode3 + str2.hashCode() + intValue2) * 31;
                int intValue3 = ((Number) this.A05).intValue();
                if (1 != intValue3) {
                    A00 = "SQUARE";
                } else {
                    A00 = AbstractC111324zv.A00(1707);
                }
                int hashCode5 = (hashCode4 + A00.hashCode() + intValue3) * 31;
                int intValue4 = ((Number) this.A01).intValue();
                if (1 != intValue4) {
                    str3 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                } else {
                    str3 = "BOUNCY";
                }
                hashCode = (hashCode5 + str3.hashCode() + intValue4) * 31;
                int intValue5 = ((Number) this.A02).intValue();
                if (1 != intValue5) {
                    str4 = "TEMPORARILY_SHOW_PREVIOUS_CONTENTS";
                } else {
                    str4 = "SHOW_BACKGROUND_PLACEHOLDER";
                }
                hashCode2 = str4.hashCode() + intValue5;
                break;
            case 1:
                hashCode = ((((((this.A05.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
                obj = this.A03;
                hashCode2 = obj.hashCode();
                break;
            case 2:
                hashCode = ((((((this.A04.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode()) * 31;
                obj = this.A02;
                hashCode2 = obj.hashCode();
                break;
            default:
                hashCode = ((((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31;
                obj = this.A05;
                hashCode2 = obj.hashCode();
                break;
        }
        return hashCode + hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C206279Bk(java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, int r12) {
        /*
            r7 = this;
            r6 = r11
            r5 = 0
            r0 = 0
            r1 = r7
            r7.A00 = r0
            r0 = r12 & 8
            if (r0 == 0) goto Lc
            java.lang.Integer r5 = X.C05F.A01
        Lc:
            r0 = r12 & 16
            if (r0 == 0) goto L12
            java.lang.Integer r6 = X.C05F.A00
        L12:
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206279Bk.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int):void");
    }

    public C206279Bk(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A03 = obj5;
    }
}
