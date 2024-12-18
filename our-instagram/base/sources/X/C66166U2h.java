package X;

/* renamed from: X.U2h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66166U2h {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C66166U2h(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.A03 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A04 = str4;
        this.A01 = str5;
        this.A02 = str6;
        this.A00 = l;
        this.A08 = z;
        this.A06 = str7;
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C66166U2h c66166U2h, Integer num, int i) {
        interfaceC02590Ai.AAP("search_type", AbstractC66135U1c.A00(num));
        interfaceC02590Ai.AAP("selected_id", c66166U2h.A03);
        interfaceC02590Ai.A9K("selected_position", Long.valueOf(i));
        interfaceC02590Ai.AAP("selected_type", c66166U2h.A04);
    }
}
