package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BjN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26254BjN extends C0T6 implements InterfaceC30889Di2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final InterfaceC30891Di4 A03;
    public final Integer A04;
    public final ImageUrl A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26254BjN) {
                C26254BjN c26254BjN = (C26254BjN) obj;
                if (!C14360o3.A0K(this.A06, c26254BjN.A06) || !C14360o3.A0K(this.A05, c26254BjN.A05) || this.A07 != c26254BjN.A07 || !C14360o3.A0K(this.A04, c26254BjN.A04) || this.A01 != c26254BjN.A01 || this.A02 != c26254BjN.A02 || this.A00 != c26254BjN.A00 || !C14360o3.A0K(this.A03, c26254BjN.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26254BjN(ImageUrl imageUrl, InterfaceC30891Di4 interfaceC30891Di4, Integer num, String str, int i, int i2, int i3, boolean z) {
        C14360o3.A0B(interfaceC30891Di4, 8);
        this.A06 = str;
        this.A05 = imageUrl;
        this.A07 = z;
        this.A04 = num;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = interfaceC30891Di4;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (((((((AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0J(this.A06))) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31);
    }
}
