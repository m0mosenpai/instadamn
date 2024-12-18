package X;

import com.google.gson.annotations.SerializedName;

/* renamed from: X.SaG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62992SaG {

    @SerializedName("amount")
    public final String A00;

    @SerializedName("currency")
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62992SaG) {
                C62992SaG c62992SaG = (C62992SaG) obj;
                if (!C14360o3.A0K(this.A01, c62992SaG.A01) || !C14360o3.A0K(this.A00, c62992SaG.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("AuthAmount(currency=", this.A01, ", amount=", this.A00, ')');
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public C62992SaG(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public C62992SaG() {
        this(null, null);
    }
}
