package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9ZH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZH extends C0T6 {
    public long A00 = 0;
    public String A05 = null;
    public String A03 = null;
    public String A04 = null;
    public ImageUrl A01 = null;
    public String A02 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZH) {
                C9ZH c9zh = (C9ZH) obj;
                if (this.A00 != c9zh.A00 || !C14360o3.A0K(this.A05, c9zh.A05) || !C14360o3.A0K(this.A03, c9zh.A03) || !C14360o3.A0K(this.A04, c9zh.A04) || !C14360o3.A0K(this.A01, c9zh.A01) || !C14360o3.A0K(this.A02, c9zh.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        int i2 = 0;
        int A0O = (((((((i + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0O + i2;
    }
}
