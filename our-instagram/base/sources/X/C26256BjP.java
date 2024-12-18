package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BjP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26256BjP extends C0T6 implements InterfaceC30891Di4 {
    public final ImageUrl A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26256BjP) {
                C26256BjP c26256BjP = (C26256BjP) obj;
                if (!C14360o3.A0K(this.A01, c26256BjP.A01) || !C14360o3.A0K(this.A00, c26256BjP.A00) || this.A02 != c26256BjP.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public C26256BjP(ImageUrl imageUrl, String str, boolean z) {
        this.A01 = str;
        this.A00 = imageUrl;
        this.A02 = z;
    }
}
