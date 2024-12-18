package X;

import java.util.List;

/* renamed from: X.MwD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51869MwD extends C0T6 implements InterfaceC57855PlL {
    public final List A00;
    public final List A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51869MwD) {
                C51869MwD c51869MwD = (C51869MwD) obj;
                if (!C14360o3.A0K(this.A02, c51869MwD.A02) || !C14360o3.A0K(this.A01, c51869MwD.A01) || !C14360o3.A0K(this.A00, c51869MwD.A00) || this.A08 != c51869MwD.A08 || this.A04 != c51869MwD.A04 || this.A05 != c51869MwD.A05 || this.A07 != c51869MwD.A07 || this.A06 != c51869MwD.A06 || this.A03 != c51869MwD.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)))))))));
    }

    public C51869MwD(List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = list3;
        this.A08 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A06 = z5;
        this.A03 = z6;
    }
}
