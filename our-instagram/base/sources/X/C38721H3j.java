package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H3j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38721H3j extends C0T6 implements JKI {
    public final Boolean A00;
    public final List A01;

    @Override // X.JKI
    public final C38721H3j EvA() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38721H3j) {
                C38721H3j c38721H3j = (C38721H3j) obj;
                if (!C14360o3.A0K(this.A01, c38721H3j.A01) || !C14360o3.A0K(this.A00, c38721H3j.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKI
    public final List AeM() {
        return this.A01;
    }

    @Override // X.JKI
    public final Boolean CQL() {
        return this.A00;
    }

    @Override // X.JKI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGMetaPaymentsSDKAvailabilityDict", AbstractC39994Hob.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38721H3j(Boolean bool, List list) {
        this.A01 = list;
        this.A00 = bool;
    }
}
