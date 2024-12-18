package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bix, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26233Bix extends C0T6 implements InterfaceC58259Ps3 {
    public final Medium A00;
    public final ImageUrl A01;
    public final String A02;
    public final boolean A03;

    public C26233Bix(Medium medium, ImageUrl imageUrl, String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = medium;
        this.A01 = imageUrl;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26233Bix) {
                C26233Bix c26233Bix = (C26233Bix) obj;
                if (!C14360o3.A0K(this.A02, c26233Bix.A02) || !C14360o3.A0K(this.A00, c26233Bix.A00) || !C14360o3.A0K(this.A01, c26233Bix.A01) || this.A03 != c26233Bix.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0M(this.A01)) * 31);
    }
}
