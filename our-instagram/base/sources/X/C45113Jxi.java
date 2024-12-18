package X;

/* renamed from: X.Jxi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45113Jxi extends C0T6 {
    public long A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public C45113Jxi(C45090JxK c45090JxK, Integer num, String str, long j) {
        this.A05 = 1;
        String A0n = AbstractC166997dE.A0n();
        this.A05 = 1;
        AbstractC167007dF.A1E(A0n, 1, num);
        this.A03 = A0n;
        this.A04 = str;
        this.A01 = num;
        this.A02 = c45090JxK;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (this.A05 != 0) {
            if (this != obj) {
                if (obj instanceof C45113Jxi) {
                    C45113Jxi c45113Jxi = (C45113Jxi) obj;
                    if (c45113Jxi.A05 != 1 || !C14360o3.A0K(this.A03, c45113Jxi.A03) || !C14360o3.A0K(this.A04, c45113Jxi.A04) || this.A01 != c45113Jxi.A01 || !C14360o3.A0K(this.A02, c45113Jxi.A02) || this.A00 != c45113Jxi.A00) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C45113Jxi)) {
                return false;
            }
            C45113Jxi c45113Jxi2 = (C45113Jxi) obj;
            if (c45113Jxi2.A05 != 0 || !C14360o3.A0K(this.A04, c45113Jxi2.A04) || !C14360o3.A0K(this.A01, c45113Jxi2.A01) || !C14360o3.A0K(this.A02, c45113Jxi2.A02) || this.A00 != c45113Jxi2.A00 || !C14360o3.A0K(this.A03, c45113Jxi2.A03)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A01;
        int A07;
        String str;
        if (this.A05 != 0) {
            int A0K = AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A03));
            int A0H = AbstractC166987dD.A0H(this.A01);
            if (1 != A0H) {
                str = "IRIS";
            } else {
                str = "MEM";
            }
            A01 = AbstractC166997dE.A0J(this.A02, AbstractC25231BEo.A0H(str, A0H, A0K));
            A07 = AbstractC25228BEl.A03(this.A00);
        } else {
            A01 = AbstractC25236BEt.A01(this.A00, ((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31);
            A07 = AbstractC25227BEk.A07(this.A03);
        }
        return A01 + A07;
    }

    public C45113Jxi(C203248yh c203248yh, String str, String str2, long j) {
        this.A05 = 0;
        this.A04 = str;
        this.A01 = c203248yh;
        this.A02 = null;
        this.A00 = j;
        this.A03 = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45113Jxi() {
        this((C203248yh) null, (String) null, (String) null, System.currentTimeMillis());
        this.A05 = 0;
        this.A05 = 0;
    }
}
