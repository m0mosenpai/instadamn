package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H2f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38694H2f extends C0T6 implements JKA {
    public final String A00;
    public final String A01;

    public C38694H2f(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.JKA
    public final C38694H2f Eru() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38694H2f) {
                C38694H2f c38694H2f = (C38694H2f) obj;
                if (!C14360o3.A0K(this.A00, c38694H2f.A00) || !C14360o3.A0K(this.A01, c38694H2f.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKA
    public final String Byk() {
        return this.A00;
    }

    @Override // X.JKA
    public final String Byp() {
        return this.A01;
    }

    @Override // X.JKA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClipsCutoutStickerInfo", AbstractC39813HlN.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
