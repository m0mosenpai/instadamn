package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class URQ extends C0T6 implements InterfaceC31126Dm9 {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC31126Dm9
    public final URQ F35() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URQ) {
                URQ urq = (URQ) obj;
                if (!C14360o3.A0K(this.A00, urq.A00) || !C14360o3.A0K(this.A01, urq.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC31126Dm9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextColorSpec", VPB.A00(this));
    }

    @Override // X.InterfaceC31126Dm9
    public final String getDark() {
        return this.A00;
    }

    @Override // X.InterfaceC31126Dm9
    public final String getLight() {
        return this.A01;
    }

    public URQ(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
