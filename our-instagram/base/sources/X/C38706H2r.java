package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaType;

/* renamed from: X.H2r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38706H2r extends C0T6 implements C5FH {
    public final MediaType A00;
    public final String A01;
    public final String A02;

    @Override // X.C5FH
    public final C38706H2r EsM() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38706H2r) {
                C38706H2r c38706H2r = (C38706H2r) obj;
                if (!C14360o3.A0K(this.A01, c38706H2r.A01) || !C14360o3.A0K(this.A02, c38706H2r.A02) || this.A00 != c38706H2r.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5FH
    public final String Aec() {
        return this.A01;
    }

    @Override // X.C5FH
    public final String Aee() {
        return this.A02;
    }

    @Override // X.C5FH
    public final MediaType CBX() {
        return this.A00;
    }

    @Override // X.C5FH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCommentAvatarMediaInfo", AbstractC39839Hln.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38706H2r(MediaType mediaType, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = mediaType;
    }
}
