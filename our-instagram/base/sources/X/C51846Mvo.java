package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Mvo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51846Mvo extends C0T6 implements InterfaceC57956Pn2 {
    public int A00;
    public ImageUrl A01;
    public String A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final String A05;
    public final String A06;
    public final EnumC53172NfT A07 = EnumC53172NfT.A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51846Mvo) {
                C51846Mvo c51846Mvo = (C51846Mvo) obj;
                if (!C14360o3.A0K(this.A06, c51846Mvo.A06) || !C14360o3.A0K(this.A04, c51846Mvo.A04) || !C14360o3.A0K(this.A05, c51846Mvo.A05) || !C14360o3.A0K(this.A03, c51846Mvo.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57956Pn2
    public final EnumC53172NfT CBf() {
        return this.A07;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0K(this.A05, ((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC166997dE.A0I(this.A04)) * 31));
    }

    public C51846Mvo(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2) {
        this.A06 = str;
        this.A04 = imageUrl;
        this.A05 = str2;
        this.A03 = imageUrl2;
    }
}
