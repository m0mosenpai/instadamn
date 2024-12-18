package X;

import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.QIs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58914QIs extends C0T6 {
    public static final C58914QIs A02 = new C58914QIs(ZonePolicy.A05, "UNKNOWN");
    public final ZonePolicy A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58914QIs) {
                C58914QIs c58914QIs = (C58914QIs) obj;
                if (this.A00 != c58914QIs.A00 || !C14360o3.A0K(this.A01, c58914QIs.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C58914QIs(ZonePolicy zonePolicy, String str) {
        this.A00 = zonePolicy;
        this.A01 = str;
    }
}
