package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.Mxj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51961Mxj extends C0T6 implements Comparable {
    public final int A00;
    public final Medium A01;
    public final C38321qM A02;
    public final Integer A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51961Mxj) {
                C51961Mxj c51961Mxj = (C51961Mxj) obj;
                if (!C14360o3.A0K(this.A02, c51961Mxj.A02) || !C14360o3.A0K(this.A01, c51961Mxj.A01) || !C14360o3.A0K(this.A04, c51961Mxj.A04) || this.A03 != c51961Mxj.A03 || this.A00 != c51961Mxj.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C51961Mxj c51961Mxj = (C51961Mxj) obj;
        C14360o3.A0B(c51961Mxj, 0);
        return C14360o3.A00(this.A00, c51961Mxj.A00);
    }

    public final int hashCode() {
        String str;
        int A0K = AbstractC166997dE.A0K(this.A04, ((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "MEDIA";
        } else {
            str = "MEDIUM";
        }
        return AbstractC25231BEo.A0H(str, intValue, A0K) + this.A00;
    }

    public C51961Mxj(Medium medium, C38321qM c38321qM, Integer num, String str, int i) {
        this.A02 = c38321qM;
        this.A01 = medium;
        this.A04 = str;
        this.A03 = num;
        this.A00 = i;
    }
}
