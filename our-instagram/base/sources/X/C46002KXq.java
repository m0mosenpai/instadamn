package X;

import android.location.Location;

/* renamed from: X.KXq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46002KXq extends AbstractC47449Kxe {
    public final int A00;
    public final Location A01;
    public final String A02;
    public final String A03;
    public final java.util.Set A04;

    public C46002KXq(Location location, String str, String str2, java.util.Set set, int i) {
        super(new C17u(AbstractC25230BEn.A07(1, set, str), 19));
        this.A04 = set;
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = location;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46002KXq) {
                C46002KXq c46002KXq = (C46002KXq) obj;
                if (!C14360o3.A0K(this.A04, c46002KXq.A04) || this.A00 != c46002KXq.A00 || !C14360o3.A0K(this.A03, c46002KXq.A03) || !C14360o3.A0K(this.A02, c46002KXq.A02) || !C14360o3.A0K(this.A01, c46002KXq.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A03, (AbstractC166987dD.A0G(this.A04) + this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }
}
