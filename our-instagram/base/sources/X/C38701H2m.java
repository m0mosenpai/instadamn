package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;

/* renamed from: X.H2m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38701H2m extends C0T6 implements InterfaceC43532JKs {
    public final ClipsSpinSwappableElementType A00;
    public final InterfaceC43504JJq A01;
    public final String A02;

    public C38701H2m(ClipsSpinSwappableElementType clipsSpinSwappableElementType, InterfaceC43504JJq interfaceC43504JJq, String str) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = clipsSpinSwappableElementType;
        this.A01 = interfaceC43504JJq;
    }

    @Override // X.InterfaceC43532JKs
    public final C38701H2m Es7() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38701H2m) {
                C38701H2m c38701H2m = (C38701H2m) obj;
                if (!C14360o3.A0K(this.A02, c38701H2m.A02) || this.A00 != c38701H2m.A00 || !C14360o3.A0K(this.A01, c38701H2m.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43532JKs
    public final String B0s() {
        return this.A02;
    }

    @Override // X.InterfaceC43532JKs
    public final ClipsSpinSwappableElementType B0z() {
        return this.A00;
    }

    @Override // X.InterfaceC43532JKs
    public final InterfaceC43504JJq C4X() {
        return this.A01;
    }

    @Override // X.InterfaceC43532JKs
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClipsSpinSwappedElement", AbstractC39823HlX.A00(this));
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }
}
