package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Jz9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45168Jz9 extends C0T6 implements InterfaceC132185xw {
    public final GifUrlImpl A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final ImageUrl A05;
    public final String A06;

    public C45168Jz9(ImageUrl imageUrl, GifUrlImpl gifUrlImpl, String str, String str2, String str3, int i, int i2) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A04 = i;
        this.A03 = i2;
        this.A06 = str2;
        this.A01 = str3;
        this.A00 = gifUrlImpl;
        this.A05 = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45168Jz9) {
                C45168Jz9 c45168Jz9 = (C45168Jz9) obj;
                if (!C14360o3.A0K(this.A02, c45168Jz9.A02) || this.A04 != c45168Jz9.A04 || this.A03 != c45168Jz9.A03 || !C14360o3.A0K(this.A06, c45168Jz9.A06) || !C14360o3.A0K(this.A01, c45168Jz9.A01) || !C14360o3.A0K(this.A00, c45168Jz9.A00) || !C14360o3.A0K(this.A05, c45168Jz9.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132185xw
    public final String AXw() {
        return this.A06;
    }

    @Override // X.InterfaceC132185xw
    public final int getHeight() {
        return this.A03;
    }

    @Override // X.InterfaceC132185xw
    public final String getId() {
        return this.A02;
    }

    @Override // X.InterfaceC132185xw
    public final int getWidth() {
        return this.A04;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A05, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A01, (((((AbstractC166987dD.A0J(this.A02) + this.A04) * 31) + this.A03) * 31) + AbstractC167017dG.A0O(this.A06)) * 31)));
    }
}
