package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;

/* renamed from: X.H2k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38699H2k extends C0T6 implements InterfaceC43531JKr {
    public final ClipsSpinSwappableElementType A00;
    public final InterfaceC43579JMn A01;
    public final String A02;

    @Override // X.InterfaceC43531JKr
    public final C38699H2k Es5() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38699H2k) {
                C38699H2k c38699H2k = (C38699H2k) obj;
                if (!C14360o3.A0K(this.A02, c38699H2k.A02) || this.A00 != c38699H2k.A00 || !C14360o3.A0K(this.A01, c38699H2k.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43531JKr
    public final String B0s() {
        return this.A02;
    }

    @Override // X.InterfaceC43531JKr
    public final ClipsSpinSwappableElementType B0z() {
        return this.A00;
    }

    @Override // X.InterfaceC43531JKr
    public final InterfaceC43579JMn C4W() {
        return this.A01;
    }

    @Override // X.InterfaceC43531JKr
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClipsSpinSwappableElement", AbstractC39821HlV.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38699H2k(ClipsSpinSwappableElementType clipsSpinSwappableElementType, InterfaceC43579JMn interfaceC43579JMn, String str) {
        this.A02 = str;
        this.A00 = clipsSpinSwappableElementType;
        this.A01 = interfaceC43579JMn;
    }
}
