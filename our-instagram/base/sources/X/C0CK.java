package X;

/* renamed from: X.0CK, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0CK {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final EnumC31512Dsw A00(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1814342561:
                if (str.equals("double_tap_tab_bar")) {
                    return EnumC31512Dsw.A0C;
                }
                return EnumC31512Dsw.A0E;
            case -976711082:
                str2 = "tab_bar_long_press";
                break;
            case -657162262:
                str2 = "long_press_tab_bar";
                break;
            case -309425751:
                if (str.equals("profile")) {
                    return EnumC31512Dsw.A09;
                }
                return EnumC31512Dsw.A0E;
            case 441111834:
                if (str.equals("unknown_nt_action")) {
                    return EnumC31512Dsw.A0F;
                }
                return EnumC31512Dsw.A0E;
            case 660917936:
                if (str.equals("direct_inbox")) {
                    return EnumC31512Dsw.A04;
                }
                return EnumC31512Dsw.A0E;
            case 1414199215:
                if (str.equals("horizontal_switch")) {
                    return EnumC31512Dsw.A05;
                }
                return EnumC31512Dsw.A0E;
            case 2005378358:
                if (str.equals("bookmark")) {
                    return EnumC31512Dsw.A03;
                }
                return EnumC31512Dsw.A0E;
            default:
                return EnumC31512Dsw.A0E;
        }
        if (str.equals(str2)) {
            return EnumC31512Dsw.A0D;
        }
        return EnumC31512Dsw.A0E;
    }
}
