package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H2Q extends C0T6 implements InterfaceC43501JJn {
    public final JLL A00;

    @Override // X.InterfaceC43501JJn
    public final H2Q ErJ() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H2Q) && C14360o3.A0K(this.A00, ((H2Q) obj).A00));
    }

    @Override // X.InterfaceC43501JJn
    public final JLL BG3() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public H2Q(JLL jll) {
        this.A00 = jll;
    }

    @Override // X.InterfaceC43501JJn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BG3() != null) {
            JLL BG3 = BG3();
            if (BG3 != null) {
                treeUpdaterJNI = BG3.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("ig_mention", treeUpdaterJNI);
        }
        return AbstractC37300Gc1.A05("XDTBloksStickerNativeProps", AbstractC06930Yk.A0B(A0X));
    }
}
