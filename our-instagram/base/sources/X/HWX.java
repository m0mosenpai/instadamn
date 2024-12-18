package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HWX extends C17T implements JK5 {
    @Override // X.JK5
    public final JK4 BHI() {
        return (JK4) A05(-1703305877, HWW.class);
    }

    @Override // X.JK5
    public final C38815H7f F5d() {
        C38814H7e c38814H7e;
        JK4 BHI = BHI();
        if (BHI != null) {
            c38814H7e = BHI.F5c();
        } else {
            c38814H7e = null;
        }
        return new C38815H7f(c38814H7e);
    }

    @Override // X.JK5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BHI() != null) {
            JK4 BHI = BHI();
            if (BHI != null) {
                treeUpdaterJNI = BHI.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("incentive", treeUpdaterJNI);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
