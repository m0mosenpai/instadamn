package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipChainType;

/* renamed from: X.H2d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38692H2d extends C0T6 implements InterfaceC43530JKq {
    public final int A00;
    public final ClipChainType A01;
    public final String A02;

    @Override // X.InterfaceC43530JKq
    public final C38692H2d Erp() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38692H2d) {
                C38692H2d c38692H2d = (C38692H2d) obj;
                if (this.A00 != c38692H2d.A00 || this.A01 != c38692H2d.A01 || !C14360o3.A0K(this.A02, c38692H2d.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43530JKq
    public final int Ao6() {
        return this.A00;
    }

    @Override // X.InterfaceC43530JKq
    public final ClipChainType AoC() {
        return this.A01;
    }

    @Override // X.InterfaceC43530JKq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClipChainMetadataDict", AbstractC39808HlI.A00(this));
    }

    @Override // X.InterfaceC43530JKq
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A01, this.A00 * 31));
    }

    public C38692H2d(ClipChainType clipChainType, String str, int i) {
        AbstractC167017dG.A1R(clipChainType, str);
        this.A00 = i;
        this.A01 = clipChainType;
        this.A02 = str;
    }
}
