package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H46 extends C0T6 implements InterfaceC43566JMa {
    public final float A00;
    public final float A01;
    public final Boolean A02;
    public final Float A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // X.InterfaceC43566JMa
    public final H46 Ew6() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H46) {
                H46 h46 = (H46) obj;
                if (!C14360o3.A0K(this.A04, h46.A04) || !C14360o3.A0K(this.A05, h46.A05) || !C14360o3.A0K(this.A06, h46.A06) || !C14360o3.A0K(this.A07, h46.A07) || !C14360o3.A0K(this.A02, h46.A02) || Float.compare(this.A00, h46.A00) != 0 || Float.compare(this.A01, h46.A01) != 0 || !C14360o3.A0K(this.A08, h46.A08) || !C14360o3.A0K(this.A09, h46.A09) || !C14360o3.A0K(this.A03, h46.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43566JMa
    public final String Ap3() {
        return this.A04;
    }

    @Override // X.InterfaceC43566JMa
    public final String B0i() {
        return this.A06;
    }

    @Override // X.InterfaceC43566JMa
    public final String B42() {
        return this.A07;
    }

    @Override // X.InterfaceC43566JMa
    public final float BM7() {
        return this.A00;
    }

    @Override // X.InterfaceC43566JMa
    public final float BO8() {
        return this.A01;
    }

    @Override // X.InterfaceC43566JMa
    public final String Bdf() {
        return this.A09;
    }

    @Override // X.InterfaceC43566JMa
    public final Float Bjy() {
        return this.A03;
    }

    @Override // X.InterfaceC43566JMa
    public final Boolean CRT() {
        return this.A02;
    }

    @Override // X.InterfaceC43566JMa
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTLocationCoordinates", AbstractC40048Hpa.A00(this));
    }

    @Override // X.InterfaceC43566JMa
    public final String getEffectId() {
        return this.A05;
    }

    @Override // X.InterfaceC43566JMa
    public final String getName() {
        return this.A08;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A00(AbstractC166997dE.A00(((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31, this.A00), this.A01) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public H46(Boolean bool, Float f, String str, String str2, String str3, String str4, String str5, String str6, float f2, float f3) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = bool;
        this.A00 = f2;
        this.A01 = f3;
        this.A08 = str5;
        this.A09 = str6;
        this.A03 = f;
    }
}
