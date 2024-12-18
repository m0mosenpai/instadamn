package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class E8I extends C0T6 implements InterfaceC37278GbV {
    public final Float A00;
    public final Float A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // X.InterfaceC37278GbV
    public final E8I F3X() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8I) {
                E8I e8i = (E8I) obj;
                if (!C14360o3.A0K(this.A02, e8i.A02) || !C14360o3.A0K(this.A03, e8i.A03) || !C14360o3.A0K(this.A04, e8i.A04) || !C14360o3.A0K(this.A05, e8i.A05) || !C14360o3.A0K(this.A06, e8i.A06) || !C14360o3.A0K(this.A00, e8i.A00) || !C14360o3.A0K(this.A01, e8i.A01) || !C14360o3.A0K(this.A07, e8i.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37278GbV
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserAdditionalBusinessAddressDict", AbstractC33767Evt.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A07);
    }

    public E8I(Float f, Float f2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = str6;
    }

    @Override // X.InterfaceC37278GbV
    public final String AZj() {
        return this.A02;
    }

    @Override // X.InterfaceC37278GbV
    public final String AZq() {
        return this.A03;
    }

    @Override // X.InterfaceC37278GbV
    public final String Anh() {
        return this.A04;
    }

    @Override // X.InterfaceC37278GbV
    public final String Ani() {
        return this.A05;
    }

    @Override // X.InterfaceC37278GbV
    public final String BIO() {
        return this.A06;
    }

    @Override // X.InterfaceC37278GbV
    public final Float BMH() {
        return this.A00;
    }

    @Override // X.InterfaceC37278GbV
    public final Float BPG() {
        return this.A01;
    }

    @Override // X.InterfaceC37278GbV
    public final String CIl() {
        return this.A07;
    }
}
