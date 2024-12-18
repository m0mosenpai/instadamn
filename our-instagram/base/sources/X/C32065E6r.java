package X;

import java.util.Arrays;

/* renamed from: X.E6r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32065E6r extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final int[] A0B;
    public final int[] A0C;

    public C32065E6r(String str, String str2, String str3, String str4, String str5, String str6, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(str, 1);
        AbstractC167017dG.A1U(iArr, iArr2);
        this.A09 = str;
        this.A04 = i;
        this.A0A = str2;
        this.A03 = i2;
        this.A01 = i3;
        this.A0C = iArr;
        this.A0B = iArr2;
        this.A02 = i4;
        this.A00 = i5;
        this.A08 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A05 = str6;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.thread.threaddetail.model.DirectThreadThemeInfoViewModel");
                C32065E6r c32065E6r = (C32065E6r) obj;
                if (!C14360o3.A0K(this.A09, c32065E6r.A09) || this.A04 != c32065E6r.A04 || !C14360o3.A0K(this.A0A, c32065E6r.A0A) || this.A03 != c32065E6r.A03 || this.A01 != c32065E6r.A01 || !Arrays.equals(this.A0C, c32065E6r.A0C) || !Arrays.equals(this.A0B, c32065E6r.A0B) || this.A02 != c32065E6r.A02 || this.A00 != c32065E6r.A00 || !C14360o3.A0K(this.A08, c32065E6r.A08) || !C14360o3.A0K(this.A06, c32065E6r.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((((((((((((((AbstractC166987dD.A0J(this.A09) + this.A04) * 31) + AbstractC31177DnL.A04(this.A0A)) * 31) + this.A03) * 31) + this.A01) * 31) + Arrays.hashCode(this.A0C)) * 31) + Arrays.hashCode(this.A0B)) * 31) + this.A02) * 31) + this.A00) * 31) + AbstractC31177DnL.A04(this.A08)) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return A0J + i;
    }

    public C32065E6r() {
        this("", "", "", "", null, null, new int[0], new int[0], 0, 0, 0, 0, 0);
    }
}
