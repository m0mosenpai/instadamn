package X;

/* renamed from: X.WdS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70590WdS implements C53S {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C69794Vvd A01;
    public final /* synthetic */ C66151U1s A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C70590WdS(C69794Vvd c69794Vvd, C66151U1s c66151U1s, String str, String str2, String str3, String str4, int i) {
        this.A05 = str;
        this.A04 = str2;
        this.A02 = c66151U1s;
        this.A03 = str3;
        this.A06 = str4;
        this.A00 = i;
        this.A01 = c69794Vvd;
    }

    @Override // X.C53S
    public final void A8Y(C19280xC c19280xC) {
        C14360o3.A0B(c19280xC, 0);
        String str = this.A05;
        String str2 = this.A04;
        String str3 = this.A02.A07;
        c19280xC.A07(AbstractC129015sM.A01, str);
        c19280xC.A07(AbstractC129015sM.A00, str2);
        c19280xC.A0C("search_session_id", str3);
        String str4 = this.A03;
        String str5 = this.A06;
        int i = this.A00;
        c19280xC.A0C("search_tab", str4);
        c19280xC.A0C("selected_type", str5);
        c19280xC.A08(Integer.valueOf(i), "position");
        C69794Vvd c69794Vvd = this.A01;
        if (c69794Vvd != null) {
            c19280xC.A04(AbstractC69959Vya.A01(c69794Vvd.A00()).A00());
        }
    }
}
