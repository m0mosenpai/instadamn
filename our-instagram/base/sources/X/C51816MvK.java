package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MvK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51816MvK extends C0T6 implements InterfaceC66482zP {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51816MvK) {
                C51816MvK c51816MvK = (C51816MvK) obj;
                if (!C14360o3.A0K(this.A01, c51816MvK.A01) || !C14360o3.A0K(this.A00, c51816MvK.A00) || !C14360o3.A0K(this.A02, c51816MvK.A02) || !C14360o3.A0K(this.A03, c51816MvK.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01))) + AbstractC167017dG.A0O(this.A03);
    }

    public C51816MvK(ImageUrl imageUrl, String str, String str2, String str3) {
        AbstractC167027dH.A13(str, imageUrl, str2);
        this.A01 = str;
        this.A00 = imageUrl;
        this.A02 = str2;
        this.A03 = str3;
    }
}
