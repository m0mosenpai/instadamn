package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KTA extends AbstractC129515tG implements InterfaceC129555tK {
    public final float A00;
    public final long A01;
    public final ImageUrl A02;
    public final C7QL A03;
    public final C45948KUz A04;
    public final C7QX A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTA) {
                KTA kta = (KTA) obj;
                if (Float.compare(this.A00, kta.A00) != 0 || !C14360o3.A0K(this.A02, kta.A02) || !C14360o3.A0K(this.A04, kta.A04) || !C14360o3.A0K(this.A03, kta.A03) || !C14360o3.A0K(this.A05, kta.A05) || this.A01 != kta.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, ((Float.floatToIntBits(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31))) + AbstractC25228BEl.A03(this.A01);
    }

    public KTA(ImageUrl imageUrl, C7QX c7qx, C7QL c7ql, C45948KUz c45948KUz, float f, long j) {
        super(c7qx);
        this.A00 = f;
        this.A02 = imageUrl;
        this.A04 = c45948KUz;
        this.A03 = c7ql;
        this.A05 = c7qx;
        this.A01 = j;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
