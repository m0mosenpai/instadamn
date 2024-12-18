package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HN9 extends C17T implements InterfaceC43501JJn {
    @Override // X.InterfaceC43501JJn
    public final JLL BG3() {
        return (JLL) A05(-1629695031, HNA.class);
    }

    @Override // X.InterfaceC43501JJn
    public final H2Q ErJ() {
        H2R h2r;
        JLL BG3 = BG3();
        if (BG3 != null) {
            h2r = BG3.ErI();
        } else {
            h2r = null;
        }
        return new H2Q(h2r);
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
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
