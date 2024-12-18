package X;

import java.util.List;

/* renamed from: X.K2t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45291K2t extends C0T6 implements MNW {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45291K2t) {
                C45291K2t c45291K2t = (C45291K2t) obj;
                if (!C14360o3.A0K(this.A01, c45291K2t.A01) || !C14360o3.A0K(this.A00, c45291K2t.A00) || this.A06 != c45291K2t.A06 || this.A08 != c45291K2t.A08 || this.A09 != c45291K2t.A09 || this.A07 != c45291K2t.A07 || this.A05 != c45291K2t.A05 || this.A02 != c45291K2t.A02 || this.A04 != c45291K2t.A04 || this.A03 != c45291K2t.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0G(this.A01))))))))));
    }

    public C45291K2t(String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A01 = list;
        this.A00 = str;
        this.A06 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A07 = z4;
        this.A05 = z5;
        this.A02 = z6;
        this.A04 = z7;
        this.A03 = z8;
    }

    public C45291K2t() {
        this("", C16930sl.A00, true, false, false, false, false, false, false, false);
    }
}
