package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.HQb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39227HQb extends C17T implements InterfaceC43507JJt {
    @Override // X.InterfaceC43507JJt
    public final InterfaceC43510JJw Bcm() {
        return (InterfaceC43510JJw) A05(973885226, HRd.class);
    }

    @Override // X.InterfaceC43507JJt
    public final H3z Evg() {
        H4T h4t;
        InterfaceC43510JJw Bcm = Bcm();
        if (Bcm != null) {
            h4t = Bcm.Exw();
        } else {
            h4t = null;
        }
        return new H3z(h4t);
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
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
