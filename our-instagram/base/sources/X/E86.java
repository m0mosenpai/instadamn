package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes6.dex */
public final class E86 extends C0T6 implements InterfaceC37274GbR {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    @Override // X.InterfaceC37274GbR
    public final E86 EzE() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E86) {
                E86 e86 = (E86) obj;
                if (!C14360o3.A0K(this.A04, e86.A04) || !C14360o3.A0K(this.A01, e86.A01) || !C14360o3.A0K(this.A02, e86.A02) || !C14360o3.A0K(this.A00, e86.A00) || !C14360o3.A0K(this.A03, e86.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37274GbR
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTRightsManagerFlagInfoDict", AbstractC33738EvQ.A00(this));
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A04) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public E86(Boolean bool, String str, String str2, String str3, List list) {
        this.A04 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
        this.A03 = str3;
    }

    @Override // X.InterfaceC37274GbR
    public final List AsA() {
        return this.A04;
    }

    @Override // X.InterfaceC37274GbR
    public final String Bks() {
        return this.A01;
    }

    @Override // X.InterfaceC37274GbR
    public final String BsS() {
        return this.A02;
    }

    @Override // X.InterfaceC37274GbR
    public final Boolean Buy() {
        return this.A00;
    }

    @Override // X.InterfaceC37274GbR
    public final String CBn() {
        return this.A03;
    }
}
