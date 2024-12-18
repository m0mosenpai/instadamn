package X;

import java.util.Map;

/* renamed from: X.Bg7 */
/* loaded from: classes5.dex */
public final class C26078Bg7 extends C0T6 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26078Bg7(X.C38321qM r1, java.lang.Integer r2, java.lang.Integer r3, java.lang.String r4, java.util.Map r5, java.util.Set r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8, int r9, int r10, boolean r11) {
        /*
            r0 = this;
            r8 = 0
            r0.A00 = r8
            java.lang.Integer r2 = X.C05F.A0N
            r1 = 0
            X.0sk r5 = X.AbstractC06930Yk.A0E()
            X.0sj r6 = X.C16910sj.A00
            r7 = -1
            r3 = r2
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26078Bg7.<init>(X.1qM, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.Map, java.util.Set, kotlin.jvm.internal.DefaultConstructorMarker, int, int, int, boolean):void");
    }

    public static /* synthetic */ C26078Bg7 A01(C26078Bg7 c26078Bg7, Integer num) {
        return A00(c26078Bg7, null, null, num, null, null, null, 0, 247, false);
    }

    public static /* synthetic */ C26078Bg7 A02(C26078Bg7 c26078Bg7, Integer num, java.util.Set set, int i) {
        return A00(c26078Bg7, null, num, null, null, null, set, 0, i, false);
    }

    public static /* synthetic */ C26078Bg7 A00(C26078Bg7 c26078Bg7, C38321qM c38321qM, Integer num, Integer num2, String str, Map map, java.util.Set set, int i, int i2, boolean z) {
        boolean z2 = z;
        java.util.Set set2 = set;
        int i3 = i;
        Integer num3 = num2;
        String str2 = str;
        Map map2 = map;
        C38321qM c38321qM2 = c38321qM;
        Integer num4 = num;
        if ((i2 & 1) != 0) {
            num4 = (Integer) c26078Bg7.A03;
        }
        if ((i2 & 2) != 0) {
            c38321qM2 = (C38321qM) c26078Bg7.A04;
        }
        if ((i2 & 4) != 0) {
            map2 = (Map) c26078Bg7.A02;
        }
        if ((i2 & 8) != 0) {
            num3 = (Integer) c26078Bg7.A06;
        }
        if ((i2 & 16) != 0) {
            str2 = c26078Bg7.A07;
        }
        if ((i2 & 32) != 0) {
            set2 = (java.util.Set) c26078Bg7.A05;
        }
        if ((i2 & 64) != 0) {
            z2 = c26078Bg7.A08;
        }
        if ((i2 & 128) != 0) {
            i3 = c26078Bg7.A01;
        }
        AbstractC25233BEq.A0v(0, num4, map2, num3);
        C14360o3.A0B(set2, 5);
        return new C26078Bg7(c38321qM2, num4, num3, str2, map2, set2, i3, z2);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C26078Bg7) {
            C26078Bg7 c26078Bg7 = (C26078Bg7) obj;
            if (c26078Bg7.A00 != i || this.A03 != c26078Bg7.A03 || !C14360o3.A0K(this.A04, c26078Bg7.A04) || !C14360o3.A0K(this.A02, c26078Bg7.A02) || this.A06 != c26078Bg7.A06 || !C14360o3.A0K(this.A07, c26078Bg7.A07) || !C14360o3.A0K(this.A05, c26078Bg7.A05) || this.A08 != c26078Bg7.A08 || this.A01 != c26078Bg7.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A0J;
        int i = this.A00;
        Integer num = (Integer) this.A03;
        if (i != 0) {
            A0J = ((AbstractC166997dE.A0J(this.A02, ((AbstractC27539CDj.A00(num) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC27538CDi.A00((Integer) this.A06)) * 31) + AbstractC25227BEk.A07(this.A07);
        } else {
            A0J = ((AbstractC166997dE.A0J(this.A02, ((AbstractC27539CDj.A00(num) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC27538CDi.A00((Integer) this.A06)) * 31) + AbstractC25227BEk.A07(this.A07);
        }
        return AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A05, A0J * 31)) + this.A01;
    }

    public C26078Bg7(C31230DoD c31230DoD, Integer num, Integer num2, String str, C5Hc c5Hc, InterfaceC65696TsI interfaceC65696TsI, int i, boolean z) {
        AbstractC25233BEq.A0w(1, num, c5Hc, num2);
        C14360o3.A0B(interfaceC65696TsI, 6);
        this.A03 = num;
        this.A04 = c31230DoD;
        this.A02 = c5Hc;
        this.A06 = num2;
        this.A07 = str;
        this.A05 = interfaceC65696TsI;
        this.A08 = z;
        this.A01 = i;
    }

    public C26078Bg7(C38321qM c38321qM, Integer num, Integer num2, String str, Map map, java.util.Set set, int i, boolean z) {
        this.A03 = num;
        this.A04 = c38321qM;
        this.A02 = map;
        this.A06 = num2;
        this.A07 = str;
        this.A05 = set;
        this.A08 = z;
        this.A01 = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26078Bg7() {
        /*
            r10 = this;
            r0 = 1
            r1 = r10
            r10.A00 = r0
            java.lang.Integer r3 = X.C05F.A0N
            r2 = 0
            X.5HZ r6 = X.C5HZ.A01
            X.Pvy r7 = X.C58473Pvy.A03
            r9 = 0
            r8 = -1
            r4 = r3
            r5 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26078Bg7.<init>():void");
    }
}
