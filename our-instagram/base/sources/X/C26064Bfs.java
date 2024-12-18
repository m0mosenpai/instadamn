package X;

import java.util.List;

/* renamed from: X.Bfs */
/* loaded from: classes5.dex */
public final class C26064Bfs extends C0T6 {
    public final int A00 = 0;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26064Bfs(java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13, int r14, int r15) {
        /*
            r10 = this;
            r6 = r13
            r5 = r12
            r4 = r11
            r7 = 0
            r1 = 0
            r8 = 0
            r2 = r10
            r10.A00 = r8
            r0 = r15 & 1
            if (r0 == 0) goto L29
            X.C6R r3 = X.C6R.A03
        Lf:
            r0 = r15 & 2
            if (r0 == 0) goto L15
            X.5HZ r7 = X.C5HZ.A01
        L15:
            r0 = r15 & 8
            if (r0 == 0) goto L1a
            r4 = r1
        L1a:
            r0 = r15 & 16
            if (r0 == 0) goto L1f
            r5 = r1
        L1f:
            r0 = r15 & 64
            if (r0 == 0) goto L24
            r6 = r1
        L24:
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        L29:
            r3 = r7
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26064Bfs.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, int, int):void");
    }

    public static /* synthetic */ C26064Bfs A00(C26064Bfs c26064Bfs, C6R c6r, C5Hc c5Hc, int i, int i2) {
        int i3 = i;
        C5Hc c5Hc2 = c5Hc;
        C6R c6r2 = c6r;
        Integer num = null;
        Integer num2 = null;
        int i4 = 0;
        Integer num3 = null;
        if ((i2 & 1) != 0) {
            c6r2 = (C6R) c26064Bfs.A05;
        }
        if ((i2 & 2) != 0) {
            c5Hc2 = (C5Hc) c26064Bfs.A04;
        }
        if ((i2 & 4) != 0) {
            i3 = c26064Bfs.A01;
        }
        if ((i2 & 8) != 0) {
            num = (Integer) c26064Bfs.A03;
        }
        if ((i2 & 16) != 0) {
            num2 = (Integer) c26064Bfs.A06;
        }
        if ((i2 & 32) != 0) {
            i4 = c26064Bfs.A02;
        }
        if ((i2 & 64) != 0) {
            num3 = (Integer) c26064Bfs.A07;
        }
        AbstractC167017dG.A1N(c6r2, c5Hc2);
        return new C26064Bfs(c6r2, num, num2, num3, c5Hc2, i3, i4);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26064Bfs) {
                    C26064Bfs c26064Bfs = (C26064Bfs) obj;
                    if (c26064Bfs.A00 == 1 && C14360o3.A0K(this.A06, c26064Bfs.A06) && C14360o3.A0K(this.A07, c26064Bfs.A07) && this.A01 == c26064Bfs.A01 && this.A02 == c26064Bfs.A02 && C14360o3.A0K(this.A05, c26064Bfs.A05) && C14360o3.A0K(this.A04, c26064Bfs.A04)) {
                        obj2 = this.A03;
                        obj3 = c26064Bfs.A03;
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
            if (!(obj instanceof C26064Bfs)) {
                return false;
            }
            C26064Bfs c26064Bfs2 = (C26064Bfs) obj;
            if (c26064Bfs2.A00 != 0 || this.A05 != c26064Bfs2.A05 || !C14360o3.A0K(this.A04, c26064Bfs2.A04) || this.A01 != c26064Bfs2.A01 || !C14360o3.A0K(this.A03, c26064Bfs2.A03) || !C14360o3.A0K(this.A06, c26064Bfs2.A06) || this.A02 != c26064Bfs2.A02) {
                return false;
            }
            obj2 = this.A07;
            obj3 = c26064Bfs2.A07;
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
            return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A04, (((((((AbstractC166987dD.A0G(this.A06) + AbstractC167017dG.A0M(this.A07)) * 31) + this.A01) * 31) + this.A02) * 31) + AbstractC166997dE.A0I(this.A05)) * 31));
        }
        return ((((((((AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A05)) + this.A01) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A02) * 31) + AbstractC166997dE.A0I(this.A07);
    }

    public C26064Bfs(C6R c6r, Integer num, Integer num2, Integer num3, C5Hc c5Hc, int i, int i2) {
        AbstractC167017dG.A1P(c6r, c5Hc);
        this.A05 = c6r;
        this.A04 = c5Hc;
        this.A01 = i;
        this.A03 = num;
        this.A06 = num2;
        this.A02 = i2;
        this.A07 = num3;
    }

    public C26064Bfs(C38688GzT c38688GzT, InterfaceC31134DmH interfaceC31134DmH, Long l, List list, List list2, int i, int i2) {
        AbstractC25229BEm.A1I(list, 1, list2);
        this.A06 = list;
        this.A07 = interfaceC31134DmH;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = l;
        this.A04 = list2;
        this.A03 = c38688GzT;
    }
}
