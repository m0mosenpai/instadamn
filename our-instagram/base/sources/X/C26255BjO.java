package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BjO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26255BjO extends C0T6 implements InterfaceC30890Di3 {
    public final InterfaceC30891Di4 A00;
    public final String A01;
    public final ImageUrl A02;
    public final String A03;
    public final boolean A04;

    public C26255BjO(ImageUrl imageUrl, InterfaceC30891Di4 interfaceC30891Di4, String str, String str2, boolean z) {
        C14360o3.A0B(interfaceC30891Di4, 4);
        this.A03 = str;
        this.A02 = imageUrl;
        this.A04 = z;
        this.A00 = interfaceC30891Di4;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26255BjO) {
                C26255BjO c26255BjO = (C26255BjO) obj;
                if (!C14360o3.A0K(this.A03, c26255BjO.A03) || !C14360o3.A0K(this.A02, c26255BjO.A02) || this.A04 != c26255BjO.A04 || !C14360o3.A0K(this.A00, c26255BjO.A00) || !C14360o3.A0K(this.A01, c26255BjO.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03)))) + AbstractC167017dG.A0O(this.A01);
    }
}
