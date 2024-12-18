package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KUv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45944KUv extends AbstractC46448Kh8 {
    public final long A00;
    public final ImageUrl A01;
    public final C38321qM A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45944KUv) {
                C45944KUv c45944KUv = (C45944KUv) obj;
                if (!C14360o3.A0K(this.A01, c45944KUv.A01) || this.A04 != c45944KUv.A04 || this.A00 != c45944KUv.A00 || this.A05 != c45944KUv.A05 || !C14360o3.A0K(this.A02, c45944KUv.A02) || this.A06 != c45944KUv.A06 || !C14360o3.A0K(this.A03, c45944KUv.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A05, AbstractC25236BEt.A01(this.A00, AbstractC167007dF.A0D(this.A04, AbstractC167017dG.A0M(this.A01) * 31))))) + AbstractC166997dE.A0I(this.A03);
    }

    public C45944KUv(ImageUrl imageUrl, C38321qM c38321qM, Integer num, long j, boolean z, boolean z2, boolean z3) {
        this.A01 = imageUrl;
        this.A04 = z;
        this.A00 = j;
        this.A05 = z2;
        this.A02 = c38321qM;
        this.A06 = z3;
        this.A03 = num;
    }
}
