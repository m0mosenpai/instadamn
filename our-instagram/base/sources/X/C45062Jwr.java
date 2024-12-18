package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Jwr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45062Jwr extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C45062Jwr(ImageUrl imageUrl, Reel reel, User user, String str, int i, int i2, long j, boolean z, boolean z2) {
        this.A00 = i2;
        AbstractC25234BEr.A1P(str, user, imageUrl);
        this.A06 = str;
        this.A05 = user;
        this.A02 = j;
        this.A03 = imageUrl;
        this.A01 = i;
        this.A08 = z;
        this.A04 = reel;
        this.A07 = z2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C45062Jwr) {
            C45062Jwr c45062Jwr = (C45062Jwr) obj;
            if (c45062Jwr.A00 != i || !C14360o3.A0K(this.A06, c45062Jwr.A06) || !C14360o3.A0K(this.A05, c45062Jwr.A05) || this.A02 != c45062Jwr.A02 || !C14360o3.A0K(this.A03, c45062Jwr.A03) || this.A01 != c45062Jwr.A01 || this.A08 != c45062Jwr.A08 || !C14360o3.A0K(this.A04, c45062Jwr.A04) || this.A07 != c45062Jwr.A07) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A07, (AbstractC167007dF.A0D(this.A08, (AbstractC166997dE.A0J(this.A03, AbstractC25236BEt.A01(this.A02, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0J(this.A06)))) + this.A01) * 31) + AbstractC167017dG.A0M(this.A04)) * 31);
    }
}
