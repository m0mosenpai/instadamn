package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class OM6 {
    public final int A00;
    public final long A01;
    public final C51745MtU A02;
    public final ImageUrl A03;
    public final User A04;
    public final EnumC53318Nhu A05;
    public final EnumC223199sy A06;
    public final Long A07;
    public final String A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (!(obj instanceof OM6)) {
            return false;
        }
        OM6 om6 = (OM6) obj;
        if (this.A01 != om6.A01 || !C14360o3.A0K(this.A04, om6.A04) || this.A05 != om6.A05 || this.A00 != om6.A00 || !C14360o3.A0K(this.A08, om6.A08) || !C14360o3.A0K(this.A02, om6.A02) || this.A09 != om6.A09) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0K = AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0J(this.A05, (AbstractC25235BEs.A03(this.A01) + AbstractC25235BEs.A06(this.A04)) * 31));
        C51745MtU c51745MtU = this.A02;
        if (c51745MtU != null) {
            i = c51745MtU.hashCode();
        }
        return A0K + i;
    }

    public OM6(C51745MtU c51745MtU, ImageUrl imageUrl, User user, EnumC53318Nhu enumC53318Nhu, EnumC223199sy enumC223199sy, Long l, String str, int i, long j, boolean z) {
        this.A01 = j;
        this.A04 = user;
        this.A03 = imageUrl;
        this.A08 = str;
        this.A05 = enumC53318Nhu;
        this.A06 = enumC223199sy;
        this.A00 = i;
        this.A09 = z;
        this.A07 = l;
        this.A02 = c51745MtU;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Question{id=");
        A1C.append(this.A01);
        A1C.append(", author=");
        A1C.append(this.A04);
        A1C.append(", body='");
        A1C.append(this.A08);
        A1C.append("', state=");
        A1C.append(this.A06);
        A1C.append(", source=");
        A1C.append(this.A05);
        A1C.append(", igLiveSupporterInfo =");
        A1C.append(this.A02);
        return AbstractC167027dH.A0R(A1C);
    }
}
