package X;

import java.util.List;

/* renamed from: X.Jxn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45118Jxn extends C0T6 {
    public final C50679MYx A00;
    public final MUD A01;
    public final MRM A02;
    public final C38321qM A03;
    public final Integer A04;
    public final Integer A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45118Jxn) {
                C45118Jxn c45118Jxn = (C45118Jxn) obj;
                if (this.A08 != c45118Jxn.A08 || this.A07 != c45118Jxn.A07 || this.A09 != c45118Jxn.A09 || !C14360o3.A0K(this.A02, c45118Jxn.A02) || !C14360o3.A0K(this.A03, c45118Jxn.A03) || !C14360o3.A0K(this.A06, c45118Jxn.A06) || !C14360o3.A0K(this.A01, c45118Jxn.A01) || !C14360o3.A0K(this.A00, c45118Jxn.A00) || this.A0A != c45118Jxn.A0A || this.A05 != c45118Jxn.A05 || this.A04 != c45118Jxn.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C45118Jxn A00(MUD mud, C45118Jxn c45118Jxn, MRM mrm, Integer num, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C38321qM c38321qM;
        C50679MYx c50679MYx;
        Integer num2 = num;
        boolean z5 = z4;
        MUD mud2 = mud;
        List list2 = list;
        MRM mrm2 = mrm;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        Integer num3 = null;
        if ((i & 1) != 0) {
            z8 = c45118Jxn.A08;
        }
        if ((i & 2) != 0) {
            z7 = c45118Jxn.A07;
        }
        if ((i & 4) != 0) {
            z6 = c45118Jxn.A09;
        }
        if ((i & 8) != 0) {
            mrm2 = c45118Jxn.A02;
        }
        if ((i & 16) != 0) {
            c38321qM = c45118Jxn.A03;
        } else {
            c38321qM = null;
        }
        if ((i & 32) != 0) {
            list2 = c45118Jxn.A06;
        }
        if ((i & 64) != 0) {
            mud2 = c45118Jxn.A01;
        }
        if ((i & 128) != 0) {
            c50679MYx = c45118Jxn.A00;
        } else {
            c50679MYx = null;
        }
        if ((i & 256) != 0) {
            z5 = c45118Jxn.A0A;
        }
        if ((i & 512) != 0) {
            num3 = c45118Jxn.A05;
        }
        if ((i & 1024) != 0) {
            num2 = c45118Jxn.A04;
        }
        AbstractC167007dF.A1J(list2, 5, num3);
        C14360o3.A0B(num2, 10);
        return new C45118Jxn(c50679MYx, mud2, mrm2, c38321qM, num3, num2, list2, z8, z7, z6, z5);
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0A, (((AbstractC166997dE.A0J(this.A06, (((AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A07, AbstractC25225BEi.A08(this.A08))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31) + AbstractC46629Kk6.A00(this.A05)) * 31) + AbstractC46630Kk7.A00(this.A04);
    }

    public C45118Jxn(C50679MYx c50679MYx, MUD mud, MRM mrm, C38321qM c38321qM, Integer num, Integer num2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A02 = mrm;
        this.A03 = c38321qM;
        this.A06 = list;
        this.A01 = mud;
        this.A00 = c50679MYx;
        this.A0A = z4;
        this.A05 = num;
        this.A04 = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45118Jxn() {
        /*
            r12 = this;
            r1 = 0
            r8 = 0
            X.0sl r7 = X.C16930sl.A00
            java.lang.Integer r5 = X.C05F.A00
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r9 = r8
            r10 = r8
            r11 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45118Jxn.<init>():void");
    }
}
