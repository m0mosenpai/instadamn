package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H2R extends C0T6 implements JLL {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public H2R(String str, String str2, String str3, String str4) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // X.JLL
    public final H2R ErI() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2R) {
                H2R h2r = (H2R) obj;
                if (!C14360o3.A0K(this.A00, h2r.A00) || !C14360o3.A0K(this.A01, h2r.A01) || !C14360o3.A0K(this.A02, h2r.A02) || !C14360o3.A0K(this.A03, h2r.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLL
    public final String AY2() {
        return this.A00;
    }

    @Override // X.JLL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTBloksStickerNativePropsIGMention", AbstractC39772Hki.A00(this));
    }

    @Override // X.JLL
    public final String getFullName() {
        return this.A01;
    }

    @Override // X.JLL
    public final String getProfilePicUrl() {
        return this.A02;
    }

    @Override // X.JLL
    public final String getUsername() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00))));
    }
}
