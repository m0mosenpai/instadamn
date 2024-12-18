package X;

import java.util.List;

/* renamed from: X.Mwc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51894Mwc extends C0T6 implements InterfaceC57856PlM {
    public final float A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C51894Mwc(String str, String str2, List list, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC25233BEq.A0w(2, list, str, str2);
        this.A05 = z;
        this.A03 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = f;
        this.A08 = z2;
        this.A06 = z3;
        this.A07 = z4;
        this.A04 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51894Mwc) {
                C51894Mwc c51894Mwc = (C51894Mwc) obj;
                if (this.A05 != c51894Mwc.A05 || !C14360o3.A0K(this.A03, c51894Mwc.A03) || !C14360o3.A0K(this.A01, c51894Mwc.A01) || !C14360o3.A0K(this.A02, c51894Mwc.A02) || Float.compare(this.A00, c51894Mwc.A00) != 0 || this.A08 != c51894Mwc.A08 || this.A06 != c51894Mwc.A06 || this.A07 != c51894Mwc.A07 || this.A04 != c51894Mwc.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A00(AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC25225BEi.A08(this.A05)))), this.A00)))));
    }
}
