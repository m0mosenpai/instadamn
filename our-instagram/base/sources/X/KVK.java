package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KVK extends AbstractC46453KhD {
    public final ImageUrl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KVK) && C14360o3.A0K(this.A00, ((KVK) obj).A00));
    }

    public KVK(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC53644Nnp.A00() * 31);
    }
}
