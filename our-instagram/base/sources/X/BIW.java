package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class BIW extends C0T6 implements InterfaceC31096Dle {
    public final ImageUrl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BIW) && C14360o3.A0K(this.A00, ((BIW) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public BIW(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
