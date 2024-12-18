package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H3m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38724H3m extends C0T6 implements InterfaceC43536JKw {
    public final String A00;
    public final String A01;
    public final List A02;

    @Override // X.InterfaceC43536JKw
    public final C38724H3m EvD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38724H3m) {
                C38724H3m c38724H3m = (C38724H3m) obj;
                if (!C14360o3.A0K(this.A00, c38724H3m.A00) || !C14360o3.A0K(this.A01, c38724H3m.A01) || !C14360o3.A0K(this.A02, c38724H3m.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43536JKw
    public final List CEM() {
        return this.A02;
    }

    @Override // X.InterfaceC43536JKw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGMetaPaymentsSDKReceiverInfoDict", AbstractC39998Hof.A00(this));
    }

    @Override // X.InterfaceC43536JKw
    public final String getId() {
        return this.A00;
    }

    @Override // X.InterfaceC43536JKw
    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C38724H3m(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }
}
