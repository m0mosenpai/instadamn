package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes11.dex */
public final class URU extends C0T6 implements InterfaceC72033XFv {
    public final XG4 A00;
    public final List A01;

    @Override // X.InterfaceC72033XFv
    public final URU F44() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URU) {
                URU uru = (URU) obj;
                if (!C14360o3.A0K(this.A00, uru.A00) || !C14360o3.A0K(this.A01, uru.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72033XFv
    public final XG4 Aet() {
        return this.A00;
    }

    @Override // X.InterfaceC72033XFv
    public final List Apm() {
        return this.A01;
    }

    @Override // X.InterfaceC72033XFv
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardCommentCardMultiCardPayload", VPN.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = AbstractC167017dG.A0M(this.A00) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        return A0M + i;
    }

    public URU(XG4 xg4, List list) {
        this.A00 = xg4;
        this.A01 = list;
    }
}
