package X;

import java.util.List;

/* renamed from: X.E6q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32064E6q extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32064E6q() {
        /*
            r8 = this;
            r4 = 0
            r1 = 0
            r5 = 255(0xff, float:3.57E-43)
            r0 = r8
            r2 = r1
            r3 = r1
            r6 = r4
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32064E6q.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32064E6q) {
                C32064E6q c32064E6q = (C32064E6q) obj;
                if (this.A01 != c32064E6q.A01 || this.A00 != c32064E6q.A00 || this.A02 != c32064E6q.A02 || this.A03 != c32064E6q.A03 || !C14360o3.A0K(this.A04, c32064E6q.A04) || !C14360o3.A0K(this.A05, c32064E6q.A05) || this.A07 != c32064E6q.A07 || this.A06 != c32064E6q.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C32064E6q(Integer num, List list, List list2, int i, int i2, boolean z, boolean z2) {
        int i3 = (i2 & 1) != 0 ? 2131952583 : 0;
        int i4 = (i2 & 2) != 0 ? 2131952582 : 0;
        i = (i2 & 4) != 0 ? 2131952566 : i;
        num = (i2 & 8) != 0 ? C05F.A00 : num;
        list = (i2 & 16) != 0 ? C16930sl.A00 : list;
        list2 = (i2 & 32) != 0 ? C16930sl.A00 : list2;
        z = (i2 & 64) != 0 ? false : z;
        boolean z3 = (i2 & 128) == 0 ? z2 : false;
        C14360o3.A0B(num, 4);
        AbstractC167017dG.A1T(list, list2);
        this.A01 = i3;
        this.A00 = i4;
        this.A02 = i;
        this.A03 = num;
        this.A04 = list;
        this.A05 = list2;
        this.A07 = z;
        this.A06 = z3;
    }

    public final int hashCode() {
        String str;
        int i = ((((this.A01 * 31) + this.A00) * 31) + this.A02) * 31;
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "GRID";
        } else {
            str = "LIST";
        }
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC25231BEo.A0H(str, intValue, i)))));
    }
}
