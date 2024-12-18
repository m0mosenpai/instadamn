package X;

import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.MqP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51571MqP extends C0T6 {
    public UserMonetizationProductType A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51571MqP) {
                C51571MqP c51571MqP = (C51571MqP) obj;
                if (this.A00 != c51571MqP.A00 || !C14360o3.A0K(this.A02, c51571MqP.A02) || !C14360o3.A0K(this.A01, c51571MqP.A01) || !C14360o3.A0K(this.A04, c51571MqP.A04) || this.A05 != c51571MqP.A05 || !C14360o3.A0K(this.A03, c51571MqP.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A05, (((AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A03);
    }
}
