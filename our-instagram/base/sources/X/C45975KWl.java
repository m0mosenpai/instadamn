package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.KWl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45975KWl extends AbstractC46459KhJ {
    public final Medium A00;
    public final C47Z A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45975KWl) {
                C45975KWl c45975KWl = (C45975KWl) obj;
                if (!C14360o3.A0K(this.A00, c45975KWl.A00) || !C14360o3.A0K(this.A01, c45975KWl.A01) || this.A02 != c45975KWl.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public C45975KWl(Medium medium, C47Z c47z, boolean z) {
        this.A00 = medium;
        this.A01 = c47z;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GalleryPhoto(medium=");
        A1C.append(this.A00);
        A1C.append(", pendingMedia=");
        A1C.append(this.A01);
        A1C.append(", isHd=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
