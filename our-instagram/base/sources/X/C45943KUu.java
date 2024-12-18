package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KUu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45943KUu extends AbstractC46448Kh8 {
    public final long A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45943KUu) {
                C45943KUu c45943KUu = (C45943KUu) obj;
                if (!C14360o3.A0K(this.A01, c45943KUu.A01) || this.A00 != c45943KUu.A00 || this.A03 != c45943KUu.A03 || !C14360o3.A0K(this.A02, c45943KUu.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC25236BEt.A01(this.A00, AbstractC167017dG.A0M(this.A01) * 31)) + AbstractC166997dE.A0I(this.A02);
    }

    public C45943KUu(ImageUrl imageUrl, Integer num, long j, boolean z) {
        this.A01 = imageUrl;
        this.A00 = j;
        this.A03 = z;
        this.A02 = num;
    }
}
