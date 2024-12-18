package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.E8m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32088E8m extends C0T6 implements InterfaceC66482zP {
    public boolean A00 = true;
    public final ImageUrl A01;
    public final FJA A02;
    public final String A03;
    public final String A04;

    public C32088E8m(ImageUrl imageUrl, FJA fja, String str, String str2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A02 = fja;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32088E8m) {
                C32088E8m c32088E8m = (C32088E8m) obj;
                if (!C14360o3.A0K(this.A03, c32088E8m.A03) || !C14360o3.A0K(this.A04, c32088E8m.A04) || !C14360o3.A0K(this.A01, c32088E8m.A01) || !C14360o3.A0K(this.A02, c32088E8m.A02) || this.A00 != c32088E8m.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0K(this.A04, AbstractC167017dG.A0O(this.A03) * 31) + AbstractC166997dE.A0I(this.A01)) * 31));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
