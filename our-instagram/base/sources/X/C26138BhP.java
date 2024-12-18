package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BhP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26138BhP extends C0T6 implements InterfaceC31123Dm6 {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC31123Dm6
    public final C26138BhP Ewu() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26138BhP) {
                C26138BhP c26138BhP = (C26138BhP) obj;
                if (!C14360o3.A0K(this.A00, c26138BhP.A00) || !C14360o3.A0K(this.A01, c26138BhP.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31123Dm6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMoreInfoSubItem", CDO.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C26138BhP(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC31123Dm6
    public final String BEi() {
        return this.A00;
    }

    @Override // X.InterfaceC31123Dm6
    public final String BEz() {
        return this.A01;
    }
}
