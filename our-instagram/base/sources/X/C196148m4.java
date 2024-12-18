package X;

import java.util.List;

/* renamed from: X.8m4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196148m4 {
    public String A00;
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C196148m4) {
                C196148m4 c196148m4 = (C196148m4) obj;
                if (!C14360o3.A0K(this.A00, c196148m4.A00) || !C14360o3.A0K(this.A01, c196148m4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxSourceIdentityWithDestinations(sourceIdentityId=");
        sb.append(this.A00);
        sb.append(", destinationIdentities=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C196148m4() {
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 2);
        this.A00 = "";
        this.A01 = c16930sl;
    }
}
