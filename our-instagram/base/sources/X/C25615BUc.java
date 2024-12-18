package X;

/* renamed from: X.BUc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25615BUc extends C0T6 {
    public final C3YP A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25615BUc) {
                C25615BUc c25615BUc = (C25615BUc) obj;
                if (this.A00 != c25615BUc.A00 || this.A04 != c25615BUc.A04 || !C14360o3.A0K(this.A07, c25615BUc.A07) || !C14360o3.A0K(this.A03, c25615BUc.A03) || !C14360o3.A0K(this.A06, c25615BUc.A06) || !C14360o3.A0K(this.A01, c25615BUc.A01) || !C14360o3.A0K(this.A05, c25615BUc.A05) || !C14360o3.A0K(this.A02, c25615BUc.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A00);
        Integer num = this.A04;
        return ((((((((((AbstractC167017dG.A0L(num, AbstractC28059CYn.A01(num), A0G) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C25615BUc(C3YP c3yp, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2) {
        this.A00 = c3yp;
        this.A04 = num;
        this.A07 = str;
        this.A03 = num2;
        this.A06 = str2;
        this.A01 = num3;
        this.A05 = num4;
        this.A02 = num5;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ArbiterEvent(surface=");
        A1C.append(this.A00);
        A1C.append(", name=");
        Integer num = this.A04;
        if (num != null) {
            str = AbstractC28059CYn.A01(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", responseId=");
        A1C.append(this.A07);
        A1C.append(", index=");
        A1C.append(this.A03);
        A1C.append(", mediaId=");
        A1C.append(this.A06);
        A1C.append(", dedupExistingItemIndex=");
        A1C.append(this.A01);
        A1C.append(", serverGap=");
        A1C.append(this.A05);
        A1C.append(", gapAtBorder=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
