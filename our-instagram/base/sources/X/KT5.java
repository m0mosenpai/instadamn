package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KT5 extends AbstractC129515tG implements InterfaceC129555tK {
    public final ImageUrl A00;
    public final C7QX A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KT5) {
                KT5 kt5 = (KT5) obj;
                if (!C14360o3.A0K(this.A00, kt5.A00) || !C14360o3.A0K(this.A01, kt5.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public KT5(ImageUrl imageUrl, C7QX c7qx) {
        super(c7qx);
        this.A00 = imageUrl;
        this.A01 = c7qx;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
