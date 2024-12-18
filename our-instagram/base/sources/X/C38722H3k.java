package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H3k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38722H3k extends C0T6 implements C5FZ {
    public final InterfaceC43537JKx A00;

    @Override // X.C5FZ
    public final C38722H3k EvB() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38722H3k) && C14360o3.A0K(this.A00, ((C38722H3k) obj).A00));
    }

    @Override // X.C5FZ
    public final InterfaceC43537JKx AnP() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C38722H3k(InterfaceC43537JKx interfaceC43537JKx) {
        this.A00 = interfaceC43537JKx;
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
        return AbstractC37300Gc1.A05("XDTIGMetaPaymentsSDKIABPostClickDataExtensionDict", AbstractC06930Yk.A0B(A0X));
    }
}
