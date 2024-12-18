package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.FyN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36209FyN implements InterfaceC66482zP {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36209FyN c36209FyN = (C36209FyN) obj;
        C14360o3.A0B(c36209FyN, 0);
        if (C14360o3.A0K(this.A03, c36209FyN.A03) && this.A06 == c36209FyN.A06 && this.A04 == c36209FyN.A04 && this.A05 == c36209FyN.A05) {
            return true;
        }
        return false;
    }

    public C36209FyN(ImageUrl imageUrl, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = imageUrl;
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }
}
