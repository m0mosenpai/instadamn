package X;

import android.graphics.PointF;
import android.graphics.Rect;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class K2I extends C0T6 implements MNE {
    public final PointF A00;
    public final Rect A01;
    public final EnumC168507fk A02;
    public final User A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2I) {
                K2I k2i = (K2I) obj;
                if (!C14360o3.A0K(this.A05, k2i.A05) || !C14360o3.A0K(this.A04, k2i.A04) || !C14360o3.A0K(this.A03, k2i.A03) || this.A07 != k2i.A07 || this.A08 != k2i.A08 || this.A02 != k2i.A02 || this.A06 != k2i.A06 || !C14360o3.A0K(this.A01, k2i.A01) || !C14360o3.A0K(this.A00, k2i.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A03, (AbstractC166987dD.A0J(this.A05) + AbstractC167017dG.A0O(this.A04)) * 31)))))));
    }

    public K2I(PointF pointF, Rect rect, EnumC168507fk enumC168507fk, User user, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A04 = str2;
        this.A03 = user;
        this.A07 = z;
        this.A08 = z2;
        this.A02 = enumC168507fk;
        this.A06 = z3;
        this.A01 = rect;
        this.A00 = pointF;
    }
}
