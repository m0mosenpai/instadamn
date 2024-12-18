package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.9aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211969aN extends C0T6 implements BEW, BEX {
    public final EnumC185548Kw A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final MusicAttributionConfig A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211969aN) {
                C211969aN c211969aN = (C211969aN) obj;
                if (!C14360o3.A0K(this.A03, c211969aN.A03) || !C14360o3.A0K(this.A07, c211969aN.A07) || !C14360o3.A0K(this.A05, c211969aN.A05) || !C14360o3.A0K(this.A04, c211969aN.A04) || !C14360o3.A0K(this.A08, c211969aN.A08) || !C14360o3.A0K(this.A06, c211969aN.A06) || !C14360o3.A0K(this.A01, c211969aN.A01) || this.A00 != c211969aN.A00 || !C14360o3.A0K(this.A02, c211969aN.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.BEX
    public final String B0Q() {
        return this.A05;
    }

    @Override // X.BEX
    public final String B0R() {
        return this.A06;
    }

    @Override // X.BEX
    public final String B0V() {
        return this.A08;
    }

    @Override // X.BEX
    public final Boolean B0e() {
        return this.A04;
    }

    @Override // X.BEX
    public final ImageUrl B0h() {
        return this.A01;
    }

    @Override // X.BEW
    public final MusicAttributionConfig BVX() {
        return this.A03;
    }

    @Override // X.BEY
    public final EnumC185548Kw C3o() {
        return this.A00;
    }

    @Override // X.BEY
    public final ImageUrl C89() {
        return this.A02;
    }

    @Override // X.BEX
    public final String getEffectId() {
        return this.A07;
    }

    public final int hashCode() {
        int i = 0;
        int A0K = (((((AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0G(this.A03)) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, (A0K + i) * 31)));
    }

    public C211969aN(EnumC185548Kw enumC185548Kw, ImageUrl imageUrl, ImageUrl imageUrl2, MusicAttributionConfig musicAttributionConfig, Boolean bool, String str, String str2, String str3, String str4) {
        this.A03 = musicAttributionConfig;
        this.A07 = str;
        this.A05 = str2;
        this.A04 = bool;
        this.A08 = str3;
        this.A06 = str4;
        this.A01 = imageUrl;
        this.A00 = enumC185548Kw;
        this.A02 = imageUrl2;
    }
}
