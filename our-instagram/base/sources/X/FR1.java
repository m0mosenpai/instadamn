package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class FR1 {
    public String A00;
    public List A01;

    public final boolean equals(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.phonenumber.model.CountryCodeGuess");
        FR1 fr1 = (FR1) obj;
        if (this == obj) {
            return true;
        }
        if (!AbstractC167017dG.A1Z(this, obj)) {
            return false;
        }
        return C14360o3.A0K(this.A00, fr1.A00);
    }

    public final int hashCode() {
        return AbstractC31177DnL.A04(this.A00);
    }
}
