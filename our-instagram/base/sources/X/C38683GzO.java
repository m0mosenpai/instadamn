package X;

/* renamed from: X.GzO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38683GzO extends C0T6 {
    public final long A00;
    public final C4SX A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Double A05;
    public final Long A06;
    public final Long A07;

    public static Long A01(InterfaceC02590Ai interfaceC02590Ai, C38683GzO c38683GzO) {
        interfaceC02590Ai.AAK(c38683GzO.A01, "advertiser_id");
        interfaceC02590Ai.A9K("catalog_id", null);
        return Long.valueOf(c38683GzO.A00);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38683GzO) {
                C38683GzO c38683GzO = (C38683GzO) obj;
                if (this.A00 != c38683GzO.A00 || !C14360o3.A0K(this.A01, c38683GzO.A01) || !C14360o3.A0K(this.A04, c38683GzO.A04) || !C14360o3.A0K(this.A02, c38683GzO.A02) || !C14360o3.A0K(this.A07, c38683GzO.A07) || !C14360o3.A0K(this.A06, c38683GzO.A06) || !C14360o3.A0K(this.A03, c38683GzO.A03) || !C14360o3.A0K(this.A05, c38683GzO.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public static Long A00(InterfaceC02590Ai interfaceC02590Ai, C38683GzO c38683GzO) {
        interfaceC02590Ai.AAK(c38683GzO.A01, "advertiser_id");
        interfaceC02590Ai.A9K("catalog_id", null);
        return Long.valueOf(c38683GzO.A00);
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C38683GzO c38683GzO) {
        interfaceC02590Ai.A9K("product_id", Long.valueOf(c38683GzO.A00));
        interfaceC02590Ai.AAK(c38683GzO.A01, "merchant_id");
    }

    public final int hashCode() {
        return ((((((((((AbstractC166997dE.A0J(this.A01, AbstractC25235BEs.A03(this.A00)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public C38683GzO(C4SX c4sx, Boolean bool, Boolean bool2, Boolean bool3, Double d, Long l, Long l2, long j) {
        this.A00 = j;
        this.A01 = c4sx;
        this.A04 = bool;
        this.A02 = bool2;
        this.A07 = l;
        this.A06 = l2;
        this.A03 = bool3;
        this.A05 = d;
    }
}
