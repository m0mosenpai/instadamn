package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.FyM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36208FyM implements InterfaceC66482zP {
    public final ImageUrl A00;
    public final EB0 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return this.A04.equals(((C36208FyM) obj).A04);
    }

    public C36208FyM(ImageUrl imageUrl, EB0 eb0, String str, String str2, String str3, String str4) {
        this.A00 = imageUrl;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A01 = eb0;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }
}
