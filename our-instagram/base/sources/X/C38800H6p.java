package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H6p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38800H6p extends C0T6 implements InterfaceC43519JKf {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC43519JKf
    public final C38800H6p F3I() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38800H6p) {
                C38800H6p c38800H6p = (C38800H6p) obj;
                if (!C14360o3.A0K(this.A00, c38800H6p.A00) || !C14360o3.A0K(this.A01, c38800H6p.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43519JKf
    public final String BL7() {
        return this.A00;
    }

    @Override // X.InterfaceC43519JKf
    public final String CAg() {
        return this.A01;
    }

    @Override // X.InterfaceC43519JKf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextStickerTranslationData", AbstractC40414Hw1.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C38800H6p(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
