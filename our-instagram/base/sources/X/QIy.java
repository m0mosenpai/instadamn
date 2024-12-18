package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class QIy extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public String A06;
    public final int A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QIy() {
        this((QIp) null, (QIj) null, (QIj) null, (QIj) null, AbstractC166997dE.A0o(), (String) null, AbstractC06930Yk.A0E());
        this.A07 = 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QIy.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0M;
        int A0K;
        int A0I;
        switch (this.A07) {
            case 0:
                return AbstractC166987dD.A0I(this.A02, (((((((((AbstractC166987dD.A0J(this.A05) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31);
            case 1:
                A0K = (((((((AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0G(this.A04)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
                A0I = AbstractC166997dE.A0I(this.A02);
                return A0K + A0I;
            case 2:
            default:
                A0M = (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02);
                break;
            case 3:
                A0M = (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02);
                break;
        }
        A0K = ((((A0M * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31;
        A0I = AbstractC166997dE.A0I(this.A04);
        return A0K + A0I;
    }

    public QIy(QIp qIp, QIj qIj, QIj qIj2, QIj qIj3, String str, String str2, Map map) {
        this.A07 = 0;
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = qIj;
        this.A04 = qIj2;
        this.A03 = qIj3;
        this.A00 = qIp;
        this.A02 = map;
    }

    public QIy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A05 = str;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A06 = str2;
        this.A04 = obj5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QIy(X.EnumC61182Rgi r10, java.lang.String r11, java.lang.String r12, java.util.List r13, java.util.List r14, java.util.List r15, int r16) {
        /*
            r9 = this;
            r8 = r15
            r7 = r14
            r5 = r12
            r6 = r13
            r2 = 0
            r0 = 1
            r1 = r9
            r9.A07 = r0
            r0 = r16 & 4
            if (r0 == 0) goto Lf
            X.0sl r6 = X.C16930sl.A00
        Lf:
            r0 = r16 & 8
            if (r0 == 0) goto L14
            r5 = r2
        L14:
            r0 = r16 & 16
            if (r0 == 0) goto L1a
            X.0sl r7 = X.C16930sl.A00
        L1a:
            r0 = r16 & 32
            if (r0 == 0) goto L20
            X.0sl r8 = X.C16930sl.A00
        L20:
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QIy.<init>(X.Rgi, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, int):void");
    }

    public QIy(EnumC61185Rgl enumC61185Rgl, EnumC61182Rgi enumC61182Rgi, String str, String str2, List list, List list2, List list3) {
        this.A07 = 1;
        C14360o3.A0B(str, 2);
        this.A04 = enumC61182Rgi;
        this.A05 = str;
        this.A03 = list;
        this.A06 = str2;
        this.A01 = list2;
        this.A00 = list3;
        this.A02 = enumC61185Rgl;
    }
}
