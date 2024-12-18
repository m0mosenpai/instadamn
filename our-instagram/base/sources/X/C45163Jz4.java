package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jz4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45163Jz4 extends C0T6 implements InterfaceC50391MMt {
    public final int A00;
    public final ImageUrl A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45163Jz4) {
                C45163Jz4 c45163Jz4 = (C45163Jz4) obj;
                if (this.A00 != c45163Jz4.A00 || !C14360o3.A0K(this.A02, c45163Jz4.A02) || !C14360o3.A0K(this.A01, c45163Jz4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, this.A00 * 31) + AbstractC167017dG.A0M(this.A01);
    }

    public C45163Jz4(ImageUrl imageUrl, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = imageUrl;
    }
}
