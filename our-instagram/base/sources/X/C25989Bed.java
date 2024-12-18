package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bed, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25989Bed extends C0T6 {
    public final ImageUrl A00;
    public final Double A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25989Bed) {
                C25989Bed c25989Bed = (C25989Bed) obj;
                if (!C14360o3.A0K(this.A02, c25989Bed.A02) || !C14360o3.A0K(this.A03, c25989Bed.A03) || !C14360o3.A0K(this.A00, c25989Bed.A00) || !C14360o3.A0K(this.A01, c25989Bed.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02))) + AbstractC167017dG.A0M(this.A01);
    }

    public C25989Bed(ImageUrl imageUrl, Double d, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = imageUrl;
        this.A01 = d;
    }
}
