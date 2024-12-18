package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BhI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26131BhI extends C0T6 implements InterfaceC31129DmC {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C26131BhI(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // X.InterfaceC31129DmC
    public final C26131BhI Ett() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26131BhI) {
                C26131BhI c26131BhI = (C26131BhI) obj;
                if (!C14360o3.A0K(this.A00, c26131BhI.A00) || !C14360o3.A0K(this.A01, c26131BhI.A01) || !C14360o3.A0K(this.A02, c26131BhI.A02) || !C14360o3.A0K(this.A03, c26131BhI.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31129DmC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGiphyVideoInfo", CDE.A00(this));
    }

    public final int hashCode() {
        return ((((AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    @Override // X.InterfaceC31129DmC
    public final String C8B() {
        return this.A01;
    }

    @Override // X.InterfaceC31129DmC
    public final String getId() {
        return this.A00;
    }

    @Override // X.InterfaceC31129DmC
    public final String getTitle() {
        return this.A02;
    }

    @Override // X.InterfaceC31129DmC
    public final String getUsername() {
        return this.A03;
    }
}
