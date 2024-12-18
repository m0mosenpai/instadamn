package X;

import java.util.List;

/* renamed from: X.8Qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187018Qu extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C187018Qu) {
                C187018Qu c187018Qu = (C187018Qu) obj;
                if (!C14360o3.A0K(this.A01, c187018Qu.A01) || !C14360o3.A0K(this.A02, c187018Qu.A02) || this.A00 != c187018Qu.A00 || !C14360o3.A0K(this.A03, c187018Qu.A03) || this.A04 != c187018Qu.A04 || this.A05 != c187018Qu.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public C187018Qu(String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = list;
        this.A04 = z;
        this.A05 = z2;
    }
}
