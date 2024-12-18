package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.MrS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51635MrS extends C0T6 {
    public final ImageUrl A00;
    public final BJ3 A01;
    public final Reel A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51635MrS) {
                C51635MrS c51635MrS = (C51635MrS) obj;
                if (!C14360o3.A0K(this.A05, c51635MrS.A05) || !C14360o3.A0K(this.A00, c51635MrS.A00) || !C14360o3.A0K(this.A03, c51635MrS.A03) || !C14360o3.A0K(this.A04, c51635MrS.A04) || this.A01 != c51635MrS.A01 || this.A08 != c51635MrS.A08 || this.A07 != c51635MrS.A07 || this.A06 != c51635MrS.A06 || !C14360o3.A0K(this.A02, c51635MrS.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A05)) + AbstractC167017dG.A0O(this.A03)) * 31))))) + AbstractC166997dE.A0I(this.A02);
    }

    public C51635MrS(ImageUrl imageUrl, BJ3 bj3, Reel reel, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = bj3;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A02 = reel;
    }
}
