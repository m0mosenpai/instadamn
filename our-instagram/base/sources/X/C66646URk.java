package X;

import java.util.List;

/* renamed from: X.URk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66646URk extends C0T6 implements C5NL, InterfaceC71984XDt {
    public int A00;
    public int A01;
    public VES A02;
    public C6S5 A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public List A07;
    public boolean A08;
    public transient Integer A09;

    @Override // X.InterfaceC71984XDt
    public final String Bd2(int i) {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66646URk) {
                C66646URk c66646URk = (C66646URk) obj;
                if (!C14360o3.A0K(this.A07, c66646URk.A07) || this.A01 != c66646URk.A01 || this.A02 != c66646URk.A02 || this.A00 != c66646URk.A00 || this.A03 != c66646URk.A03 || !C14360o3.A0K(this.A09, c66646URk.A09) || !C14360o3.A0K(this.A06, c66646URk.A06) || this.A08 != c66646URk.A08 || !C14360o3.A0K(this.A05, c66646URk.A05) || !C14360o3.A0K(this.A04, c66646URk.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC71984XDt
    public final int Bd3() {
        return this.A07.size();
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A04;
        String str = this.A06;
        C14360o3.A0A(str);
        c5ng.A06 = AbstractC166987dD.A1J(str);
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A08;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (AbstractC167007dF.A0D(this.A08, (((AbstractC166997dE.A0J(this.A03, (AbstractC166997dE.A0J(this.A02, ((this.A07.hashCode() * 31) + this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31;
        Integer num = this.A04;
        if (num != null) {
            i = num.hashCode();
        }
        return A0D + i;
    }

    public C66646URk(VES ves, C6S5 c6s5, Integer num, Integer num2, Integer num3, String str, List list, int i, int i2, boolean z) {
        AbstractC167017dG.A1Q(list, ves);
        this.A07 = list;
        this.A01 = i;
        this.A02 = ves;
        this.A00 = i2;
        this.A03 = c6s5;
        this.A09 = num;
        this.A06 = str;
        this.A08 = z;
        this.A05 = num2;
        this.A04 = num3;
    }

    @Override // X.InterfaceC71984XDt
    public final int AYr(int i) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC71984XDt
    public final int Bzm(int i) {
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66646URk() {
        /*
            r11 = this;
            r3 = 0
            X.0sl r7 = X.C16930sl.A00
            r8 = 0
            X.VES r1 = X.VZJ.A01
            int r9 = X.VZJ.A00
            X.6S5 r2 = X.C6S5.A05
            r0 = r11
            r4 = r3
            r5 = r3
            r6 = r3
            r10 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66646URk.<init>():void");
    }
}
