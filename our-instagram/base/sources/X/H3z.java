package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H3z extends C0T6 implements InterfaceC43507JJt {
    public final InterfaceC43510JJw A00;

    @Override // X.InterfaceC43507JJt
    public final H3z Evg() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H3z) && C14360o3.A0K(this.A00, ((H3z) obj).A00));
    }

    @Override // X.InterfaceC43507JJt
    public final InterfaceC43510JJw Bcm() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public H3z(InterfaceC43510JJw interfaceC43510JJw) {
        this.A00 = interfaceC43510JJw;
    }

    @Override // X.InterfaceC43507JJt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (Bcm() != null) {
            InterfaceC43510JJw Bcm = Bcm();
            if (Bcm != null) {
                treeUpdaterJNI = Bcm.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("photo3d_info", treeUpdaterJNI);
        }
        return AbstractC37300Gc1.A05("XDTImmersiveMediaMetadata", AbstractC06930Yk.A0B(A0X));
    }
}
