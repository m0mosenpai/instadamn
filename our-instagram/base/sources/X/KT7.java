package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes8.dex */
public final class KT7 extends AbstractC129515tG implements InterfaceC129555tK {
    public final GifUrlImpl A00;
    public final String A01;
    public final C7QX A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KT7(C7QX c7qx, GifUrlImpl gifUrlImpl, String str, boolean z) {
        super(c7qx);
        C14360o3.A0B(gifUrlImpl, 1);
        this.A00 = gifUrlImpl;
        this.A01 = str;
        this.A02 = c7qx;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KT7) {
                KT7 kt7 = (KT7) obj;
                if (!C14360o3.A0K(this.A00, kt7.A00) || !C14360o3.A0K(this.A01, kt7.A01) || !C14360o3.A0K(this.A02, kt7.A02) || this.A03 != kt7.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A02, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01)) * 31));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
