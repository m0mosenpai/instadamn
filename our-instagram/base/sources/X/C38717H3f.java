package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38717H3f extends C0T6 implements InterfaceC43535JKv {
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    @Override // X.InterfaceC43535JKv
    public final C38717H3f Euj() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38717H3f) {
                C38717H3f c38717H3f = (C38717H3f) obj;
                if (!C14360o3.A0K(this.A00, c38717H3f.A00) || !C14360o3.A0K(this.A01, c38717H3f.A01) || !C14360o3.A0K(this.A02, c38717H3f.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43535JKv
    public final Integer BN2() {
        return this.A00;
    }

    @Override // X.InterfaceC43535JKv
    public final Integer BYa() {
        return this.A01;
    }

    @Override // X.InterfaceC43535JKv
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGIABPostClickDisclaimerBodyRangeDict", AbstractC39980HoI.A00(this));
    }

    @Override // X.InterfaceC43535JKv
    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public C38717H3f(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }
}
