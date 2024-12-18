package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7B5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7B5 extends AbstractC158787Ap {
    public final ImageUrl A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7B5) {
                C7B5 c7b5 = (C7B5) obj;
                if (!C14360o3.A0K(this.A01, c7b5.A01) || !C14360o3.A0K(this.A00, c7b5.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public C7B5(ImageUrl imageUrl, String str) {
        this.A01 = str;
        this.A00 = imageUrl;
    }
}
