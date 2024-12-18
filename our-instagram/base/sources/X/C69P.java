package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.69P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69P extends C0T6 {
    public final ImageUrl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C69P) && C14360o3.A0K(this.A00, ((C69P) obj).A00));
    }

    public final int hashCode() {
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            return 0;
        }
        return imageUrl.hashCode();
    }

    public C69P(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
