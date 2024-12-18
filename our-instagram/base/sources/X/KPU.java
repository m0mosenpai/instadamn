package X;

/* loaded from: classes8.dex */
public final class KPU extends AbstractC2056898s {
    public final Integer A00;

    public static final void A00(KPU kpu, String str) {
        String str2;
        Integer num = kpu.A00;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2 && intValue != 6) {
                if (intValue != 1) {
                    if (intValue == 4) {
                        str2 = AbstractC46735Kls.A00(num);
                    } else {
                        return;
                    }
                } else {
                    str2 = "REENGAGE_TOAST";
                }
            } else {
                str2 = "SETTINGS";
            }
        } else {
            str2 = "INBOX";
        }
        kpu.A03();
        kpu.A07("ENTRY_POINT", str2);
        kpu.A07("RESTORE_REASON", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPU(C006802i c006802i, C6CF c6cf, InterfaceC02900Bo interfaceC02900Bo, Integer num) {
        super(c006802i, c6cf, interfaceC02900Bo);
        AbstractC43594JPz.A1P(interfaceC02900Bo, c6cf);
        this.A00 = num;
    }

    @Override // X.AbstractC2056898s
    public final int A0B() {
        return 724769478;
    }
}
