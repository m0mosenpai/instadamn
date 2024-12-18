package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4Fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93064Fg extends C0T6 implements InterfaceC93074Fh {
    public final int A00;
    public final String A01;

    public C93064Fg(int i, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.InterfaceC93074Fh
    public final C93064Fg EsG() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93064Fg) {
                C93064Fg c93064Fg = (C93064Fg) obj;
                if (this.A00 != c93064Fg.A00 || !C14360o3.A0K(this.A01, c93064Fg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC93074Fh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTextColor", AbstractC37397Gdd.A00(this));
    }

    @Override // X.InterfaceC93074Fh
    public final int getCount() {
        return this.A00;
    }

    @Override // X.InterfaceC93074Fh
    public final String getHexRgbaColor() {
        return this.A01;
    }
}
