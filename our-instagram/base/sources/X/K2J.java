package X;

import com.instagram.user.model.User;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class K2J extends C0T6 implements MNE {
    public final User A00;
    public final EnumC65855TvH A01;
    public final VG2 A02;
    public final MRA A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final JSONObject A08;

    public K2J(User user, EnumC65855TvH enumC65855TvH, VG2 vg2, MRA mra, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        C14360o3.A0B(str4, 6);
        this.A01 = enumC65855TvH;
        this.A02 = vg2;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = user;
        this.A03 = mra;
        this.A08 = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2J) {
                K2J k2j = (K2J) obj;
                if (this.A01 != k2j.A01 || this.A02 != k2j.A02 || !C14360o3.A0K(this.A05, k2j.A05) || !C14360o3.A0K(this.A04, k2j.A04) || !C14360o3.A0K(this.A06, k2j.A06) || !C14360o3.A0K(this.A07, k2j.A07) || !C14360o3.A0K(this.A00, k2j.A00) || !C14360o3.A0K(this.A03, k2j.A03) || !C14360o3.A0K(this.A08, k2j.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A08, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A07, (AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)))) + AbstractC167017dG.A0O(this.A06)) * 31))));
    }
}
