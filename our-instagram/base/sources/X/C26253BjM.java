package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BjM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26253BjM extends C0T6 implements InterfaceC30888Di1 {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26253BjM) {
                C26253BjM c26253BjM = (C26253BjM) obj;
                if (!C14360o3.A0K(this.A02, c26253BjM.A02) || !C14360o3.A0K(this.A01, c26253BjM.A01) || !C14360o3.A0K(this.A00, c26253BjM.A00) || this.A03 != c26253BjM.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A02))));
    }

    public C26253BjM(ImageUrl imageUrl, String str, String str2, boolean z) {
        AbstractC167017dG.A1Q(str, imageUrl);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = imageUrl;
        this.A03 = z;
    }
}
