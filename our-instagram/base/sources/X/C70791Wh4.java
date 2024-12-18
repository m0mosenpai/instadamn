package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Wh4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70791Wh4 implements InterfaceC66482zP {
    public final long A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C70791Wh4(ImageUrl imageUrl, String str, String str2, long j, boolean z) {
        C14360o3.A0B(str2, 5);
        this.A00 = j;
        this.A03 = str;
        this.A01 = imageUrl;
        this.A04 = z;
        this.A02 = str2;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Long.valueOf(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70791Wh4 c70791Wh4 = (C70791Wh4) obj;
        C14360o3.A0B(c70791Wh4, 0);
        if (C14360o3.A0K(this.A03, c70791Wh4.A03) && C14360o3.A0K(this.A01, c70791Wh4.A01) && this.A04 == c70791Wh4.A04 && C14360o3.A0K(this.A02, c70791Wh4.A02)) {
            return true;
        }
        return false;
    }
}
