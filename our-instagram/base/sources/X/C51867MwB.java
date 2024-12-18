package X;

import java.util.List;

/* renamed from: X.MwB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51867MwB extends C0T6 implements InterfaceC57855PlL {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C51867MwB(Integer num, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(list, 2);
        this.A01 = str;
        this.A04 = list;
        this.A03 = str2;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A02 = str3;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51867MwB) {
                C51867MwB c51867MwB = (C51867MwB) obj;
                if (!C14360o3.A0K(this.A01, c51867MwB.A01) || !C14360o3.A0K(this.A04, c51867MwB.A04) || !C14360o3.A0K(this.A03, c51867MwB.A03) || this.A06 != c51867MwB.A06 || this.A05 != c51867MwB.A05 || this.A07 != c51867MwB.A07 || !C14360o3.A0K(this.A02, c51867MwB.A02) || this.A00 != c51867MwB.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = (AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC167017dG.A0O(this.A01) * 31))))) + AbstractC167017dG.A0O(this.A02)) * 31;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "CALL";
        } else {
            str = "INVITE";
        }
        return AbstractC25231BEo.A0H(str, intValue, A0D);
    }
}
