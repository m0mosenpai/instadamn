package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class URR extends C0T6 implements InterfaceC99344d3 {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC99344d3
    public final URR F38() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URR) {
                URR urr = (URR) obj;
                if (!C14360o3.A0K(this.A00, urr.A00) || !C14360o3.A0K(this.A01, urr.A01) || !C14360o3.A0K(this.A02, urr.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC99344d3
    public final String BIl() {
        return this.A00;
    }

    @Override // X.InterfaceC99344d3
    public final String BXD() {
        return this.A01;
    }

    @Override // X.InterfaceC99344d3
    public final String BkG() {
        return this.A02;
    }

    @Override // X.InterfaceC99344d3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppDebugInfo", VPD.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public URR(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
