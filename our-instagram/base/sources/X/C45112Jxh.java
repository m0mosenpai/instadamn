package X;

import java.util.List;

/* renamed from: X.Jxh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45112Jxh extends C0T6 {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C45112Jxh(String str, String str2, List list, int i, int i2) {
        this.A05 = str;
        this.A04 = str2;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = list;
    }

    public static C45112Jxh A00(C45112Jxh c45112Jxh, List list) {
        String str = c45112Jxh.A05;
        String str2 = c45112Jxh.A04;
        int i = c45112Jxh.A02;
        int i2 = c45112Jxh.A01;
        C14360o3.A0B(list, 4);
        return new C45112Jxh(str, str2, list, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45112Jxh) {
                C45112Jxh c45112Jxh = (C45112Jxh) obj;
                if (!C14360o3.A0K(this.A05, c45112Jxh.A05) || !C14360o3.A0K(this.A04, c45112Jxh.A04) || this.A02 != c45112Jxh.A02 || this.A01 != c45112Jxh.A01 || !C14360o3.A0K(this.A03, c45112Jxh.A03)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC25227BEk.A07(this.A04)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A03.hashCode();
    }

    public C45112Jxh(int i, int i2) {
        this(null, null, C16930sl.A00, i, i2);
    }
}
