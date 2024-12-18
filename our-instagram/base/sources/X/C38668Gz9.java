package X;

import com.instagram.api.schemas.AdsAPIInstagramPosition;

/* renamed from: X.Gz9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38668Gz9 extends C0T6 {
    public static final String A02;
    public static final String A03;
    public final AdsAPIInstagramPosition A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38668Gz9) {
                C38668Gz9 c38668Gz9 = (C38668Gz9) obj;
                if (this.A00 != c38668Gz9.A00 || !C14360o3.A0K(this.A01, c38668Gz9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        String name = C38668Gz9.class.getName();
        A03 = AnonymousClass001.A0R(name, "_instagramPosition");
        A02 = AnonymousClass001.A0R(name, "_callToAction");
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01);
    }

    public C38668Gz9(AdsAPIInstagramPosition adsAPIInstagramPosition, String str) {
        this.A00 = adsAPIInstagramPosition;
        this.A01 = str;
    }
}
