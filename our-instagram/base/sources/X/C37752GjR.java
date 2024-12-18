package X;

/* renamed from: X.GjR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37752GjR extends AbstractC39653Hii {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C37752GjR(Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A01 = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37752GjR) {
                C37752GjR c37752GjR = (C37752GjR) obj;
                if (this.A00 != c37752GjR.A00 || this.A02 != c37752GjR.A02 || this.A03 != c37752GjR.A03 || this.A04 != c37752GjR.A04 || this.A01 != c37752GjR.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return AbstractC166987dD.A0K(this.A01, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC25230BEn.A0C(num, AbstractC37758GjX.A00(num)) * 31))));
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoadingState(prefetchConnectStatus=");
        Integer num = this.A00;
        if (num != null) {
            str = AbstractC37758GjX.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", isFirstPage=");
        A1C.append(this.A02);
        A1C.append(", isRefreshing=");
        A1C.append(this.A03);
        A1C.append(", isStreaming=");
        A1C.append(this.A04);
        A1C.append(", isEagerFetch=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }

    public C37752GjR() {
        this(C05F.A0C, false, false, false, false);
    }
}
