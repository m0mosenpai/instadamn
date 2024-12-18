package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.Bie, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26214Bie extends C0T6 implements InterfaceC31132DmF {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C26214Bie(String str, List list, boolean z) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A02 = z;
        this.A00 = str;
    }

    @Override // X.InterfaceC31132DmF
    public final C26214Bie F4d(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC31132DmF
    public final C26214Bie F4e(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26214Bie) {
                C26214Bie c26214Bie = (C26214Bie) obj;
                if (!C14360o3.A0K(this.A01, c26214Bie.A01) || this.A02 != c26214Bie.A02 || !C14360o3.A0K(this.A00, c26214Bie.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31132DmF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGetClipsSpinsResponse", AbstractC27672CIr.A00(this));
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0O(this.A00);
    }

    @Override // X.InterfaceC31132DmF
    public final List Aoa() {
        return this.A01;
    }

    @Override // X.InterfaceC31132DmF
    public final boolean BV0() {
        return this.A02;
    }

    @Override // X.InterfaceC31132DmF
    public final String Bb8() {
        return this.A00;
    }

    @Override // X.InterfaceC31132DmF
    public final InterfaceC31132DmF EBO(C1DY c1dy) {
        return this;
    }
}
