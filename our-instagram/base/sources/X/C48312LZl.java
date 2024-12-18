package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LZl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48312LZl implements InterfaceC66482zP {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C48312LZl(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, boolean z) {
        AbstractC25233BEq.A0w(1, str, imageUrl, imageUrl2);
        C14360o3.A0B(str3, 6);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A00 = imageUrl2;
        this.A05 = z;
        this.A02 = str3;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48312LZl c48312LZl = (C48312LZl) obj;
        C14360o3.A0B(c48312LZl, 0);
        if (C14360o3.A0K(this.A04, c48312LZl.A04) && C14360o3.A0K(this.A01, c48312LZl.A01) && C14360o3.A0K(this.A00, c48312LZl.A00) && this.A05 == c48312LZl.A05 && C14360o3.A0K(this.A02, c48312LZl.A02)) {
            return true;
        }
        return false;
    }
}
