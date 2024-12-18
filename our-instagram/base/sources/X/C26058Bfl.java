package X;

import java.util.List;

/* renamed from: X.Bfl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26058Bfl extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    public C26058Bfl(C74 c74, C74 c742, Integer num, Integer num2, String str, List list, List list2, boolean z) {
        this.A03 = list;
        this.A06 = num;
        this.A08 = z;
        this.A07 = str;
        this.A02 = c74;
        this.A04 = c742;
        this.A01 = num2;
        this.A05 = list2;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26058Bfl) {
                    C26058Bfl c26058Bfl = (C26058Bfl) obj;
                    if (c26058Bfl.A00 != 1 || !C14360o3.A0K(this.A03, c26058Bfl.A03) || !C14360o3.A0K(this.A06, c26058Bfl.A06) || this.A08 != c26058Bfl.A08 || !C14360o3.A0K(this.A07, c26058Bfl.A07) || this.A02 != c26058Bfl.A02 || this.A04 != c26058Bfl.A04 || this.A01 != c26058Bfl.A01 || !C14360o3.A0K(this.A05, c26058Bfl.A05)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C26058Bfl)) {
                return false;
            }
            C26058Bfl c26058Bfl2 = (C26058Bfl) obj;
            if (c26058Bfl2.A00 != 0 || !C14360o3.A0K(this.A03, c26058Bfl2.A03) || !C14360o3.A0K(this.A02, c26058Bfl2.A02) || !C14360o3.A0K(this.A04, c26058Bfl2.A04) || !C14360o3.A0K(this.A01, c26058Bfl2.A01) || this.A06 != c26058Bfl2.A06 || !C14360o3.A0K(this.A07, c26058Bfl2.A07) || !C14360o3.A0K(this.A05, c26058Bfl2.A05) || this.A08 != c26058Bfl2.A08) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        int A0G = AbstractC166987dD.A0G(this.A03);
        if (i != 0) {
            return ((AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A02, (AbstractC167007dF.A0D(this.A08, (A0G + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31)) + CJW.A00((Integer) this.A01)) * 31) + AbstractC166997dE.A0I(this.A05);
        }
        return AbstractC166987dD.A0K(this.A08, AbstractC166997dE.A0J(this.A05, (((AbstractC166997dE.A0J(this.A01, (((A0G + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC25227BEk.A07(this.A07)) * 31));
    }

    public C26058Bfl(C51760Mtj c51760Mtj, C51760Mtj c51760Mtj2, C61 c61, C28224CcU c28224CcU, InterfaceC30817Dgs interfaceC30817Dgs, String str, C5Hc c5Hc, boolean z) {
        C14360o3.A0B(c5Hc, 4);
        this.A03 = interfaceC30817Dgs;
        this.A02 = c28224CcU;
        this.A04 = c51760Mtj;
        this.A01 = c5Hc;
        this.A06 = c61;
        this.A07 = str;
        this.A05 = c51760Mtj2;
        this.A08 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26058Bfl() {
        /*
            r10 = this;
            r0 = 1
            r1 = r10
            r10.A00 = r0
            X.0sl r7 = X.C16930sl.A00
            r4 = 0
            r9 = 0
            X.C74 r2 = X.C74.A07
            java.lang.Integer r5 = X.C05F.A01
            r3 = r2
            r6 = r4
            r8 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26058Bfl.<init>():void");
    }
}
