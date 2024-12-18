package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HQB extends C17T implements C5FZ {
    @Override // X.C5FZ
    public final InterfaceC43537JKx AnP() {
        return (InterfaceC43537JKx) A05(-1004744521, HQE.class);
    }

    @Override // X.C5FZ
    public final C38722H3k EvB() {
        C38725H3n c38725H3n;
        InterfaceC43537JKx AnP = AnP();
        if (AnP != null) {
            c38725H3n = AnP.EvE();
        } else {
            c38725H3n = null;
        }
        return new C38722H3k(c38725H3n);
    }

    @Override // X.C5FZ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (AnP() != null) {
            InterfaceC43537JKx AnP = AnP();
            if (AnP != null) {
                treeUpdaterJNI = AnP.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("checkoutSetupPayload", treeUpdaterJNI);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
