package X;

import android.graphics.Bitmap;

/* renamed from: X.Bfj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26056Bfj extends C0T6 {
    public String A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C26056Bfj(Bitmap bitmap, C51755Mte c51755Mte, String str, String str2, String str3, String str4, String str5) {
        this.A01 = 0;
        C14360o3.A0B(bitmap, 1);
        this.A02 = bitmap;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = str3;
        this.A06 = str4;
        this.A03 = c51755Mte;
        this.A07 = str5;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A01 != 0) {
            if (this != obj) {
                if (obj instanceof C26056Bfj) {
                    C26056Bfj c26056Bfj = (C26056Bfj) obj;
                    if (c26056Bfj.A01 == 1 && C14360o3.A0K(this.A07, c26056Bfj.A07) && C14360o3.A0K(this.A06, c26056Bfj.A06) && C14360o3.A0K(this.A02, c26056Bfj.A02) && C14360o3.A0K(this.A03, c26056Bfj.A03) && C14360o3.A0K(this.A05, c26056Bfj.A05) && C14360o3.A0K(this.A04, c26056Bfj.A04)) {
                        str = this.A00;
                        str2 = c26056Bfj.A00;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C26056Bfj)) {
                return false;
            }
            C26056Bfj c26056Bfj2 = (C26056Bfj) obj;
            if (c26056Bfj2.A01 != 0 || !C14360o3.A0K(this.A02, c26056Bfj2.A02) || !C14360o3.A0K(this.A05, c26056Bfj2.A05) || !C14360o3.A0K(this.A04, c26056Bfj2.A04) || !C14360o3.A0K(this.A00, c26056Bfj2.A00) || !C14360o3.A0K(this.A06, c26056Bfj2.A06) || !C14360o3.A0K(this.A03, c26056Bfj2.A03)) {
                return false;
            }
            str = this.A07;
            str2 = c26056Bfj2.A07;
        } else {
            return true;
        }
        if (!C14360o3.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0G;
        String str;
        if (this.A01 != 0) {
            A0G = ((((((((((AbstractC167017dG.A0O(this.A07) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
            str = this.A00;
        } else {
            A0G = (((((((((AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
            str = this.A07;
        }
        return A0G + AbstractC25227BEk.A07(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26056Bfj(Bitmap bitmap, C51755Mte c51755Mte, String str, String str2, String str3, String str4, String str5, int i) {
        this(bitmap, (i & 32) != 0 ? null : c51755Mte, str, str2, str3, str4, (i & 64) != 0 ? null : str5);
        this.A01 = 0;
    }

    public C26056Bfj(Boolean bool, Integer num, String str, String str2, String str3, String str4) {
        this.A01 = 1;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = num;
        this.A03 = bool;
        this.A05 = str3;
        this.A04 = str4;
        this.A00 = null;
    }
}
