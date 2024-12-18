package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Mvx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51853Mvx extends C0T6 implements C5NL {
    public final int A00;
    public final ImageUrl A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51853Mvx) {
                C51853Mvx c51853Mvx = (C51853Mvx) obj;
                if (!C14360o3.A0K(this.A01, c51853Mvx.A01) || !C14360o3.A0K(this.A06, c51853Mvx.A06) || !C14360o3.A0K(this.A03, c51853Mvx.A03) || !C14360o3.A0K(this.A04, c51853Mvx.A04) || this.A00 != c51853Mvx.A00 || !C14360o3.A0K(this.A05, c51853Mvx.A05) || !C14360o3.A0K(this.A02, c51853Mvx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A06;
        c5ng.A06 = C148276lx.A1f.A01();
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0d;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C51853Mvx(ImageUrl imageUrl, Long l, String str, String str2, String str3, String str4, int i) {
        AbstractC167017dG.A1P(imageUrl, str);
        this.A01 = imageUrl;
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = i;
        this.A05 = str4;
        this.A02 = l;
    }
}
