package X;

/* renamed from: X.GzC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38671GzC extends C0T6 {
    public long A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public C38671GzC(Integer num, String str, String str2, String str3, long j) {
        this.A05 = 0;
        this.A02 = str;
        this.A01 = num;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A05 != 0) {
            if (this != obj) {
                if (obj instanceof C38671GzC) {
                    C38671GzC c38671GzC = (C38671GzC) obj;
                    if (c38671GzC.A05 == 1 && C14360o3.A0K(this.A02, c38671GzC.A02) && this.A00 == c38671GzC.A00 && C14360o3.A0K(this.A04, c38671GzC.A04) && C14360o3.A0K(this.A03, c38671GzC.A03)) {
                        obj2 = this.A01;
                        obj3 = c38671GzC.A01;
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
            if (!(obj instanceof C38671GzC)) {
                return false;
            }
            C38671GzC c38671GzC2 = (C38671GzC) obj;
            if (c38671GzC2.A05 != 0 || !C14360o3.A0K(this.A02, c38671GzC2.A02) || !C14360o3.A0K(this.A01, c38671GzC2.A01) || this.A00 != c38671GzC2.A00 || !C14360o3.A0K(this.A03, c38671GzC2.A03)) {
                return false;
            }
            obj2 = this.A04;
            obj3 = c38671GzC2.A04;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A01;
        int A07;
        if (this.A05 != 0) {
            A01 = (((AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
            A07 = AbstractC166997dE.A0I(this.A01);
        } else {
            A01 = (AbstractC25236BEt.A01(this.A00, ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
            A07 = AbstractC25227BEk.A07(this.A04);
        }
        return A01 + A07;
    }

    public C38671GzC() {
        this.A05 = 1;
        this.A05 = 1;
        this.A05 = 1;
        this.A02 = "";
        this.A00 = 0L;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
    }
}
