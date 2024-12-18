package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E88 extends C0T6 implements InterfaceC37277GbU {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;

    public E88(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2) {
        AbstractC25233BEq.A0x(3, str2, list2, str3);
        C14360o3.A0B(str6, 9);
        this.A08 = list;
        this.A03 = str;
        this.A02 = str2;
        this.A09 = list2;
        this.A04 = str3;
        this.A00 = bool;
        this.A05 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E88) {
                E88 e88 = (E88) obj;
                if (!C14360o3.A0K(this.A08, e88.A08) || !C14360o3.A0K(this.A03, e88.A03) || !C14360o3.A0K(this.A02, e88.A02) || !C14360o3.A0K(this.A09, e88.A09) || !C14360o3.A0K(this.A04, e88.A04) || !C14360o3.A0K(this.A00, e88.A00) || !C14360o3.A0K(this.A05, e88.A05) || !C14360o3.A0K(this.A06, e88.A06) || !C14360o3.A0K(this.A07, e88.A07) || !C14360o3.A0K(this.A01, e88.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A07, (((((AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0K(this.A02, ((AbstractC167017dG.A0M(this.A08) * 31) + AbstractC167017dG.A0O(this.A03)) * 31))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    @Override // X.InterfaceC37277GbU
    public final List B45() {
        return this.A09;
    }

    @Override // X.InterfaceC37277GbU
    public final String BAS() {
        return this.A04;
    }

    @Override // X.InterfaceC37277GbU
    public final Boolean BwQ() {
        return this.A00;
    }

    @Override // X.InterfaceC37277GbU
    public final String C3e() {
        return this.A06;
    }

    @Override // X.InterfaceC37277GbU
    public final Integer CDo() {
        return this.A01;
    }

    @Override // X.InterfaceC37277GbU
    public final String CIp() {
        return this.A02;
    }

    @Override // X.InterfaceC37277GbU
    public final String getCategory() {
        return this.A03;
    }

    @Override // X.InterfaceC37277GbU
    public final String getSubtitle() {
        return this.A05;
    }

    @Override // X.InterfaceC37277GbU
    public final String getTitle() {
        return this.A07;
    }

    @Override // X.InterfaceC37277GbU
    public final InterfaceC37277GbU E9r(C1DY c1dy) {
        return this;
    }
}
