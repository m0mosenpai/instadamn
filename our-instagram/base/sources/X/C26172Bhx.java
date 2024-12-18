package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bhx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26172Bhx extends C0T6 implements InterfaceC66482zP {
    public final C44O A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C26172Bhx(C44O c44o, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        AbstractC25229BEm.A1I(str, 3, str3);
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A06 = str;
        this.A07 = str2;
        this.A0B = z;
        this.A08 = str3;
        this.A09 = z2;
        this.A05 = str4;
        this.A04 = num;
        this.A0A = z3;
        this.A03 = num2;
        this.A00 = c44o;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26172Bhx) {
                C26172Bhx c26172Bhx = (C26172Bhx) obj;
                if (!C14360o3.A0K(this.A01, c26172Bhx.A01) || !C14360o3.A0K(this.A02, c26172Bhx.A02) || !C14360o3.A0K(this.A06, c26172Bhx.A06) || !C14360o3.A0K(this.A07, c26172Bhx.A07) || this.A0B != c26172Bhx.A0B || !C14360o3.A0K(this.A08, c26172Bhx.A08) || this.A09 != c26172Bhx.A09 || !C14360o3.A0K(this.A05, c26172Bhx.A05) || !C14360o3.A0K(this.A04, c26172Bhx.A04) || this.A0A != c26172Bhx.A0A || !C14360o3.A0K(this.A03, c26172Bhx.A03) || !C14360o3.A0K(this.A00, c26172Bhx.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A08.hashCode());
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0A, (((AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0K(this.A08, AbstractC167007dF.A0D(this.A0B, (AbstractC166997dE.A0K(this.A06, ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
