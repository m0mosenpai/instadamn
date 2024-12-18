package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.JwH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45026JwH extends C0T6 {
    public final DirectAnimatedMedia A00;
    public final DirectAnimatedMedia A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45026JwH) {
                C45026JwH c45026JwH = (C45026JwH) obj;
                if (!C14360o3.A0K(this.A01, c45026JwH.A01) || !C14360o3.A0K(this.A00, c45026JwH.A00) || this.A02 != c45026JwH.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public C45026JwH(DirectAnimatedMedia directAnimatedMedia, DirectAnimatedMedia directAnimatedMedia2, boolean z) {
        AbstractC167017dG.A1P(directAnimatedMedia, directAnimatedMedia2);
        this.A01 = directAnimatedMedia;
        this.A00 = directAnimatedMedia2;
        this.A02 = z;
    }
}
