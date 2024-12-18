package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.BhV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26144BhV extends C0T6 implements InterfaceC31033DkX {
    public final GifUrlImpl A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26144BhV) {
                C26144BhV c26144BhV = (C26144BhV) obj;
                if (!C14360o3.A0K(this.A05, c26144BhV.A05) || this.A03 != c26144BhV.A03 || this.A02 != c26144BhV.A02 || !C14360o3.A0K(this.A04, c26144BhV.A04) || !C14360o3.A0K(this.A00, c26144BhV.A00) || !C14360o3.A0K(this.A01, c26144BhV.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0J(this.A00, (((((AbstractC166987dD.A0J(this.A05) + this.A03) * 31) + this.A02) * 31) + AbstractC167017dG.A0O(this.A04)) * 31));
    }

    public C26144BhV(GifUrlImpl gifUrlImpl, String str, String str2, String str3, int i, int i2) {
        this.A05 = str;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = str2;
        this.A00 = gifUrlImpl;
        this.A01 = str3;
    }

    @Override // X.InterfaceC31033DkX
    public final int getHeight() {
        return this.A02;
    }

    @Override // X.InterfaceC31033DkX
    public final String getId() {
        return this.A05;
    }

    @Override // X.InterfaceC31033DkX
    public final int getWidth() {
        return this.A03;
    }
}
