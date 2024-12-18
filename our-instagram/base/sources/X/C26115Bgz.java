package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bgz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26115Bgz extends C0T6 implements InterfaceC30795DgW {
    public final ImageUrl A00;

    public C26115Bgz(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 1);
        this.A00 = imageUrl;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26115Bgz) && C14360o3.A0K(this.A00, ((C26115Bgz) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
