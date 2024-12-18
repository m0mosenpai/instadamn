package X;

/* renamed from: X.8mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196358mR {
    public final /* synthetic */ InterfaceC196338mP A00;
    public final /* synthetic */ C196058lv A01;
    public final /* synthetic */ String A02;

    public final void A01(String str) {
        Object value;
        C196058lv c196058lv = this.A01;
        c196058lv.A01.set(false);
        C05A c05a = c196058lv.A06;
        do {
            value = c05a.getValue();
            ((Number) value).longValue();
        } while (!c05a.AIi(value, 0L));
        InterfaceC196338mP interfaceC196338mP = this.A00;
        if (interfaceC196338mP != null) {
            interfaceC196338mP.DeN();
        }
        C196438mZ c196438mZ = (C196438mZ) c196058lv.A02.getValue();
        String str2 = this.A02;
        C18920wW c18920wW = (C18920wW) c196438mZ.A01.getValue();
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "cxp_ig_client_sourced_creation");
        EnumC222416a A0I = C17060sy.A01.A01(c196438mZ.A00).A0I();
        if (A0I == null) {
            A0I = EnumC222416a.A08;
        }
        A00.AAP(AbstractC50635MWw.A02(42, 10, 0), str2);
        A00.AAP("event_name", "xposting_destination_fetch_failure");
        A00.AAP("data_source", str);
        A00.AAP("source_account_type", A0I.A01);
        A00.Cht();
    }

    public C196358mR(InterfaceC196338mP interfaceC196338mP, C196058lv c196058lv, String str) {
        this.A01 = c196058lv;
        this.A02 = str;
        this.A00 = interfaceC196338mP;
    }

    public final void A00() {
        Object value;
        C196058lv c196058lv = this.A01;
        c196058lv.A01.set(false);
        C05A c05a = c196058lv.A06;
        do {
            value = c05a.getValue();
            ((Number) value).longValue();
        } while (!c05a.AIi(value, Long.valueOf(System.currentTimeMillis())));
        InterfaceC196338mP interfaceC196338mP = this.A00;
        if (interfaceC196338mP != null) {
            interfaceC196338mP.DeO();
        }
    }
}
