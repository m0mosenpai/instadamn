package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class NF0 extends C4F4 {
    public final android.net.Uri A00;
    public final InterfaceC11380iw A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;

    public NF0(android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, Integer num, String str) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A03 = num;
        this.A01 = interfaceC11380iw;
        this.A00 = uri;
        this.A02 = imageUrl;
        this.A05 = true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        NF0 nf0 = (NF0) obj;
        C14360o3.A0B(nf0, 0);
        if (C14360o3.A0K(this.A04, nf0.A04) && C14360o3.A0K(this.A00, nf0.A00) && C14360o3.A0K(this.A02, nf0.A02) && this.A03 == nf0.A03 && this.A05 == nf0.A05) {
            return true;
        }
        return false;
    }
}
