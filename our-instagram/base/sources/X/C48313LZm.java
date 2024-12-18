package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LZm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48313LZm implements InterfaceC66482zP {
    public String A00;
    public String A01;
    public boolean A02;
    public final ImageUrl A03;
    public final String A04;
    public final String A05;

    public C48313LZm(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, boolean z) {
        AbstractC25233BEq.A0x(1, str, str3, str4);
        this.A05 = str;
        this.A03 = imageUrl;
        this.A04 = str2;
        this.A01 = str3;
        this.A02 = z;
        this.A00 = str5;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C48313LZm c48313LZm = (C48313LZm) obj;
        String str2 = this.A05;
        if (c48313LZm != null) {
            str = c48313LZm.A05;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str) && C14360o3.A0K(this.A01, c48313LZm.A01) && this.A02 == c48313LZm.A02 && C14360o3.A0K(this.A00, c48313LZm.A00)) {
            return true;
        }
        return false;
    }
}
