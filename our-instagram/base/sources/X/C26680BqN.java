package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BqN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26680BqN extends C99 {
    public final ImageUrl A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26680BqN) {
                C26680BqN c26680BqN = (C26680BqN) obj;
                if (!C14360o3.A0K(this.A01, c26680BqN.A01) || !C14360o3.A0K(this.A00, c26680BqN.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C26680BqN(ImageUrl imageUrl, String str) {
        AbstractC167017dG.A1P(str, imageUrl);
        this.A01 = str;
        this.A00 = imageUrl;
    }
}
