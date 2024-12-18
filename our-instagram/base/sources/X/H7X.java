package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H7X extends C0T6 implements InterfaceC43525JKl {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC43525JKl
    public final H7X F54() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7X) {
                H7X h7x = (H7X) obj;
                if (!C14360o3.A0K(this.A00, h7x.A00) || !C14360o3.A0K(this.A01, h7x.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43525JKl
    public final String B6W() {
        return this.A00;
    }

    @Override // X.InterfaceC43525JKl
    public final String BNL() {
        return this.A01;
    }

    @Override // X.InterfaceC43525JKl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryElectionStickerDict", I2E.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public H7X(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
