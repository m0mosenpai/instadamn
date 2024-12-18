package X;

import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.TrackData;
import com.instagram.user.model.User;

/* renamed from: X.Jwx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45068Jwx extends C0T6 {
    public final int A00;
    public final int A01;
    public final Lyrics A02;
    public final TrackData A03;
    public final User A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public C45068Jwx(Lyrics lyrics, TrackData trackData, User user, Boolean bool, Boolean bool2, String str, int i, int i2, boolean z) {
        C14360o3.A0B(trackData, 6);
        this.A01 = i;
        this.A00 = i2;
        this.A09 = true;
        this.A07 = str;
        this.A08 = z;
        this.A03 = trackData;
        this.A04 = user;
        this.A05 = bool;
        this.A06 = bool2;
        this.A02 = lyrics;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45068Jwx) {
                C45068Jwx c45068Jwx = (C45068Jwx) obj;
                if (this.A01 != c45068Jwx.A01 || this.A00 != c45068Jwx.A00 || this.A09 != c45068Jwx.A09 || !C14360o3.A0K(this.A07, c45068Jwx.A07) || this.A08 != c45068Jwx.A08 || !C14360o3.A0K(this.A03, c45068Jwx.A03) || !C14360o3.A0K(this.A04, c45068Jwx.A04) || !C14360o3.A0K(this.A05, c45068Jwx.A05) || !C14360o3.A0K(this.A06, c45068Jwx.A06) || !C14360o3.A0K(this.A02, c45068Jwx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A08, (AbstractC167007dF.A0D(this.A09, ((this.A01 * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A07)) * 31)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
