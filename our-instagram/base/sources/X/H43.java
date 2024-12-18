package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H43 extends C0T6 implements JKN {
    public final String A00;
    public final String A01;

    @Override // X.JKN
    public final H43 Evq() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H43) {
                H43 h43 = (H43) obj;
                if (!C14360o3.A0K(this.A00, h43.A00) || !C14360o3.A0K(this.A01, h43.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKN
    public final String BL7() {
        return this.A00;
    }

    @Override // X.JKN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTKaraokeTranslatedCaptionData", HpR.A00(this));
    }

    @Override // X.JKN
    public final String getUri() {
        return this.A01;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public H43(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
