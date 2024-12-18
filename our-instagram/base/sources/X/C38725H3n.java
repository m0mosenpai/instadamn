package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38725H3n extends C0T6 implements InterfaceC43537JKx {
    public final JKI A00;
    public final JKJ A01;
    public final InterfaceC43536JKw A02;

    @Override // X.InterfaceC43537JKx
    public final C38725H3n EvE() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38725H3n) {
                C38725H3n c38725H3n = (C38725H3n) obj;
                if (!C14360o3.A0K(this.A00, c38725H3n.A00) || !C14360o3.A0K(this.A01, c38725H3n.A01) || !C14360o3.A0K(this.A02, c38725H3n.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43537JKx
    public final JKI AeL() {
        return this.A00;
    }

    @Override // X.InterfaceC43537JKx
    public final JKJ Bbm() {
        return this.A01;
    }

    @Override // X.InterfaceC43537JKx
    public final InterfaceC43536JKw Bkw() {
        return this.A02;
    }

    @Override // X.InterfaceC43537JKx
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGMetaPaymentsSDKSetupPayloadDict", AbstractC40000Hoh.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C38725H3n(JKI jki, JKJ jkj, InterfaceC43536JKw interfaceC43536JKw) {
        this.A00 = jki;
        this.A01 = jkj;
        this.A02 = interfaceC43536JKw;
    }
}
