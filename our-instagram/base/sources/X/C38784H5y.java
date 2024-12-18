package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H5y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38784H5y extends C0T6 implements InterfaceC43540JLa {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC43540JLa
    public final C38784H5y F1Z() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38784H5y) {
                C38784H5y c38784H5y = (C38784H5y) obj;
                if (!C14360o3.A0K(this.A01, c38784H5y.A01) || !C14360o3.A0K(this.A02, c38784H5y.A02) || !C14360o3.A0K(this.A00, c38784H5y.A00) || !C14360o3.A0K(this.A03, c38784H5y.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43540JLa
    public final Integer Arz() {
        return this.A01;
    }

    @Override // X.InterfaceC43540JLa
    public final String BEE() {
        return this.A02;
    }

    @Override // X.InterfaceC43540JLa
    public final Boolean CVt() {
        return this.A00;
    }

    @Override // X.InterfaceC43540JLa
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryQuizTallyDict", AbstractC40316HuM.A00(this));
    }

    @Override // X.InterfaceC43540JLa
    public final String getText() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C38784H5y(Boolean bool, Integer num, String str, String str2) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = bool;
        this.A03 = str2;
    }
}
