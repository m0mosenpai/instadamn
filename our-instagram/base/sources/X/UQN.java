package X;

import android.text.Spannable;
import java.util.List;

/* loaded from: classes11.dex */
public final class UQN extends C0T6 {
    public final int A00;
    public final Spannable A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final java.util.Set A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public static /* synthetic */ UQN A00(Spannable spannable, UQN uqn) {
        return A01(spannable, uqn, null, null, null, 0, 16319, false, false, false, false);
    }

    public static /* synthetic */ UQN A02(Spannable spannable, UQN uqn, java.util.Set set, int i) {
        return A01(spannable, uqn, null, null, set, 0, i, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQN) {
                UQN uqn = (UQN) obj;
                if (this.A0A != uqn.A0A || this.A0B != uqn.A0B || this.A07 != uqn.A07 || !C14360o3.A0K(this.A02, uqn.A02) || this.A06 != uqn.A06 || this.A00 != uqn.A00 || !C14360o3.A0K(this.A01, uqn.A01) || this.A09 != uqn.A09 || this.A0D != uqn.A0D || !C14360o3.A0K(this.A04, uqn.A04) || this.A08 != uqn.A08 || this.A0C != uqn.A0C || !C14360o3.A0K(this.A03, uqn.A03) || !C14360o3.A0K(this.A05, uqn.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ UQN A01(Spannable spannable, UQN uqn, List list, List list2, java.util.Set set, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        java.util.Set set2 = set;
        List list3 = list2;
        boolean z9 = z4;
        List list4 = list;
        boolean z10 = z3;
        Spannable spannable2 = spannable;
        int i3 = i;
        boolean z11 = z2;
        boolean z12 = z;
        String str = null;
        if ((i2 & 1) != 0) {
            z12 = uqn.A0A;
        }
        if ((i2 & 2) != 0) {
            z11 = uqn.A0B;
        }
        if ((i2 & 4) != 0) {
            z5 = uqn.A07;
        } else {
            z5 = false;
        }
        if ((i2 & 8) != 0) {
            str = uqn.A02;
        }
        if ((i2 & 16) != 0) {
            z6 = uqn.A06;
        } else {
            z6 = false;
        }
        if ((i2 & 32) != 0) {
            i3 = uqn.A00;
        }
        if ((i2 & 64) != 0) {
            spannable2 = uqn.A01;
        }
        if ((i2 & 128) != 0) {
            z7 = uqn.A09;
        } else {
            z7 = false;
        }
        if ((i2 & 256) != 0) {
            z10 = uqn.A0D;
        }
        if ((i2 & 512) != 0) {
            list4 = uqn.A04;
        }
        if ((i2 & 1024) != 0) {
            z8 = uqn.A08;
        } else {
            z8 = false;
        }
        if ((i2 & C3OO.FLAG_MOVED) != 0) {
            z9 = uqn.A0C;
        }
        if ((i2 & 4096) != 0) {
            list3 = uqn.A03;
        }
        if ((i2 & 8192) != 0) {
            set2 = uqn.A05;
        }
        AbstractC25229BEm.A1I(str, 3, spannable2);
        C14360o3.A0B(list4, 9);
        AbstractC25229BEm.A1M(list3, 12, set2);
        int i4 = i3;
        return new UQN(spannable2, str, list4, list3, set2, i4, z12, z11, z5, z6, z7, z10, z8, z9);
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        return AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0J(this.A01, (AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0K(this.A02, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0B, i * 31)))) + this.A00) * 31))))))) + this.A05.hashCode();
    }

    public UQN(Spannable spannable, String str, List list, List list2, java.util.Set set, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0A = z;
        this.A0B = z2;
        this.A07 = z3;
        this.A02 = str;
        this.A06 = z4;
        this.A00 = i;
        this.A01 = spannable;
        this.A09 = z5;
        this.A0D = z6;
        this.A04 = list;
        this.A08 = z7;
        this.A0C = z8;
        this.A03 = list2;
        this.A05 = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UQN() {
        /*
            r15 = this;
            r6 = 0
            java.lang.String r2 = ""
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r2)
            X.0sl r3 = X.C16930sl.A00
            X.0sj r5 = X.C16910sj.A00
            r0 = r15
            r4 = r3
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQN.<init>():void");
    }
}
