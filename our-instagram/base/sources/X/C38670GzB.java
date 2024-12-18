package X;

import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;

/* renamed from: X.GzB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38670GzB extends C0T6 {
    public final C9C2 A00;
    public final FiltersLoggingInfo A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38670GzB) {
                C38670GzB c38670GzB = (C38670GzB) obj;
                if (!C14360o3.A0K(this.A04, c38670GzB.A04) || !C14360o3.A0K(this.A01, c38670GzB.A01) || !C14360o3.A0K(this.A03, c38670GzB.A03) || !C14360o3.A0K(this.A00, c38670GzB.A00) || !C14360o3.A0K(this.A02, c38670GzB.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31 * 31 * 31 * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(null)) * 31;
    }

    public C38670GzB(C9C2 c9c2, FiltersLoggingInfo filtersLoggingInfo, String str, String str2, String str3) {
        this.A04 = str;
        this.A01 = filtersLoggingInfo;
        this.A03 = str2;
        this.A00 = c9c2;
        this.A02 = str3;
    }

    public C38670GzB() {
        this(null, null, null, null, null);
    }
}
