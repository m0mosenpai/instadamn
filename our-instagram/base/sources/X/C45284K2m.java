package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.K2m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45284K2m extends C0T6 implements MNR {
    public final long A00;
    public final User A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45284K2m) {
                C45284K2m c45284K2m = (C45284K2m) obj;
                if (!C14360o3.A0K(this.A02, c45284K2m.A02) || !C14360o3.A0K(this.A01, c45284K2m.A01) || this.A00 != c45284K2m.A00 || this.A05 != c45284K2m.A05 || this.A04 != c45284K2m.A04 || this.A06 != c45284K2m.A06 || !C14360o3.A0K(this.A03, c45284K2m.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC25236BEt.A01(this.A00, (AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31)))));
    }

    public C45284K2m(User user, String str, List list, long j, boolean z, boolean z2, boolean z3) {
        this.A02 = str;
        this.A01 = user;
        this.A00 = j;
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A03 = list;
    }
}
