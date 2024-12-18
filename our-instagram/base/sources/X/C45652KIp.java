package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KIp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45652KIp extends C4F4 {
    public final int A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45652KIp c45652KIp = (C45652KIp) obj;
        C14360o3.A0B(c45652KIp, 0);
        if (C14360o3.A0K(this.A02, c45652KIp.A02) && this.A00 == c45652KIp.A00 && this.A04 == c45652KIp.A04) {
            return true;
        }
        return false;
    }

    public C45652KIp(ImageUrl imageUrl, String str, String str2, int i, boolean z) {
        this.A01 = imageUrl;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = z;
    }
}
