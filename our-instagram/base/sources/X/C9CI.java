package X;

import java.util.List;

/* renamed from: X.9CI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CI extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9CI(X.InterfaceC83713oG r11) {
        /*
            r10 = this;
            r0 = 1
            r3 = r10
            r10.A00 = r0
            r9 = 0
            X.3oF r0 = X.AbstractC140946Yw.A02(r11)
            if (r0 == 0) goto L91
            X.3oE r0 = X.AbstractC140956Yx.A00(r0)
            if (r0 == 0) goto L91
            java.lang.String r6 = r0.A00
        L13:
            X.3oF r1 = X.AbstractC140946Yw.A02(r11)
            if (r1 == 0) goto L8f
            boolean r0 = r1 instanceof X.C122145g6
            if (r0 == 0) goto L8f
            X.5g6 r1 = (X.C122145g6) r1
            if (r1 == 0) goto L8f
            java.util.List r8 = r1.A00
        L23:
            X.98k r1 = X.AbstractC140946Yw.A04(r11)
            if (r1 == 0) goto L8d
            boolean r0 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L8d
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r1
            if (r1 == 0) goto L8d
            long r0 = r1.A00
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L37:
            X.98k r1 = X.AbstractC140946Yw.A04(r11)
            if (r1 == 0) goto L8b
            boolean r0 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L8b
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r1
            if (r1 == 0) goto L8b
            java.lang.Long r5 = r1.A02
        L47:
            X.98k r0 = X.AbstractC140946Yw.A04(r11)
            if (r0 == 0) goto L89
            X.4Ds r0 = r0.CAo()
            if (r0 == 0) goto L89
            java.lang.String r7 = r0.A00
        L55:
            X.98k r1 = X.AbstractC140946Yw.A04(r11)
            if (r1 == 0) goto L93
            boolean r0 = r1 instanceof X.C23974Ak9
            if (r0 == 0) goto L93
            X.Ak9 r1 = (X.C23974Ak9) r1
            if (r1 == 0) goto L93
            java.util.List r1 = r1.A02
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L74:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r1 = r2.next()
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r1 = (com.instagram.model.direct.threadkey.impl.MsysPendingRecipient) r1
            X.OUd r0 = new X.OUd
            r0.<init>(r1)
            r9.add(r0)
            goto L74
        L89:
            r7 = r9
            goto L55
        L8b:
            r5 = r9
            goto L47
        L8d:
            r4 = r9
            goto L37
        L8f:
            r8 = r9
            goto L23
        L91:
            r6 = r9
            goto L13
        L93:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r0 = r11 instanceof X.C83693oE
            if (r0 != 0) goto Lae
            boolean r0 = r11 instanceof X.C122145g6
            if (r0 != 0) goto Lae
            boolean r0 = r11 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 != 0) goto Lae
            boolean r0 = r11 instanceof X.C23974Ak9
            if (r0 != 0) goto Lae
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CI.<init>(X.3oG):void");
    }

    public final boolean equals(Object obj) {
        C9CI c9ci;
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9CI) {
                    c9ci = (C9CI) obj;
                    if (c9ci.A00 == 1 && C14360o3.A0K(this.A06, c9ci.A06) && C14360o3.A0K(this.A01, c9ci.A01) && C14360o3.A0K(this.A04, c9ci.A04) && C14360o3.A0K(this.A03, c9ci.A03)) {
                        obj2 = this.A07;
                        obj3 = c9ci.A07;
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
            if (!(obj instanceof C9CI)) {
                return false;
            }
            c9ci = (C9CI) obj;
            if (c9ci.A00 != 0 || !C14360o3.A0K(this.A06, c9ci.A06) || !C14360o3.A0K(this.A07, c9ci.A07) || !C14360o3.A0K(this.A03, c9ci.A03) || !C14360o3.A0K(this.A04, c9ci.A04) || !C14360o3.A0K(this.A05, c9ci.A05)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = c9ci.A01;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3) || !C14360o3.A0K(this.A02, c9ci.A02)) {
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
        int i3 = this.A00;
        String str = this.A06;
        if (i3 != 0) {
            i = 0;
            if (str == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str.hashCode();
            }
            int i4 = hashCode4 * 31;
            Object obj = this.A01;
            if (obj == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = obj.hashCode();
            }
            int i5 = (i4 + hashCode5) * 31;
            Object obj2 = this.A04;
            if (obj2 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = obj2.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            Object obj3 = this.A03;
            if (obj3 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = obj3.hashCode();
            }
            i2 = (i6 + hashCode7) * 31;
            String str2 = this.A07;
            if (str2 != null) {
                hashCode3 = str2.hashCode();
            }
            hashCode3 = 0;
        } else {
            int hashCode8 = str.hashCode() * 31;
            String str3 = this.A07;
            i = 0;
            if (str3 == null) {
                hashCode = 0;
            } else {
                hashCode = str3.hashCode();
            }
            int hashCode9 = (((((hashCode8 + hashCode) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31;
            Object obj4 = this.A05;
            if (obj4 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj4.hashCode();
            }
            i2 = (hashCode9 + hashCode2) * 31;
            Object obj5 = this.A01;
            if (obj5 != null) {
                hashCode3 = obj5.hashCode();
            }
            hashCode3 = 0;
        }
        int i7 = (i2 + hashCode3) * 31;
        Object obj6 = this.A02;
        if (obj6 != null) {
            i = obj6.hashCode();
        }
        return i7 + i;
    }

    public C9CI(Long l, Long l2, String str, String str2, List list, List list2) {
        this.A00 = 1;
        this.A06 = str;
        this.A01 = list;
        this.A04 = l;
        this.A03 = l2;
        this.A07 = str2;
        this.A02 = list2;
        this.A05 = AbstractC09440dt.A01(new C57526Pg0(this, 2));
    }

    public C9CI(C25991Bef c25991Bef, C26011Bez c26011Bez, C50627MWo c50627MWo, C38688GzT c38688GzT, Boolean bool, String str, String str2) {
        this.A00 = 0;
        this.A06 = str;
        this.A07 = str2;
        this.A03 = c25991Bef;
        this.A04 = c26011Bez;
        this.A05 = c50627MWo;
        this.A01 = bool;
        this.A02 = c38688GzT;
    }
}
