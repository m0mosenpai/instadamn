package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H3l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38723H3l extends C0T6 implements JKJ {
    public final String A00;
    public final List A01;

    @Override // X.JKJ
    public final C38723H3l EvC() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38723H3l) {
                C38723H3l c38723H3l = (C38723H3l) obj;
                if (!C14360o3.A0K(this.A00, c38723H3l.A00) || !C14360o3.A0K(this.A01, c38723H3l.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKJ
    public final String Bbr() {
        return this.A00;
    }

    @Override // X.JKJ
    public final List C4C() {
        return this.A01;
    }

    @Override // X.JKJ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGMetaPaymentsSDKPaymentConfigDict", AbstractC39996Hod.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38723H3l(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
