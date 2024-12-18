package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.Tap, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64964Tap extends C0YY implements InterfaceC16820sZ {
    public static final C64964Tap A00 = new C64964Tap();

    public C64964Tap() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        A0Z.put("cc-number", AbstractC58321PtD.A15("swisspass|student|wellness|traveller|shipping|user[_\\-\\s]?id|passsword|reward|charm|student|club|valid|voucher|passport|gift|password|identity|phone|id[_\\-\\s]?card|family|name|district|super[_\\-\\s]?card|loyalty|member|isic|rcpt|country[._\\-\\s]?code|formCountry|formState|zip[._\\-\\s]?code|e[._\\-\\s]?mail", (java.util.Set) C63376Sin.A0C.getValue()));
        return A0Z.buildOrThrow();
    }
}
