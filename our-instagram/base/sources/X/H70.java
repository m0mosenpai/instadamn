package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H70 extends C0T6 implements InterfaceC43523JKj {
    public final String A00;
    public final boolean A01;

    public H70(boolean z, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = z;
        this.A00 = str;
    }

    @Override // X.InterfaceC43523JKj
    public final H70 F3j() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H70) {
                H70 h70 = (H70) obj;
                if (this.A01 != h70.A01 || !C14360o3.A0K(this.A00, h70.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43523JKj
    public final String CEz() {
        return this.A00;
    }

    @Override // X.InterfaceC43523JKj
    public final boolean CRE() {
        return this.A01;
    }

    @Override // X.InterfaceC43523JKj
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTVideoChatCaptureInfo", AbstractC40443HwY.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC25225BEi.A08(this.A01));
    }
}
