package X;

/* renamed from: X.4Cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92554Cp {
    public static final InterfaceC08100bW A00 = new C1QF("IgSecureUriParser").A00;

    public static final String A00(C75363a3 c75363a3) {
        switch (c75363a3.A0E.intValue()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (c75363a3.A08()) {
                    return "DashVod";
                }
                return "Progressive";
            case 3:
                return "Live";
            default:
                throw new RuntimeException();
        }
    }
}
