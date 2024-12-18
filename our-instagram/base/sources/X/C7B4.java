package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7B4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7B4 extends AbstractC158787Ap {
    public final ImageUrl A00;
    public final boolean A01 = true;

    public C7B4(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7B4) {
                C7B4 c7b4 = (C7B4) obj;
                if (!C14360o3.A0K(this.A00, c7b4.A00) || this.A01 != c7b4.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
