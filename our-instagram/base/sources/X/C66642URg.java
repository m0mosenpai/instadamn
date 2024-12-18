package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.URg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66642URg extends C0T6 implements InterfaceC99384d8 {
    public final C38321qM A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    @Override // X.InterfaceC99384d8
    public final C66642URg F4k(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC99384d8
    public final C66642URg F4l(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66642URg) {
                C66642URg c66642URg = (C66642URg) obj;
                if (!C14360o3.A0K(this.A05, c66642URg.A05) || !C14360o3.A0K(this.A06, c66642URg.A06) || !C14360o3.A0K(this.A01, c66642URg.A01) || !C14360o3.A0K(this.A02, c66642URg.A02) || !C14360o3.A0K(this.A03, c66642URg.A03) || !C14360o3.A0K(this.A00, c66642URg.A00) || !C14360o3.A0K(this.A04, c66642URg.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC99384d8
    public final String Apu() {
        return this.A05;
    }

    @Override // X.InterfaceC99384d8
    public final String Apv() {
        return this.A06;
    }

    @Override // X.InterfaceC99384d8
    public final C38321qM BPJ() {
        return this.A00;
    }

    @Override // X.InterfaceC99384d8
    public final Integer BXl() {
        return this.A04;
    }

    @Override // X.InterfaceC99384d8
    public final Boolean CXq() {
        return this.A01;
    }

    @Override // X.InterfaceC99384d8
    public final Boolean CXr() {
        return this.A02;
    }

    @Override // X.InterfaceC99384d8
    public final Boolean Cfv() {
        return this.A03;
    }

    @Override // X.InterfaceC99384d8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppMediaLoopCommunityInfo", VTF.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        Integer num = this.A04;
        if (num != null) {
            i = num.hashCode();
        }
        return A0O + i;
    }

    public C66642URg(C38321qM c38321qM, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2) {
        this.A05 = str;
        this.A06 = str2;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A00 = c38321qM;
        this.A04 = num;
    }

    @Override // X.InterfaceC99384d8
    public final InterfaceC99384d8 EBT(C1DY c1dy) {
        return this;
    }
}
