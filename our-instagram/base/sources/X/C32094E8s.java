package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.E8s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32094E8s extends C0T6 implements InterfaceC66482zP {
    public final ImageUrl A00;
    public final VFX A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32094E8s) {
                C32094E8s c32094E8s = (C32094E8s) obj;
                if (!C14360o3.A0K(this.A00, c32094E8s.A00) || !C14360o3.A0K(this.A02, c32094E8s.A02) || this.A01 != c32094E8s.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String url = this.A00.getUrl();
        C14360o3.A07(url);
        return url;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C32094E8s c32094E8s = (C32094E8s) obj;
        C14360o3.A0B(c32094E8s, 0);
        String url = this.A00.getUrl();
        C14360o3.A07(url);
        String url2 = c32094E8s.A00.getUrl();
        C14360o3.A07(url2);
        return url.equals(url2);
    }

    public C32094E8s(ImageUrl imageUrl, VFX vfx, String str) {
        this.A00 = imageUrl;
        this.A02 = str;
        this.A01 = vfx;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FanClubConsiderationTeaserViewModel(imageUrl=");
        A1C.append(this.A00);
        A1C.append(", mediaId=");
        A1C.append(this.A02);
        A1C.append(MSV.A00(68));
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
