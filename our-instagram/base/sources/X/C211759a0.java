package X;

import com.instagram.api.schemas.IntegrityInterstitialType;

/* renamed from: X.9a0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211759a0 extends C0T6 implements XFI {
    public final IntegrityInterstitialType A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211759a0) {
                C211759a0 c211759a0 = (C211759a0) obj;
                if (!C14360o3.A0K(this.A03, c211759a0.A03) || this.A00 != c211759a0.A00 || !C14360o3.A0K(this.A01, c211759a0.A01) || !C14360o3.A0K(this.A02, c211759a0.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public C211759a0(IntegrityInterstitialType integrityInterstitialType, String str, String str2, String str3) {
        this.A03 = str;
        this.A00 = integrityInterstitialType;
        this.A01 = str2;
        this.A02 = str3;
    }
}
