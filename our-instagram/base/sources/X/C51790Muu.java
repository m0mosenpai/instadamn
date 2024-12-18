package X;

import com.instagram.api.schemas.MediaKitVisibility;

/* renamed from: X.Muu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51790Muu extends C0T6 implements InterfaceC58235Prf {
    public final MediaKitVisibility A00;
    public final String A01;

    public C51790Muu(MediaKitVisibility mediaKitVisibility, String str) {
        C14360o3.A0B(mediaKitVisibility, 2);
        this.A01 = str;
        this.A00 = mediaKitVisibility;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51790Muu) {
                C51790Muu c51790Muu = (C51790Muu) obj;
                if (!C14360o3.A0K(this.A01, c51790Muu.A01) || this.A00 != c51790Muu.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }
}
