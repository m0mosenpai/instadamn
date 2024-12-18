package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H72 extends C0T6 implements InterfaceC43524JKk {
    public final long A00;
    public final String A01;

    public H72(long j, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = j;
        this.A01 = str;
    }

    @Override // X.InterfaceC43524JKk
    public final H72 F3m() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H72) {
                H72 h72 = (H72) obj;
                if (this.A00 != h72.A00 || !C14360o3.A0K(this.A01, h72.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43524JKk
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTViewerReaction", AbstractC40448Hwd.A00(this));
    }

    @Override // X.InterfaceC43524JKk
    public final long getCreatedAt() {
        return this.A00;
    }

    @Override // X.InterfaceC43524JKk
    public final String getEmoji() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC25235BEs.A03(this.A00));
    }
}
