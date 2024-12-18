package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HXJ extends C17T implements InterfaceC39521sX {
    @Override // X.InterfaceC39521sX
    public final InterfaceC39501sV BIe() {
        return (InterfaceC39501sV) A05(301526158, HXI.class);
    }

    @Override // X.InterfaceC39521sX
    public final C39511sW F6c() {
        C39491sU c39491sU;
        InterfaceC39501sV BIe = BIe();
        if (BIe != null) {
            c39491sU = BIe.F6d();
        } else {
            c39491sU = null;
        }
        return new C39511sW(c39491sU);
    }

    @Override // X.InterfaceC39521sX
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BIe() != null) {
            InterfaceC39501sV BIe = BIe();
            if (BIe != null) {
                treeUpdaterJNI = BIe.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("instruction", treeUpdaterJNI);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
