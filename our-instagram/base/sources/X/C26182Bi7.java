package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bi7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26182Bi7 extends C0T6 implements InterfaceC30802Dgd {
    public final float A00;
    public final ImageUrl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26182Bi7) {
                C26182Bi7 c26182Bi7 = (C26182Bi7) obj;
                if (!C14360o3.A0K(this.A01, c26182Bi7.A01) || !C119145aW.A01(this.A00, c26182Bi7.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC167017dG.A0M(this.A01) * 31, this.A00);
    }

    public C26182Bi7(ImageUrl imageUrl, float f) {
        this.A01 = imageUrl;
        this.A00 = f;
    }
}
