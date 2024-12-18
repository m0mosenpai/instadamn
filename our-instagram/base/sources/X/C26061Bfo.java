package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Bfo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26061Bfo extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26061Bfo(X.InterfaceC30793DgU r15, X.InterfaceC30794DgV r16, X.InterfaceC30795DgW r17, X.InterfaceC30796DgX r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.List r23, int r24, boolean r25) {
        /*
            r14 = this;
            r4 = r15
            r10 = r21
            r12 = r23
            r9 = r20
            r6 = r17
            r7 = r18
            r8 = r19
            r5 = r16
            r0 = 1
            r3 = r14
            r14.A00 = r0
            r1 = r24
            r0 = r24 & 1
            if (r0 == 0) goto L1b
            X.CsC r5 = X.C29085CsC.A00
        L1b:
            r0 = r24 & 2
            if (r0 == 0) goto L21
            java.lang.String r8 = ""
        L21:
            r0 = r24 & 4
            if (r0 == 0) goto L27
            X.CsF r7 = X.C29088CsF.A00
        L27:
            r0 = r24 & 8
            if (r0 == 0) goto L2d
            X.CsE r6 = X.C29087CsE.A00
        L2d:
            r0 = r24 & 16
            r11 = 0
            if (r0 == 0) goto L33
            r9 = r11
        L33:
            r0 = r24 & 32
            if (r0 == 0) goto L38
            r10 = r11
        L38:
            r0 = r24 & 64
            if (r0 != 0) goto L3e
            r11 = r22
        L3e:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L44
            X.CsB r4 = X.C29084CsB.A00
        L44:
            r0 = r1 & 256(0x100, float:3.59E-43)
            r2 = r25
            boolean r13 = X.AbstractC25226BEj.A1U(r0, r2)
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L52
            X.0sl r12 = X.C16930sl.A00
        L52:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26061Bfo.<init>(X.DgU, X.DgV, X.DgW, X.DgX, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean):void");
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26061Bfo) {
                    C26061Bfo c26061Bfo = (C26061Bfo) obj;
                    if (c26061Bfo.A00 == 1 && C14360o3.A0K(this.A03, c26061Bfo.A03) && C14360o3.A0K(this.A06, c26061Bfo.A06) && C14360o3.A0K(this.A05, c26061Bfo.A05) && C14360o3.A0K(this.A04, c26061Bfo.A04) && C14360o3.A0K(this.A08, c26061Bfo.A08) && C14360o3.A0K(this.A09, c26061Bfo.A09) && C14360o3.A0K(this.A07, c26061Bfo.A07) && C14360o3.A0K(this.A02, c26061Bfo.A02) && this.A0A == c26061Bfo.A0A) {
                        obj2 = this.A01;
                        obj3 = c26061Bfo.A01;
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
            if (!(obj instanceof C26061Bfo)) {
                return false;
            }
            C26061Bfo c26061Bfo2 = (C26061Bfo) obj;
            if (c26061Bfo2.A00 != 0 || !C14360o3.A0K(this.A01, c26061Bfo2.A01) || this.A0A != c26061Bfo2.A0A || !C14360o3.A0K(this.A07, c26061Bfo2.A07) || !C14360o3.A0K(this.A02, c26061Bfo2.A02) || !C14360o3.A0K(this.A08, c26061Bfo2.A08) || !C14360o3.A0K(this.A06, c26061Bfo2.A06) || !C14360o3.A0K(this.A04, c26061Bfo2.A04) || !C14360o3.A0K(this.A05, c26061Bfo2.A05) || !C14360o3.A0K(this.A03, c26061Bfo2.A03)) {
                return false;
            }
            obj2 = this.A09;
            obj3 = c26061Bfo2.A09;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A02, (((((AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0G(this.A03)))) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC25227BEk.A07(this.A07)) * 31)));
        }
        return ((((((((((((((AbstractC167007dF.A0D(this.A0A, AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A09);
    }

    public C26061Bfo(Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, Map map, int i, boolean z) {
        this.A00 = 0;
        map = (i & 1) != 0 ? AbstractC06930Yk.A0E() : map;
        boolean A1U = AbstractC25226BEj.A1U(i & 2, z);
        str = (i & 4) != 0 ? null : str;
        l = (i & 8) != 0 ? null : l;
        str2 = (i & 16) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        l2 = (i & 64) != 0 ? null : l2;
        num = (i & 128) != 0 ? null : num;
        num2 = (i & 256) != 0 ? null : num2;
        String str5 = (i & 512) == 0 ? str4 : null;
        this.A00 = 0;
        this.A01 = map;
        this.A0A = A1U;
        this.A07 = str;
        this.A02 = l;
        this.A08 = str2;
        this.A06 = str3;
        this.A04 = l2;
        this.A05 = num;
        this.A03 = num2;
        this.A09 = str5;
    }

    public C26061Bfo(InterfaceC30793DgU interfaceC30793DgU, InterfaceC30794DgV interfaceC30794DgV, InterfaceC30795DgW interfaceC30795DgW, InterfaceC30796DgX interfaceC30796DgX, String str, String str2, String str3, String str4, List list, boolean z) {
        this.A00 = 1;
        AbstractC167027dH.A0a(1, interfaceC30794DgV, str, interfaceC30796DgX, interfaceC30795DgW);
        AbstractC25229BEm.A1J(interfaceC30793DgU, 8, list);
        this.A03 = interfaceC30794DgV;
        this.A06 = str;
        this.A05 = interfaceC30796DgX;
        this.A04 = interfaceC30795DgW;
        this.A08 = str2;
        this.A09 = str3;
        this.A07 = str4;
        this.A02 = interfaceC30793DgU;
        this.A0A = z;
        this.A01 = list;
    }
}
