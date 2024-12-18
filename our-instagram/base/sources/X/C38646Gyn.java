package X;

import java.util.List;

/* renamed from: X.Gyn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38646Gyn extends C0T6 {
    public final C50627MWo A00;
    public final C50679MYx A01;
    public final InterfaceC88553xD A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final C84023om A08;
    public final List A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38646Gyn) {
                C38646Gyn c38646Gyn = (C38646Gyn) obj;
                if (this.A06 != c38646Gyn.A06 || this.A05 != c38646Gyn.A05 || !C14360o3.A0K(this.A03, c38646Gyn.A03) || !C14360o3.A0K(this.A02, c38646Gyn.A02) || this.A07 != c38646Gyn.A07 || this.A04 != c38646Gyn.A04 || !C14360o3.A0K(this.A08, c38646Gyn.A08) || !C14360o3.A0K(this.A09, c38646Gyn.A09) || !C14360o3.A0K(this.A00, c38646Gyn.A00) || !C14360o3.A0K(this.A01, c38646Gyn.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C38646Gyn(C50627MWo c50627MWo, C50679MYx c50679MYx, C84023om c84023om, InterfaceC88553xD interfaceC88553xD, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(list, 8);
        this.A06 = z;
        this.A05 = z2;
        this.A03 = str;
        this.A02 = interfaceC88553xD;
        this.A07 = z3;
        this.A04 = z4;
        this.A08 = c84023om;
        this.A09 = list;
        this.A00 = c50627MWo;
        this.A01 = c50679MYx;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A09, (AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A07, (((AbstractC167007dF.A0D(this.A05, AbstractC25225BEi.A08(this.A06)) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31)) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }
}
