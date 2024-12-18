package X;

/* renamed from: X.Hbh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39455Hbh extends PJX {
    public final /* synthetic */ C75113Zb A00;
    public final /* synthetic */ C37605Gh0 A01;
    public final /* synthetic */ EnumC39619HeT A02;
    public final /* synthetic */ String A03;

    public C39455Hbh(C75113Zb c75113Zb, C37605Gh0 c37605Gh0, EnumC39619HeT enumC39619HeT, String str) {
        this.A01 = c37605Gh0;
        this.A03 = str;
        this.A00 = c75113Zb;
        this.A02 = enumC39619HeT;
    }

    @Override // X.PJX, X.MRA
    public final void Czw(boolean z) {
        C37605Gh0 c37605Gh0 = this.A01;
        if (C18U.A06(C06090Tz.A05, c37605Gh0.A07, 36330179169305319L)) {
            String str = this.A03;
            if (C14360o3.A0K(str, "hide_button")) {
                C37605Gh0.A0I(c37605Gh0, str, null);
            }
        }
        c37605Gh0.A0A.Cvx();
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        C37605Gh0.A0I(this.A01, this.A03, null);
    }

    @Override // X.PJX, X.MRA
    public final void DpY(String str, String str2, String str3) {
        C37605Gh0.A08(this.A00, this.A01, this.A03, str);
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        C37605Gh0 c37605Gh0 = this.A01;
        C37605Gh0.A08(this.A00, c37605Gh0, this.A03, AbstractC41569IaI.A00(c37605Gh0.A07, str, AbstractC167007dF.A1X(this.A02, EnumC39619HeT.A05)));
    }
}
