package X;

import com.instagram.model.direct.stickerstore.TypedImageUrl;

/* loaded from: classes8.dex */
public final class KT9 extends AbstractC129515tG implements InterfaceC129555tK {
    public final TypedImageUrl A00;
    public final String A01;
    public final C7QX A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KT9(C7QX c7qx, TypedImageUrl typedImageUrl, String str, boolean z) {
        super(c7qx);
        C14360o3.A0B(typedImageUrl, 1);
        this.A00 = typedImageUrl;
        this.A02 = c7qx;
        this.A01 = str;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KT9) {
                KT9 kt9 = (KT9) obj;
                if (!C14360o3.A0K(this.A00, kt9.A00) || !C14360o3.A0K(this.A02, kt9.A02) || !C14360o3.A0K(this.A01, kt9.A01) || this.A03 != kt9.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A01)) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
