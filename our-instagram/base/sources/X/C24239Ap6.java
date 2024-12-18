package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Ap6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24239Ap6 implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05;
    public String A06;
    public List A07;
    public boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C24239Ap6 c24239Ap6 = (C24239Ap6) obj;
            if (this.A01 != c24239Ap6.A01 || this.A00 != c24239Ap6.A00 || this.A03 != c24239Ap6.A03 || this.A02 != c24239Ap6.A02 || !C14360o3.A0K(this.A06, c24239Ap6.A06) || this.A07 != c24239Ap6.A07 || this.A05 != c24239Ap6.A05 || this.A08 != c24239Ap6.A08) {
                return false;
            }
        }
        return true;
    }

    public final C24239Ap6 A00() {
        int i = this.A01;
        int i2 = this.A00;
        String str = this.A06;
        int i3 = this.A03;
        int i4 = this.A02;
        List list = this.A07;
        int i5 = this.A05;
        int i6 = this.A04;
        C24239Ap6 c24239Ap6 = new C24239Ap6();
        c24239Ap6.A01 = i;
        c24239Ap6.A00 = i2;
        c24239Ap6.A06 = str;
        c24239Ap6.A03 = i3;
        c24239Ap6.A02 = i4;
        c24239Ap6.A07 = list;
        c24239Ap6.A05 = i5;
        c24239Ap6.A04 = i6;
        return c24239Ap6;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C24239Ap6 c24239Ap6 = (C24239Ap6) obj;
        C14360o3.A0B(c24239Ap6, 0);
        return this.A03 - c24239Ap6.A03;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A06, this.A07, Integer.valueOf(this.A03), Integer.valueOf(this.A02), Integer.valueOf(this.A05), Boolean.valueOf(this.A08)});
    }
}
