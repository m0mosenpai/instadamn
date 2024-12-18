package X;

import java.util.List;

/* renamed from: X.Bg1 */
/* loaded from: classes5.dex */
public final class C26072Bg1 extends C0T6 {
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C26072Bg1(String str, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
        this.A01 = list4;
        this.A06 = z;
        this.A0A = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A09 = z5;
        this.A05 = z6;
    }

    public static /* synthetic */ C26072Bg1 A02(C26072Bg1 c26072Bg1, List list) {
        return A00(c26072Bg1, null, null, null, list, null, 2007, true, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26072Bg1) {
                C26072Bg1 c26072Bg1 = (C26072Bg1) obj;
                if (!C14360o3.A0K(this.A00, c26072Bg1.A00) || !C14360o3.A0K(this.A03, c26072Bg1.A03) || !C14360o3.A0K(this.A04, c26072Bg1.A04) || !C14360o3.A0K(this.A02, c26072Bg1.A02) || !C14360o3.A0K(this.A01, c26072Bg1.A01) || this.A06 != c26072Bg1.A06 || this.A0A != c26072Bg1.A0A || this.A07 != c26072Bg1.A07 || this.A08 != c26072Bg1.A08 || this.A09 != c26072Bg1.A09 || this.A05 != c26072Bg1.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C26072Bg1 A00(C26072Bg1 c26072Bg1, String str, List list, List list2, List list3, List list4, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7 = z5;
        boolean z8 = z4;
        boolean z9 = z3;
        boolean z10 = z2;
        boolean z11 = z;
        List list5 = list4;
        List list6 = list3;
        List list7 = list2;
        List list8 = list;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c26072Bg1.A00;
        }
        if ((i & 2) != 0) {
            list8 = c26072Bg1.A03;
        }
        if ((i & 4) != 0) {
            list7 = c26072Bg1.A04;
        }
        if ((i & 8) != 0) {
            list6 = c26072Bg1.A02;
        }
        if ((i & 16) != 0) {
            list5 = c26072Bg1.A01;
        }
        if ((i & 32) != 0) {
            z11 = c26072Bg1.A06;
        }
        if ((i & 64) != 0) {
            z10 = c26072Bg1.A0A;
        }
        if ((i & 128) != 0) {
            z9 = c26072Bg1.A07;
        }
        if ((i & 256) != 0) {
            z8 = c26072Bg1.A08;
        }
        if ((i & 512) != 0) {
            z7 = c26072Bg1.A09;
        }
        if ((i & 1024) != 0) {
            z6 = c26072Bg1.A05;
        } else {
            z6 = false;
        }
        C14360o3.A0B(str2, 0);
        AbstractC167027dH.A0a(1, list8, list7, list6, list5);
        return new C26072Bg1(str2, list8, list7, list6, list5, z11, z10, z9, z8, z7, z6);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A00)))))))))));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26072Bg1() {
        /*
            r12 = this;
            java.lang.String r1 = ""
            X.0sl r2 = X.C16930sl.A00
            r6 = 0
            r0 = r12
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26072Bg1.<init>():void");
    }
}
