package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class H7T extends C0T6 implements JJ6 {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7T) {
                H7T h7t = (H7T) obj;
                if (!C14360o3.A0K(this.A01, h7t.A01) || !C14360o3.A0K(this.A02, h7t.A02) || !C14360o3.A0K(this.A00, h7t.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H7T(ImageUrl imageUrl, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
    }
}
