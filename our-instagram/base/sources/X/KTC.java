package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KTC extends AbstractC129515tG implements InterfaceC129555tK {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final C7QL A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final C7QX A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTC) {
                KTC ktc = (KTC) obj;
                if (!C14360o3.A0K(this.A03, ktc.A03) || !C14360o3.A0K(this.A00, ktc.A00) || !C14360o3.A0K(this.A04, ktc.A04) || !C14360o3.A0K(this.A05, ktc.A05) || !C14360o3.A0K(this.A01, ktc.A01) || !C14360o3.A0K(this.A02, ktc.A02) || !C14360o3.A0K(this.A06, ktc.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A06, AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, (AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0M(this.A00)) * 31)) + AbstractC166997dE.A0I(this.A01)) * 31));
    }

    public KTC(ImageUrl imageUrl, ImageUrl imageUrl2, C7QX c7qx, C7QL c7ql, String str, String str2, String str3) {
        super(c7qx);
        this.A03 = str;
        this.A00 = imageUrl;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = imageUrl2;
        this.A02 = c7ql;
        this.A06 = c7qx;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
