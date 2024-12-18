package X;

/* loaded from: classes11.dex */
public abstract class VRE {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CTWA_UPSELL";
            case 2:
                return "DIRECT_CTD_AYMT";
            case 3:
                return "AD_TOOLS_CTD_AYMT";
            case 4:
                return "CTD_INBOX_SETTING";
            case 5:
                return "MESSAGING_HUB";
            case 6:
                return "MESSAGING_HUB_CTWA";
            case 7:
                return "AYMT_CTWA_DROPOFF";
            case 8:
                return "AYMT_CTD_DROPOFF";
            case 9:
                return "AYMT_WV_DROPOFF";
            case 10:
                return "AYMT_PV_DROPOFF";
            default:
                return "CTD_UPSELL";
        }
    }
}
