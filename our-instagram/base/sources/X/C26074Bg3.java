package X;

/* renamed from: X.Bg3 */
/* loaded from: classes5.dex */
public final class C26074Bg3 extends C0T6 {
    public final int A00;
    public final C26200BiQ A01;
    public final C6R A02;
    public final C6R A03;
    public final InterfaceC30822Dgx A04;
    public final InterfaceC30822Dgx A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static /* synthetic */ C26074Bg3 A01(InterfaceC30822Dgx interfaceC30822Dgx, C26074Bg3 c26074Bg3) {
        return A00(null, null, null, interfaceC30822Dgx, null, c26074Bg3, null, null, null, null, 8190, false);
    }

    public static /* synthetic */ C26074Bg3 A02(InterfaceC30822Dgx interfaceC30822Dgx, C26074Bg3 c26074Bg3) {
        return A00(null, null, null, null, interfaceC30822Dgx, c26074Bg3, null, null, null, null, 8189, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26074Bg3) {
                C26074Bg3 c26074Bg3 = (C26074Bg3) obj;
                if (!C14360o3.A0K(this.A04, c26074Bg3.A04) || !C14360o3.A0K(this.A05, c26074Bg3.A05) || this.A02 != c26074Bg3.A02 || !C14360o3.A0K(this.A06, c26074Bg3.A06) || this.A0B != c26074Bg3.A0B || !C14360o3.A0K(this.A08, c26074Bg3.A08) || !C14360o3.A0K(this.A09, c26074Bg3.A09) || !C14360o3.A0K(this.A07, c26074Bg3.A07) || this.A0A != c26074Bg3.A0A || this.A0C != c26074Bg3.A0C || !C14360o3.A0K(this.A01, c26074Bg3.A01) || this.A03 != c26074Bg3.A03 || this.A00 != c26074Bg3.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C26074Bg3 A00(C26200BiQ c26200BiQ, C6R c6r, C6R c6r2, InterfaceC30822Dgx interfaceC30822Dgx, InterfaceC30822Dgx interfaceC30822Dgx2, C26074Bg3 c26074Bg3, Long l, String str, String str2, String str3, int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        C6R c6r3 = c6r2;
        C26200BiQ c26200BiQ2 = c26200BiQ;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        boolean z4 = z;
        Long l2 = l;
        C6R c6r4 = c6r;
        InterfaceC30822Dgx interfaceC30822Dgx3 = interfaceC30822Dgx2;
        InterfaceC30822Dgx interfaceC30822Dgx4 = interfaceC30822Dgx;
        if ((i & 1) != 0) {
            interfaceC30822Dgx4 = c26074Bg3.A04;
        }
        if ((i & 2) != 0) {
            interfaceC30822Dgx3 = c26074Bg3.A05;
        }
        if ((i & 4) != 0) {
            c6r4 = c26074Bg3.A02;
        }
        if ((i & 8) != 0) {
            l2 = c26074Bg3.A06;
        }
        if ((i & 16) != 0) {
            z4 = c26074Bg3.A0B;
        }
        if ((i & 32) != 0) {
            str6 = c26074Bg3.A08;
        }
        if ((i & 64) != 0) {
            str5 = c26074Bg3.A09;
        }
        if ((i & 128) != 0) {
            str4 = c26074Bg3.A07;
        }
        if ((i & 256) != 0) {
            z2 = c26074Bg3.A0A;
        } else {
            z2 = false;
        }
        if ((i & 512) != 0) {
            z3 = c26074Bg3.A0C;
        } else {
            z3 = false;
        }
        if ((i & 1024) != 0) {
            c26200BiQ2 = c26074Bg3.A01;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            c6r3 = c26074Bg3.A03;
        }
        if ((i & 4096) != 0) {
            i2 = c26074Bg3.A00;
        } else {
            i2 = 0;
        }
        AbstractC167027dH.A12(interfaceC30822Dgx4, interfaceC30822Dgx3, c6r4);
        AbstractC167007dF.A1H(str6, 5, str4);
        return new C26074Bg3(c26200BiQ2, c6r4, c6r3, interfaceC30822Dgx4, interfaceC30822Dgx3, l2, str6, str5, str4, i2, z4, z2, z3);
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0K(this.A07, (AbstractC166997dE.A0K(this.A08, AbstractC167007dF.A0D(this.A0B, (AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0G(this.A04))) + AbstractC167017dG.A0M(this.A06)) * 31)) + AbstractC167017dG.A0O(this.A09)) * 31))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31) + this.A00;
    }

    public C26074Bg3(C26200BiQ c26200BiQ, C6R c6r, C6R c6r2, InterfaceC30822Dgx interfaceC30822Dgx, InterfaceC30822Dgx interfaceC30822Dgx2, Long l, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        this.A04 = interfaceC30822Dgx;
        this.A05 = interfaceC30822Dgx2;
        this.A02 = c6r;
        this.A06 = l;
        this.A0B = z;
        this.A08 = str;
        this.A09 = str2;
        this.A07 = str3;
        this.A0A = z2;
        this.A0C = z3;
        this.A01 = c26200BiQ;
        this.A03 = c6r2;
        this.A00 = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26074Bg3() {
        /*
            r14 = this;
            r1 = 0
            X.Cur r4 = X.C29248Cur.A00
            X.C6R r2 = X.C6R.A04
            r11 = 0
            java.lang.String r7 = ""
            r12 = 1
            r10 = 2000(0x7d0, float:2.803E-42)
            r0 = r14
            r3 = r1
            r5 = r4
            r6 = r1
            r8 = r1
            r9 = r7
            r13 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26074Bg3.<init>():void");
    }
}
