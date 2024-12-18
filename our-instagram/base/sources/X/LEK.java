package X;

/* loaded from: classes8.dex */
public final class LEK {
    public final FPB A00;
    public final InterfaceC08830cm A01;

    public static final C83403nh A00(LEK lek, String str, String str2, boolean z) {
        C7U0 c7u0 = (C7U0) lek.A01.get();
        EnumC2054697t enumC2054697t = EnumC2054697t.A0W;
        C83403nh c83403nh = null;
        if (c7u0.AHB(enumC2054697t)) {
            InterfaceC163557Ts BT6 = c7u0.BT6();
            C14360o3.A0C(BT6, "null cannot be cast to non-null type com.instagram.direct.messagethread.DirectMessageStoreImpl");
            C160787Im BT7 = ((C163547Tr) BT6).BT7(str);
            if ((BT7 == null || (c83403nh = BT7.A0e) == null) && str2 != null) {
                if (z) {
                    lek.A00.A00(AnonymousClass001.A0R(str2, ": null_direct_message"));
                }
                AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0R(str2, ": Message is null"), 20134884);
            }
        } else {
            AbstractC34074F2c.A00(enumC2054697t);
            if (z) {
                lek.A00.A00(AnonymousClass001.A0R(str2, ": pseudo_capability_disabled"));
                return null;
            }
        }
        return c83403nh;
    }

    public LEK(FPB fpb, InterfaceC08830cm interfaceC08830cm) {
        AbstractC167017dG.A1P(interfaceC08830cm, fpb);
        this.A01 = interfaceC08830cm;
        this.A00 = fpb;
    }
}
