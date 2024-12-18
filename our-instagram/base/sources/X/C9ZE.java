package X;

import com.instagram.api.schemas.ACRType;

/* renamed from: X.9ZE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZE extends C0T6 {
    public String A03 = null;
    public Long A01 = null;
    public Long A02 = null;
    public ACRType A00 = null;
    public String A04 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZE) {
                C9ZE c9ze = (C9ZE) obj;
                if (!C14360o3.A0K(this.A03, c9ze.A03) || !C14360o3.A0K(this.A01, c9ze.A01) || !C14360o3.A0K(this.A02, c9ze.A02) || this.A00 != c9ze.A00 || !C14360o3.A0K(this.A04, c9ze.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }
}
