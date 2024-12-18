package X;

import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class UPH extends C0T6 {
    public final int A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final boolean A06;

    public UPH(User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, boolean z) {
        C14360o3.A0B(user, 7);
        this.A00 = i;
        this.A06 = z;
        this.A02 = bool;
        this.A03 = bool2;
        this.A04 = bool3;
        this.A05 = bool4;
        this.A01 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPH) {
                UPH uph = (UPH) obj;
                if (this.A00 != uph.A00 || this.A06 != uph.A06 || !C14360o3.A0K(this.A02, uph.A02) || !C14360o3.A0K(this.A03, uph.A03) || !C14360o3.A0K(this.A04, uph.A04) || !C14360o3.A0K(this.A05, uph.A05) || !C14360o3.A0K(this.A01, uph.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (((((AbstractC167007dF.A0D(this.A06, this.A00 * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
        Boolean bool = this.A05;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((A0D + i) * 31) + this.A01.hashCode();
    }
}
