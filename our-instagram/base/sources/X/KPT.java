package X;

import java.util.Locale;

/* loaded from: classes8.dex */
public final class KPT extends AbstractC2056898s {
    public final InterfaceC02900Bo A00;

    public final void A0C(Integer num, boolean z, boolean z2) {
        String str;
        String str2;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2 && intValue != 6) {
                return;
            } else {
                str = "SETTINGS";
            }
        } else {
            str = "INBOX";
        }
        if (z) {
            str2 = "V2";
        } else {
            str2 = "V1";
        }
        A07("VERSION", str2);
        A07("IS_FROM_OMNISTORE", AbstractC166997dE.A10(Locale.ROOT, String.valueOf(z2)));
        A07("ENTRY_POINT", str);
        A07("LOGGED_IN_ACCOUNTS", String.valueOf(this.A00.BOZ()));
        A03();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPT(C006802i c006802i, C6CF c6cf, InterfaceC02900Bo interfaceC02900Bo) {
        super(c006802i, c6cf, interfaceC02900Bo);
        AbstractC167017dG.A1R(interfaceC02900Bo, c6cf);
        this.A00 = interfaceC02900Bo;
    }

    @Override // X.AbstractC2056898s
    public final int A0B() {
        return 724775184;
    }
}
