package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H6Q extends C0T6 implements InterfaceC43563JLx {
    public final Boolean A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC43563JLx
    public final H6Q F2g() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6Q) {
                H6Q h6q = (H6Q) obj;
                if (!C14360o3.A0K(this.A02, h6q.A02) || !C14360o3.A0K(this.A00, h6q.A00) || !C14360o3.A0K(this.A03, h6q.A03) || !C14360o3.A0K(this.A01, h6q.A01) || !C14360o3.A0K(this.A04, h6q.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43563JLx
    public final String BWt() {
        return this.A03;
    }

    @Override // X.InterfaceC43563JLx
    public final Boolean BxX() {
        return this.A01;
    }

    @Override // X.InterfaceC43563JLx
    public final Boolean CU1() {
        return this.A00;
    }

    @Override // X.InterfaceC43563JLx
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSurveyAnswerDict", AbstractC40366HvC.A00(this));
    }

    @Override // X.InterfaceC43563JLx
    public final String getId() {
        return this.A02;
    }

    @Override // X.InterfaceC43563JLx
    public final String getText() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public H6Q(Boolean bool, Boolean bool2, String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = bool;
        this.A03 = str2;
        this.A01 = bool2;
        this.A04 = str3;
    }
}
