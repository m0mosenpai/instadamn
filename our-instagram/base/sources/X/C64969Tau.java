package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.Tau, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64969Tau extends C0YY implements InterfaceC16820sZ {
    public static final C64969Tau A00 = new C64969Tau();

    public C64969Tau() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        InterfaceC09390do interfaceC09390do = C63376Sin.A0C;
        A0Z.put("cc-csc", AbstractC58321PtD.A15("password", AbstractC58322PtE.A12(A0Z, "cc-exp", AbstractC58321PtD.A15("birthdate|dob|invaliddate", AbstractC58322PtE.A12(A0Z, "cc-exp-year", AbstractC58321PtD.A15("cardmonthyear", AbstractC58322PtE.A12(A0Z, "cc-exp-month", AbstractC58321PtD.A15("cardmonthyear", AbstractC58322PtE.A12(A0Z, "cc-number", AbstractC58321PtD.A15("swisspass|student|wellness|traveller|shipping|user[_\\-\\s]?id|passsword|reward|charm|student|club|valid|voucher|passport|gift|password|identity|phone|id[_\\-\\s]?card|family|name|district|super[_\\-\\s]?card|loyalty|member|isic|rcpt|country[._\\-\\s]?code|formCountry|formState|zip[._\\-\\s]?code|e[._\\-\\s]?mail|cpfpix|addressnumber|shippingaddress", (java.util.Set) interfaceC09390do.getValue()), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)));
        return A0Z.buildOrThrow();
    }
}
