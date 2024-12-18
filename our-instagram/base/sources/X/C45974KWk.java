package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.KWk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45974KWk extends AbstractC46459KhJ {
    public final Medium A00;
    public final C47Z A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45974KWk) {
                C45974KWk c45974KWk = (C45974KWk) obj;
                if (!C14360o3.A0K(this.A00, c45974KWk.A00) || !C14360o3.A0K(this.A01, c45974KWk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C45974KWk(Medium medium, C47Z c47z) {
        this.A00 = medium;
        this.A01 = c47z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GalleryVideo(medium=");
        A1C.append(this.A00);
        A1C.append(", pendingMedia=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
