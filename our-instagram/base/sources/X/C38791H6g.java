package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppTextFragmentType;

/* renamed from: X.H6g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38791H6g extends C0T6 implements JMW {
    public final InterfaceC43495JJh A00;
    public final InterfaceC43517JKd A01;
    public final InterfaceC43542JLc A02;
    public final InterfaceC43496JJi A03;
    public final TextAppTextFragmentType A04;
    public final String A05;

    @Override // X.JMW
    public final C38791H6g F30(C1DY c1dy) {
        return this;
    }

    @Override // X.JMW
    public final C38791H6g F31(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38791H6g) {
                C38791H6g c38791H6g = (C38791H6g) obj;
                if (!C14360o3.A0K(this.A00, c38791H6g.A00) || this.A04 != c38791H6g.A04 || !C14360o3.A0K(this.A01, c38791H6g.A01) || !C14360o3.A0K(this.A02, c38791H6g.A02) || !C14360o3.A0K(this.A05, c38791H6g.A05) || !C14360o3.A0K(this.A03, c38791H6g.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMW
    public final InterfaceC43495JJh B5W() {
        return this.A00;
    }

    @Override // X.JMW
    public final TextAppTextFragmentType B8V() {
        return this.A04;
    }

    @Override // X.JMW
    public final InterfaceC43517JKd BNO() {
        return this.A01;
    }

    @Override // X.JMW
    public final InterfaceC43542JLc BSM() {
        return this.A02;
    }

    @Override // X.JMW
    public final String Bdh() {
        return this.A05;
    }

    @Override // X.JMW
    public final InterfaceC43496JJi C4y() {
        return this.A03;
    }

    @Override // X.JMW
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextAppTextFragment", AbstractC40395Hvi.A00(this));
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public C38791H6g(InterfaceC43495JJh interfaceC43495JJh, InterfaceC43517JKd interfaceC43517JKd, InterfaceC43542JLc interfaceC43542JLc, InterfaceC43496JJi interfaceC43496JJi, TextAppTextFragmentType textAppTextFragmentType, String str) {
        this.A00 = interfaceC43495JJh;
        this.A04 = textAppTextFragmentType;
        this.A01 = interfaceC43517JKd;
        this.A02 = interfaceC43542JLc;
        this.A05 = str;
        this.A03 = interfaceC43496JJi;
    }

    @Override // X.JMW
    public final JMW EB3(C1DY c1dy) {
        return this;
    }
}
