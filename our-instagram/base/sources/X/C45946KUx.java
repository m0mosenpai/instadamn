package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KUx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45946KUx extends AbstractC46449Kh9 {
    public final ImageUrl A00;
    public final C40971v4 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C45946KUx(ImageUrl imageUrl, C40971v4 c40971v4, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = c40971v4;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45946KUx) {
                C45946KUx c45946KUx = (C45946KUx) obj;
                if (!C14360o3.A0K(this.A02, c45946KUx.A02) || !C14360o3.A0K(this.A00, c45946KUx.A00) || !C14360o3.A0K(this.A01, c45946KUx.A01) || !C14360o3.A0K(this.A04, c45946KUx.A04) || !C14360o3.A0K(this.A03, c45946KUx.A03) || this.A05 != c45946KUx.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (((((((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31);
    }
}
