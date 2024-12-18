package X;

import com.instagram.api.schemas.GraphGuardianContent;
import java.util.List;

/* renamed from: X.MtR */
/* loaded from: classes9.dex */
public final class C51742MtR extends C0T6 {
    public final int A00 = 0;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51742MtR(X.C74 r11, java.util.List r12, int r13) {
        /*
            r10 = this;
            r2 = r11
            r6 = r12
            r5 = 0
            r8 = 0
            r9 = 0
            r1 = r10
            r10.A00 = r9
            r0 = r13 & 1
            if (r0 == 0) goto Le
            X.0sl r6 = X.C16930sl.A00
        Le:
            r0 = r13 & 2
            if (r0 == 0) goto L34
            X.0sl r7 = X.C16930sl.A00
        L14:
            r0 = r13 & 16
            if (r0 == 0) goto L32
            java.lang.Integer r4 = X.C05F.A01
        L1a:
            r0 = r13 & 32
            if (r0 == 0) goto L20
            X.C74 r2 = X.C74.A07
        L20:
            r0 = r13 & 64
            if (r0 == 0) goto L30
            X.C74 r3 = X.C74.A07
        L26:
            r0 = r13 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2c
            X.0sl r8 = X.C16930sl.A00
        L2c:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L30:
            r3 = r5
            goto L26
        L32:
            r4 = r5
            goto L1a
        L34:
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51742MtR.<init>(X.C74, java.util.List, int):void");
    }

    public static /* synthetic */ C51742MtR A01(C51742MtR c51742MtR, C74 c74, C74 c742, List list, int i) {
        return A00(c51742MtR, c74, c742, null, null, null, list, null, 0, i);
    }

    public static /* synthetic */ C51742MtR A00(C51742MtR c51742MtR, C74 c74, C74 c742, Integer num, String str, List list, List list2, List list3, int i, int i2) {
        List list4 = list3;
        String str2 = str;
        Integer num2 = num;
        int i3 = i;
        C74 c743 = c742;
        List list5 = list2;
        C74 c744 = c74;
        List list6 = list;
        if ((i2 & 1) != 0) {
            list6 = (List) c51742MtR.A04;
        }
        if ((i2 & 2) != 0) {
            list5 = (List) c51742MtR.A07;
        }
        if ((i2 & 4) != 0) {
            i3 = c51742MtR.A01;
        }
        if ((i2 & 8) != 0) {
            str2 = c51742MtR.A08;
        }
        if ((i2 & 16) != 0) {
            num2 = (Integer) c51742MtR.A02;
        }
        if ((i2 & 32) != 0) {
            c744 = (C74) c51742MtR.A03;
        }
        if ((i2 & 64) != 0) {
            c743 = (C74) c51742MtR.A05;
        }
        if ((i2 & 128) != 0) {
            list4 = (List) c51742MtR.A06;
        }
        AbstractC167017dG.A1N(list6, list5);
        AbstractC25234BEr.A0k(4, num2, c744, c743, list4);
        return new C51742MtR(c744, c743, num2, str2, list6, list5, list4, i3);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51742MtR) {
                    C51742MtR c51742MtR = (C51742MtR) obj;
                    if (c51742MtR.A00 == 1 && C14360o3.A0K(this.A03, c51742MtR.A03) && this.A01 == c51742MtR.A01 && C14360o3.A0K(this.A04, c51742MtR.A04) && C14360o3.A0K(this.A02, c51742MtR.A02) && C14360o3.A0K(this.A08, c51742MtR.A08) && C14360o3.A0K(this.A05, c51742MtR.A05) && C14360o3.A0K(this.A06, c51742MtR.A06)) {
                        obj2 = this.A07;
                        obj3 = c51742MtR.A07;
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
            if (!(obj instanceof C51742MtR)) {
                return false;
            }
            C51742MtR c51742MtR2 = (C51742MtR) obj;
            if (c51742MtR2.A00 != 0 || !C14360o3.A0K(this.A04, c51742MtR2.A04) || !C14360o3.A0K(this.A07, c51742MtR2.A07) || this.A01 != c51742MtR2.A01 || !C14360o3.A0K(this.A08, c51742MtR2.A08) || this.A02 != c51742MtR2.A02 || this.A03 != c51742MtR2.A03 || this.A05 != c51742MtR2.A05) {
                return false;
            }
            obj2 = this.A06;
            obj3 = c51742MtR2.A06;
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
            return ((((((((((((AbstractC166987dD.A0G(this.A03) + this.A01) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC166997dE.A0I(this.A07);
        }
        return AbstractC166987dD.A0I(this.A06, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, (((((AbstractC166997dE.A0J(this.A07, AbstractC166987dD.A0G(this.A04)) + this.A01) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + CJW.A00((Integer) this.A02)) * 31)));
    }

    public C51742MtR(C74 c74, C74 c742, Integer num, String str, List list, List list2, List list3, int i) {
        C14360o3.A0B(list, 1);
        AbstractC25234BEr.A0k(2, list2, num, c74, c742);
        C14360o3.A0B(list3, 8);
        this.A04 = list;
        this.A07 = list2;
        this.A01 = i;
        this.A08 = str;
        this.A02 = num;
        this.A03 = c74;
        this.A05 = c742;
        this.A06 = list3;
    }

    public C51742MtR(GraphGuardianContent graphGuardianContent, C38321qM c38321qM, Integer num, Integer num2, Integer num3, String str, List list, int i) {
        C14360o3.A0B(list, 1);
        this.A03 = list;
        this.A01 = i;
        this.A04 = c38321qM;
        this.A02 = num;
        this.A08 = str;
        this.A05 = num2;
        this.A06 = graphGuardianContent;
        this.A07 = num3;
    }
}
