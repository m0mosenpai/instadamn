package X;

import java.util.List;

/* renamed from: X.Mwd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51895Mwd extends C0T6 implements InterfaceC57856PlM {
    public final Integer A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C51895Mwd(Integer num, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C14360o3.A0B(list, 3);
        this.A06 = z;
        this.A04 = z2;
        this.A02 = list;
        this.A01 = str;
        this.A08 = z3;
        this.A05 = z4;
        this.A03 = z5;
        this.A09 = z6;
        this.A00 = num;
        this.A07 = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51895Mwd) {
                C51895Mwd c51895Mwd = (C51895Mwd) obj;
                if (this.A06 != c51895Mwd.A06 || this.A04 != c51895Mwd.A04 || !C14360o3.A0K(this.A02, c51895Mwd.A02) || !C14360o3.A0K(this.A01, c51895Mwd.A01) || this.A08 != c51895Mwd.A08 || this.A05 != c51895Mwd.A05 || this.A03 != c51895Mwd.A03 || this.A09 != c51895Mwd.A09 || this.A00 != c51895Mwd.A00 || this.A07 != c51895Mwd.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A06))))))));
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "VIDEO_CALL_CANDIDATE";
        } else {
            str = "ROOMS_INVITE_CANDIDATE";
        }
        return AbstractC166987dD.A0K(this.A07, AbstractC25231BEo.A0H(str, intValue, A0D));
    }
}
