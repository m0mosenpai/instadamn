package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H6M extends C0T6 implements InterfaceC43577JMl {
    public final InterfaceC43493JJf A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;

    @Override // X.InterfaceC43577JMl
    public final H6M F2U() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6M) {
                H6M h6m = (H6M) obj;
                if (!C14360o3.A0K(this.A0D, h6m.A0D) || !C14360o3.A0K(this.A01, h6m.A01) || !C14360o3.A0K(this.A02, h6m.A02) || !C14360o3.A0K(this.A09, h6m.A09) || !C14360o3.A0K(this.A0A, h6m.A0A) || !C14360o3.A0K(this.A0B, h6m.A0B) || !C14360o3.A0K(this.A0C, h6m.A0C) || !C14360o3.A0K(this.A03, h6m.A03) || !C14360o3.A0K(this.A04, h6m.A04) || !C14360o3.A0K(this.A00, h6m.A00) || !C14360o3.A0K(this.A05, h6m.A05) || !C14360o3.A0K(this.A06, h6m.A06) || !C14360o3.A0K(this.A07, h6m.A07) || !C14360o3.A0K(this.A08, h6m.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43577JMl
    public final String AdC() {
        return this.A0D;
    }

    @Override // X.InterfaceC43577JMl
    public final Float B29() {
        return this.A01;
    }

    @Override // X.InterfaceC43577JMl
    public final Float BDR() {
        return this.A02;
    }

    @Override // X.InterfaceC43577JMl
    public final Float Bpa() {
        return this.A03;
    }

    @Override // X.InterfaceC43577JMl
    public final Float Bzq() {
        return this.A04;
    }

    @Override // X.InterfaceC43577JMl
    public final InterfaceC43493JJf CHa() {
        return this.A00;
    }

    @Override // X.InterfaceC43577JMl
    public final Float CHf() {
        return this.A05;
    }

    @Override // X.InterfaceC43577JMl
    public final Float CI1() {
        return this.A06;
    }

    @Override // X.InterfaceC43577JMl
    public final Float CIa() {
        return this.A07;
    }

    @Override // X.InterfaceC43577JMl
    public final Float CIh() {
        return this.A08;
    }

    @Override // X.InterfaceC43577JMl
    public final Integer CUY() {
        return this.A09;
    }

    @Override // X.InterfaceC43577JMl
    public final Integer CVk() {
        return this.A0A;
    }

    @Override // X.InterfaceC43577JMl
    public final Integer CaJ() {
        return this.A0B;
    }

    @Override // X.InterfaceC43577JMl
    public final Integer Cdh() {
        return this.A0C;
    }

    @Override // X.InterfaceC43577JMl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryWhatsAppStickerTappableObject", AbstractC40357Hv2.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((AbstractC167017dG.A0O(this.A0D) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC166997dE.A0I(this.A08);
    }

    public H6M(InterfaceC43493JJf interfaceC43493JJf, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        this.A0D = str;
        this.A01 = f;
        this.A02 = f2;
        this.A09 = num;
        this.A0A = num2;
        this.A0B = num3;
        this.A0C = num4;
        this.A03 = f3;
        this.A04 = f4;
        this.A00 = interfaceC43493JJf;
        this.A05 = f5;
        this.A06 = f6;
        this.A07 = f7;
        this.A08 = f8;
    }
}
