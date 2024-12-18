package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MvL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51817MvL extends C0T6 implements InterfaceC66482zP {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51817MvL) {
                C51817MvL c51817MvL = (C51817MvL) obj;
                if (!C14360o3.A0K(this.A00, c51817MvL.A00) || !C14360o3.A0K(this.A01, c51817MvL.A01) || !C14360o3.A0K(this.A03, c51817MvL.A03) || !C14360o3.A0K(this.A02, c51817MvL.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00))) + AbstractC167017dG.A0M(this.A02);
    }

    public C51817MvL(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str) {
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
        this.A03 = str;
        this.A02 = num;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
