package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H2Z extends C0T6 implements InterfaceC43528JKo {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public H2Z(String str, int i, boolean z) {
        C14360o3.A0B(str, 3);
        this.A00 = i;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // X.InterfaceC43528JKo
    public final H2Z Ere() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2Z) {
                H2Z h2z = (H2Z) obj;
                if (this.A00 != h2z.A00 || this.A02 != h2z.A02 || !C14360o3.A0K(this.A01, h2z.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43528JKo
    public final int Am3() {
        return this.A00;
    }

    @Override // X.InterfaceC43528JKo
    public final String BSQ() {
        return this.A01;
    }

    @Override // X.InterfaceC43528JKo
    public final boolean CRI() {
        return this.A02;
    }

    @Override // X.InterfaceC43528JKo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCarouselChildCommentMention", AbstractC39799Hl9.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC167007dF.A0D(this.A02, this.A00 * 31));
    }
}
